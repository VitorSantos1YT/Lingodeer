package dt;

import com.lingodeer.R;
import h1.p8;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r0 implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f24142b;

    public /* synthetic */ r0(long j11, int i11) {
        this.f24141a = i11;
        this.f24142b = j11;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f24141a) {
            case 0:
                String it = (String) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(it, "it");
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    h1.r4.b(se.k.y(R.drawable.shield_check, sVar, 0), null, j0.e2.n(z1.o.f58481a, 16), this.f24142b, sVar, 432, 0);
                } else {
                    sVar.W();
                }
                break;
            case 1:
                p8 it2 = (p8) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(it2, "it");
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    j0.o.a(d0.n.h(j0.e2.n(z1.o.f58481a, 30), this.f24142b, r0.f.f48733a), sVar2, 0);
                } else {
                    sVar2.W();
                }
                break;
            case 2:
                l0.c item = (l0.c) obj;
                l1.n nVar3 = (l1.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item, "$this$item");
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    qu.o.e(ub.a.e0(sVar3, R.string.promotion_zone), this.f24142b, R.drawable.lb_promotion_zone_arrow_left, R.drawable.lb_promotion_zone_arrow_right, sVar3, 48);
                } else {
                    sVar3.W();
                }
                break;
            case 3:
                l0.c item2 = (l0.c) obj;
                l1.n nVar4 = (l1.n) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item2, "$this$item");
                l1.s sVar4 = (l1.s) nVar4;
                if (sVar4.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    qu.o.e(ub.a.e0(sVar4, R.string.demotion_zone), this.f24142b, R.drawable.lb_demotion_zone_arrow_left, R.drawable.lb_demotion_zone_arrow_right, sVar4, 48);
                } else {
                    sVar4.W();
                }
                break;
            case 4:
                l0.c item3 = (l0.c) obj;
                l1.n nVar5 = (l1.n) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item3, "$this$item");
                l1.s sVar5 = (l1.s) nVar5;
                if (sVar5.T(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    float f5 = 20;
                    yg.r.b(0, this.f24142b, sVar5, j0.c.D(z1.o.f58481a, f5, 80, f5, 16));
                } else {
                    sVar5.W();
                }
                break;
            default:
                l0.c item4 = (l0.c) obj;
                l1.n nVar6 = (l1.n) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item4, "$this$item");
                l1.s sVar6 = (l1.s) nVar6;
                if (sVar6.T(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    String strE0 = ub.a.e0(sVar6, R.string.subs_can_be_cancel_anytime_for_any_reason);
                    long j11 = this.f24142b;
                    yg.o.f(strE0, j11, sVar6, 0);
                    yg.o.f(ub.a.e0(sVar6, R.string.tv_subscription_rule), j11, sVar6, 0);
                    yg.o.f(ub.a.e0(sVar6, R.string.ld_plus_billing_alert), j11, sVar6, 0);
                    yg.o.f(ub.a.e0(sVar6, R.string.xiaomi_billing_alert), j11, sVar6, 0);
                } else {
                    sVar6.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
