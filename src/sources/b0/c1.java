package b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends xy.i implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1 f3455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c2 f3456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f3457f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(Object obj, Object obj2, f1 f1Var, c2 c2Var, float f5, vy.d dVar) {
        super(1, dVar);
        this.f3453b = obj;
        this.f3454c = obj2;
        this.f3455d = f1Var;
        this.f3456e = c2Var;
        this.f3457f = f5;
    }

    @Override // xy.a
    public final vy.d create(vy.d dVar) {
        return new c1(this.f3453b, this.f3454c, this.f3455d, this.f3456e, this.f3457f, dVar);
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        return ((c1) create((vy.d) obj)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f3452a;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            b1 b1Var = new b1(this.f3453b, this.f3454c, this.f3455d, this.f3456e, this.f3457f, null);
            this.f3452a = 1;
            if (rz.e0.l(b1Var, this) == aVar) {
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
