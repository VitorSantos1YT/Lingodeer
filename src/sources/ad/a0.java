package ad;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends xy.i implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f566a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(int i11, int i12, vy.d dVar) {
        super(i11, dVar);
        this.f566a = i12;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f566a) {
            case 0:
                ((Number) obj).intValue();
                new a0(3, 0, (vy.d) obj3).invokeSuspend(qy.b0.f48488a);
                return Boolean.FALSE;
            case 1:
                a0 a0Var = new a0(3, 1, (vy.d) obj3);
                qy.b0 b0Var = qy.b0.f48488a;
                a0Var.invokeSuspend(b0Var);
                return b0Var;
            case 2:
                long j11 = ((f2.b) obj2).f26570a;
                a0 a0Var2 = new a0(3, 2, (vy.d) obj3);
                qy.b0 b0Var2 = qy.b0.f48488a;
                a0Var2.invokeSuspend(b0Var2);
                return b0Var2;
            case 3:
                ((Number) obj2).floatValue();
                a0 a0Var3 = new a0(3, 3, (vy.d) obj3);
                qy.b0 b0Var3 = qy.b0.f48488a;
                a0Var3.invokeSuspend(b0Var3);
                return b0Var3;
            case 4:
                long j12 = ((f2.b) obj2).f26570a;
                a0 a0Var4 = new a0(3, 4, (vy.d) obj3);
                qy.b0 b0Var4 = qy.b0.f48488a;
                a0Var4.invokeSuspend(b0Var4);
                return b0Var4;
            case 5:
                a0 a0Var5 = new a0(3, 5, (vy.d) obj3);
                qy.b0 b0Var5 = qy.b0.f48488a;
                a0Var5.invokeSuspend(b0Var5);
                return b0Var5;
            case 6:
                a0 a0Var6 = new a0(3, 6, (vy.d) obj3);
                qy.b0 b0Var6 = qy.b0.f48488a;
                a0Var6.invokeSuspend(b0Var6);
                return b0Var6;
            default:
                ((Number) obj).intValue();
                a0 a0Var7 = new a0(3, 7, (vy.d) obj3);
                qy.b0 b0Var7 = qy.b0.f48488a;
                a0Var7.invokeSuspend(b0Var7);
                return b0Var7;
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f566a;
        qy.b0 b0Var = qy.b0.f48488a;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return Boolean.FALSE;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return b0Var;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return b0Var;
            case 3:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return b0Var;
            case 4:
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return b0Var;
            case 5:
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return b0Var;
            case 6:
                wy.a aVar7 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return b0Var;
            default:
                wy.a aVar8 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return b0Var;
        }
    }
}
