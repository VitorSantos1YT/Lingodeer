package p;

import android.view.View;
import r.t2;
import z4.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends ve.i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f46228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f46229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f46230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f46231g;

    public k(l lVar) {
        this.f46228d = 0;
        this.f46231g = lVar;
        this.f46229e = false;
        this.f46230f = 0;
    }

    @Override // ve.i, z4.x0
    public void a() {
        switch (this.f46228d) {
            case 1:
                this.f46229e = true;
                break;
        }
    }

    @Override // z4.x0
    public final void b(View view) {
        switch (this.f46228d) {
            case 0:
                int i11 = this.f46230f + 1;
                this.f46230f = i11;
                l lVar = (l) this.f46231g;
                if (i11 == lVar.f46232a.size()) {
                    x0 x0Var = lVar.f46235d;
                    if (x0Var != null) {
                        x0Var.b(null);
                    }
                    this.f46230f = 0;
                    this.f46229e = false;
                    lVar.f46236e = false;
                }
                break;
            default:
                if (!this.f46229e) {
                    ((t2) this.f46231g).f48654a.setVisibility(this.f46230f);
                }
                break;
        }
    }

    @Override // ve.i, z4.x0
    public final void c() {
        switch (this.f46228d) {
            case 0:
                if (!this.f46229e) {
                    this.f46229e = true;
                    x0 x0Var = ((l) this.f46231g).f46235d;
                    if (x0Var != null) {
                        x0Var.c();
                    }
                    break;
                }
                break;
            default:
                ((t2) this.f46231g).f48654a.setVisibility(0);
                break;
        }
    }

    public k(t2 t2Var, int i11) {
        this.f46228d = 1;
        this.f46231g = t2Var;
        this.f46230f = i11;
        this.f46229e = false;
    }
}
