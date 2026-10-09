package qd;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.lifecycle.livedata.HeRS.DytezVyM;
import com.adjust.sdk.Constants;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import ob.u;
import pd.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f47717c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f47715a = new LinkedHashMap(16, 0.75f, true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f47716b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f47718d = 5242880;

    public d(u uVar) {
        this.f47717c = uVar;
    }

    public static String c(String str) {
        int length = str.length() / 2;
        StringBuilder sbN = ep.a.n(String.valueOf(str.substring(0, length).hashCode()));
        sbN.append(String.valueOf(str.substring(length).hashCode()));
        return sbN.toString();
    }

    public static int h(c cVar) throws IOException {
        int i11 = cVar.read();
        if (i11 != -1) {
            return i11;
        }
        throw new EOFException();
    }

    public static int i(c cVar) {
        return (h(cVar) << 24) | h(cVar) | (h(cVar) << 8) | (h(cVar) << 16);
    }

    public static long j(c cVar) {
        return (((long) h(cVar)) & 255) | ((((long) h(cVar)) & 255) << 8) | ((((long) h(cVar)) & 255) << 16) | ((((long) h(cVar)) & 255) << 24) | ((((long) h(cVar)) & 255) << 32) | ((((long) h(cVar)) & 255) << 40) | ((((long) h(cVar)) & 255) << 48) | ((255 & ((long) h(cVar))) << 56);
    }

    public static String k(c cVar) {
        return new String(l(cVar, j(cVar)), Constants.ENCODING);
    }

    public static void m(BufferedOutputStream bufferedOutputStream, int i11) {
        bufferedOutputStream.write(i11 & 255);
        bufferedOutputStream.write((i11 >> 8) & 255);
        bufferedOutputStream.write((i11 >> 16) & 255);
        bufferedOutputStream.write((i11 >> 24) & 255);
    }

    public static void n(BufferedOutputStream bufferedOutputStream, long j11) {
        bufferedOutputStream.write((byte) j11);
        bufferedOutputStream.write((byte) (j11 >>> 8));
        bufferedOutputStream.write((byte) (j11 >>> 16));
        bufferedOutputStream.write((byte) (j11 >>> 24));
        bufferedOutputStream.write((byte) (j11 >>> 32));
        bufferedOutputStream.write((byte) (j11 >>> 40));
        bufferedOutputStream.write((byte) (j11 >>> 48));
        bufferedOutputStream.write((byte) (j11 >>> 56));
    }

    public static void o(BufferedOutputStream bufferedOutputStream, String str) {
        byte[] bytes = str.getBytes(Constants.ENCODING);
        n(bufferedOutputStream, bytes.length);
        bufferedOutputStream.write(bytes, 0, bytes.length);
    }

    public final synchronized pd.a a(String str) {
        b bVar = (b) this.f47715a.get(str);
        if (bVar == null) {
            return null;
        }
        File fileB = b(str);
        try {
            c cVar = new c(new BufferedInputStream(new FileInputStream(fileB)), fileB.length());
            try {
                b bVarA = b.a(cVar);
                if (TextUtils.equals(str, bVarA.f47706b)) {
                    pd.a aVarB = bVar.b(l(cVar, cVar.f47713a - cVar.f47714b));
                    cVar.close();
                    return aVarB;
                }
                p.a("%s: key=%s, found=%s", fileB.getAbsolutePath(), str, bVarA.f47706b);
                b bVar2 = (b) this.f47715a.remove(str);
                if (bVar2 != null) {
                    this.f47716b -= bVar2.f47705a;
                }
                cVar.close();
                return null;
            } catch (Throwable th2) {
                cVar.close();
                throw th2;
            }
        } catch (IOException e8) {
            p.a("%s: %s", fileB.getAbsolutePath(), e8.toString());
            synchronized (this) {
                boolean zDelete = b(str).delete();
                b bVar3 = (b) this.f47715a.remove(str);
                if (bVar3 != null) {
                    this.f47716b -= bVar3.f47705a;
                }
                if (!zDelete) {
                    p.a("Could not delete cache entry for key=%s, filename=%s", str, c(str));
                }
                return null;
            }
        }
    }

    public final File b(String str) {
        return new File(this.f47717c.p(), c(str));
    }

    public final synchronized void d() {
        try {
            File fileP = this.f47717c.p();
            if (!fileP.exists()) {
                if (!fileP.mkdirs()) {
                    p.a("Unable to create cache dir %s", fileP.getAbsolutePath());
                }
                return;
            }
            File[] fileArrListFiles = fileP.listFiles();
            if (fileArrListFiles == null) {
                return;
            }
            for (File file : fileArrListFiles) {
                try {
                    long length = file.length();
                    c cVar = new c(new BufferedInputStream(new FileInputStream(file)), length);
                    try {
                        b bVarA = b.a(cVar);
                        bVarA.f47705a = length;
                        g(bVarA.f47706b, bVarA);
                        cVar.close();
                    } catch (Throwable th2) {
                        cVar.close();
                        throw th2;
                    }
                } catch (IOException unused) {
                    file.delete();
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final void e() {
        long j11 = this.f47716b;
        int i11 = this.f47718d;
        if (j11 < i11) {
            return;
        }
        int i12 = 0;
        if (p.f46808a) {
            p.b("Pruning old cache entries.", new Object[0]);
        }
        long j12 = this.f47716b;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Iterator it = this.f47715a.entrySet().iterator();
        while (it.hasNext()) {
            b bVar = (b) ((Map.Entry) it.next()).getValue();
            if (b(bVar.f47706b).delete()) {
                this.f47716b -= bVar.f47705a;
            } else {
                String str = bVar.f47706b;
                p.a("Could not delete cache entry for key=%s, filename=%s", str, c(str));
            }
            it.remove();
            i12++;
            if (this.f47716b < i11 * 0.9f) {
                break;
            }
        }
        if (p.f46808a) {
            p.b("pruned %d files, %d bytes, %d ms", Integer.valueOf(i12), Long.valueOf(this.f47716b - j12), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
        }
    }

    public final synchronized void f(String str, pd.a aVar) {
        long j11 = this.f47716b;
        byte[] bArr = aVar.f46761a;
        long length = j11 + ((long) bArr.length);
        int i11 = this.f47718d;
        if (length > i11 && bArr.length > i11 * 0.9f) {
            return;
        }
        File fileB = b(str);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileB));
            b bVar = new b(str, aVar);
            if (!bVar.c(bufferedOutputStream)) {
                bufferedOutputStream.close();
                p.a("Failed to write header for %s", fileB.getAbsolutePath());
                throw new IOException();
            }
            bufferedOutputStream.write(aVar.f46761a);
            bufferedOutputStream.close();
            bVar.f47705a = fileB.length();
            g(str, bVar);
            e();
        } catch (IOException unused) {
            if (!fileB.delete()) {
                p.a("Could not clean up file %s", fileB.getAbsolutePath());
            }
            if (!this.f47717c.p().exists()) {
                p.a("Re-initializing cache after external clearing.", new Object[0]);
                this.f47715a.clear();
                this.f47716b = 0L;
                d();
            }
        }
    }

    public final void g(String str, b bVar) {
        LinkedHashMap linkedHashMap = this.f47715a;
        if (linkedHashMap.containsKey(str)) {
            this.f47716b = (bVar.f47705a - ((b) linkedHashMap.get(str)).f47705a) + this.f47716b;
        } else {
            this.f47716b += bVar.f47705a;
        }
        linkedHashMap.put(str, bVar);
    }

    public static byte[] l(c cVar, long j11) throws IOException {
        long j12 = cVar.f47713a - cVar.f47714b;
        if (j11 >= 0 && j11 <= j12) {
            int i11 = (int) j11;
            if (i11 == j11) {
                byte[] bArr = new byte[i11];
                new DataInputStream(cVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sbJ = w4.c.j(j11, "streamToBytes length=", DytezVyM.KyeCQsRRJulYw);
        sbJ.append(j12);
        throw new IOException(sbJ.toString());
    }
}
