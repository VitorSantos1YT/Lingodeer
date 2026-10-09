package rt;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class v3 extends xy.i implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f50524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ uz.j f50525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f50526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b4 f50527e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v3(int i11, b4 b4Var, vy.d dVar) {
        super(3, dVar);
        this.f50523a = i11;
        this.f50527e = b4Var;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        uz.j jVar = (uz.j) obj;
        vy.d dVar = (vy.d) obj3;
        switch (this.f50523a) {
            case 0:
                v3 v3Var = new v3(0, this.f50527e, dVar);
                v3Var.f50525c = jVar;
                v3Var.f50526d = obj2;
                return v3Var.invokeSuspend(qy.b0.f48488a);
            default:
                v3 v3Var2 = new v3(1, this.f50527e, dVar);
                v3Var2.f50525c = jVar;
                v3Var2.f50526d = obj2;
                return v3Var2.invokeSuspend(qy.b0.f48488a);
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        uz.i iVarD;
        uz.i s3Var;
        switch (this.f50523a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f50524b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    uz.j jVar = this.f50525c;
                    m0 m0Var = (m0) this.f50526d;
                    if (m0Var == null) {
                        iVarD = new gp.r(null, 9);
                    } else {
                        iVarD = ((fr.r) this.f50527e.f49495f).d(m0Var.f50042a);
                    }
                    this.f50525c = null;
                    this.f50526d = null;
                    this.f50524b = 1;
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
                int i12 = this.f50524b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    uz.j jVar2 = this.f50525c;
                    m0 m0Var2 = (m0) this.f50526d;
                    if (m0Var2 == null) {
                        s3Var = new gp.r(new dc(false, BuildConfig.VERSION_NAME), 9);
                    } else {
                        b4 b4Var = this.f50527e;
                        vt.p0 p0Var = b4Var.f49507t;
                        fr.x0 x0Var = (fr.x0) p0Var;
                        s3Var = new s3(x0Var.c(com.bumptech.glide.g.h(m0Var2.f50045d, xt.d.k(((fr.o0) b4Var.f49491d).f27733a.keyLanguage), m0Var2.f50044c)), 0);
                    }
                    this.f50525c = null;
                    this.f50526d = null;
                    this.f50524b = 1;
                    if (uz.x0.q(jVar2, s3Var, this) == aVar2) {
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
