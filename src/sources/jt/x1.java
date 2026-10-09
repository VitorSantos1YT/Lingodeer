package jt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class x1 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a2 f37268c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x1(a2 a2Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f37266a = i11;
        this.f37268c = a2Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f37266a) {
            case 0:
                return new x1(this.f37268c, dVar, 0);
            default:
                return new x1(this.f37268c, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f37266a) {
            case 0:
                break;
        }
        return ((x1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f37266a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f37267b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f37267b = 1;
                    if (rz.e0.m(300L, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                a2 a2Var = this.f37268c;
                a2Var.f36880i.setValue(null);
                a2Var.f36879h.setValue(null);
                a2Var.f36878g.setValue(b2.f36896a);
                a2Var.f36881j.setValue(Boolean.FALSE);
                return qy.b0.f48488a;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f37267b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f37267b = 1;
                    if (this.f37268c.b(this) == aVar2) {
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
