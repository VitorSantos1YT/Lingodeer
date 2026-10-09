package f0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y1 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b2 f26502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ long f26503d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y1(b2 b2Var, long j11, vy.d dVar, int i11) {
        super(2, dVar);
        this.f26500a = i11;
        this.f26502c = b2Var;
        this.f26503d = j11;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f26500a) {
            case 0:
                return new y1(this.f26502c, this.f26503d, dVar, 0);
            case 1:
                return new y1(this.f26502c, this.f26503d, dVar, 1);
            case 2:
                return new y1(this.f26502c, this.f26503d, dVar, 2);
            default:
                y1 y1Var = new y1(this.f26502c, dVar);
                y1Var.f26503d = ((f2.b) obj).f26570a;
                return y1Var;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f26500a) {
            case 0:
                return ((y1) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 1:
                return ((y1) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 2:
                return ((y1) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                long j11 = ((f2.b) obj).f26570a;
                y1 y1Var = new y1(this.f26502c, (vy.d) obj2);
                y1Var.f26503d = j11;
                return y1Var.invokeSuspend(qy.b0.f48488a);
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f26500a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f26501b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    i2 i2Var = this.f26502c.f26202g0;
                    long j11 = this.f26503d;
                    this.f26501b = 1;
                    if (i2Var.b(j11, false, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f26501b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    i2 i2Var2 = this.f26502c.f26202g0;
                    d0.l1 l1Var = d0.l1.UserInput;
                    z1 z1Var = new z1(this.f26503d, null);
                    this.f26501b = 1;
                    if (i2Var2.f(l1Var, z1Var, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f26501b;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    i2 i2Var3 = this.f26502c.f26202g0;
                    long j12 = this.f26503d;
                    this.f26501b = 1;
                    if (i2Var3.b(j12, true, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            default:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f26501b;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                long j13 = this.f26503d;
                i2 i2Var4 = this.f26502c.f26202g0;
                this.f26501b = 1;
                Object objA = u1.a(i2Var4, j13, this);
                return objA == aVar4 ? aVar4 : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(b2 b2Var, vy.d dVar) {
        super(2, dVar);
        this.f26500a = 3;
        this.f26502c = b2Var;
    }
}
