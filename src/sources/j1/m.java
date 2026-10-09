package j1;

import com.yalantis.ucrop.view.CropImageView;
import rz.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f35502c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(p pVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f35500a = i11;
        this.f35502c = pVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f35500a) {
            case 0:
                return new m(this.f35502c, dVar, 0);
            case 1:
                return new m(this.f35502c, dVar, 1);
            default:
                return new m(this.f35502c, dVar, 2);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f35500a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((m) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f35500a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f35501b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    p pVar = this.f35502c;
                    if (pVar.S) {
                        q qVar = pVar.V;
                        this.f35501b = 1;
                        if (((s) qVar).a(1.0f, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        q qVar2 = pVar.V;
                        this.f35501b = 2;
                        if (((s) qVar2).a(CropImageView.DEFAULT_ASPECT_RATIO, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i11 != 1 && i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f35501b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    p pVar2 = this.f35502c;
                    q qVar3 = pVar2.V;
                    float fL = pVar2.Y.l() / pVar2.Z0();
                    this.f35501b = 1;
                    if (((s) qVar3).a(fL, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            default:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f35501b;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    p pVar3 = this.f35502c;
                    if (pVar3.S) {
                        this.f35501b = 2;
                        if (pVar3.X0(this) == aVar3) {
                            return aVar3;
                        }
                    } else {
                        this.f35501b = 1;
                        if (pVar3.W0(this) == aVar3) {
                            return aVar3;
                        }
                    }
                } else {
                    if (i13 != 1 && i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
        }
    }
}
