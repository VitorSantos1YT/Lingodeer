package f0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a2 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b2 f26189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f26190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f26191d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(b2 b2Var, float f5, float f11, vy.d dVar) {
        super(2, dVar);
        this.f26189b = b2Var;
        this.f26190c = f5;
        this.f26191d = f11;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new a2(this.f26189b, this.f26190c, this.f26191d, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((a2) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f26188a;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            i2 i2Var = this.f26189b.f26202g0;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.f26190c)) << 32) | (((long) Float.floatToRawIntBits(this.f26191d)) & 4294967295L);
            this.f26188a = 1;
            if (u1.a(i2Var, jFloatToRawIntBits, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        return qy.b0.f48488a;
    }
}
