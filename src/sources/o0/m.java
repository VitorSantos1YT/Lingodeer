package o0;

import com.yalantis.ucrop.view.CropImageView;
import f0.h1;
import j0.t1;
import java.util.ArrayList;
import java.util.List;
import l1.b1;
import l1.g1;
import n0.c0;
import n0.d0;
import n0.g0;
import n0.w0;
import rz.b0;
import w2.q1;
import w2.r0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f44390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h1 f44391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t1 f44392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f44393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f44394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fz.a f44395f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fz.a f44396g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z1.i f44397h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g0.l f44398i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b0 f44399j;

    public m(t tVar, h1 h1Var, t1 t1Var, float f5, f fVar, mz.g gVar, fz.a aVar, z1.i iVar, g0.l lVar, b0 b0Var) {
        this.f44390a = tVar;
        this.f44391b = h1Var;
        this.f44392c = t1Var;
        this.f44393d = f5;
        this.f44394e = fVar;
        this.f44395f = gVar;
        this.f44396g = aVar;
        this.f44397h = iVar;
        this.f44398i = lVar;
        this.f44399j = b0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not found block with instruction: 0x0616: MOVE (r5v23 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) A[DONT_GENERATE, REMOVE] (LINE:1559) */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r35v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v53, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r54v2 */
    /* JADX WARN: Type inference failed for: r54v3, types: [java.util.List] */
    @Override // n0.c0
    public final r0 a(d0 d0Var, long j11) {
        q1 q1Var;
        z1.i iVar;
        int i11;
        int i12;
        long j12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        e eVar;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        ry.k kVar;
        int i25;
        long j13;
        int i26;
        e eVar2;
        ArrayList arrayList;
        int i27;
        int i28;
        int i29;
        ArrayList arrayList2;
        int i30;
        boolean z11;
        int i31;
        ArrayList arrayList3;
        ry.k kVar2;
        ArrayList arrayList4;
        ?? arrayList5;
        ?? arrayList6;
        Object obj;
        n nVar;
        int i32;
        long j14;
        List list;
        ArrayList arrayList7;
        int i33;
        m mVar = this;
        q1 q1Var2 = d0Var.f42933b;
        t tVar = mVar.f44390a;
        tVar.C.getValue();
        h1 h1Var = h1.Vertical;
        h1 h1Var2 = mVar.f44391b;
        boolean z12 = h1Var2 == h1Var;
        d0.n.l(j11, z12 ? h1Var : h1.Horizontal);
        t1 t1Var = mVar.f44392c;
        int iN0 = z12 ? q1Var2.n0(t1Var.b(q1Var2.getLayoutDirection())) : q1Var2.n0(j0.c.l(t1Var, q1Var2.getLayoutDirection()));
        int iN1 = z12 ? q1Var2.n0(t1Var.d(q1Var2.getLayoutDirection())) : q1Var2.n0(j0.c.k(t1Var, q1Var2.getLayoutDirection()));
        int iN2 = q1Var2.n0(t1Var.c());
        int iN3 = q1Var2.n0(t1Var.a()) + iN2;
        int i34 = iN0 + iN1;
        int i35 = z12 ? iN3 : i34;
        if (z12) {
            iN1 = iN2;
        } else if (!z12) {
            iN1 = iN0;
        }
        int i36 = i35 - iN1;
        long jI = v3.b.i(j11, -i34, -iN3);
        tVar.f44447q = d0Var;
        int iN4 = q1Var2.n0(mVar.f44393d);
        int iG = z12 ? v3.a.g(j11) - iN3 : v3.a.h(j11) - i34;
        long j15 = jI;
        long j16 = (((long) iN0) << 32) | (((long) iN2) & 4294967295L);
        mVar.f44394e.getClass();
        int i37 = iG < 0 ? 0 : iG;
        tVar.f44456z = v3.b.b(h1Var2 == h1Var ? v3.a.h(j15) : i37, h1Var2 != h1Var ? v3.a.g(j15) : i37, 5);
        l lVar = (l) mVar.f44395f.invoke();
        g0.l lVar2 = mVar.f44398i;
        x1.f fVarN = re.q.n();
        int i38 = iG;
        fz.c cVarE = fVarN != null ? fVarN.e() : null;
        x1.f fVarR = re.q.r(fVarN);
        try {
            int iK = tVar.k();
            com.android.billingclient.api.h hVar = tVar.f44435d;
            int i39 = n0.l.i(iK, hVar.f7512e, lVar);
            if (iK != i39) {
                ((l1.h1) hVar.f7510c).m(i39);
                ((g0) hVar.f7513f).b(iK);
            }
            tVar.k();
            float fL = ((g1) hVar.f7511d).l();
            tVar.m();
            lVar2.getClass();
            float f5 = 0;
            int i40 = i37 + iN4;
            int iQ = hz.b.Q(f5 - (i40 * fL));
            re.q.t(fVarN, fVarR, cVarE);
            List listG = n0.l.g(lVar, tVar.A, tVar.f44452v);
            y.x xVar = y.n.f56742a;
            y.x xVar2 = new y.x();
            int iIntValue = ((Number) mVar.f44396g.invoke()).intValue();
            List list2 = listG;
            b1 b1Var = tVar.B;
            if (iN1 < 0) {
                i0.a.a("negative beforeContentPadding");
            }
            if (i36 < 0) {
                i0.a.a("negative afterContentPadding");
            }
            int i41 = i40 < 0 ? 0 : i40;
            int i42 = iIntValue < 0 ? iIntValue : 0;
            int i43 = i41;
            int i44 = iQ;
            ry.s sVar = ry.s.f50855a;
            h1 h1Var3 = mVar.f44391b;
            g0.l lVar3 = mVar.f44398i;
            b0 b0Var = mVar.f44399j;
            if (iIntValue <= 0) {
                nVar = new n(i37, iN4, i36, h1Var3, -iN1, i38 + i36, i42, lVar3, q1Var2.q0(v3.b.g(v3.a.j(j15) + i34, j11), v3.b.f(v3.a.i(j15) + iN3, j11), sVar, new com.lingo.lingoskill.object.a(27)), b0Var);
                q1Var = q1Var2;
            } else {
                h1 h1Var4 = h1Var3;
                long jB = v3.b.b(h1Var4 == h1Var ? v3.a.h(j15) : i37, h1Var4 != h1Var ? v3.a.g(j15) : i37, 5);
                int i45 = i39;
                while (i45 > 0 && i44 > 0) {
                    i45--;
                    i44 -= i43;
                }
                int i46 = i44 * (-1);
                if (i45 >= iIntValue) {
                    i45 = iIntValue - 1;
                    i46 = 0;
                }
                ry.k kVar3 = new ry.k();
                int i47 = -iN1;
                int i48 = i47 + (iN4 < 0 ? iN4 : 0);
                q1Var = q1Var2;
                int i49 = i46 + i48;
                int iMax = 0;
                while (true) {
                    iVar = mVar.f44397h;
                    if (i49 >= 0 || i45 <= 0) {
                        break;
                    }
                    int i50 = i45 - 1;
                    long j17 = j15;
                    float f11 = f5;
                    int i51 = i37;
                    long j18 = jB;
                    e eVarH = c.a.h(d0Var, i50, j18, lVar, j16, h1Var4, iVar, q1Var.getLayoutDirection(), i51, xVar2);
                    kVar3.add(0, eVarH);
                    iMax = Math.max(iMax, eVarH.f44369h);
                    i49 += i43;
                    mVar = this;
                    i45 = i50;
                    i48 = i48;
                    jB = j18;
                    iN1 = iN1;
                    iIntValue = iIntValue;
                    i37 = i51;
                    f5 = f11;
                    j15 = j17;
                }
                int i52 = iIntValue;
                int i53 = iN1;
                long j19 = j15;
                int i54 = i38;
                int i55 = i42;
                int i56 = 0;
                float f12 = f5;
                int i57 = i48;
                int i58 = i37;
                int i59 = i43;
                long j21 = jB;
                int i60 = i49;
                if (i60 < i57) {
                    i60 = i57;
                }
                int i61 = i60 - i57;
                int i62 = i54 + i36;
                int i63 = i62 < 0 ? 0 : i62;
                int i64 = iMax;
                int i65 = i57;
                int i66 = i45;
                int i67 = -i61;
                boolean z13 = false;
                while (i56 < kVar3.f50852c) {
                    if (i67 >= i63) {
                        kVar3.d(i56);
                        z13 = true;
                    } else {
                        i66++;
                        i67 += i59;
                        i56++;
                    }
                }
                int i68 = i66;
                int i69 = i61;
                int i70 = i68;
                boolean z14 = z13;
                int iMax2 = i64;
                int i71 = i45;
                while (true) {
                    i11 = i52;
                    if (i70 >= i11 || (i67 >= i63 && i67 > 0 && !kVar3.isEmpty())) {
                        break;
                    }
                    int i72 = i65;
                    int i73 = i67;
                    i52 = i11;
                    int i74 = i63;
                    int i75 = i59;
                    long j22 = j21;
                    int i76 = i54;
                    e eVarH2 = c.a.h(d0Var, i70, j22, lVar, j16, h1Var4, iVar, q1Var.getLayoutDirection(), i58, xVar2);
                    int i77 = i70;
                    int i78 = i52 - 1;
                    int i79 = i73 + (i77 == i78 ? i58 : i75);
                    if (i79 > i72 || i77 == i78) {
                        iMax2 = Math.max(iMax2, eVarH2.f44369h);
                        kVar3.addLast(eVarH2);
                    } else {
                        i69 -= i75;
                        i71 = i77 + 1;
                        z14 = true;
                    }
                    i70 = i77 + 1;
                    i65 = i72;
                    i67 = i79;
                    i54 = i76;
                    i63 = i74;
                    j21 = j22;
                    i59 = i75;
                }
                int i80 = i11;
                int i81 = i70;
                int i82 = i59;
                long j23 = j21;
                int i83 = i54;
                if (i67 < i83) {
                    int i84 = i83 - i67;
                    int i85 = i67 + i84;
                    int i86 = i69 - i84;
                    while (true) {
                        i33 = i53;
                        if (i86 >= i33 || i71 <= 0) {
                            break;
                        }
                        i71--;
                        i53 = i33;
                        e eVarH3 = c.a.h(d0Var, i71, j23, lVar, j16, h1Var4, iVar, q1Var.getLayoutDirection(), i58, xVar2);
                        kVar3.add(0, eVarH3);
                        iMax2 = Math.max(iMax2, eVarH3.f44369h);
                        i86 += i82;
                        i81 = i81;
                        i85 = i85;
                    }
                    int i87 = i85;
                    i12 = i81;
                    int i88 = i86;
                    i53 = i33;
                    j12 = j23;
                    if (i88 < 0) {
                        i13 = i71;
                        i15 = iMax2;
                        i16 = i87 + i88;
                        i14 = 0;
                    } else {
                        i13 = i71;
                        i14 = i88;
                        i15 = iMax2;
                        i16 = i87;
                    }
                } else {
                    int i89 = i67;
                    i12 = i81;
                    j12 = j23;
                    i13 = i71;
                    i14 = i69;
                    i15 = iMax2;
                    i16 = i89;
                }
                if (i14 < 0) {
                    i0.a.a("invalid currentFirstPageScrollOffset");
                }
                int i90 = -i14;
                e eVar3 = (e) kVar3.first();
                int i91 = i12;
                int i92 = iN4;
                if (i53 > 0 || i92 < 0) {
                    int i93 = i14;
                    int iB = kVar3.b();
                    int i94 = i93;
                    int i95 = 0;
                    while (true) {
                        if (i95 >= iB || i94 == 0) {
                            i17 = i82;
                            break;
                        }
                        i17 = i82;
                        if (i17 > i94) {
                            break;
                        }
                        int i96 = iB;
                        if (i95 == ns.o.A(kVar3)) {
                            break;
                        }
                        i94 -= i17;
                        i95++;
                        eVar3 = (e) kVar3.get(i95);
                        i82 = i17;
                        iB = i96;
                    }
                    eVar = eVar3;
                    i18 = i94;
                } else {
                    i18 = i14;
                    eVar = eVar3;
                    i17 = i82;
                }
                int iMax3 = Math.max(0, i13 - i55);
                int i97 = i13 - 1;
                if (iMax3 <= i97) {
                    int i98 = iMax3;
                    int i99 = i97;
                    ArrayList arrayList8 = null;
                    while (true) {
                        if (arrayList8 == null) {
                            arrayList8 = new ArrayList();
                        }
                        i24 = i90;
                        int i100 = i98;
                        i21 = i16;
                        i22 = i100;
                        i19 = i92;
                        i23 = i17;
                        kVar = kVar3;
                        i25 = i83;
                        i26 = i55;
                        eVar2 = eVar;
                        arrayList7 = arrayList8;
                        j13 = j12;
                        arrayList7.add(c.a.h(d0Var, i99, j13, lVar, j16, h1Var4, iVar, q1Var.getLayoutDirection(), i58, xVar2));
                        if (i99 == i22) {
                            break;
                        }
                        i99--;
                        i98 = i22;
                        i16 = i21;
                        i55 = i26;
                        j12 = j13;
                        eVar = eVar2;
                        arrayList8 = arrayList7;
                        i90 = i24;
                        kVar3 = kVar;
                        i92 = i19;
                        i83 = i25;
                        i17 = i23;
                    }
                    arrayList = arrayList7;
                } else {
                    i19 = i92;
                    i21 = i16;
                    i22 = iMax3;
                    i23 = i17;
                    i24 = i90;
                    kVar = kVar3;
                    i25 = i83;
                    j13 = j12;
                    i26 = i55;
                    eVar2 = eVar;
                    arrayList = null;
                }
                int size = list2.size();
                int i101 = 0;
                while (i101 < size) {
                    List list3 = list2;
                    ArrayList arrayList9 = arrayList;
                    int iIntValue2 = ((Number) list3.get(i101)).intValue();
                    if (iIntValue2 < i22) {
                        if (arrayList9 == null) {
                            arrayList9 = new ArrayList();
                        }
                        ArrayList arrayList10 = arrayList9;
                        list = list3;
                        arrayList10.add(c.a.h(d0Var, iIntValue2, j13, lVar, j16, h1Var4, iVar, q1Var.getLayoutDirection(), i58, xVar2));
                        arrayList = arrayList10;
                    } else {
                        list = list3;
                        arrayList = arrayList9;
                    }
                    i101++;
                    i22 = i22;
                    list2 = list;
                }
                ArrayList arrayList11 = arrayList;
                List list4 = list2;
                ry.r rVar = ry.r.f50854a;
                List list5 = arrayList11 == null ? rVar : arrayList11;
                int size2 = list5.size();
                int iMax4 = i15;
                int i102 = 0;
                while (i102 < size2) {
                    iMax4 = Math.max(iMax4, ((e) list5.get(i102)).f44369h);
                    i102++;
                    rVar = rVar;
                }
                ry.r rVar2 = rVar;
                int i103 = ((e) kVar.last()).f44362a;
                int iMin = Math.min(i26, (i80 - i103) - 1) + i103;
                int i104 = i103 + 1;
                if (i104 <= iMin) {
                    int i105 = i104;
                    ArrayList arrayList12 = null;
                    while (true) {
                        if (arrayList12 == null) {
                            arrayList12 = new ArrayList();
                        }
                        i29 = iMax4;
                        i27 = i26;
                        i28 = iMin;
                        arrayList12.add(c.a.h(d0Var, i105, j13, lVar, j16, h1Var4, iVar, q1Var.getLayoutDirection(), i58, xVar2));
                        if (i105 == i28) {
                            break;
                        }
                        i105++;
                        iMin = i28;
                        iMax4 = i29;
                        i26 = i27;
                    }
                    arrayList2 = arrayList12;
                } else {
                    i27 = i26;
                    i28 = iMin;
                    i29 = iMax4;
                    arrayList2 = null;
                }
                int size3 = list4.size();
                int i106 = 0;
                while (i106 < size3) {
                    List list6 = list4;
                    int i107 = i28;
                    int iIntValue3 = ((Number) list6.get(i106)).intValue();
                    int i108 = size3;
                    if (i107 + 1 <= iIntValue3) {
                        i32 = i80;
                        if (iIntValue3 < i32) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            ArrayList arrayList13 = arrayList2;
                            e eVarH4 = c.a.h(d0Var, iIntValue3, j13, lVar, j16, h1Var4, iVar, q1Var.getLayoutDirection(), i58, xVar2);
                            j14 = j13;
                            arrayList13.add(eVarH4);
                            arrayList2 = arrayList13;
                        }
                        i106++;
                        iVar = iVar;
                        j13 = j14;
                        i80 = i32;
                        h1Var4 = h1Var4;
                        size3 = i108;
                        i28 = i107;
                        list4 = list6;
                    } else {
                        i32 = i80;
                    }
                    j14 = j13;
                    i106++;
                    iVar = iVar;
                    j13 = j14;
                    i80 = i32;
                    h1Var4 = h1Var4;
                    size3 = i108;
                    i28 = i107;
                    list4 = list6;
                }
                h1 h1Var5 = h1Var4;
                int i109 = i80;
                List list7 = arrayList2 == null ? rVar2 : arrayList2;
                int size4 = list7.size();
                int iMax5 = i29;
                for (int i110 = 0; i110 < size4; i110++) {
                    iMax5 = Math.max(iMax5, ((e) list7.get(i110)).f44369h);
                }
                boolean z15 = kotlin.jvm.internal.m.a(eVar2, kVar.first()) && list5.isEmpty() && list7.isEmpty();
                h1 h1Var6 = h1.Vertical;
                int iG2 = v3.b.g(h1Var5 == h1Var6 ? iMax5 : i21, j19);
                if (h1Var5 == h1Var6) {
                    iMax5 = i21;
                }
                int iF = v3.b.f(iMax5, j19);
                int i111 = h1Var5 == h1Var6 ? iF : iG2;
                int i112 = i25;
                int i113 = i21;
                boolean z16 = i113 < Math.min(i111, i112);
                if (!z16 || i24 == 0) {
                    i30 = i24;
                } else {
                    StringBuilder sb2 = new StringBuilder("non-zero pagesScrollOffset=");
                    i30 = i24;
                    sb2.append(i30);
                    i0.a.c(sb2.toString());
                }
                boolean z17 = z16;
                ArrayList arrayList14 = new ArrayList(list7.size() + list5.size() + kVar.b());
                if (z17) {
                    if (!list5.isEmpty() || !list7.isEmpty()) {
                        i0.a.a("No extra pages");
                    }
                    int iB2 = kVar.b();
                    int[] iArr = new int[iB2];
                    for (int i114 = 0; i114 < iB2; i114++) {
                        iArr[i114] = i58;
                    }
                    int[] iArr2 = new int[iB2];
                    arrayList3 = arrayList14;
                    z11 = z15;
                    i31 = i58;
                    j0.g gVar = new j0.g(q1Var.Q(i19), false, null);
                    if (h1Var5 == h1.Vertical) {
                        gVar.c(d0Var, i111, iArr, iArr2);
                    } else {
                        gVar.b(d0Var, i111, iArr, v3.m.Ltr, iArr2);
                    }
                    lz.g gVarV = ry.l.V(iArr2);
                    int i115 = gVarV.f40532a;
                    int i116 = gVarV.f40533b;
                    int i117 = gVarV.f40534c;
                    if ((i117 > 0 && i115 <= i116) || (i117 < 0 && i116 <= i115)) {
                        while (true) {
                            int i118 = iArr2[i115];
                            kVar2 = kVar;
                            int i119 = i117;
                            e eVar4 = (e) kVar2.get(i115);
                            eVar4.b(i118, iG2, iF);
                            arrayList3.add(eVar4);
                            if (i115 == i116) {
                                break;
                            }
                            i115 += i119;
                            kVar = kVar2;
                            i117 = i119;
                        }
                    } else {
                        kVar2 = kVar;
                    }
                } else {
                    z11 = z15;
                    h1Var5 = h1Var5;
                    i31 = i58;
                    q1Var = q1Var;
                    arrayList3 = arrayList14;
                    kVar2 = kVar;
                    int size5 = list5.size();
                    int i120 = i30;
                    for (int i121 = 0; i121 < size5; i121++) {
                        e eVar5 = (e) list5.get(i121);
                        i120 -= i40;
                        eVar5.b(i120, iG2, iF);
                        arrayList3.add(eVar5);
                    }
                    int iB3 = kVar2.b();
                    for (int i122 = 0; i122 < iB3; i122++) {
                        e eVar6 = (e) kVar2.get(i122);
                        eVar6.b(i30, iG2, iF);
                        arrayList3.add(eVar6);
                        i30 += i40;
                    }
                    int size6 = list7.size();
                    for (int i123 = 0; i123 < size6; i123++) {
                        e eVar7 = (e) list7.get(i123);
                        eVar7.b(i30, iG2, iF);
                        arrayList3.add(eVar7);
                        i30 += i40;
                    }
                }
                if (z11) {
                    arrayList4 = arrayList3;
                } else {
                    arrayList4 = new ArrayList(arrayList3.size());
                    int size7 = arrayList3.size();
                    int i124 = 0;
                    while (i124 < size7) {
                        Object obj2 = arrayList3.get(i124);
                        e eVar8 = (e) obj2;
                        List list8 = list7;
                        int i125 = size7;
                        if (eVar8.f44362a >= ((e) kVar2.first()).f44362a && eVar8.f44362a <= ((e) kVar2.last()).f44362a) {
                            arrayList4.add(obj2);
                        }
                        i124++;
                        size7 = i125;
                        list7 = list8;
                    }
                }
                List list9 = list7;
                if (list5.isEmpty()) {
                    arrayList5 = rVar2;
                } else {
                    arrayList5 = new ArrayList(arrayList3.size());
                    int size8 = arrayList3.size();
                    for (int i126 = 0; i126 < size8; i126++) {
                        Object obj3 = arrayList3.get(i126);
                        if (((e) obj3).f44362a < ((e) kVar2.first()).f44362a) {
                            arrayList5.add(obj3);
                        }
                    }
                }
                if (list9.isEmpty()) {
                    arrayList6 = rVar2;
                } else {
                    arrayList6 = new ArrayList(arrayList3.size());
                    int size9 = arrayList3.size();
                    int i127 = 0;
                    while (i127 < size9) {
                        Object obj4 = arrayList3.get(i127);
                        ?? r54 = arrayList5;
                        if (((e) obj4).f44362a > ((e) kVar2.last()).f44362a) {
                            arrayList5 = arrayList5;
                            arrayList6.add(obj4);
                        } else {
                            arrayList5 = arrayList5;
                        }
                        i127++;
                        arrayList5 = r54;
                    }
                    arrayList5 = arrayList5;
                }
                ?? r55 = arrayList5;
                if (!arrayList4.isEmpty()) {
                    obj = arrayList4.get(0);
                    int i128 = ((e) obj).f44371j;
                    lVar3.getClass();
                    float f13 = -Math.abs(i128 - f12);
                    int iA = ns.o.A(arrayList4);
                    if (1 <= iA) {
                        int i129 = 1;
                        while (true) {
                            Object obj5 = arrayList4.get(i129);
                            float f14 = -Math.abs(((e) obj5).f44371j - f12);
                            if (Float.compare(f13, f14) < 0) {
                                f13 = f14;
                                obj = obj5;
                            }
                            if (i129 == iA) {
                                break;
                            }
                            i129++;
                        }
                    }
                } else {
                    obj = null;
                }
                e eVar9 = (e) obj;
                lVar3.getClass();
                int i130 = i23;
                nVar = new n(arrayList4, i31, i19, i36, h1Var5, i47, i62, i27, eVar2, eVar9, i130 == 0 ? CropImageView.DEFAULT_ASPECT_RATIO : hz.b.k((0 - (eVar9 != null ? eVar9.f44371j : 0)) / i130, -0.5f, 0.5f), i18, i91 < i109 || i113 > i112, lVar3, q1Var.q0(v3.b.g(iG2 + i34, j11), v3.b.f(iF + iN3, j11), sVar, new w0(7, b1Var, arrayList3)), z14, r55, arrayList6, b0Var);
            }
            n nVar2 = nVar;
            tVar.h(nVar2, q1Var.c0(), false);
            return nVar2;
        } catch (Throwable th2) {
            re.q.t(fVarN, fVarR, cVarE);
            throw th2;
        }
    }
}
