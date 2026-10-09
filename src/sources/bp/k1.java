package bp;

import com.lingodeer.data.env.Env;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class k1 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Env f4668b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1(Env env, vy.d dVar, int i11) {
        super(2, dVar);
        this.f4667a = i11;
        this.f4668b = env;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f4667a) {
            case 0:
                return new k1(this.f4668b, dVar, 0);
            default:
                return new k1(this.f4668b, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f4667a) {
            case 0:
                k1 k1Var = (k1) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                k1Var.invokeSuspend(b0Var2);
                return b0Var2;
            default:
                k1 k1Var2 = (k1) create(b0Var, dVar);
                qy.b0 b0Var3 = qy.b0.f48488a;
                k1Var2.invokeSuspend(b0Var3);
                return b0Var3;
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f4667a;
        qy.b0 b0Var = qy.b0.f48488a;
        Env env = this.f4668b;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                env.hasConfirmEnLevel = true;
                env.updateEntry("hasConfirmEnLevel");
                env.enFreesUnitSortIndex = 1;
                env.updateEntry("enFreesUnitSortIndex");
                break;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                env.hasConfirmEnLevel = true;
                env.updateEntry("hasConfirmEnLevel");
                env.enFreesUnitSortIndex = 7;
                env.updateEntry("enFreesUnitSortIndex");
                break;
        }
        return b0Var;
    }
}
