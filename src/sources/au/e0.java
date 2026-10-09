package au;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e0 extends xy.i implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f2981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2983e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(Object obj, String str, int i11, vy.d dVar, int i12) {
        super(1, dVar);
        this.f2979a = i12;
        this.f2983e = obj;
        this.f2981c = str;
        this.f2982d = i11;
    }

    @Override // xy.a
    public final vy.d create(vy.d dVar) {
        switch (this.f2979a) {
            case 0:
                return new e0((f0) this.f2983e, this.f2981c, this.f2982d, dVar, 0);
            default:
                return new e0((k0) this.f2983e, this.f2981c, this.f2982d, dVar, 1);
        }
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        vy.d dVar = (vy.d) obj;
        switch (this.f2979a) {
            case 0:
                break;
        }
        return ((e0) create(dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f2979a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f2980b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    f0 f0Var = (f0) this.f2983e;
                    this.f2980b = 1;
                    if (f0.b(f0Var, this.f2981c, this.f2982d, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f2980b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    k0 k0Var = (k0) this.f2983e;
                    this.f2980b = 1;
                    if (k0.b(k0Var, this.f2981c, this.f2982d, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
        }
    }
}
