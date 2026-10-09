package s0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j3.h f51266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j3.y0 f51267b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f51270e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v3.c f51272g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n3.h f51273h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a9.i f51275j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public v3.m f51276k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f51268c = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f51269d = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f51271f = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f51274i = ry.r.f50854a;

    public z0(j3.h hVar, j3.y0 y0Var, boolean z11, v3.c cVar, n3.h hVar2, int i11) {
        this.f51266a = hVar;
        this.f51267b = y0Var;
        this.f51270e = z11;
        this.f51272g = cVar;
        this.f51273h = hVar2;
    }

    public final void a(v3.m mVar) {
        a9.i iVar = this.f51275j;
        if (iVar == null || mVar != this.f51276k || iVar.a()) {
            this.f51276k = mVar;
            iVar = new a9.i(this.f51266a, j3.t.j(this.f51267b, mVar), this.f51274i, this.f51272g, this.f51273h);
        }
        this.f51275j = iVar;
    }
}
