package v7;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import y6.z0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f53609b;

    public f(j jVar) {
        this.f53609b = jVar;
    }

    @Override // v7.c0
    public final void b() {
        j jVar = this.f53609b;
        Surface surface = jVar.f53638x1;
        if (surface != null) {
            qp.r rVar = jVar.f53624j1;
            Handler handler = (Handler) rVar.f48145b;
            if (handler != null) {
                handler.post(new ef.a(rVar, surface, SystemClock.elapsedRealtime()));
            }
            jVar.A1 = true;
        }
    }

    @Override // v7.c0
    public final void c() {
        j jVar = this.f53609b;
        if (jVar.f53638x1 != null) {
            jVar.N0(0, 1);
        }
    }

    @Override // v7.c0
    public final void d() {
        f7.c0 c0Var = this.f53609b.f41014i0;
        if (c0Var != null) {
            c0Var.a();
        }
    }

    @Override // v7.c0
    public final void a(z0 z0Var) {
    }
}
