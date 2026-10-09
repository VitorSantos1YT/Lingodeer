package dt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s1 extends xy.i implements fz.e {
    public final /* synthetic */ float H;
    public final /* synthetic */ l1.b1 K;
    public final /* synthetic */ l1.b1 L;
    public final /* synthetic */ l1.g1 M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f24176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f24177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f24178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f24179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f24180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f24181f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f24182t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(l1.b1 b1Var, l1.b1 b1Var2, float f5, float f11, float f12, float f13, float f14, float f15, l1.b1 b1Var3, l1.b1 b1Var4, l1.g1 g1Var, vy.d dVar) {
        super(2, dVar);
        this.f24176a = b1Var;
        this.f24177b = b1Var2;
        this.f24178c = f5;
        this.f24179d = f11;
        this.f24180e = f12;
        this.f24181f = f13;
        this.f24182t = f14;
        this.H = f15;
        this.K = b1Var3;
        this.L = b1Var4;
        this.M = g1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new s1(this.f24176a, this.f24177b, this.f24178c, this.f24179d, this.f24180e, this.f24181f, this.f24182t, this.H, this.K, this.L, this.M, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        s1 s1Var = (s1) create((rz.b0) obj, (vy.d) obj2);
        qy.b0 b0Var = qy.b0.f48488a;
        s1Var.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        long j11;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        l1.b1 b1Var = this.f24176a;
        long jV = 0;
        boolean zA = v3.l.a(((v3.l) b1Var.getValue()).f53498a, 0L);
        qy.b0 b0Var = qy.b0.f48488a;
        if (zA) {
            return b0Var;
        }
        l1.b1 b1Var2 = this.f24177b;
        boolean zBooleanValue = ((Boolean) b1Var2.getValue()).booleanValue();
        l1.g1 g1Var = this.M;
        l1.b1 b1Var3 = this.L;
        l1.b1 b1Var4 = this.K;
        if (zBooleanValue) {
            e.x(e.v(this.f24179d, this.f24178c, this.f24180e, this.f24181f, this.f24182t, b1Var, e.w(b1Var4)), b1Var4);
            e.y(e.v(this.f24179d, this.f24178c, this.f24180e, this.f24181f, this.f24182t, b1Var, ((f2.b) b1Var3.getValue()).f26570a), b1Var3);
            g1Var.m(e.u(this.f24180e, this.f24179d, this.f24181f, this.f24182t, b1Var, g1Var.l()));
            return b0Var;
        }
        if (v3.l.a(((v3.l) b1Var.getValue()).f53498a, 0L)) {
            j11 = 4294967295L;
        } else {
            float f5 = (int) (((v3.l) b1Var.getValue()).f53498a >> 32);
            float f11 = this.f24178c;
            float f12 = f5 - f11;
            float f13 = this.f24179d;
            long j12 = ((v3.l) b1Var.getValue()).f53498a;
            float f14 = this.f24180e;
            j11 = 4294967295L;
            b1Var = b1Var;
            jV = e.v(f13, f11, f14, this.f24181f, this.f24182t, b1Var, (((long) Float.floatToRawIntBits(f12 - f13)) << 32) | (((long) Float.floatToRawIntBits(f14 + f13 + this.H)) & 4294967295L));
        }
        e.x(jV, b1Var4);
        e.y(jV, b1Var3);
        g1Var.m(e.u(this.f24180e, this.f24179d, this.f24181f, this.f24182t, b1Var, Float.intBitsToFloat((int) (jV & j11))));
        b1Var2.setValue(Boolean.TRUE);
        return b0Var;
    }
}
