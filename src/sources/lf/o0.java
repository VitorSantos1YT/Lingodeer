package lf;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import fr.p3;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtomicLong f40082g = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f40084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f40085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ReentrantLock f40086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Condition f40087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicLong f40088f;

    public o0(String tag, ay.k0 k0Var) {
        File[] fileArrListFiles;
        kotlin.jvm.internal.m.f(tag, "tag");
        this.f40083a = tag;
        re.s sVar = re.s.f49201a;
        v0.m();
        ob.c cVar = re.s.f49208h;
        if (cVar == null) {
            kotlin.jvm.internal.m.n("cacheDir");
            throw null;
        }
        CountDownLatch countDownLatch = (CountDownLatch) cVar.f44800c;
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
            }
        }
        File file = new File((File) cVar.f44799b, this.f40083a);
        this.f40084b = file;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f40086d = reentrantLock;
        this.f40087e = reentrantLock.newCondition();
        this.f40088f = new AtomicLong(0L);
        if ((file.mkdirs() || file.isDirectory()) && (fileArrListFiles = file.listFiles(k.f40054c)) != null) {
            for (File file2 : fileArrListFiles) {
                file2.delete();
            }
        }
    }

    public final BufferedInputStream a(String str, String str2) throws IOException {
        String string;
        byte[] bytes = str.getBytes(oz.a.f46133a);
        kotlin.jvm.internal.m.e(bytes, "this as java.lang.String).getBytes(charset)");
        try {
            MessageDigest hash = MessageDigest.getInstance("MD5");
            kotlin.jvm.internal.m.e(hash, "hash");
            hash.update(bytes);
            byte[] digest = hash.digest();
            StringBuilder sb2 = new StringBuilder();
            kotlin.jvm.internal.m.e(digest, "digest");
            for (byte b3 : digest) {
                sb2.append(Integer.toHexString((b3 >> 4) & 15));
                sb2.append(Integer.toHexString(b3 & 15));
            }
            string = sb2.toString();
            kotlin.jvm.internal.m.e(string, "builder.toString()");
        } catch (NoSuchAlgorithmException unused) {
            string = null;
        }
        File file = new File(this.f40084b, string);
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), OSSConstants.DEFAULT_BUFFER_SIZE);
            try {
                JSONObject jSONObjectL = v0.l(bufferedInputStream);
                if (jSONObjectL == null) {
                    bufferedInputStream.close();
                    return null;
                }
                if (!kotlin.jvm.internal.m.a(jSONObjectL.optString("key"), str)) {
                    bufferedInputStream.close();
                    return null;
                }
                String strOptString = jSONObjectL.optString("tag", null);
                if (str2 == null && !kotlin.jvm.internal.m.a(str2, strOptString)) {
                    bufferedInputStream.close();
                    return null;
                }
                long time = new Date().getTime();
                p3 p3Var = y0.f40132d;
                p3.r(re.d0.CACHE, "o0", "Setting lastModified to " + Long.valueOf(time) + " for " + file.getName());
                file.setLastModified(time);
                return bufferedInputStream;
            } catch (Throwable th2) {
                bufferedInputStream.close();
                throw th2;
            }
        } catch (IOException unused2) {
            return null;
        }
    }

    public final BufferedOutputStream b(String str, String str2) throws IOException {
        File file = new File(this.f40084b, "buffer" + f40082g.incrementAndGet());
        file.delete();
        if (!file.createNewFile()) {
            throw new IOException("Could not create file at " + file.getAbsolutePath());
        }
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new k0(new FileOutputStream(file), new n0(System.currentTimeMillis(), this, file, str)), OSSConstants.DEFAULT_BUFFER_SIZE);
            try {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("key", str);
                    if (!j1.y(str2)) {
                        jSONObject.put("tag", str2);
                    }
                    String string = jSONObject.toString();
                    kotlin.jvm.internal.m.e(string, "header.toString()");
                    byte[] bytes = string.getBytes(oz.a.f46133a);
                    kotlin.jvm.internal.m.e(bytes, "this as java.lang.String).getBytes(charset)");
                    bufferedOutputStream.write(0);
                    bufferedOutputStream.write((bytes.length >> 16) & 255);
                    bufferedOutputStream.write((bytes.length >> 8) & 255);
                    bufferedOutputStream.write(bytes.length & 255);
                    bufferedOutputStream.write(bytes);
                    return bufferedOutputStream;
                } catch (JSONException e8) {
                    p3 p3Var = y0.f40132d;
                    p3.t(re.d0.CACHE, "o0", "Error creating JSON header for cache file: " + e8);
                    throw new IOException(e8.getMessage());
                }
            } catch (Throwable th2) {
                bufferedOutputStream.close();
                throw th2;
            }
        } catch (FileNotFoundException e10) {
            p3 p3Var2 = y0.f40132d;
            p3.t(re.d0.CACHE, "o0", "Error creating buffer output stream: " + e10);
            throw new IOException(e10.getMessage());
        }
    }

    public final String toString() {
        return "{FileLruCache: tag:" + this.f40083a + " file:" + this.f40084b.getName() + '}';
    }
}
