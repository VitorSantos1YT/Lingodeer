package jh;

import rz.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f36368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f36369c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(o oVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f36367a = i11;
        this.f36369c = oVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f36367a) {
            case 0:
                return new m(this.f36369c, dVar, 0);
            default:
                return new m(this.f36369c, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f36367a) {
            case 0:
                break;
        }
        return ((m) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f36367a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f36368b;
                qy.b0 b0Var = qy.b0.f48488a;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    vt.c cVar = this.f36369c.f36373a;
                    this.f36368b = 1;
                    ((vt.d) cVar).f(this);
                    if (b0Var == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return b0Var;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f36368b;
                qy.b0 b0Var2 = qy.b0.f48488a;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    vt.c cVar2 = this.f36369c.f36373a;
                    this.f36368b = 1;
                    ((vt.d) cVar2).f(this);
                    if (b0Var2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return b0Var2;
        }
    }
}
