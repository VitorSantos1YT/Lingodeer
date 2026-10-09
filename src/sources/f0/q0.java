package f0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f26411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r0 f26412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f26413e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(r0 r0Var, long j11, vy.d dVar, int i11) {
        super(2, dVar);
        this.f26409a = i11;
        this.f26412d = r0Var;
        this.f26413e = j11;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f26409a) {
            case 0:
                q0 q0Var = new q0(this.f26412d, this.f26413e, dVar, 0);
                q0Var.f26411c = obj;
                return q0Var;
            default:
                q0 q0Var2 = new q0(this.f26412d, this.f26413e, dVar, 1);
                q0Var2.f26411c = obj;
                return q0Var2;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f26409a) {
            case 0:
                break;
        }
        return ((q0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f26409a;
        qy.b0 b0Var = qy.b0.f48488a;
        long j11 = this.f26413e;
        r0 r0Var = this.f26412d;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f26410b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                rz.b0 b0Var2 = (rz.b0) this.f26411c;
                fz.f fVar = r0Var.f26421e0;
                f2.b bVar = new f2.b(j11);
                this.f26410b = 1;
                return fVar.invoke(b0Var2, bVar, this) == aVar ? aVar : b0Var;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f26410b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                rz.b0 b0Var3 = (rz.b0) this.f26411c;
                fz.f fVar2 = r0Var.f26422f0;
                long jF = v3.q.f(j11, r0Var.f26423g0 ? -1.0f : 1.0f);
                h1 h1Var = r0Var.f26419c0;
                ad.a0 a0Var = p0.f26394a;
                Float f5 = new Float(h1Var == h1.Vertical ? v3.q.c(jF) : v3.q.b(jF));
                this.f26410b = 1;
                return fVar2.invoke(b0Var3, f5, this) == aVar2 ? aVar2 : b0Var;
        }
    }
}
