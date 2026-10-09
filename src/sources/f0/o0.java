package f0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends y2.d1 {
    public static final dv.e K = new dv.e(18);
    public final boolean H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0 f26381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h1 f26382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f26383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h0.i f26384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f26385e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final fz.f f26386f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final fz.f f26387t;

    public o0(s0 s0Var, h1 h1Var, boolean z11, h0.i iVar, boolean z12, ad.a0 a0Var, fz.f fVar, boolean z13) {
        this.f26381a = s0Var;
        this.f26382b = h1Var;
        this.f26383c = z11;
        this.f26384d = iVar;
        this.f26385e = z12;
        this.f26386f = a0Var;
        this.f26387t = fVar;
        this.H = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o0.class != obj.getClass()) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return kotlin.jvm.internal.m.a(this.f26381a, o0Var.f26381a) && this.f26382b == o0Var.f26382b && this.f26383c == o0Var.f26383c && kotlin.jvm.internal.m.a(this.f26384d, o0Var.f26384d) && this.f26385e == o0Var.f26385e && kotlin.jvm.internal.m.a(this.f26386f, o0Var.f26386f) && kotlin.jvm.internal.m.a(this.f26387t, o0Var.f26387t) && this.H == o0Var.H;
    }

    @Override // y2.d1
    public final z1.q f() {
        dv.e eVar = K;
        boolean z11 = this.f26383c;
        h0.i iVar = this.f26384d;
        h1 h1Var = this.f26382b;
        r0 r0Var = new r0(eVar, z11, iVar, h1Var);
        r0Var.f26418b0 = this.f26381a;
        r0Var.f26419c0 = h1Var;
        r0Var.f26420d0 = this.f26385e;
        r0Var.f26421e0 = this.f26386f;
        r0Var.f26422f0 = this.f26387t;
        r0Var.f26423g0 = this.H;
        return r0Var;
    }

    public final int hashCode() {
        int iE = defpackage.e.e((this.f26382b.hashCode() + (this.f26381a.hashCode() * 31)) * 31, 31, this.f26383c);
        h0.i iVar = this.f26384d;
        return Boolean.hashCode(this.H) + ((this.f26387t.hashCode() + ((this.f26386f.hashCode() + defpackage.e.e((iE + (iVar != null ? iVar.hashCode() : 0)) * 31, 31, this.f26385e)) * 31)) * 31);
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        boolean z11;
        boolean z12;
        r0 r0Var = (r0) qVar;
        s0 s0Var = r0Var.f26418b0;
        s0 s0Var2 = this.f26381a;
        if (kotlin.jvm.internal.m.a(s0Var, s0Var2)) {
            z11 = false;
        } else {
            r0Var.f26418b0 = s0Var2;
            z11 = true;
        }
        h1 h1Var = r0Var.f26419c0;
        h1 h1Var2 = this.f26382b;
        if (h1Var != h1Var2) {
            r0Var.f26419c0 = h1Var2;
            z11 = true;
        }
        boolean z13 = r0Var.f26423g0;
        boolean z14 = this.H;
        if (z13 != z14) {
            r0Var.f26423g0 = z14;
            z12 = true;
        } else {
            z12 = z11;
        }
        r0Var.f26421e0 = this.f26386f;
        r0Var.f26422f0 = this.f26387t;
        r0Var.f26420d0 = this.f26385e;
        r0Var.e1(K, this.f26383c, this.f26384d, h1Var2, z12);
    }
}
