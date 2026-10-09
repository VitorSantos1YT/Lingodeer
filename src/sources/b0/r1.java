package b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r1 implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l2 f3657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j2 f3658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f3659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f3660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s f3661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s f3662f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s f3663g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f3664h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public s f3665i;

    public r1(m mVar, j2 j2Var, Object obj, Object obj2, s sVar) {
        this.f3657a = mVar.a(j2Var);
        this.f3658b = j2Var;
        this.f3659c = obj2;
        this.f3660d = obj;
        this.f3661e = (s) j2Var.f3575a.invoke(obj);
        fz.c cVar = j2Var.f3575a;
        this.f3662f = (s) cVar.invoke(obj2);
        this.f3663g = sVar != null ? e.k(sVar) : ((s) cVar.invoke(obj)).c();
        this.f3664h = -1L;
    }

    public final void a(Object obj) {
        if (kotlin.jvm.internal.m.a(obj, this.f3660d)) {
            return;
        }
        this.f3660d = obj;
        this.f3661e = (s) this.f3658b.f3575a.invoke(obj);
        this.f3665i = null;
        this.f3664h = -1L;
    }

    public final void b(Object obj) {
        if (kotlin.jvm.internal.m.a(this.f3659c, obj)) {
            return;
        }
        this.f3659c = obj;
        this.f3662f = (s) this.f3658b.f3575a.invoke(obj);
        this.f3665i = null;
        this.f3664h = -1L;
    }

    @Override // b0.i
    public final boolean c() {
        return this.f3657a.c();
    }

    @Override // b0.i
    public final long d() {
        if (this.f3664h < 0) {
            this.f3664h = this.f3657a.e(this.f3661e, this.f3662f, this.f3663g);
        }
        return this.f3664h;
    }

    @Override // b0.i
    public final j2 e() {
        return this.f3658b;
    }

    @Override // b0.i
    public final s f(long j11) {
        if (!g(j11)) {
            return this.f3657a.m(j11, this.f3661e, this.f3662f, this.f3663g);
        }
        s sVar = this.f3665i;
        if (sVar != null) {
            return sVar;
        }
        s sVarG = this.f3657a.g(this.f3661e, this.f3662f, this.f3663g);
        this.f3665i = sVarG;
        return sVarG;
    }

    @Override // b0.i
    public final Object h(long j11) {
        if (g(j11)) {
            return this.f3659c;
        }
        s sVarI = this.f3657a.i(j11, this.f3661e, this.f3662f, this.f3663g);
        int iB = sVarI.b();
        for (int i11 = 0; i11 < iB; i11++) {
            if (Float.isNaN(sVarI.a(i11))) {
                t0.b("AnimationVector cannot contain a NaN. " + sVarI + ". Animation: " + this + ", playTimeNanos: " + j11);
            }
        }
        return this.f3658b.f3576b.invoke(sVarI);
    }

    @Override // b0.i
    public final Object i() {
        return this.f3659c;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.f3660d + " -> " + this.f3659c + ",initial velocity: " + this.f3663g + ", duration: " + (d() / 1000000) + " ms,animationSpec: " + this.f3657a;
    }
}
