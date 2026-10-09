package mt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k2 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rt.j2 f41592b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k2(rt.j2 j2Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f41591a = i11;
        this.f41592b = j2Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f41591a) {
            case 0:
                return new k2(this.f41592b, dVar, 0);
            case 1:
                return new k2(this.f41592b, dVar, 1);
            case 2:
                return new k2(this.f41592b, dVar, 2);
            default:
                return new k2(this.f41592b, dVar, 3);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f41591a) {
            case 0:
                k2 k2Var = (k2) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                k2Var.invokeSuspend(b0Var2);
                return b0Var2;
            case 1:
                k2 k2Var2 = (k2) create(b0Var, dVar);
                qy.b0 b0Var3 = qy.b0.f48488a;
                k2Var2.invokeSuspend(b0Var3);
                return b0Var3;
            case 2:
                k2 k2Var3 = (k2) create(b0Var, dVar);
                qy.b0 b0Var4 = qy.b0.f48488a;
                k2Var3.invokeSuspend(b0Var4);
                return b0Var4;
            default:
                k2 k2Var4 = (k2) create(b0Var, dVar);
                qy.b0 b0Var5 = qy.b0.f48488a;
                k2Var4.invokeSuspend(b0Var5);
                return b0Var5;
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f41591a;
        qy.b0 b0Var = qy.b0.f48488a;
        rt.j2 j2Var = this.f41592b;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                j2Var.a();
                break;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                j2Var.P.k(((q2[]) q2.a().toArray(new q2[0]))[((fr.o0) j2Var.f49907d).f27733a.flashCardPracticeMode]);
                break;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                uz.i1 i1Var = j2Var.Q;
                Boolean boolValueOf = Boolean.valueOf(((fr.o0) j2Var.f49907d).f27733a.flashCardShuffleNewReviews);
                i1Var.getClass();
                i1Var.l(null, boolValueOf);
                break;
            default:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                uz.i1 i1Var2 = j2Var.R;
                Integer num = new Integer(((fr.o0) j2Var.f49907d).f27733a.flashCardDailyNewReviewsLimit);
                i1Var2.getClass();
                i1Var2.l(null, num);
                break;
        }
        return b0Var;
    }
}
