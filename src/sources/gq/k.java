package gq;

import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import rz.q1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f29597a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f29598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d0 f29599c;

    public final b0 a(int i11) {
        b0 a0Var;
        synchronized (this.f29597a) {
            try {
                if (this.f29598b) {
                    a0Var = x.f29653a;
                } else {
                    d0 d0Var = this.f29599c;
                    if (d0Var == null) {
                        a0Var = x.f29654b;
                    } else {
                        int i12 = j.f29596a[d0Var.f29581b.ordinal()];
                        if (i12 == 1) {
                            a0Var = x.f29654b;
                        } else if (i12 != 2) {
                            if (i12 != 3 && i12 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            w wVar = d0Var.f29580a;
                            a0Var = wVar.f29649b == i11 ? new y(wVar) : new z(wVar);
                        } else {
                            a0Var = new a0(d0Var.f29580a);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a0Var;
    }

    public final w b(boolean z11) {
        w wVar;
        e0 e0Var;
        w wVar2;
        synchronized (this.f29597a) {
            try {
                this.f29598b = true;
                d0 d0Var = this.f29599c;
                wVar = null;
                if (d0Var == null || (e0Var = d0Var.f29581b) == e0.STOPPED) {
                    wVar2 = null;
                } else if (e0Var == e0.REGISTERED) {
                    this.f29599c = null;
                    wVar2 = null;
                } else {
                    w wVar3 = z11 ? d0Var.f29580a : null;
                    wVar = d0Var.f29580a;
                    wVar2 = wVar3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (wVar2 != null) {
            ((q1) wVar2.a()).r(new CancellationException("Progress sync cancelled because teardown started"));
        }
        return wVar;
    }

    public final void c() {
        synchronized (this.f29597a) {
            this.f29598b = false;
        }
    }
}
