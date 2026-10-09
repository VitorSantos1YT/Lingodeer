package s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 extends xy.i implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f51050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ f0.l1 f51051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ long f51052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rz.b0 f51053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f51054e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h0.i f51055f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(rz.b0 b0Var, l1.b1 b1Var, h0.i iVar, vy.d dVar) {
        super(3, dVar);
        this.f51053d = b0Var;
        this.f51054e = b1Var;
        this.f51055f = iVar;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j11 = ((f2.b) obj2).f26570a;
        l1.b1 b1Var = this.f51054e;
        h0.i iVar = this.f51055f;
        h1 h1Var = new h1(this.f51053d, b1Var, iVar, (vy.d) obj3);
        h1Var.f51051b = (f0.l1) obj;
        h1Var.f51052c = j11;
        return h1Var.invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f51050a;
        rz.b0 b0Var = this.f51053d;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            f0.l1 l1Var = this.f51051b;
            rz.e0.B(b0Var, null, null, new bh.l(this.f51054e, this.f51052c, this.f51055f, (vy.d) null, 13), 3);
            this.f51050a = 1;
            obj = l1Var.f(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        rz.e0.B(b0Var, null, null, new et.c0(this.f51054e, ((Boolean) obj).booleanValue(), this.f51055f, (vy.d) null), 3);
        return qy.b0.f48488a;
    }
}
