package f0;

import com.yalantis.ucrop.view.CropImageView;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x1 extends kotlin.jvm.internal.a implements fz.e {
    public final /* synthetic */ int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x1(int i11, Object obj, Class cls, String str, String str2, int i12, int i13) {
        super(i11, i12, cls, obj, str, str2);
        this.H = i13;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.H) {
            case 0:
                long j11 = ((v3.q) obj).f53504a;
                b2 b2Var = (b2) this.f38342a;
                rz.e0.B(b2Var.f26199d0.c(), null, null, new y1(b2Var, j11, null, 2), 3);
                return qy.b0.f48488a;
            case 1:
                float fFloatValue = ((Number) obj).floatValue();
                kw.h hVar = (kw.h) this.f38342a;
                boolean zB = hVar.b();
                l1.g1 g1Var = hVar.f38869f;
                float f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                if (!zB) {
                    if (hVar.a() > hVar.f38870g.l()) {
                        ((fz.a) hVar.f38865b.getValue()).invoke();
                    }
                    rz.e0.B(hVar.f38864a, null, null, new f3.c(f5, 3, hVar, null), 3);
                    if (g1Var.l() == CropImageView.DEFAULT_ASPECT_RATIO || fFloatValue < CropImageView.DEFAULT_ASPECT_RATIO) {
                        fFloatValue = 0.0f;
                    }
                    g1Var.m(CropImageView.DEFAULT_ASPECT_RATIO);
                    f5 = fFloatValue;
                }
                return new Float(f5);
            case 2:
                return ((Map) this.f38342a).get(new Long(((Number) obj).longValue()));
            case 3:
                return ((Map) this.f38342a).get(new Long(((Number) obj).longValue()));
            case 4:
                return ((Map) this.f38342a).get(new Long(((Number) obj).longValue()));
            default:
                ((t1.d) this.f38342a).j((l1.n) obj, ((Number) obj2).intValue());
                return qy.b0.f48488a;
        }
    }
}
