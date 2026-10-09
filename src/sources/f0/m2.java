package f0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m2 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1 f26369b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m2(l1 l1Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f26368a = i11;
        this.f26369b = l1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f26368a) {
            case 0:
                return new m2(this.f26369b, dVar, 0);
            case 1:
                return new m2(this.f26369b, dVar, 1);
            case 2:
                return new m2(this.f26369b, dVar, 2);
            case 3:
                return new m2(this.f26369b, dVar, 3);
            case 4:
                return new m2(this.f26369b, dVar, 4);
            case 5:
                return new m2(this.f26369b, dVar, 5);
            case 6:
                return new m2(this.f26369b, dVar, 6);
            default:
                return new m2(this.f26369b, dVar, 7);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f26368a) {
            case 0:
                m2 m2Var = (m2) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                m2Var.invokeSuspend(b0Var2);
                return b0Var2;
            case 1:
                m2 m2Var2 = (m2) create(b0Var, dVar);
                qy.b0 b0Var3 = qy.b0.f48488a;
                m2Var2.invokeSuspend(b0Var3);
                return b0Var3;
            case 2:
                m2 m2Var3 = (m2) create(b0Var, dVar);
                qy.b0 b0Var4 = qy.b0.f48488a;
                m2Var3.invokeSuspend(b0Var4);
                return b0Var4;
            case 3:
                m2 m2Var4 = (m2) create(b0Var, dVar);
                qy.b0 b0Var5 = qy.b0.f48488a;
                m2Var4.invokeSuspend(b0Var5);
                return b0Var5;
            case 4:
                m2 m2Var5 = (m2) create(b0Var, dVar);
                qy.b0 b0Var6 = qy.b0.f48488a;
                m2Var5.invokeSuspend(b0Var6);
                return b0Var6;
            case 5:
                m2 m2Var6 = (m2) create(b0Var, dVar);
                qy.b0 b0Var7 = qy.b0.f48488a;
                m2Var6.invokeSuspend(b0Var7);
                return b0Var7;
            case 6:
                m2 m2Var7 = (m2) create(b0Var, dVar);
                qy.b0 b0Var8 = qy.b0.f48488a;
                m2Var7.invokeSuspend(b0Var8);
                return b0Var8;
            default:
                m2 m2Var8 = (m2) create(b0Var, dVar);
                qy.b0 b0Var9 = qy.b0.f48488a;
                m2Var8.invokeSuspend(b0Var9);
                return b0Var9;
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f26368a;
        qy.b0 b0Var = qy.b0.f48488a;
        l1 l1Var = this.f26369b;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                l1Var.b();
                break;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                l1Var.c();
                break;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                l1Var.c();
                break;
            case 3:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                l1Var.b();
                break;
            case 4:
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                l1Var.c();
                break;
            case 5:
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                l1Var.c();
                break;
            case 6:
                wy.a aVar7 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                l1Var.b();
                break;
            default:
                wy.a aVar8 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                l1Var.c();
                break;
        }
        return b0Var;
    }
}
