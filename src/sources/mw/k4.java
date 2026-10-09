package mw;

import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Collection f42511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w4 f42512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Future f42513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Future f42514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n2 f42515e;

    public k4(n2 n2Var, Collection collection, w4 w4Var, Future future, Future future2) {
        this.f42515e = n2Var;
        this.f42511a = collection;
        this.f42512b = w4Var;
        this.f42513c = future;
        this.f42514d = future2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lw.q1 q1Var;
        for (w4 w4Var : this.f42511a) {
            if (w4Var != this.f42512b) {
                w4Var.f42777a.p(n2.f42569i0);
            }
        }
        Future future = this.f42513c;
        if (future != null) {
            future.cancel(false);
        }
        Future future2 = this.f42514d;
        if (future2 != null) {
            future2.cancel(false);
        }
        n2 n2Var = this.f42515e;
        ob.i iVar = ((y2) n2Var.f42582f0.f42424b).F;
        synchronized (iVar.f44813b) {
            try {
                ((HashSet) iVar.f44814c).remove(n2Var);
                if (((HashSet) iVar.f44814c).isEmpty()) {
                    q1Var = (lw.q1) iVar.f44815d;
                    iVar.f44814c = new HashSet();
                } else {
                    q1Var = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (q1Var != null) {
            ((y2) iVar.f44816e).E.c(q1Var);
        }
    }
}
