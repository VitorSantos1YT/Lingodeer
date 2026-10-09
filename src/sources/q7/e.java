package q7;

import p7.y0;
import p7.z0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f47531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0 f47532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f47533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f47534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f47535e;

    public e(g gVar, g gVar2, y0 y0Var, int i11) {
        this.f47535e = gVar;
        this.f47531a = gVar2;
        this.f47532b = y0Var;
        this.f47533c = i11;
    }

    public final void a() {
        if (this.f47534d) {
            return;
        }
        g gVar = this.f47535e;
        k7.c cVar = gVar.f47543t;
        int[] iArr = gVar.f47538b;
        int i11 = this.f47533c;
        cVar.b(iArr[i11], gVar.f47539c[i11], 0, null, gVar.V);
        this.f47534d = true;
    }

    @Override // p7.z0
    public final boolean f() {
        g gVar = this.f47535e;
        return !gVar.z() && this.f47532b.p(gVar.f47537a0);
    }

    @Override // p7.z0
    public final int m(long j11) {
        g gVar = this.f47535e;
        if (gVar.z()) {
            return 0;
        }
        boolean z11 = gVar.f47537a0;
        y0 y0Var = this.f47532b;
        int iO = y0Var.o(j11, z11);
        a aVar = gVar.X;
        if (aVar != null) {
            iO = Math.min(iO, aVar.a(this.f47533c + 1) - y0Var.m());
        }
        y0Var.w(iO);
        if (iO > 0) {
            a();
        }
        return iO;
    }

    @Override // p7.z0
    public final int o(ob.e eVar, e7.d dVar, int i11) {
        g gVar = this.f47535e;
        if (gVar.z()) {
            return -3;
        }
        a aVar = gVar.X;
        y0 y0Var = this.f47532b;
        if (aVar != null && aVar.a(this.f47533c + 1) <= y0Var.m()) {
            return -3;
        }
        a();
        return y0Var.s(eVar, dVar, i11, gVar.f47537a0);
    }

    @Override // p7.z0
    public final void b() {
    }
}
