package rt;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class w9 extends xy.i implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f50580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ uz.j f50581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f50582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y9 f50583e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w9(int i11, y9 y9Var, vy.d dVar) {
        super(3, dVar);
        this.f50579a = i11;
        this.f50583e = y9Var;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        uz.j jVar = (uz.j) obj;
        vy.d dVar = (vy.d) obj3;
        switch (this.f50579a) {
            case 0:
                w9 w9Var = new w9(0, this.f50583e, dVar);
                w9Var.f50581c = jVar;
                w9Var.f50582d = obj2;
                return w9Var.invokeSuspend(qy.b0.f48488a);
            default:
                w9 w9Var2 = new w9(1, this.f50583e, dVar);
                w9Var2.f50581c = jVar;
                w9Var2.f50582d = obj2;
                return w9Var2.invokeSuspend(qy.b0.f48488a);
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        uz.i iVarD;
        uz.i rVar;
        switch (this.f50579a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f50580b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    uz.j jVar = this.f50581c;
                    ja jaVar = (ja) this.f50582d;
                    if (jaVar == null) {
                        iVarD = new gp.r(null, 9);
                    } else {
                        iVarD = ((fr.r) this.f50583e.f50705c).d(jaVar.f49927a);
                    }
                    this.f50581c = null;
                    this.f50582d = null;
                    this.f50580b = 1;
                    if (uz.x0.q(jVar, iVarD, this) == aVar) {
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
                int i12 = this.f50580b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    uz.j jVar2 = this.f50581c;
                    ja jaVar2 = (ja) this.f50582d;
                    y9 y9Var = this.f50583e;
                    vt.p0 p0Var = y9Var.f50707d;
                    if (jaVar2 == null || !jaVar2.f49933g || p0Var == null) {
                        rVar = new gp.r(new dc(false, BuildConfig.VERSION_NAME), 9);
                    } else {
                        fr.x0 x0Var = (fr.x0) p0Var;
                        rVar = new s3(x0Var.c(com.bumptech.glide.g.h(jaVar2.f49930d, xt.d.k(((fr.o0) y9Var.f50701a).f27733a.keyLanguage), jaVar2.f49929c)), 2);
                    }
                    this.f50581c = null;
                    this.f50582d = null;
                    this.f50580b = 1;
                    if (uz.x0.q(jVar2, rVar, this) == aVar2) {
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
