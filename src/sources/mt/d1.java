package mt;

import androidx.lifecycle.viewmodel.compose.NP.IMCc;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d1 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f41332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o0.t f41333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f41334d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(o0.t tVar, int i11, vy.d dVar, int i12) {
        super(2, dVar);
        this.f41331a = i12;
        this.f41333c = tVar;
        this.f41334d = i11;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f41331a) {
            case 0:
                return new d1(this.f41333c, this.f41334d, dVar, 0);
            case 1:
                return new d1(this.f41333c, this.f41334d, dVar, 1);
            default:
                return new d1(this.f41333c, this.f41334d, dVar, 2);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f41331a) {
            case 0:
                return ((d1) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 1:
                return ((d1) create((f0.n1) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((d1) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f41331a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f41332b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    o0.t tVar = this.f41333c;
                    int iK = tVar.k();
                    int i12 = this.f41334d;
                    if (iK != i12) {
                        this.f41332b = 1;
                        if (o0.t.t(tVar, i12, this) == aVar) {
                            return aVar;
                        }
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
                int i13 = this.f41332b;
                qy.b0 b0Var = qy.b0.f48488a;
                o0.t tVar2 = this.f41333c;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f41332b = 1;
                    Object objF = tVar2.f44453w.f(this);
                    if (objF != aVar2) {
                        objF = b0Var;
                    }
                    if (objF == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                double d5 = CropImageView.DEFAULT_ASPECT_RATIO;
                if (-0.5d > d5 || d5 > 0.5d) {
                    i0.a.a("pageOffsetFraction 0.0 is not within the range -0.5 to 0.5");
                }
                tVar2.u(CropImageView.DEFAULT_ASPECT_RATIO, tVar2.j(this.f41334d), true);
                return b0Var;
            default:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f41332b;
                if (i14 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f41332b = 1;
                    if (this.f41333c.f(this.f41334d, b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 7), this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException(IMCc.kCRQqXWfhN);
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
        }
    }
}
