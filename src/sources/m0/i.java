package m0;

import com.tbruyelle.rxpermissions3.BuildConfig;
import qy.b0;
import s0.o0;
import tg.i0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements fz.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t1.d f40561b;

    public /* synthetic */ i(t1.d dVar, int i11) {
        this.f40560a = i11;
        this.f40561b = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    /* JADX WARN: Code duplicated, block: B:20:0x0073  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00da  */
    /* JADX WARN: Code duplicated, block: B:39:0x00fa  */
    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f40560a) {
            case 0:
                l lVar = (l) obj;
                ((Number) obj2).intValue();
                l1.n nVar = (l1.n) obj3;
                int iIntValue = ((Number) obj4).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((l1.s) nVar).f(lVar) ? 4 : 2;
                }
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 131) != 130)) {
                    this.f40561b.invoke(lVar, sVar, Integer.valueOf(iIntValue & 14));
                } else {
                    sVar.W();
                }
                break;
            case 1:
                i0 FormattedList = (i0) obj;
                sg.q astListItem = (sg.q) obj2;
                l1.n nVar2 = (l1.n) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                kotlin.jvm.internal.m.f(FormattedList, "$this$FormattedList");
                kotlin.jvm.internal.m.f(astListItem, "astListItem");
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= ((l1.s) nVar2).f(astListItem) ? 32 : 16;
                }
                if ((iIntValue2 & 145) == 144) {
                    l1.s sVar2 = (l1.s) nVar2;
                    if (sVar2.F()) {
                        sVar2.W();
                    } else if (astListItem.f51657b.f51659b == null) {
                        l1.s sVar3 = (l1.s) nVar2;
                        sVar3.d0(-1162631361);
                        o0.c(BuildConfig.VERSION_NAME, null, null, null, 0, false, 0, 0, null, null, sVar3, 6, 1022);
                        sVar3.p(false);
                    } else {
                        l1.s sVar4 = (l1.s) nVar2;
                        sVar4.d0(-1162586318);
                        this.f40561b.invoke(astListItem, sVar4, Integer.valueOf((iIntValue2 >> 3) & 14));
                        sVar4.p(false);
                    }
                } else if (astListItem.f51657b.f51659b == null) {
                    l1.s sVar5 = (l1.s) nVar2;
                    sVar5.d0(-1162631361);
                    o0.c(BuildConfig.VERSION_NAME, null, null, null, 0, false, 0, 0, null, null, sVar5, 6, 1022);
                    sVar5.p(false);
                } else {
                    l1.s sVar6 = (l1.s) nVar2;
                    sVar6.d0(-1162586318);
                    this.f40561b.invoke(astListItem, sVar6, Integer.valueOf((iIntValue2 >> 3) & 14));
                    sVar6.p(false);
                }
                break;
            default:
                i0 FormattedList2 = (i0) obj;
                sg.q astListItem2 = (sg.q) obj2;
                l1.n nVar3 = (l1.n) obj3;
                int iIntValue3 = ((Number) obj4).intValue();
                kotlin.jvm.internal.m.f(FormattedList2, "$this$FormattedList");
                kotlin.jvm.internal.m.f(astListItem2, "astListItem");
                if ((iIntValue3 & 48) == 0) {
                    iIntValue3 |= ((l1.s) nVar3).f(astListItem2) ? 32 : 16;
                }
                if ((iIntValue3 & 145) == 144) {
                    l1.s sVar7 = (l1.s) nVar3;
                    if (sVar7.F()) {
                        sVar7.W();
                    } else if (astListItem2.f51657b.f51659b == null) {
                        l1.s sVar8 = (l1.s) nVar3;
                        sVar8.d0(-1162158177);
                        o0.c(BuildConfig.VERSION_NAME, null, null, null, 0, false, 0, 0, null, null, sVar8, 6, 1022);
                        sVar8.p(false);
                    } else {
                        l1.s sVar9 = (l1.s) nVar3;
                        sVar9.d0(-1162113134);
                        this.f40561b.invoke(astListItem2, sVar9, Integer.valueOf((iIntValue3 >> 3) & 14));
                        sVar9.p(false);
                    }
                } else if (astListItem2.f51657b.f51659b == null) {
                    l1.s sVar10 = (l1.s) nVar3;
                    sVar10.d0(-1162158177);
                    o0.c(BuildConfig.VERSION_NAME, null, null, null, 0, false, 0, 0, null, null, sVar10, 6, 1022);
                    sVar10.p(false);
                } else {
                    l1.s sVar11 = (l1.s) nVar3;
                    sVar11.d0(-1162113134);
                    this.f40561b.invoke(astListItem2, sVar11, Integer.valueOf((iIntValue3 >> 3) & 14));
                    sVar11.p(false);
                }
                break;
        }
        return b0.f48488a;
    }
}
