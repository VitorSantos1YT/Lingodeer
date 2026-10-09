package mt;

import com.lingodeer.R;
import h1.ua;
import rt.ae;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l6 implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ae f41633b;

    public /* synthetic */ l6(ae aeVar, int i11) {
        this.f41632a = i11;
        this.f41633b = aeVar;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f41632a) {
            case 0:
                j0.b2 AppGradientButton = (j0.b2) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppGradientButton, "$this$AppGradientButton");
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    iu.k.d(ub.a.d0(R.string.srs_customize_suggestion_apply, new Object[]{Integer.valueOf(this.f41633b.c())}, sVar), null, null, sVar, 0, 6);
                } else {
                    sVar.W();
                }
                break;
            default:
                j0.b2 TextButton = (j0.b2) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(TextButton, "$this$TextButton");
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ua.b(ub.a.e0(sVar2, this.f41633b.b() ? R.string.offline_deselect_all : R.string.offline_select_all), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 0, 0, 131070);
                } else {
                    sVar2.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
