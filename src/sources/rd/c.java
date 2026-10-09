package rd;

import android.os.Build;
import android.os.StrictMode;
import androidx.lifecycle.viewmodel.compose.NP.IMCc;
import bq.f;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Closeable {
    public BufferedWriter K;
    public int M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f49096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f49097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f49098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f49099d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f49101f;
    public long H = 0;
    public final LinkedHashMap L = new LinkedHashMap(0, 0.75f, true);
    public long N = 0;
    public final ThreadPoolExecutor O = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a());
    public final ax.c P = new ax.c(this, 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f49100e = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f49102t = 1;

    public c(File file, long j11) {
        this.f49096a = file;
        this.f49097b = new File(file, "journal");
        this.f49098c = new File(file, "journal.tmp");
        this.f49099d = new File(file, "journal.bkp");
        this.f49101f = j11;
    }

    public static void a(c cVar, f fVar, boolean z11) {
        synchronized (cVar) {
            b bVar = (b) fVar.f4944b;
            if (bVar.f49094f != fVar) {
                throw new IllegalStateException();
            }
            if (z11 && !bVar.f49093e) {
                for (int i11 = 0; i11 < cVar.f49102t; i11++) {
                    if (!((boolean[]) fVar.f4945c)[i11]) {
                        fVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i11);
                    }
                    if (!bVar.f49092d[i11].exists()) {
                        fVar.a();
                        return;
                    }
                }
            }
            for (int i12 = 0; i12 < cVar.f49102t; i12++) {
                File file = bVar.f49092d[i12];
                if (!z11) {
                    c(file);
                } else if (file.exists()) {
                    File file2 = bVar.f49091c[i12];
                    file.renameTo(file2);
                    long j11 = bVar.f49090b[i12];
                    long length = file2.length();
                    bVar.f49090b[i12] = length;
                    cVar.H = (cVar.H - j11) + length;
                }
            }
            cVar.M++;
            bVar.f49094f = null;
            if (bVar.f49093e || z11) {
                bVar.f49093e = true;
                cVar.K.append((CharSequence) "CLEAN");
                cVar.K.append(' ');
                cVar.K.append((CharSequence) bVar.f49089a);
                cVar.K.append((CharSequence) bVar.a());
                cVar.K.append('\n');
                if (z11) {
                    cVar.N++;
                }
            } else {
                cVar.L.remove(bVar.f49089a);
                cVar.K.append((CharSequence) "REMOVE");
                cVar.K.append(' ');
                cVar.K.append((CharSequence) bVar.f49089a);
                cVar.K.append('\n');
            }
            e(cVar.K);
            if (cVar.H > cVar.f49101f || cVar.h()) {
                cVar.O.submit(cVar.P);
            }
        }
    }

    public static void b(BufferedWriter bufferedWriter) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void c(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void e(BufferedWriter bufferedWriter) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void y(File file, File file2, boolean z11) throws IOException {
        if (z11) {
            c(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public final void A() {
        while (this.H > this.f49101f) {
            String str = (String) ((Map.Entry) this.L.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.K == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    b bVar = (b) this.L.get(str);
                    if (bVar != null && bVar.f49094f == null) {
                        for (int i11 = 0; i11 < this.f49102t; i11++) {
                            File file = bVar.f49091c[i11];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j11 = this.H;
                            long[] jArr = bVar.f49090b;
                            this.H = j11 - jArr[i11];
                            jArr[i11] = 0;
                        }
                        this.M++;
                        this.K.append((CharSequence) "REMOVE");
                        this.K.append(' ');
                        this.K.append((CharSequence) str);
                        this.K.append('\n');
                        this.L.remove(str);
                        if (h()) {
                            this.O.submit(this.P);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.K == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.L.values());
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                f fVar = ((b) obj).f49094f;
                if (fVar != null) {
                    fVar.a();
                }
            }
            A();
            b(this.K);
            this.K = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final f d(String str) {
        synchronized (this) {
            try {
                if (this.K == null) {
                    throw new IllegalStateException("cache is closed");
                }
                b bVar = (b) this.L.get(str);
                if (bVar == null) {
                    bVar = new b(this, str);
                    this.L.put(str, bVar);
                } else if (bVar.f49094f != null) {
                    return null;
                }
                f fVar = new f(this, bVar);
                bVar.f49094f = fVar;
                this.K.append((CharSequence) "DIRTY");
                this.K.append(' ');
                this.K.append((CharSequence) str);
                this.K.append('\n');
                e(this.K);
                return fVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized lp.b f(String str) {
        if (this.K == null) {
            throw new IllegalStateException("cache is closed");
        }
        b bVar = (b) this.L.get(str);
        if (bVar == null) {
            return null;
        }
        if (!bVar.f49093e) {
            return null;
        }
        for (File file : bVar.f49091c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.M++;
        this.K.append((CharSequence) "READ");
        this.K.append(' ');
        this.K.append((CharSequence) str);
        this.K.append('\n');
        if (h()) {
            this.O.submit(this.P);
        }
        return new lp.b(bVar.f49091c, 26);
    }

    public final boolean h() {
        int i11 = this.M;
        return i11 >= 2000 && i11 >= this.L.size();
    }

    public final void p() throws IOException {
        c(this.f49098c);
        Iterator it = this.L.values().iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            f fVar = bVar.f49094f;
            int i11 = this.f49102t;
            int i12 = 0;
            if (fVar == null) {
                while (i12 < i11) {
                    this.H += bVar.f49090b[i12];
                    i12++;
                }
            } else {
                bVar.f49094f = null;
                while (i12 < i11) {
                    c(bVar.f49091c[i12]);
                    c(bVar.f49092d[i12]);
                    i12++;
                }
                it.remove();
            }
        }
    }

    public final void q() {
        File file = this.f49097b;
        d dVar = new d(new FileInputStream(file), e.f49108a);
        try {
            String strA = dVar.a();
            String strA2 = dVar.a();
            String strA3 = dVar.a();
            String strA4 = dVar.a();
            String strA5 = dVar.a();
            if (!"libcore.io.DiskLruCache".equals(strA) || !"1".equals(strA2) || !Integer.toString(this.f49100e).equals(strA3) || !Integer.toString(this.f49102t).equals(strA4) || !BuildConfig.VERSION_NAME.equals(strA5)) {
                throw new IOException("unexpected journal header: [" + strA + ", " + strA2 + ", " + strA4 + ", " + strA5 + "]");
            }
            int i11 = 0;
            while (true) {
                try {
                    v(dVar.a());
                    i11++;
                } catch (EOFException unused) {
                    this.M = i11 - this.L.size();
                    if (dVar.f49107e == -1) {
                        x();
                    } else {
                        this.K = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), e.f49108a));
                    }
                    try {
                        dVar.close();
                        return;
                    } catch (RuntimeException e8) {
                        throw e8;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th2) {
            try {
                dVar.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused3) {
            }
            throw th2;
        }
    }

    public final void v(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i11 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i11);
        LinkedHashMap linkedHashMap = this.L;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i11);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i11, iIndexOf2);
        }
        b bVar = (b) linkedHashMap.get(strSubstring);
        if (bVar == null) {
            bVar = new b(this, strSubstring);
            linkedHashMap.put(strSubstring, bVar);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                bVar.f49094f = new f(this, bVar);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        bVar.f49093e = true;
        bVar.f49094f = null;
        if (strArrSplit.length != bVar.f49095g.f49102t) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        for (int i12 = 0; i12 < strArrSplit.length; i12++) {
            try {
                bVar.f49090b[i12] = Long.parseLong(strArrSplit[i12]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }

    public final synchronized void x() {
        try {
            BufferedWriter bufferedWriter = this.K;
            if (bufferedWriter != null) {
                b(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f49098c), e.f49108a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f49100e));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f49102t));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (b bVar : this.L.values()) {
                    if (bVar.f49094f != null) {
                        bufferedWriter2.write("DIRTY " + bVar.f49089a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + bVar.f49089a + bVar.a() + '\n');
                    }
                }
                b(bufferedWriter2);
                if (this.f49097b.exists()) {
                    y(this.f49097b, this.f49099d, true);
                }
                y(this.f49098c, this.f49097b, false);
                this.f49099d.delete();
                this.K = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f49097b, true), e.f49108a));
            } catch (Throwable th2) {
                b(bufferedWriter2);
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public static c i(File file, long j11) throws IOException {
        if (j11 <= 0) {
            throw new IllegalArgumentException(IMCc.MFBBxnEkjPRgW);
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                y(file2, file3, false);
            }
        }
        c cVar = new c(file, j11);
        if (cVar.f49097b.exists()) {
            try {
                cVar.q();
                cVar.p();
                return cVar;
            } catch (IOException e8) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e8.getMessage() + ", removing");
                cVar.close();
                e.a(cVar.f49096a);
            }
        }
        file.mkdirs();
        c cVar2 = new c(file, j11);
        cVar2.x();
        return cVar2;
    }
}
