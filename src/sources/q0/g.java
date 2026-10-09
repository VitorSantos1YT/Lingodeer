package q0;

import d0.z;
import dt.i2;
import g3.a0;
import g3.b0;
import g3.k;
import g3.x;
import mz.j;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends z {

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f47345n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public fz.c f47346o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final lt.e f47347p0;

    public g(boolean z11, h0.i iVar, boolean z12, k kVar, fz.c cVar) {
        super(iVar, null, false, z12, null, kVar, new i2(cVar, z11, 1));
        this.f47345n0 = z11;
        this.f47346o0 = cVar;
        this.f47347p0 = new lt.e(this, 16);
    }

    @Override // d0.f
    public final void W0(b0 b0Var) {
        i3.a aVar = this.f47345n0 ? i3.a.On : i3.a.Off;
        j[] jVarArr = g3.z.f28737a;
        a0 a0Var = x.J;
        j jVar = g3.z.f28737a[25];
        b0Var.b(a0Var, aVar);
    }
}
