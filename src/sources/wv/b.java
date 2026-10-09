package wv;

import android.os.Handler;
import android.os.HandlerThread;
import ew.f;
import ge.h;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;
import qp.o2;
import tp.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f55481c;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile Thread f55485t;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f55483e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicInteger f55484f = new AtomicInteger();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o2 f55479a = new o2(7);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f55480b = new e(3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f55482d = ew.d.f25940a.f25942b;

    public b() {
        int i11 = f.f25949a;
        HandlerThread handlerThread = new HandlerThread("FileDownloader-RemitHandoverToDB");
        handlerThread.start();
        this.f55481c = new Handler(handlerThread.getLooper(), new h(this, 1));
    }

    public final void a(int i11) {
        this.f55481c.removeMessages(i11);
        if (this.f55484f.get() != i11) {
            m(i11);
            return;
        }
        this.f55485t = Thread.currentThread();
        this.f55481c.sendEmptyMessage(0);
        LockSupport.park();
    }

    @Override // wv.a
    public final void b(bw.a aVar) {
        this.f55479a.b(aVar);
        if (l(aVar.f6384a)) {
            return;
        }
        this.f55480b.b(aVar);
    }

    @Override // wv.a
    public final void c(int i11) {
        this.f55479a.getClass();
        if (l(i11)) {
            return;
        }
        this.f55480b.getClass();
    }

    @Override // wv.a
    public final void clear() {
        this.f55479a.clear();
        this.f55480b.clear();
    }

    @Override // wv.a
    public final void d(int i11, String str, long j11, long j12, int i12) {
        this.f55479a.getClass();
        if (l(i11)) {
            return;
        }
        this.f55480b.d(i11, str, j11, j12, i12);
    }

    @Override // wv.a
    public final void e(int i11) {
        this.f55479a.remove(i11);
        if (l(i11)) {
            this.f55481c.removeMessages(i11);
            if (this.f55484f.get() == i11) {
                this.f55485t = Thread.currentThread();
                this.f55481c.sendEmptyMessage(0);
                LockSupport.park();
                this.f55480b.remove(i11);
            }
        } else {
            this.f55480b.remove(i11);
        }
        this.f55483e.remove(Integer.valueOf(i11));
    }

    @Override // wv.a
    public final void f(int i11, String str, String str2, long j11) {
        this.f55479a.getClass();
        if (l(i11)) {
            return;
        }
        this.f55480b.f(i11, str, str2, j11);
    }

    @Override // wv.a
    public final void g(long j11, int i11, int i12) {
        this.f55479a.g(j11, i11, i12);
        if (l(i11)) {
            return;
        }
        this.f55480b.g(j11, i11, i12);
    }

    @Override // wv.a
    public final void h(int i11) {
        this.f55479a.h(i11);
        if (l(i11)) {
            return;
        }
        this.f55480b.h(i11);
    }

    @Override // wv.a
    public final void i(Exception exc, int i11) {
        this.f55479a.getClass();
        if (l(i11)) {
            return;
        }
        this.f55480b.i(exc, i11);
    }

    @Override // wv.a
    public final void j(int i11) {
        this.f55481c.sendEmptyMessageDelayed(i11, this.f55482d);
    }

    @Override // wv.a
    public final void k(bw.c cVar) {
        this.f55479a.k(cVar);
        if (l(cVar.f6390a)) {
            return;
        }
        this.f55480b.k(cVar);
    }

    public final boolean l(int i11) {
        return !this.f55483e.contains(Integer.valueOf(i11));
    }

    public final void m(int i11) {
        o2 o2Var = this.f55479a;
        bw.c cVarR = o2Var.r(i11);
        e eVar = this.f55480b;
        eVar.k(cVarR);
        ArrayList arrayListQ = o2Var.q(i11);
        eVar.h(i11);
        int size = arrayListQ.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayListQ.get(i12);
            i12++;
            eVar.b((bw.a) obj);
        }
    }

    @Override // wv.a
    public final void n(int i11, long j11) {
        this.f55479a.getClass();
        if (l(i11)) {
            return;
        }
        this.f55480b.n(i11, j11);
    }

    @Override // wv.a
    public final void o(int i11, long j11, Throwable th2) {
        this.f55479a.getClass();
        if (l(i11)) {
            a(i11);
        }
        this.f55480b.o(i11, j11, th2);
        this.f55483e.remove(Integer.valueOf(i11));
    }

    @Override // wv.a
    public final ArrayList q(int i11) {
        return this.f55479a.q(i11);
    }

    @Override // wv.a
    public final bw.c r(int i11) {
        return this.f55479a.r(i11);
    }

    @Override // wv.a
    public final boolean remove(int i11) {
        this.f55480b.remove(i11);
        this.f55479a.remove(i11);
        return true;
    }

    @Override // wv.a
    public final void s(int i11, int i12) {
        this.f55479a.getClass();
        if (l(i11)) {
            return;
        }
        this.f55480b.s(i11, i12);
    }

    @Override // wv.a
    public final void t(int i11, long j11) {
        this.f55479a.getClass();
        if (l(i11)) {
            a(i11);
        }
        this.f55480b.t(i11, j11);
        this.f55483e.remove(Integer.valueOf(i11));
    }
}
