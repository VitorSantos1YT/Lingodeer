package bt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class v2 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f6100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p0.c f6101e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f6102f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(int i11, int i12, float f5, p0.c cVar, l1.b1 b1Var, vy.d dVar) {
        super(2, dVar);
        this.f6098b = i11;
        this.f6099c = i12;
        this.f6100d = f5;
        this.f6101e = cVar;
        this.f6102f = b1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new v2(this.f6098b, this.f6099c, this.f6100d, this.f6101e, this.f6102f, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((v2) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f6097a;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            if (this.f6098b == this.f6099c) {
                float f5 = d3.f5309a;
                l1.b1 b1Var = this.f6102f;
                if (!v3.l.a(((v3.l) b1Var.getValue()).f53498a, 0L)) {
                    float f11 = this.f6100d;
                    float f12 = -f11;
                    f2.c cVar = new f2.c(f12, f12, ((int) (((v3.l) b1Var.getValue()).f53498a >> 32)) + f11, ((int) (((v3.l) b1Var.getValue()).f53498a & 4294967295L)) + f11);
                    this.f6097a = 1;
                    if (this.f6101e.a(cVar, this) == aVar) {
                        return aVar;
                    }
                }
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
