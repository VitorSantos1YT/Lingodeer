package xv;

import android.content.Intent;
import android.database.sqlite.SQLiteFullException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.StatFs;
import aw.a0;
import aw.b0;
import aw.c0;
import aw.j;
import aw.p;
import aw.s;
import aw.w;
import aw.x;
import aw.y;
import com.liulishuo.filedownloader.exception.FileDownloadGiveUpRetryException;
import com.liulishuo.filedownloader.exception.FileDownloadOutOfSpaceException;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.LockSupport;
import ns.o;
import sz.xej.iFLeRCXvYCGdPW;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements Handler.Callback {
    public Handler H;
    public HandlerThread K;
    public volatile Thread M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bw.c f56610a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.android.billingclient.api.g f56612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f56613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f56614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f56615f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f56616t;
    public volatile boolean L = false;
    public volatile long N = 0;
    public final AtomicLong O = new AtomicLong();
    public final AtomicBoolean P = new AtomicBoolean(false);
    public final AtomicBoolean Q = new AtomicBoolean(false);
    public final AtomicBoolean R = new AtomicBoolean(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wv.a f56611b = c.f56595a.b();

    public h(bw.c cVar, int i11, int i12, int i13) {
        this.f56610a = cVar;
        this.f56614e = i12 < 5 ? 5 : i12;
        this.f56615f = i13;
        this.f56612c = new com.android.billingclient.api.g();
        this.f56613d = i11;
    }

    public final void a() {
        Handler handler = this.H;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.K.quit();
            this.M = Thread.currentThread();
            while (this.L) {
                LockSupport.parkNanos(TimeUnit.MILLISECONDS.toNanos(100L));
            }
            this.M = null;
        }
    }

    public final Exception b(Exception exc) {
        long length;
        bw.c cVar = this.f56610a;
        String strC = cVar.c();
        if ((cVar.H == -1 || ew.d.f25940a.f25946f) && (exc instanceof IOException) && com.google.android.material.datepicker.d.D(strC)) {
            long availableBytes = new StatFs(strC).getAvailableBytes();
            if (availableBytes <= 4096) {
                File file = new File(strC);
                if (file.exists()) {
                    length = file.length();
                } else {
                    o00.a.B(6, this, exc, "Exception with: free space isn't enough, and the target file not exist.", new Object[0]);
                    length = 0;
                }
                Locale locale = Locale.ENGLISH;
                StringBuilder sbJ = w4.c.j(length, "The file is too large to store, breakpoint in bytes:  ", ", required space in bytes: 4096, but free space in bytes: ");
                sbJ.append(availableBytes);
                return new FileDownloadOutOfSpaceException(sbJ.toString(), exc);
            }
        }
        return exc;
    }

    public final void c() {
        bw.c cVar = this.f56610a;
        if (cVar.f6396t.get() == cVar.H) {
            this.f56611b.n(cVar.f6390a, cVar.f6396t.get());
        } else {
            if (this.Q.compareAndSet(true, false)) {
                cVar.e((byte) 3);
            }
            if (this.P.compareAndSet(true, false)) {
                i((byte) 3);
            }
        }
    }

    public final void d(Exception exc, int i11) {
        Exception excB = b(exc);
        com.android.billingclient.api.g gVar = this.f56612c;
        gVar.f7507c = excB;
        gVar.f7506b = this.f56613d - i11;
        bw.c cVar = this.f56610a;
        cVar.e((byte) 5);
        cVar.K = excB.toString();
        this.f56611b.i(excB, cVar.f6390a);
        i((byte) 5);
    }

    public final void e() {
        bw.c cVar = this.f56610a;
        boolean z11 = true;
        boolean z12 = cVar.H == -1;
        AtomicLong atomicLong = cVar.f6396t;
        if (z12) {
            cVar.g(atomicLong.get());
        } else if (atomicLong.get() != cVar.H) {
            long j11 = atomicLong.get();
            long j12 = cVar.H;
            int i11 = ew.f.f25949a;
            Locale locale = Locale.ENGLISH;
            f(new FileDownloadGiveUpRetryException(defpackage.e.i(j12, "]", w4.c.j(j11, "sofar[", "] not equal total["))));
            return;
        }
        String strC = cVar.c();
        String strB = cVar.b();
        File file = new File(strC);
        try {
            File file2 = new File(strB);
            if (file2.exists()) {
                long length = file2.length();
                if (!file2.delete()) {
                    Locale locale2 = Locale.ENGLISH;
                    throw new IOException("Can't delete the old file([" + strB + "], [" + length + "]), so can't replace it with the new downloaded one.");
                }
                o00.a.P(this, "The target file([%s], [%d]) will be replaced with the new downloaded file[%d]", strB, Long.valueOf(length), Long.valueOf(file.length()));
            }
            boolean zRenameTo = file.renameTo(file2);
            boolean z13 = !zRenameTo;
            if (!zRenameTo) {
                try {
                    Locale locale3 = Locale.ENGLISH;
                    throw new IOException("Can't rename the  temp downloaded file(" + strC + ") to the target file(" + strB + ")");
                } catch (Throwable th2) {
                    th = th2;
                    z11 = z13;
                    if (z11 && file.exists() && !file.delete()) {
                        o00.a.P(this, "delete the temp file(%s) failed, on completed downloading.", strC);
                    }
                    throw th;
                }
            }
            if (!zRenameTo && file.exists() && !file.delete()) {
                o00.a.P(this, "delete the temp file(%s) failed, on completed downloading.", strC);
            }
            cVar.e((byte) -3);
            int i12 = cVar.f6390a;
            wv.a aVar = this.f56611b;
            aVar.e(i12);
            aVar.h(cVar.f6390a);
            i((byte) -3);
            if (ew.d.f25940a.f25947g) {
                if (cVar.a() != -3) {
                    throw new IllegalStateException();
                }
                Intent intent = new Intent("filedownloader.intent.action.completed");
                intent.putExtra("model", cVar);
                o.f44007a.sendBroadcast(intent);
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void f(Exception exc) {
        Exception excB = b(exc);
        boolean z11 = excB instanceof SQLiteFullException;
        wv.a aVar = this.f56611b;
        bw.c cVar = this.f56610a;
        if (z11) {
            int i11 = cVar.f6390a;
            cVar.K = ((SQLiteFullException) excB).toString();
            cVar.e((byte) -1);
            aVar.remove(i11);
            aVar.h(i11);
        } else {
            try {
                cVar.e((byte) -1);
                cVar.K = exc.toString();
                aVar.o(cVar.f6390a, cVar.f6396t.get(), excB);
            } catch (SQLiteFullException e8) {
                excB = e8;
                int i12 = cVar.f6390a;
                cVar.K = excB.toString();
                cVar.e((byte) -1);
                aVar.remove(i12);
                aVar.h(i12);
            }
        }
        this.f56612c.f7507c = excB;
        i((byte) -1);
    }

    public final void g() {
        HandlerThread handlerThread = new HandlerThread("source-status-callback");
        this.K = handlerThread;
        handlerThread.start();
        this.H = new Handler(this.K.getLooper(), this);
    }

    public final void h() {
        bw.c cVar = this.f56610a;
        cVar.e((byte) -2);
        this.f56611b.t(cVar.f6390a, cVar.f6396t.get());
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0022  */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        this.L = true;
        int i11 = message.what;
        try {
            if (i11 != 3) {
                if (i11 == 5) {
                    d((Exception) message.obj, message.arg1);
                }
                this.L = false;
                if (this.M != null) {
                    LockSupport.unpark(this.M);
                }
                return true;
            }
            c();
            this.L = false;
            if (this.M != null) {
                LockSupport.unpark(this.M);
            }
            return true;
        } catch (Throwable th2) {
            this.L = false;
            if (this.M != null) {
                LockSupport.unpark(this.M);
            }
            throw th2;
        }
    }

    public final void i(byte b3) {
        p dVar;
        p hVar;
        if (b3 == -2) {
            return;
        }
        bw.c cVar = this.f56610a;
        int i11 = cVar.f6390a;
        AtomicLong atomicLong = cVar.f6396t;
        if (b3 == -4) {
            int i12 = ew.f.f25949a;
            Locale locale = Locale.ENGLISH;
            throw new IllegalStateException(nv.p.j(i11, "please use #catchWarn instead "));
        }
        if (b3 != -3) {
            com.android.billingclient.api.g gVar = this.f56612c;
            if (b3 != -1) {
                if (b3 == 1) {
                    hVar = cVar.N ? new aw.h(atomicLong.get(), i11, cVar.H) : new a0(i11, (int) atomicLong.get(), (int) cVar.H);
                } else if (b3 == 2) {
                    String str = cVar.f6393d ? cVar.f6394e : null;
                    if (cVar.N) {
                        hVar = new aw.e(cVar.L, i11, gVar.f7505a, cVar.H, str);
                    } else {
                        hVar = new x(i11, cVar.L, str, (int) cVar.H, gVar.f7505a);
                    }
                } else if (b3 == 3) {
                    dVar = cVar.N ? new aw.i(i11, atomicLong.get()) : new b0(i11, (int) atomicLong.get());
                } else if (b3 != 5) {
                    if (b3 != 6) {
                        int i13 = ew.f.f25949a;
                        Locale locale2 = Locale.ENGLISH;
                        String str2 = "it can't takes a snapshot for the task(" + cVar + ") when its status is " + ((int) b3) + ",";
                        o00.a.P(s.class, iFLeRCXvYCGdPW.feZYcKmQcANmPbg, cVar, Byte.valueOf(b3));
                        IllegalStateException illegalStateException = ((Exception) gVar.f7507c) != null ? new IllegalStateException(str2, (Exception) gVar.f7507c) : new IllegalStateException(str2);
                        dVar = cVar.N ? new aw.f(i11, atomicLong.get(), illegalStateException) : new y(i11, (int) atomicLong.get(), illegalStateException);
                    } else {
                        dVar = new aw.o(i11);
                    }
                } else if (cVar.N) {
                    hVar = new j(i11, atomicLong.get(), (Exception) gVar.f7507c, gVar.f7506b);
                } else {
                    dVar = new c0(i11, (int) atomicLong.get(), (Exception) gVar.f7507c, gVar.f7506b);
                }
                dVar = hVar;
            } else {
                dVar = cVar.N ? new aw.f(i11, atomicLong.get(), (Exception) gVar.f7507c) : new y(i11, (int) atomicLong.get(), (Exception) gVar.f7507c);
            }
        } else {
            dVar = cVar.N ? new aw.d(i11, cVar.H, false) : new w(i11, false, (int) cVar.H);
        }
        s.f3241a.a(dVar);
    }

    public final synchronized void j(Message message) {
        if (this.K.isAlive()) {
            try {
                this.H.sendMessage(message);
            } catch (IllegalStateException e8) {
                if (this.K.isAlive()) {
                    throw e8;
                }
            }
        }
    }
}
