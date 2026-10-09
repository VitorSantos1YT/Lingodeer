package bt;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a2 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.a1 f5147b;

    public /* synthetic */ a2(l1.a1 a1Var, int i11) {
        this.f5146a = i11;
        this.f5147b = a1Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f5146a) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                l1.h1 h1Var = (l1.h1) this.f5147b;
                if (h1Var.l() != iIntValue) {
                    h1Var.m(iIntValue);
                }
                return qy.b0.f48488a;
            case 1:
                w2.x it = (w2.x) obj;
                kotlin.jvm.internal.m.f(it, "it");
                ((l1.h1) this.f5147b).m((int) (it.m() >> 32));
                break;
            case 2:
                ((l1.h1) this.f5147b).m(((Integer) obj).intValue());
                break;
            case 3:
                w2.x it2 = (w2.x) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                ((l1.h1) this.f5147b).m((int) (it2.m() & 4294967295L));
                break;
            case 4:
                ((l1.h1) this.f5147b).m(((Integer) obj).intValue());
                break;
            case 5:
                int iIntValue2 = ((Integer) obj).intValue();
                l1.h1 h1Var2 = (l1.h1) this.f5147b;
                if (h1Var2.l() != iIntValue2) {
                    h1Var2.m(iIntValue2);
                }
                return qy.b0.f48488a;
            case 6:
                w2.x it3 = (w2.x) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                ((l1.h1) this.f5147b).m((int) (it3.m() >> 32));
                break;
            case 7:
                w2.x it4 = (w2.x) obj;
                kotlin.jvm.internal.m.f(it4, "it");
                ((l1.h1) this.f5147b).m((int) (it4.m() & 4294967295L));
                break;
            case 8:
                w2.x it5 = (w2.x) obj;
                kotlin.jvm.internal.m.f(it5, "it");
                ((l1.h1) this.f5147b).m((int) Float.intBitsToFloat((int) (it5.c(0L) & 4294967295L)));
                break;
            case 9:
                ((l1.h1) this.f5147b).m(((Integer) obj).intValue());
                break;
            case 10:
                ((l1.h1) this.f5147b).m((int) (((v3.l) obj).f53498a & 4294967295L));
                break;
            case 11:
                ((l1.h1) this.f5147b).m(((Integer) obj).intValue());
                break;
            case 12:
                ((l1.h1) this.f5147b).m(((Integer) obj).intValue());
                break;
            case 13:
                ((l1.h1) this.f5147b).m(((Integer) obj).intValue());
                break;
            case 14:
                ((l1.h1) this.f5147b).m(((Integer) obj).intValue());
                break;
            case 15:
                w2.x it6 = (w2.x) obj;
                kotlin.jvm.internal.m.f(it6, "it");
                ((l1.h1) this.f5147b).m((int) (it6.m() & 4294967295L));
                break;
            case 16:
                w2.x it7 = (w2.x) obj;
                kotlin.jvm.internal.m.f(it7, "it");
                int iM = (int) (it7.m() >> 32);
                l1.h1 h1Var3 = (l1.h1) this.f5147b;
                if (iM != h1Var3.l()) {
                    h1Var3.m(iM);
                }
                return qy.b0.f48488a;
            case 17:
                w2.x it8 = (w2.x) obj;
                kotlin.jvm.internal.m.f(it8, "it");
                ((l1.h1) this.f5147b).m((int) Float.intBitsToFloat((int) (it8.c(0L) & 4294967295L)));
                break;
            default:
                w2.x it9 = (w2.x) obj;
                kotlin.jvm.internal.m.f(it9, "it");
                ((l1.h1) this.f5147b).m((int) (Float.intBitsToFloat((int) (it9.c((((long) Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO)) << 32) | (((long) Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO)) & 4294967295L)) & 4294967295L)) + ((int) (it9.m() & 4294967295L))));
                break;
        }
        return qy.b0.f48488a;
    }
}
