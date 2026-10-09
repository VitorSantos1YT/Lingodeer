package fr;

import com.lingodeer.data.env.Env;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class n0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0 f27716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f27717c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(o0 o0Var, String str, vy.d dVar, int i11) {
        super(2, dVar);
        this.f27715a = i11;
        this.f27716b = o0Var;
        this.f27717c = str;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f27715a) {
            case 0:
                return new n0(this.f27716b, this.f27717c, dVar, 0);
            default:
                return new n0(this.f27716b, this.f27717c, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f27715a) {
            case 0:
                n0 n0Var = (n0) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                n0Var.invokeSuspend(b0Var2);
                return b0Var2;
            default:
                n0 n0Var2 = (n0) create(b0Var, dVar);
                qy.b0 b0Var3 = qy.b0.f48488a;
                n0Var2.invokeSuspend(b0Var3);
                return b0Var3;
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f27715a;
        qy.b0 b0Var = qy.b0.f48488a;
        String str = this.f27717c;
        o0 o0Var = this.f27716b;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Env env = o0Var.f27733a;
                env.userPicName = str;
                env.updateEntry("userPicName");
                break;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Env env2 = o0Var.f27733a;
                env2.uid = str;
                env2.updateEntry("uid");
                break;
        }
        return b0Var;
    }
}
