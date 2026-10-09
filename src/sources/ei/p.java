package ei;

import com.yalantis.ucrop.view.CropImageView;
import rz.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class p extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o0.b f25644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f25645d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(o0.b bVar, int i11, vy.d dVar, int i12) {
        super(2, dVar);
        this.f25642a = i12;
        this.f25644c = bVar;
        this.f25645d = i11;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f25642a) {
            case 0:
                return new p(this.f25644c, this.f25645d, dVar, 0);
            case 1:
                return new p(this.f25644c, this.f25645d, dVar, 1);
            case 2:
                return new p(this.f25644c, this.f25645d, dVar, 2);
            default:
                return new p(this.f25644c, this.f25645d, dVar, 3);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f25642a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((p) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f25642a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f25643b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f25643b = 1;
                    if (this.f25644c.f(this.f25645d, b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 7), this) == aVar) {
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
                int i12 = this.f25643b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f25643b = 1;
                    if (this.f25644c.f(this.f25645d, b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 7), this) == aVar2) {
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
                int i13 = this.f25643b;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f25643b = 1;
                    if (this.f25644c.f(this.f25645d, b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 7), this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            default:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f25643b;
                if (i14 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f25643b = 1;
                    if (this.f25644c.f(this.f25645d, b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 7), this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
        }
    }
}
