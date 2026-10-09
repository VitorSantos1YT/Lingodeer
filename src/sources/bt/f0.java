package bt;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0.d f5371c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(b0.d dVar, vy.d dVar2, int i11) {
        super(2, dVar2);
        this.f5369a = i11;
        this.f5371c = dVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f5369a) {
            case 0:
                return new f0(this.f5371c, dVar, 0);
            case 1:
                return new f0(this.f5371c, dVar, 1);
            case 2:
                return new f0(this.f5371c, dVar, 2);
            case 3:
                return new f0(this.f5371c, dVar, 3);
            case 4:
                return new f0(this.f5371c, dVar, 4);
            default:
                return new f0(this.f5371c, dVar, 5);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f5369a) {
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
        return ((f0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f5369a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f5370b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    Float f5 = new Float(CropImageView.DEFAULT_ASPECT_RATIO);
                    b0.i1 i1VarQ = b0.e.q(0.5f, 1500.0f, null, 4);
                    this.f5370b = 1;
                    if (b0.d.c(this.f5371c, f5, i1VarQ, null, this, 12) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f5370b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    Float f11 = new Float(1.0f);
                    b0.g0 g0VarO = b0.e.o(b0.e.r(100, 0, b0.b0.f3441d, 2), b0.u0.Reverse, 4);
                    this.f5370b = 1;
                    if (b0.d.c(this.f5371c, f11, g0VarO, null, this, 12) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f5370b;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    Float f12 = new Float(CropImageView.DEFAULT_ASPECT_RATIO);
                    this.f5370b = 1;
                    if (b0.d.c(this.f5371c, f12, null, null, this, 14) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 3:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f5370b;
                if (i14 == 0) {
                    com.bumptech.glide.e.F(obj);
                    Float f13 = new Float(CropImageView.DEFAULT_ASPECT_RATIO);
                    this.f5370b = 1;
                    if (b0.d.c(this.f5371c, f13, null, null, this, 14) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 4:
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                int i15 = this.f5370b;
                if (i15 == 0) {
                    com.bumptech.glide.e.F(obj);
                    Float f14 = new Float(1.0f);
                    b0.i2 i2VarR = b0.e.r(500, 0, b0.a0.f3422b, 2);
                    this.f5370b = 1;
                    if (b0.d.c(this.f5371c, f14, i2VarR, null, this, 12) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            default:
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                int i16 = this.f5370b;
                if (i16 == 0) {
                    com.bumptech.glide.e.F(obj);
                    Float f15 = new Float(1.0f);
                    b0.i2 i2VarR2 = b0.e.r(500, 0, b0.a0.f3422b, 2);
                    this.f5370b = 1;
                    if (b0.d.c(this.f5371c, f15, i2VarR2, null, this, 12) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
        }
    }
}
