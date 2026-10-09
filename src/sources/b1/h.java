package b1;

import d1.z0;
import j3.x0;
import o3.d0;
import s0.s0;
import y2.d1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends d1 {
    public final z0 H;
    public final o3.j K;
    public final e2.v L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f3780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o3.w f3781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s0 f3782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f3784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f3785f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o3.p f3786t;

    public h(d0 d0Var, o3.w wVar, s0 s0Var, boolean z11, boolean z12, boolean z13, o3.p pVar, z0 z0Var, o3.j jVar, e2.v vVar) {
        this.f3780a = d0Var;
        this.f3781b = wVar;
        this.f3782c = s0Var;
        this.f3783d = z11;
        this.f3784e = z12;
        this.f3785f = z13;
        this.f3786t = pVar;
        this.H = z0Var;
        this.K = jVar;
        this.L = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return kotlin.jvm.internal.m.a(this.f3780a, hVar.f3780a) && kotlin.jvm.internal.m.a(this.f3781b, hVar.f3781b) && kotlin.jvm.internal.m.a(this.f3782c, hVar.f3782c) && this.f3783d == hVar.f3783d && this.f3784e == hVar.f3784e && this.f3785f == hVar.f3785f && kotlin.jvm.internal.m.a(this.f3786t, hVar.f3786t) && kotlin.jvm.internal.m.a(this.H, hVar.H) && kotlin.jvm.internal.m.a(this.K, hVar.K) && kotlin.jvm.internal.m.a(this.L, hVar.L);
    }

    @Override // y2.d1
    public final z1.q f() {
        k kVar = new k();
        kVar.S = this.f3780a;
        kVar.T = this.f3781b;
        kVar.U = this.f3782c;
        kVar.V = this.f3783d;
        kVar.W = this.f3784e;
        kVar.X = this.f3785f;
        kVar.Y = this.f3786t;
        z0 z0Var = this.H;
        kVar.Z = z0Var;
        kVar.f3791a0 = this.K;
        kVar.f3792b0 = this.L;
        z0Var.f23043g = new i(kVar, 4);
        return kVar;
    }

    public final int hashCode() {
        return this.L.hashCode() + ((this.K.hashCode() + ((this.H.hashCode() + ((this.f3786t.hashCode() + defpackage.e.e(defpackage.e.e(defpackage.e.e((this.f3782c.hashCode() + ((this.f3781b.hashCode() + (this.f3780a.hashCode() * 31)) * 31)) * 31, 31, this.f3783d), 31, this.f3784e), 31, this.f3785f)) * 31)) * 31)) * 31);
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        k kVar = (k) qVar;
        boolean z11 = kVar.W;
        boolean z12 = false;
        boolean z13 = z11 && !kVar.V;
        boolean z14 = kVar.X;
        o3.j jVar = kVar.f3791a0;
        z0 z0Var = kVar.Z;
        boolean z15 = this.f3783d;
        boolean z16 = this.f3784e;
        if (z16 && !z15) {
            z12 = true;
        }
        kVar.S = this.f3780a;
        o3.w wVar = this.f3781b;
        kVar.T = wVar;
        kVar.U = this.f3782c;
        kVar.V = z15;
        kVar.W = z16;
        kVar.Y = this.f3786t;
        z0 z0Var2 = this.H;
        kVar.Z = z0Var2;
        o3.j jVar2 = this.K;
        kVar.f3791a0 = jVar2;
        kVar.f3792b0 = this.L;
        if (z16 != z11 || z12 != z13 || !kotlin.jvm.internal.m.a(jVar2, jVar) || this.f3785f != z14 || !x0.c(wVar.f44705b)) {
            y2.f.o(kVar);
        }
        if (z0Var2.equals(z0Var)) {
            return;
        }
        z0Var2.f23043g = new i(kVar, 0);
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.f3780a + ", value=" + this.f3781b + ", state=" + this.f3782c + ", readOnly=" + this.f3783d + ", enabled=" + this.f3784e + ", isPassword=" + this.f3785f + ", offsetMapping=" + this.f3786t + ", manager=" + this.H + ", imeOptions=" + this.K + ", focusRequester=" + this.L + ')';
    }
}
