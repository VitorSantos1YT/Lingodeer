package bt;

import com.lingodeer.R;
import com.lingodeer.data.model.CourseWord;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h6 implements fz.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ht.q f5493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5494c;

    public /* synthetic */ h6(ht.q qVar, CourseWord courseWord, int i11) {
        this.f5492a = i11;
        this.f5493b = qVar;
        this.f5494c = courseWord;
    }

    @Override // fz.h
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        String strD0;
        switch (this.f5492a) {
            case 0:
                CourseWord courseWord = (CourseWord) this.f5494c;
                j0.q CourseTestModelScreen = (j0.q) obj;
                int iIntValue = ((Integer) obj2).intValue();
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                l1.n nVar = (l1.n) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                kotlin.jvm.internal.m.f(CourseTestModelScreen, "$this$CourseTestModelScreen");
                if ((iIntValue2 & 6) == 0) {
                    i11 = (((l1.s) nVar).f(CourseTestModelScreen) ? 4 : 2) | iIntValue2;
                } else {
                    i11 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i11 |= ((l1.s) nVar).d(iIntValue) ? 32 : 16;
                }
                if ((iIntValue2 & 384) == 0) {
                    i11 |= ((l1.s) nVar).g(zBooleanValue) ? 256 : 128;
                }
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(i11 & 1, (i11 & 1171) != 1170)) {
                    int i18 = i11 & 14;
                    int i19 = i11 << 6;
                    dt.v2.l(CourseTestModelScreen, this.f5493b, courseWord, iIntValue, zBooleanValue, sVar, i18 | (i19 & 7168) | (i19 & 57344));
                } else {
                    sVar.W();
                }
                break;
            case 1:
                CourseWord courseWord2 = (CourseWord) this.f5494c;
                j0.q CourseTestModelScreen2 = (j0.q) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                l1.n nVar2 = (l1.n) obj4;
                int iIntValue4 = ((Integer) obj5).intValue();
                kotlin.jvm.internal.m.f(CourseTestModelScreen2, "$this$CourseTestModelScreen");
                if ((iIntValue4 & 6) == 0) {
                    i12 = (((l1.s) nVar2).f(CourseTestModelScreen2) ? 4 : 2) | iIntValue4;
                } else {
                    i12 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i12 |= ((l1.s) nVar2).d(iIntValue3) ? 32 : 16;
                }
                if ((iIntValue4 & 384) == 0) {
                    i12 |= ((l1.s) nVar2).g(zBooleanValue2) ? 256 : 128;
                }
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(i12 & 1, (i12 & 1171) != 1170)) {
                    int i21 = i12 & 14;
                    int i22 = i12 << 6;
                    dt.v2.l(CourseTestModelScreen2, this.f5493b, courseWord2, iIntValue3, zBooleanValue2, sVar2, i21 | (i22 & 7168) | (i22 & 57344));
                } else {
                    sVar2.W();
                }
                break;
            case 2:
                CourseWord courseWord3 = (CourseWord) this.f5494c;
                j0.q CourseTestModelScreen3 = (j0.q) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
                l1.n nVar3 = (l1.n) obj4;
                int iIntValue6 = ((Integer) obj5).intValue();
                kotlin.jvm.internal.m.f(CourseTestModelScreen3, "$this$CourseTestModelScreen");
                if ((iIntValue6 & 6) == 0) {
                    i13 = (((l1.s) nVar3).f(CourseTestModelScreen3) ? 4 : 2) | iIntValue6;
                } else {
                    i13 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i13 |= ((l1.s) nVar3).d(iIntValue5) ? 32 : 16;
                }
                if ((iIntValue6 & 384) == 0) {
                    i13 |= ((l1.s) nVar3).g(zBooleanValue3) ? 256 : 128;
                }
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(i13 & 1, (i13 & 1171) != 1170)) {
                    int i23 = i13 & 14;
                    int i24 = i13 << 6;
                    dt.v2.l(CourseTestModelScreen3, this.f5493b, courseWord3, iIntValue5, zBooleanValue3, sVar3, i23 | (i24 & 7168) | (i24 & 57344));
                } else {
                    sVar3.W();
                }
                break;
            case 3:
                CourseWord courseWord4 = (CourseWord) this.f5494c;
                j0.q CourseTestModelScreen4 = (j0.q) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                boolean zBooleanValue4 = ((Boolean) obj3).booleanValue();
                l1.n nVar4 = (l1.n) obj4;
                int iIntValue8 = ((Integer) obj5).intValue();
                kotlin.jvm.internal.m.f(CourseTestModelScreen4, "$this$CourseTestModelScreen");
                if ((iIntValue8 & 6) == 0) {
                    i14 = (((l1.s) nVar4).f(CourseTestModelScreen4) ? 4 : 2) | iIntValue8;
                } else {
                    i14 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i14 |= ((l1.s) nVar4).d(iIntValue7) ? 32 : 16;
                }
                if ((iIntValue8 & 384) == 0) {
                    i14 |= ((l1.s) nVar4).g(zBooleanValue4) ? 256 : 128;
                }
                l1.s sVar4 = (l1.s) nVar4;
                if (sVar4.T(i14 & 1, (i14 & 1171) != 1170)) {
                    int i25 = i14 & 14;
                    int i26 = i14 << 6;
                    dt.v2.l(CourseTestModelScreen4, this.f5493b, courseWord4, iIntValue7, zBooleanValue4, sVar4, i25 | (i26 & 7168) | (i26 & 57344));
                } else {
                    sVar4.W();
                }
                break;
            case 4:
                CourseWord courseWord5 = (CourseWord) this.f5494c;
                j0.q CourseTestModelScreen5 = (j0.q) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                boolean zBooleanValue5 = ((Boolean) obj3).booleanValue();
                l1.n nVar5 = (l1.n) obj4;
                int iIntValue10 = ((Integer) obj5).intValue();
                kotlin.jvm.internal.m.f(CourseTestModelScreen5, "$this$CourseTestModelScreen");
                if ((iIntValue10 & 6) == 0) {
                    i15 = (((l1.s) nVar5).f(CourseTestModelScreen5) ? 4 : 2) | iIntValue10;
                } else {
                    i15 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i15 |= ((l1.s) nVar5).d(iIntValue9) ? 32 : 16;
                }
                if ((iIntValue10 & 384) == 0) {
                    i15 |= ((l1.s) nVar5).g(zBooleanValue5) ? 256 : 128;
                }
                l1.s sVar5 = (l1.s) nVar5;
                if (sVar5.T(i15 & 1, (i15 & 1171) != 1170)) {
                    int i27 = i15 & 14;
                    int i28 = i15 << 6;
                    dt.v2.l(CourseTestModelScreen5, this.f5493b, courseWord5, iIntValue9, zBooleanValue5, sVar5, i27 | (i28 & 7168) | (i28 & 57344));
                } else {
                    sVar5.W();
                }
                break;
            case 5:
                CourseWord courseWord6 = (CourseWord) this.f5494c;
                j0.q CourseTestModelScreen6 = (j0.q) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                boolean zBooleanValue6 = ((Boolean) obj3).booleanValue();
                l1.n nVar6 = (l1.n) obj4;
                int iIntValue12 = ((Integer) obj5).intValue();
                kotlin.jvm.internal.m.f(CourseTestModelScreen6, "$this$CourseTestModelScreen");
                if ((iIntValue12 & 6) == 0) {
                    i16 = (((l1.s) nVar6).f(CourseTestModelScreen6) ? 4 : 2) | iIntValue12;
                } else {
                    i16 = iIntValue12;
                }
                if ((iIntValue12 & 48) == 0) {
                    i16 |= ((l1.s) nVar6).d(iIntValue11) ? 32 : 16;
                }
                if ((iIntValue12 & 384) == 0) {
                    i16 |= ((l1.s) nVar6).g(zBooleanValue6) ? 256 : 128;
                }
                l1.s sVar6 = (l1.s) nVar6;
                if (sVar6.T(i16 & 1, (i16 & 1171) != 1170)) {
                    int i29 = i16 & 14;
                    int i30 = i16 << 6;
                    dt.v2.l(CourseTestModelScreen6, this.f5493b, courseWord6, iIntValue11, zBooleanValue6, sVar6, i29 | (i30 & 7168) | (i30 & 57344));
                } else {
                    sVar6.W();
                }
                break;
            default:
                ot.t1 t1Var = (ot.t1) this.f5494c;
                j0.q CourseTestModelScreen7 = (j0.q) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                boolean zBooleanValue7 = ((Boolean) obj3).booleanValue();
                l1.n nVar7 = (l1.n) obj4;
                int iIntValue14 = ((Integer) obj5).intValue();
                kotlin.jvm.internal.m.f(CourseTestModelScreen7, "$this$CourseTestModelScreen");
                if ((iIntValue14 & 6) == 0) {
                    i17 = (((l1.s) nVar7).f(CourseTestModelScreen7) ? 4 : 2) | iIntValue14;
                } else {
                    i17 = iIntValue14;
                }
                if ((iIntValue14 & 48) == 0) {
                    i17 |= ((l1.s) nVar7).d(iIntValue13) ? 32 : 16;
                }
                if ((iIntValue14 & 384) == 0) {
                    i17 |= ((l1.s) nVar7).g(zBooleanValue7) ? 256 : 128;
                }
                l1.s sVar7 = (l1.s) nVar7;
                if (sVar7.T(i17 & 1, (i17 & 1171) != 1170)) {
                    sVar7.d0(-1984751757);
                    List listW0 = oz.q.W0(t1Var.f45998b.getChineseToneMetaData().getShengDiao(), new String[]{" "}, 0, 6);
                    ArrayList arrayList = new ArrayList(ry.n.W(listW0, 10));
                    Iterator it = listW0.iterator();
                    while (it.hasNext()) {
                        arrayList.add(b.L(sVar7, Integer.parseInt((String) it.next())));
                    }
                    sVar7.p(false);
                    Object objQ = sVar7.Q();
                    if (objQ == l1.m.f39353a) {
                        objQ = new br.b(15);
                        sVar7.o0(objQ);
                    }
                    String strY0 = ry.m.y0(arrayList, " + ", null, null, (fz.c) objQ, 30);
                    List listK = ns.o.K(t1Var.f45998b);
                    ht.q qVar = ht.q.WRONG;
                    ht.q qVar2 = this.f5493b;
                    if (qVar2 == qVar) {
                        sVar7.d0(-1984741730);
                        strD0 = ub.a.d0(R.string.chinese_tone_this_is_tone, new Object[]{strY0}, sVar7);
                        sVar7.p(false);
                    } else {
                        sVar7.d0(-1397308049);
                        sVar7.p(false);
                        strD0 = BuildConfig.VERSION_NAME;
                    }
                    String str = strD0;
                    int i31 = (i17 & 14) | 196608;
                    int i32 = i17 << 15;
                    dt.v2.k(CourseTestModelScreen7, qVar2, listK, null, str, BuildConfig.VERSION_NAME, iIntValue13, zBooleanValue7, null, null, false, false, false, false, false, null, sVar7, i31 | (3670016 & i32) | (i32 & 29360128), 384, 30596);
                } else {
                    sVar7.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ h6(ot.t1 t1Var, ht.q qVar) {
        this.f5492a = 6;
        this.f5494c = t1Var;
        this.f5493b = qVar;
    }
}
