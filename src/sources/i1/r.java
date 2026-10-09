package i1;

import com.yalantis.ucrop.view.CropImageView;
import l1.k1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.n implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ob.s f34062b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(ob.s sVar, int i11) {
        super(0);
        this.f34061a = i11;
        this.f34062b = sVar;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f34061a) {
            case 0:
                return this.f34062b.h();
            case 1:
                ob.s sVar = this.f34062b;
                return new qy.l(sVar.h(), ((l1.g0) sVar.f44882h).getValue());
            case 2:
                ob.s sVar2 = this.f34062b;
                Object value = ((k1) sVar2.f44886l).getValue();
                if (value != null) {
                    return value;
                }
                float fL = ((l1.g1) sVar2.f44884j).l();
                k1 k1Var = (k1) sVar2.f44881g;
                if (Float.isNaN(fL)) {
                    return k1Var.getValue();
                }
                Object value2 = k1Var.getValue();
                o0 o0VarH = sVar2.h();
                float fD = o0VarH.d(value2);
                if (fD != fL && !Float.isNaN(fD)) {
                    if (fD < fL) {
                        Object objB = o0VarH.b(fL, true);
                        if (objB != null) {
                            return objB;
                        }
                    } else {
                        Object objB2 = o0VarH.b(fL, false);
                        if (objB2 != null) {
                            return objB2;
                        }
                    }
                }
                return value2;
            case 3:
                ob.s sVar3 = this.f34062b;
                float fD2 = sVar3.h().d(((k1) sVar3.f44881g).getValue());
                float fD3 = sVar3.h().d(((l1.g0) sVar3.f44883i).getValue()) - fD2;
                float fAbs = Math.abs(fD3);
                float f5 = 1.0f;
                if (!Float.isNaN(fAbs) && fAbs > 1.0E-6f) {
                    float fR = (sVar3.r() - fD2) / fD3;
                    if (fR < 1.0E-6f) {
                        f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                    } else if (fR <= 0.999999f) {
                        f5 = fR;
                    }
                }
                return Float.valueOf(f5);
            default:
                ob.s sVar4 = this.f34062b;
                Object value3 = ((k1) sVar4.f44886l).getValue();
                if (value3 != null) {
                    return value3;
                }
                float fL2 = ((l1.g1) sVar4.f44884j).l();
                k1 k1Var2 = (k1) sVar4.f44881g;
                return !Float.isNaN(fL2) ? sVar4.e(fL2, CropImageView.DEFAULT_ASPECT_RATIO, k1Var2.getValue()) : k1Var2.getValue();
        }
    }
}
