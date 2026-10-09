package iv;

import bp.g2;
import com.yalantis.ucrop.view.CropImageView;
import d0.l1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o0.t f34705c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(int i11, o0.t tVar, vy.d dVar) {
        super(2, dVar);
        this.f34703a = i11;
        this.f34705c = tVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f34703a) {
            case 0:
                return new d0(0, this.f34705c, dVar);
            case 1:
                return new d0(1, this.f34705c, dVar);
            case 2:
                return new d0(2, this.f34705c, dVar);
            case 3:
                return new d0(3, this.f34705c, dVar);
            case 4:
                return new d0(4, this.f34705c, dVar);
            default:
                return new d0(5, this.f34705c, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f34703a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return ((d0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF;
        Object objF2;
        int i11 = this.f34703a;
        int i12 = 2;
        o0.t tVar = this.f34705c;
        qy.b0 b0Var = qy.b0.f48488a;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f34704b;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f34704b = 1;
                    return tVar.f(0, b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 7), this) == aVar ? aVar : b0Var;
                }
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
                return b0Var;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f34704b;
                if (i14 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f34704b = 1;
                    return tVar.f(1, b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 7), this) == aVar2 ? aVar2 : b0Var;
                }
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
                return b0Var;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i15 = this.f34704b;
                if (i15 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f34704b = 1;
                    return tVar.f(2, b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 7), this) == aVar3 ? aVar3 : b0Var;
                }
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
                return b0Var;
            case 3:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i16 = this.f34704b;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                this.f34704b = 1;
                float f5 = o0.w.f44457a;
                if (tVar.k() - 1 < 0 || (objF = tVar.f(tVar.k() - 1, b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 7), this)) != aVar4) {
                    objF = b0Var;
                }
                return objF == aVar4 ? aVar4 : b0Var;
            case 4:
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                int i17 = this.f34704b;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                this.f34704b = 1;
                float f11 = o0.w.f44457a;
                if (tVar.k() + 1 >= tVar.m() || (objF2 = tVar.f(tVar.k() + 1, b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 7), this)) != aVar5) {
                    objF2 = b0Var;
                }
                return objF2 == aVar5 ? aVar5 : b0Var;
            default:
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                int i18 = this.f34704b;
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                this.f34704b = 1;
                l1 l1Var = l1.Default;
                g2 g2Var = new g2(i12, 5, null);
                tVar.getClass();
                Object objS = o0.t.s(tVar, l1Var, g2Var, this);
                if (objS != aVar6) {
                    objS = b0Var;
                }
                return objS == aVar6 ? aVar6 : b0Var;
        }
    }
}
