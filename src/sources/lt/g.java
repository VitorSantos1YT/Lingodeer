package lt;

import com.google.api.Service;
import com.yalantis.ucrop.view.CropImageView;
import h1.e0;
import h1.k7;
import iu.k;
import l1.m;
import l1.n;
import l1.s;
import l1.t;
import mt.e2;
import mt.p2;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.a f40324b;

    public /* synthetic */ g(int i11, fz.a aVar) {
        this.f40323a = 8;
        this.f40324b = aVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        n nVar = (n) obj;
        Integer num = (Integer) obj2;
        switch (this.f40323a) {
            case 0:
                int iIntValue = num.intValue();
                s sVar = (s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    k7.m(this.f40324b, null, false, null, null, null, b.f40309e, sVar, 805306368, 510);
                } else {
                    sVar.W();
                }
                break;
            case 1:
                int iIntValue2 = num.intValue();
                s sVar2 = (s) nVar;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    k7.m(this.f40324b, null, false, null, null, null, b.f40310f, sVar2, 805306368, 510);
                } else {
                    sVar2.W();
                }
                break;
            case 2:
                int iIntValue3 = num.intValue();
                s sVar3 = (s) nVar;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    k7.m(this.f40324b, null, false, null, null, null, mt.g.f41425e, sVar3, 805306368, 510);
                } else {
                    sVar3.W();
                }
                break;
            case 3:
                int iIntValue4 = num.intValue();
                s sVar4 = (s) nVar;
                if (sVar4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    k7.m(this.f40324b, null, false, null, null, null, mt.g.f41454t, sVar4, 805306368, 510);
                } else {
                    sVar4.W();
                }
                break;
            case 4:
                int iIntValue5 = num.intValue();
                s sVar5 = (s) nVar;
                if (sVar5.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    k7.m(this.f40324b, null, false, null, null, null, mt.g.Q, sVar5, 805306368, 510);
                } else {
                    sVar5.W();
                }
                break;
            case 5:
                int iIntValue6 = num.intValue();
                s sVar6 = (s) nVar;
                if (sVar6.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    k7.m(this.f40324b, null, false, null, null, null, mt.g.R, sVar6, 805306368, 510);
                } else {
                    sVar6.W();
                }
                break;
            case 6:
                int iIntValue7 = num.intValue();
                s sVar7 = (s) nVar;
                if (sVar7.T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    k7.m(this.f40324b, null, false, null, null, null, mt.g.W, sVar7, 805306368, 510);
                } else {
                    sVar7.W();
                }
                break;
            case 7:
                int iIntValue8 = num.intValue();
                s sVar8 = (s) nVar;
                if (sVar8.T(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    k7.h(this.f40324b, null, false, null, mt.g.f41434i0, sVar8, 196608, 30);
                } else {
                    sVar8.W();
                }
                break;
            case 8:
                num.getClass();
                p2.e(this.f40324b, nVar, t.M(1));
                break;
            case 9:
                int iIntValue9 = num.intValue();
                s sVar9 = (s) nVar;
                if (sVar9.T(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    k7.h(this.f40324b, null, false, null, mt.g.E0, sVar9, 196608, 30);
                } else {
                    sVar9.W();
                }
                break;
            case 10:
                int iIntValue10 = num.intValue();
                s sVar10 = (s) nVar;
                if (sVar10.T(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    k7.h(this.f40324b, null, false, null, mt.j.f41560c, sVar10, 196608, 30);
                } else {
                    sVar10.W();
                }
                break;
            case 11:
                int iIntValue11 = num.intValue();
                s sVar11 = (s) nVar;
                if (sVar11.T(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    k7.m(this.f40324b, null, false, null, null, null, mt.g.P0, sVar11, 805306368, 510);
                } else {
                    sVar11.W();
                }
                break;
            case 12:
                int iIntValue12 = num.intValue();
                s sVar12 = (s) nVar;
                if (sVar12.T(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    fz.a aVar = this.f40324b;
                    boolean zF = sVar12.f(aVar);
                    Object objQ = sVar12.Q();
                    if (zF || objQ == m.f39353a) {
                        objQ = new e2(28, aVar);
                        sVar12.o0(objQ);
                    }
                    k.j((fz.a) objQ, sVar12, 0);
                } else {
                    sVar12.W();
                }
                break;
            case 13:
                int iIntValue13 = num.intValue();
                s sVar13 = (s) nVar;
                if (sVar13.T(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    k.g(this.f40324b, null, nq.a.f43922a, null, null, null, null, null, sVar13, 384, 250);
                } else {
                    sVar13.W();
                }
                break;
            case 14:
                int iIntValue14 = num.intValue();
                s sVar14 = (s) nVar;
                if (sVar14.T(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    fz.a aVar2 = this.f40324b;
                    boolean zF2 = sVar14.f(aVar2);
                    Object objQ2 = sVar14.Q();
                    if (zF2 || objQ2 == m.f39353a) {
                        objQ2 = new nv.d(0, aVar2);
                        sVar14.o0(objQ2);
                    }
                    k.j((fz.a) objQ2, sVar14, 0);
                } else {
                    sVar14.W();
                }
                break;
            case 15:
                int iIntValue15 = num.intValue();
                s sVar15 = (s) nVar;
                if (sVar15.T(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    fz.a aVar3 = this.f40324b;
                    boolean zF3 = sVar15.f(aVar3);
                    Object objQ3 = sVar15.Q();
                    if (zF3 || objQ3 == m.f39353a) {
                        objQ3 = new nv.d(3, aVar3);
                        sVar15.o0(objQ3);
                    }
                    k.j((fz.a) objQ3, sVar15, 0);
                } else {
                    sVar15.W();
                }
                break;
            case 16:
                int iIntValue16 = num.intValue();
                s sVar16 = (s) nVar;
                if (sVar16.T(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    e0.c(nv.a.f44094e, null, t1.e.d(1142625015, new g(this.f40324b, 15, (byte) 0), sVar16), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, null, sVar16, 390, 250);
                } else {
                    sVar16.W();
                }
                break;
            case 17:
                int iIntValue17 = num.intValue();
                s sVar17 = (s) nVar;
                if (sVar17.T(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    fz.a aVar4 = this.f40324b;
                    boolean zF4 = sVar17.f(aVar4);
                    Object objQ4 = sVar17.Q();
                    if (zF4 || objQ4 == m.f39353a) {
                        objQ4 = new nv.d(7, aVar4);
                        sVar17.o0(objQ4);
                    }
                    k.j((fz.a) objQ4, sVar17, 0);
                } else {
                    sVar17.W();
                }
                break;
            case 18:
                int iIntValue18 = num.intValue();
                s sVar18 = (s) nVar;
                if (sVar18.T(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    fz.a aVar5 = this.f40324b;
                    boolean zF5 = sVar18.f(aVar5);
                    Object objQ5 = sVar18.Q();
                    if (zF5 || objQ5 == m.f39353a) {
                        objQ5 = new nv.d(8, aVar5);
                        sVar18.o0(objQ5);
                    }
                    k.j((fz.a) objQ5, sVar18, 0);
                } else {
                    sVar18.W();
                }
                break;
            case 19:
                int iIntValue19 = num.intValue();
                s sVar19 = (s) nVar;
                if (sVar19.T(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    fz.a aVar6 = this.f40324b;
                    boolean zF6 = sVar19.f(aVar6);
                    Object objQ6 = sVar19.Q();
                    if (zF6 || objQ6 == m.f39353a) {
                        objQ6 = new nv.d(9, aVar6);
                        sVar19.o0(objQ6);
                    }
                    k.j((fz.a) objQ6, sVar19, 0);
                } else {
                    sVar19.W();
                }
                break;
            case 20:
                int iIntValue20 = num.intValue();
                s sVar20 = (s) nVar;
                if (sVar20.T(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    fz.a aVar7 = this.f40324b;
                    boolean zF7 = sVar20.f(aVar7);
                    Object objQ7 = sVar20.Q();
                    if (zF7 || objQ7 == m.f39353a) {
                        objQ7 = new nv.d(10, aVar7);
                        sVar20.o0(objQ7);
                    }
                    k.j((fz.a) objQ7, sVar20, 0);
                } else {
                    sVar20.W();
                }
                break;
            case 21:
                int iIntValue21 = num.intValue();
                s sVar21 = (s) nVar;
                if (sVar21.T(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    fz.a aVar8 = this.f40324b;
                    boolean zF8 = sVar21.f(aVar8);
                    Object objQ8 = sVar21.Q();
                    if (zF8 || objQ8 == m.f39353a) {
                        objQ8 = new nv.d(11, aVar8);
                        sVar21.o0(objQ8);
                    }
                    k.j((fz.a) objQ8, sVar21, 0);
                } else {
                    sVar21.W();
                }
                break;
            case 22:
                int iIntValue22 = num.intValue();
                s sVar22 = (s) nVar;
                if (sVar22.T(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    fz.a aVar9 = this.f40324b;
                    boolean zF9 = sVar22.f(aVar9);
                    Object objQ9 = sVar22.Q();
                    if (zF9 || objQ9 == m.f39353a) {
                        objQ9 = new nv.d(12, aVar9);
                        sVar22.o0(objQ9);
                    }
                    k.j((fz.a) objQ9, sVar22, 0);
                } else {
                    sVar22.W();
                }
                break;
            case 23:
                int iIntValue23 = num.intValue();
                s sVar23 = (s) nVar;
                if (sVar23.T(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    fz.a aVar10 = this.f40324b;
                    boolean zF10 = sVar23.f(aVar10);
                    Object objQ10 = sVar23.Q();
                    if (zF10 || objQ10 == m.f39353a) {
                        objQ10 = new nv.d(13, aVar10);
                        sVar23.o0(objQ10);
                    }
                    k.j((fz.a) objQ10, sVar23, 0);
                } else {
                    sVar23.W();
                }
                break;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                int iIntValue24 = num.intValue();
                s sVar24 = (s) nVar;
                if (sVar24.T(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    fz.a aVar11 = this.f40324b;
                    boolean zF11 = sVar24.f(aVar11);
                    Object objQ11 = sVar24.Q();
                    if (zF11 || objQ11 == m.f39353a) {
                        objQ11 = new nv.d(14, aVar11);
                        sVar24.o0(objQ11);
                    }
                    k.j((fz.a) objQ11, sVar24, 0);
                } else {
                    sVar24.W();
                }
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                int iIntValue25 = num.intValue();
                s sVar25 = (s) nVar;
                if (sVar25.T(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    fz.a aVar12 = this.f40324b;
                    boolean zF12 = sVar25.f(aVar12);
                    Object objQ12 = sVar25.Q();
                    if (zF12 || objQ12 == m.f39353a) {
                        objQ12 = new nv.d(15, aVar12);
                        sVar25.o0(objQ12);
                    }
                    k.j((fz.a) objQ12, sVar25, 0);
                } else {
                    sVar25.W();
                }
                break;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                int iIntValue26 = num.intValue();
                s sVar26 = (s) nVar;
                if (sVar26.T(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    fz.a aVar13 = this.f40324b;
                    boolean zF13 = sVar26.f(aVar13);
                    Object objQ13 = sVar26.Q();
                    if (zF13 || objQ13 == m.f39353a) {
                        objQ13 = new nv.d(16, aVar13);
                        sVar26.o0(objQ13);
                    }
                    k.j((fz.a) objQ13, sVar26, 0);
                } else {
                    sVar26.W();
                }
                break;
            case 27:
                int iIntValue27 = num.intValue();
                s sVar27 = (s) nVar;
                if (sVar27.T(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    fz.a aVar14 = this.f40324b;
                    boolean zF14 = sVar27.f(aVar14);
                    Object objQ14 = sVar27.Q();
                    if (zF14 || objQ14 == m.f39353a) {
                        objQ14 = new nv.d(17, aVar14);
                        sVar27.o0(objQ14);
                    }
                    k.j((fz.a) objQ14, sVar27, 0);
                } else {
                    sVar27.W();
                }
                break;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                int iIntValue28 = num.intValue();
                s sVar28 = (s) nVar;
                if (sVar28.T(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    fz.a aVar15 = this.f40324b;
                    boolean zF15 = sVar28.f(aVar15);
                    Object objQ15 = sVar28.Q();
                    if (zF15 || objQ15 == m.f39353a) {
                        objQ15 = new nv.d(18, aVar15);
                        sVar28.o0(objQ15);
                    }
                    k.j((fz.a) objQ15, sVar28, 0);
                } else {
                    sVar28.W();
                }
                break;
            default:
                int iIntValue29 = num.intValue();
                s sVar29 = (s) nVar;
                if (sVar29.T(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    fz.a aVar16 = this.f40324b;
                    boolean zF16 = sVar29.f(aVar16);
                    Object objQ16 = sVar29.Q();
                    if (zF16 || objQ16 == m.f39353a) {
                        objQ16 = new nv.d(19, aVar16);
                        sVar29.o0(objQ16);
                    }
                    k.j((fz.a) objQ16, sVar29, 0);
                } else {
                    sVar29.W();
                }
                break;
        }
        return b0.f48488a;
    }

    public /* synthetic */ g(fz.a aVar, int i11, byte b3) {
        this.f40323a = i11;
        this.f40324b = aVar;
    }
}
