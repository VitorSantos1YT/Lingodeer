package ad;

import com.yalantis.ucrop.view.CropImageView;
import l1.k1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.n implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f594b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(i iVar, int i11) {
        super(0);
        this.f593a = i11;
        this.f594b = iVar;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f593a) {
            case 0:
                i iVar = this.f594b;
                k1 k1Var = iVar.f603e;
                wc.h hVar = (wc.h) iVar.K.getValue();
                float f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                if (hVar != null) {
                    if (((Number) iVar.f604f.getValue()).floatValue() < CropImageView.DEFAULT_ASPECT_RATIO) {
                        if (k1Var.getValue() != null) {
                            throw new ClassCastException();
                        }
                    } else {
                        if (k1Var.getValue() != null) {
                            throw new ClassCastException();
                        }
                        f5 = 1.0f;
                    }
                }
                return Float.valueOf(f5);
            case 1:
                i iVar2 = this.f594b;
                k1 k1Var2 = iVar2.f604f;
                return Float.valueOf((((Boolean) iVar2.f602d.getValue()).booleanValue() && iVar2.g() % 2 == 0) ? -((Number) k1Var2.getValue()).floatValue() : ((Number) k1Var2.getValue()).floatValue());
            default:
                i iVar3 = this.f594b;
                return Boolean.valueOf(iVar3.g() == ((Number) iVar3.f601c.getValue()).intValue() && ((Number) iVar3.M.getValue()).floatValue() == iVar3.f());
        }
    }
}
