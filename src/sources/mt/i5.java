package mt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i5 extends xy.i implements fz.e {
    public final /* synthetic */ rt.b5 H;
    public final /* synthetic */ l1.b1 K;
    public final /* synthetic */ l1.b1 L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f41551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Integer f41552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v3.c f41553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f41554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f41555f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l0.w f41556t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(boolean z11, Integer num, v3.c cVar, int i11, int i12, l0.w wVar, rt.b5 b5Var, l1.b1 b1Var, l1.b1 b1Var2, vy.d dVar) {
        super(2, dVar);
        this.f41551b = z11;
        this.f41552c = num;
        this.f41553d = cVar;
        this.f41554e = i11;
        this.f41555f = i12;
        this.f41556t = wVar;
        this.H = b5Var;
        this.K = b1Var;
        this.L = b1Var2;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new i5(this.f41551b, this.f41552c, this.f41553d, this.f41554e, this.f41555f, this.f41556t, this.H, this.K, this.L, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((i5) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f41550a;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            if (this.f41551b) {
                Integer num = this.f41552c;
                int iIntValue = (num != null ? num.intValue() : this.f41553d.n0(l5.f41627a)) - this.f41554e;
                if (iIntValue < 0) {
                    iIntValue = 0;
                }
                int i12 = (this.f41555f - iIntValue) / 2;
                int i13 = i12 >= 0 ? i12 : 0;
                float f5 = l5.f41627a;
                this.K.setValue(null);
                this.L.setValue(Boolean.FALSE);
                this.f41550a = 1;
                if (this.f41556t.f(this.H.f49514g + 1, -i13, this) == aVar) {
                    return aVar;
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
