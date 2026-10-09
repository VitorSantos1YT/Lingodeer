package w2;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0.s0 f54593a;

    public v0(j0.s0 s0Var) {
        this.f54593a = s0Var;
    }

    @Override // w2.q0
    public final int a(s sVar, List list, int i11) {
        ArrayList arrayListK = y2.f.k(sVar);
        j0.s0 s0Var = this.f54593a;
        j0.q0 q0Var = s0Var.f35414g;
        List list2 = (List) ry.m.t0(1, arrayListK);
        p0 p0Var = list2 != null ? (p0) ry.m.s0(list2) : null;
        List list3 = (List) ry.m.t0(2, arrayListK);
        q0Var.b(p0Var, list3 != null ? (p0) ry.m.s0(list3) : null, v3.b.b(i11, 0, 13));
        List list4 = (List) ry.m.s0(arrayListK);
        if (list4 == null) {
            list4 = ry.r.f50854a;
        }
        return j0.s0.a(list4, i11, sVar.n0(s0Var.f35410c), sVar.n0(s0Var.f35412e), s0Var.f35413f, s0Var.f35414g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v7, types: [w2.g1[]] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r8v12, types: [w2.g1[]] */
    @Override // w2.q0
    public final r0 e(s0 s0Var, List list, long j11) {
        j0.b bVar;
        p0 p0Var;
        y.k kVar;
        g1 g1VarB;
        j0.i0 i0Var;
        j0.h0 h0VarA;
        int i11;
        char c11;
        g1 g1Var;
        y.k kVar2;
        Integer num;
        y.k kVar3;
        j0.i0 i0Var2;
        int i12;
        y.w wVar;
        y.w wVar2;
        long jA;
        g1 g1VarB2;
        int i13;
        int i14;
        long jA2;
        ArrayList arrayListK = y2.f.k(s0Var);
        final j0.s0 s0Var2 = this.f54593a;
        final j0.q0 q0Var = s0Var2.f35414g;
        int i15 = s0Var2.f35413f;
        ry.s sVar = ry.s.f50855a;
        final int i16 = 0;
        if (i15 == 0 || arrayListK.isEmpty() || (v3.a.g(j11) == 0 && q0Var.f35383a != j0.m0.Visible)) {
            return s0Var.q0(0, 0, sVar, new com.lingo.lingoskill.object.a(27));
        }
        List list2 = (List) ry.m.q0(arrayListK);
        if (list2.isEmpty()) {
            return s0Var.q0(0, 0, sVar, new com.lingo.lingoskill.object.a(27));
        }
        final int i17 = 1;
        List list3 = (List) ry.m.t0(1, arrayListK);
        p0 p0Var2 = list3 != null ? (p0) ry.m.s0(list3) : null;
        List list4 = (List) ry.m.t0(2, arrayListK);
        p0 p0Var3 = list4 != null ? (p0) ry.m.s0(list4) : null;
        list2.size();
        q0Var.getClass();
        j0.h1 h1Var = j0.h1.Horizontal;
        long jG = j0.c.G(j0.c.n(10, j0.c.m(j11, h1Var)), h1Var);
        if (p0Var2 != null) {
            j0.c.u(p0Var2, s0Var2, jG, new fz.c() { // from class: j0.o0
                @Override // fz.c
                public final Object invoke(Object obj) {
                    int iG0;
                    int iA0;
                    int iG1;
                    int iA1;
                    w2.g1 g1Var2 = (w2.g1) obj;
                    switch (i16) {
                        case 0:
                            if (g1Var2 != null) {
                                s0Var2.getClass();
                                iG0 = g1Var2.g0();
                                iA0 = g1Var2.a0();
                            } else {
                                iG0 = 0;
                                iA0 = 0;
                            }
                            y.k kVar4 = new y.k(y.k.a(iG0, iA0));
                            q0 q0Var2 = q0Var;
                            q0Var2.f35388f = kVar4;
                            q0Var2.f35385c = g1Var2;
                            break;
                        default:
                            if (g1Var2 != null) {
                                s0Var2.getClass();
                                iG1 = g1Var2.g0();
                                iA1 = g1Var2.a0();
                            } else {
                                iG1 = 0;
                                iA1 = 0;
                            }
                            y.k kVar5 = new y.k(y.k.a(iG1, iA1));
                            q0 q0Var3 = q0Var;
                            q0Var3.f35389g = kVar5;
                            q0Var3.f35387e = g1Var2;
                            break;
                    }
                    return qy.b0.f48488a;
                }
            });
            q0Var.f35384b = p0Var2;
        }
        if (p0Var3 != null) {
            j0.c.u(p0Var3, s0Var2, jG, new fz.c() { // from class: j0.o0
                @Override // fz.c
                public final Object invoke(Object obj) {
                    int iG0;
                    int iA0;
                    int iG1;
                    int iA1;
                    w2.g1 g1Var2 = (w2.g1) obj;
                    switch (i17) {
                        case 0:
                            if (g1Var2 != null) {
                                s0Var2.getClass();
                                iG0 = g1Var2.g0();
                                iA0 = g1Var2.a0();
                            } else {
                                iG0 = 0;
                                iA0 = 0;
                            }
                            y.k kVar4 = new y.k(y.k.a(iG0, iA0));
                            q0 q0Var2 = q0Var;
                            q0Var2.f35388f = kVar4;
                            q0Var2.f35385c = g1Var2;
                            break;
                        default:
                            if (g1Var2 != null) {
                                s0Var2.getClass();
                                iG1 = g1Var2.g0();
                                iA1 = g1Var2.a0();
                            } else {
                                iG1 = 0;
                                iA1 = 0;
                            }
                            y.k kVar5 = new y.k(y.k.a(iG1, iA1));
                            q0 q0Var3 = q0Var;
                            q0Var3.f35389g = kVar5;
                            q0Var3.f35387e = g1Var2;
                            break;
                    }
                    return qy.b0.f48488a;
                }
            });
            q0Var.f35386d = p0Var3;
        }
        Iterator it = list2.iterator();
        float f5 = s0Var2.f35410c;
        float f11 = s0Var2.f35412e;
        long jM = j0.c.m(j11, h1Var);
        int i18 = s0Var2.f35413f;
        j0.q0 q0Var2 = s0Var2.f35414g;
        n1.e eVar = new n1.e(new r0[16]);
        int iH = v3.a.h(jM);
        int iJ = v3.a.j(jM);
        int iG = v3.a.g(jM);
        y.x xVar = y.n.f56742a;
        y.x xVar2 = new y.x();
        ArrayList arrayList = new ArrayList();
        int iCeil = (int) Math.ceil(s0Var.e0(f5));
        int iCeil2 = (int) Math.ceil(s0Var.e0(f11));
        long jA3 = v3.b.a(0, iH, 0, iG);
        long jG2 = j0.c.G(j0.c.n(14, jA3), h1Var);
        if (it instanceof j0.x) {
            s0Var.Q(iH);
            s0Var.Q(iG);
            bVar = new j0.b(4);
        } else {
            bVar = null;
        }
        if (it.hasNext()) {
            try {
                if (it instanceof j0.x) {
                    throw new ClassCastException();
                }
                p0Var = (p0) it.next();
            } catch (IndexOutOfBoundsException unused) {
                p0Var = null;
            }
        } else {
            p0Var = null;
        }
        if (p0Var != null) {
            if (j0.c.p(j0.c.o(p0Var)) == CropImageView.DEFAULT_ASPECT_RATIO) {
                j0.c.o(p0Var);
                g1VarB = p0Var.B(jG2);
                jA2 = y.k.a(g1VarB.g0(), g1VarB.a0());
            } else {
                int iP = p0Var.p(Integer.MAX_VALUE);
                jA2 = y.k.a(iP, p0Var.W(iP));
                g1VarB = null;
            }
            kVar = new y.k(jA2);
        } else {
            iCeil2 = iCeil2;
            kVar = null;
            g1VarB = null;
        }
        Integer numValueOf = kVar != null ? Integer.valueOf((int) (kVar.f56725a >> 32)) : null;
        Integer numValueOf2 = kVar != null ? Integer.valueOf((int) (kVar.f56725a & 4294967295L)) : null;
        y.w wVar3 = new y.w();
        p0 p0Var4 = p0Var;
        y.w wVar4 = new y.w();
        g1 g1Var2 = g1VarB;
        y.y yVar = new y.y();
        j0.j0 j0Var = new j0.j0(i18, q0Var2, jM, iCeil, iCeil2);
        int i19 = iCeil2;
        Integer num2 = numValueOf2;
        int i21 = i18;
        int i22 = iCeil;
        y.k kVar4 = kVar;
        j0.i0 i0VarB = j0Var.b(it.hasNext(), 0, y.k.a(iH, iG), kVar4, 0, 0, 0, false, false);
        if (i0VarB.f35312b) {
            i0Var = i0VarB;
            h0VarA = j0Var.a(i0Var, kVar4 != null, -1, 0, iH, 0);
        } else {
            i0Var = i0VarB;
            h0VarA = null;
        }
        j0.h0 h0Var = h0VarA;
        int i23 = iH;
        y.y yVar2 = yVar;
        j0.i0 i0Var3 = i0Var;
        p0 p0Var5 = p0Var4;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        y.w wVar5 = wVar3;
        j0.b bVar2 = bVar;
        int i28 = iG;
        g1 g1Var3 = g1Var2;
        int i29 = 0;
        int i30 = 0;
        while (!i0Var3.f35312b && p0Var5 != null) {
            kotlin.jvm.internal.m.c(numValueOf);
            int iIntValue = numValueOf.intValue();
            kotlin.jvm.internal.m.c(num2);
            int iIntValue2 = num2.intValue();
            y.w wVar6 = wVar4;
            int i31 = i24 + iIntValue;
            int iMax = Math.max(i29, iIntValue2);
            int i32 = i23 - iIntValue;
            int i33 = i30 + 1;
            q0Var2.getClass();
            arrayList.add(p0Var5);
            xVar2.h(i30, g1Var3);
            p0Var5.G();
            int i34 = i33 - i25;
            boolean z11 = i34 < i21;
            if (bVar2 != null) {
                if (z11) {
                    i13 = i32 - i22;
                    if (i13 < 0) {
                        i13 = 0;
                    }
                } else {
                    i13 = iH;
                }
                s0Var.Q(i13);
                if (z11) {
                    i14 = i28;
                } else {
                    i14 = (i28 - iMax) - i19;
                    if (i14 < 0) {
                        i14 = 0;
                    }
                }
                s0Var.Q(i14);
            }
            if (it.hasNext()) {
                try {
                    if (it instanceof j0.x) {
                        throw new ClassCastException();
                    }
                    p0Var5 = (p0) it.next();
                } catch (IndexOutOfBoundsException unused2) {
                    p0Var5 = null;
                }
            } else {
                p0Var5 = null;
            }
            if (p0Var5 != null) {
                if (j0.c.p(j0.c.o(p0Var5)) == CropImageView.DEFAULT_ASPECT_RATIO) {
                    j0.c.o(p0Var5);
                    g1VarB2 = p0Var5.B(jG2);
                    jA = y.k.a(g1VarB2.g0(), g1VarB2.a0());
                } else {
                    int iP2 = p0Var5.p(Integer.MAX_VALUE);
                    jA = y.k.a(iP2, p0Var5.W(iP2));
                    g1VarB2 = null;
                }
                kVar2 = new y.k(jA);
                g1Var = g1VarB2;
            } else {
                i21 = i21;
                i34 = i34;
                g1Var = null;
                kVar2 = null;
            }
            g1 g1Var4 = g1Var;
            numValueOf = kVar2 != null ? Integer.valueOf(((int) (kVar2.f56725a >> 32)) + i22) : null;
            Integer numValueOf3 = kVar2 != null ? Integer.valueOf((int) (kVar2.f56725a & 4294967295L)) : null;
            boolean zHasNext = it.hasNext();
            int i35 = i26;
            long jA4 = y.k.a(i32, i28);
            if (kVar2 == null) {
                num = numValueOf3;
                kVar3 = null;
            } else {
                kotlin.jvm.internal.m.c(numValueOf);
                int iIntValue3 = numValueOf.intValue();
                kotlin.jvm.internal.m.c(numValueOf3);
                num = numValueOf3;
                kVar3 = new y.k(y.k.a(iIntValue3, num.intValue()));
            }
            j0.i0 i0VarB2 = j0Var.b(zHasNext, i34, jA4, kVar3, i35, i27, iMax, false, false);
            int i36 = iMax;
            if (i0VarB2.f35311a) {
                int iMin = Math.min(Math.max(iJ, i31), iH);
                int i37 = i27 + i36;
                i0Var2 = i0VarB2;
                j0.h0 h0VarA2 = j0Var.a(i0Var2, kVar2 != null, i35, i37, i32, i34);
                wVar = wVar6;
                wVar.a(i36);
                i28 = (iG - i37) - i19;
                y.w wVar7 = wVar5;
                wVar7.a(i33);
                i26 = i35 + 1;
                h0Var = h0VarA2;
                wVar2 = wVar7;
                i12 = iH;
                i25 = i33;
                numValueOf = numValueOf != null ? Integer.valueOf(numValueOf.intValue() - i22) : null;
                i27 = i37 + i19;
                i36 = 0;
                i31 = 0;
                iJ = iMin;
            } else {
                i0Var2 = i0VarB2;
                i12 = i32;
                wVar = wVar6;
                wVar2 = wVar5;
                i26 = i35;
            }
            i29 = i36;
            g1Var3 = g1Var4;
            i30 = i33;
            wVar5 = wVar2;
            i21 = i21;
            it = it;
            i23 = i12;
            num2 = num;
            i24 = i31;
            wVar4 = wVar;
            i0Var3 = i0Var2;
        }
        y.w wVar8 = wVar4;
        y.w wVar9 = wVar5;
        if (h0Var != null) {
            j0.h0 h0Var2 = h0Var;
            long j12 = h0Var2.f35298b;
            arrayList.add((p0) h0Var2.f35299c);
            xVar2.h(arrayList.size() - 1, (g1) h0Var2.f35300d);
            int i38 = wVar9.f56783b - 1;
            if (h0Var2.f35297a) {
                wVar8.g(i38, Math.max(wVar8.c(i38), (int) (j12 & 4294967295L)));
                wVar9.g(i38, wVar9.d() + 1);
            } else {
                wVar8.a((int) (j12 & 4294967295L));
                wVar9.a(wVar9.d() + 1);
            }
        }
        int size = arrayList.size();
        ?? r9 = new g1[size];
        for (int i39 = 0; i39 < size; i39++) {
            r9[i39] = xVar2.b(i39);
        }
        int i40 = wVar9.f56783b;
        int iMax2 = iJ;
        int[] iArr = new int[i40];
        int[] iArr2 = new int[i40];
        int[] iArr3 = wVar9.f56782a;
        int i41 = 0;
        int i42 = 0;
        int i43 = 0;
        ?? r11 = r9;
        while (i42 < i40) {
            int i44 = iArr3[i42];
            int iC = wVar8.c(i42);
            y.y yVar3 = yVar2;
            if (yVar3.b(i42)) {
                c11 = 65535;
            } else {
                c11 = 65535;
                iC = v3.a.g(jA3) == Integer.MAX_VALUE ? Integer.MAX_VALUE : v3.a.g(jA3) - i43;
            }
            ?? r12 = r11;
            yVar2 = yVar3;
            int i45 = i22;
            ArrayList arrayList2 = arrayList;
            r0 r0VarT = j0.c.t(s0Var2, iMax2, v3.a.i(jA3), v3.a.h(jA3), iC, i45, s0Var, arrayList2, r12, i41, i44, iArr, i42);
            int iH2 = r0VarT.h();
            int iF = r0VarT.f();
            iArr2[i42] = iF;
            i43 += iF;
            iMax2 = Math.max(iMax2, iH2);
            eVar.c(r0VarT);
            i42++;
            r11 = r12;
            i41 = i44;
            wVar8 = wVar8;
            iArr3 = iArr3;
            i22 = i45;
            arrayList = arrayList2;
        }
        if (eVar.f43114c == 0) {
            iMax2 = 0;
            i11 = 0;
        } else {
            i11 = i43;
        }
        j0.h hVar = s0Var2.f35409b;
        int iN0 = ((eVar.f43114c - 1) * s0Var.n0(hVar.a())) + i11;
        int i46 = v3.a.i(jM);
        int iG2 = v3.a.g(jM);
        if (iN0 < i46) {
            iN0 = i46;
        }
        if (iN0 <= iG2) {
            iG2 = iN0;
        }
        hVar.c(s0Var, iG2, iArr2, iArr);
        int iJ2 = v3.a.j(jM);
        int iH3 = v3.a.h(jM);
        if (iMax2 < iJ2) {
            iMax2 = iJ2;
        }
        if (iMax2 <= iH3) {
            iH3 = iMax2;
        }
        return s0Var.q0(iH3, iG2, sVar, new gr.s(eVar, 13));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v0) && kotlin.jvm.internal.m.a(this.f54593a, ((v0) obj).f54593a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0095  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // w2.q0
    public final int f(s sVar, List list, int i11) {
        int i12;
        int[] iArr;
        List list2;
        int i13;
        long jA;
        int i14;
        j0.m0 m0Var;
        ArrayList arrayListK = y2.f.k(sVar);
        j0.s0 s0Var = this.f54593a;
        j0.q0 q0Var = s0Var.f35414g;
        int i15 = 1;
        List list3 = (List) ry.m.t0(1, arrayListK);
        p0 p0Var = list3 != null ? (p0) ry.m.s0(list3) : null;
        List list4 = (List) ry.m.t0(2, arrayListK);
        int i16 = 0;
        q0Var.b(p0Var, list4 != null ? (p0) ry.m.s0(list4) : null, v3.b.b(0, i11, 7));
        List list5 = (List) ry.m.s0(arrayListK);
        if (list5 == null) {
            list5 = ry.r.f50854a;
        }
        int iN0 = sVar.n0(s0Var.f35410c);
        int iN1 = sVar.n0(s0Var.f35412e);
        int i17 = s0Var.f35413f;
        j0.q0 q0Var2 = s0Var.f35414g;
        if (list5.isEmpty()) {
            return 0;
        }
        int size = list5.size();
        int[] iArr2 = new int[size];
        int size2 = list5.size();
        int[] iArr3 = new int[size2];
        int size3 = list5.size();
        for (int i18 = 0; i18 < size3; i18++) {
            p0 p0Var2 = (p0) list5.get(i18);
            int iP = p0Var2.p(i11);
            iArr2[i18] = iP;
            iArr3[i18] = p0Var2.W(iP);
        }
        if (Integer.MAX_VALUE >= list5.size() || !((m0Var = q0Var2.f35383a) == j0.m0.ExpandIndicator || m0Var == j0.m0.ExpandOrCollapseIndicator)) {
            if (Integer.MAX_VALUE >= list5.size()) {
                q0Var2.getClass();
                i12 = q0Var2.f35383a == j0.m0.ExpandOrCollapseIndicator ? 1 : 0;
            }
        }
        int iMin = Math.min(Integer.MAX_VALUE - i12, list5.size());
        int i19 = 0;
        for (int i21 = 0; i21 < size; i21++) {
            i19 += iArr2[i21];
        }
        int size4 = ((list5.size() - 1) * iN0) + i19;
        if (size2 == 0) {
            throw new NoSuchElementException();
        }
        int i22 = iArr3[0];
        int i23 = size2 - 1;
        if (1 <= i23) {
            int i24 = 1;
            while (true) {
                int i25 = iArr3[i24];
                if (i22 < i25) {
                    i22 = i25;
                }
                if (i24 == i23) {
                    break;
                }
                i24++;
            }
        }
        if (size == 0) {
            throw new NoSuchElementException();
        }
        int i26 = iArr2[0];
        int i27 = size - 1;
        if (1 <= i27) {
            int i28 = 1;
            while (true) {
                int i29 = iArr2[i28];
                if (i26 < i29) {
                    i26 = i29;
                }
                if (i28 == i27) {
                    break;
                }
                i28++;
            }
        }
        int i30 = size4;
        while (i26 <= size4 && i22 != i11) {
            int i31 = (i26 + size4) / 2;
            if (list5.isEmpty()) {
                jA = y.k.a(i16, i16);
                i31 = i31;
                list2 = list5;
                iArr = iArr3;
            } else {
                j0.j0 j0Var = new j0.j0(i17, q0Var2, v3.b.a(i16, i31, i16, Integer.MAX_VALUE), iN0, iN1);
                p0 p0Var3 = (p0) ry.m.t0(i16, list5);
                int i32 = p0Var3 != null ? iArr3[i16] : i16;
                int i33 = p0Var3 != null ? iArr2[i16] : i16;
                iArr = iArr3;
                int i34 = 0;
                int i35 = 0;
                if (j0Var.b(list5.size() > i15 ? i15 : 0, 0, y.k.a(i31, Integer.MAX_VALUE), p0Var3 == null ? null : new y.k(y.k.a(i33, i32)), 0, 0, 0, false, false).f35312b) {
                    y.k kVarA = q0Var2.a(0, 0, p0Var3 != null);
                    jA = y.k.a(kVarA != null ? (int) (kVarA.f56725a & 4294967295L) : 0, 0);
                    i31 = i31;
                    list2 = list5;
                } else {
                    int size5 = list5.size();
                    int i36 = i31;
                    int i37 = 0;
                    int i38 = 0;
                    int i39 = 0;
                    int i40 = 0;
                    while (true) {
                        if (i37 >= size5) {
                            i31 = i31;
                            list2 = list5;
                            i13 = i38;
                            break;
                        }
                        int i41 = i36 - i33;
                        i13 = i37 + 1;
                        int iMax = Math.max(i40, i32);
                        p0 p0Var4 = (p0) ry.m.t0(i13, list5);
                        i32 = p0Var4 != null ? iArr[i13] : 0;
                        int i42 = p0Var4 != null ? iArr2[i13] + iN0 : 0;
                        list2 = list5;
                        int i43 = i13 - i39;
                        j0.i0 i0VarB = j0Var.b(i37 + 2 < list2.size(), i43, y.k.a(i41, Integer.MAX_VALUE), p0Var4 == null ? null : new y.k(y.k.a(i42, i32)), i34, i35, iMax, false, false);
                        if (i0VarB.f35311a) {
                            int i44 = iMax + iN1 + i35;
                            int i45 = i34;
                            j0.h0 h0VarA = j0Var.a(i0VarB, p0Var4 != null, i45, i44, i41, i43);
                            i42 -= iN0;
                            i34 = i45 + 1;
                            if (i0VarB.f35312b) {
                                if (h0VarA != null) {
                                    long j11 = h0VarA.f35298b;
                                    if (!h0VarA.f35297a) {
                                        i44 = ((int) (j11 & 4294967295L)) + iN1 + i44;
                                    }
                                }
                                i35 = i44;
                                break;
                            }
                            i39 = i13;
                            i35 = i44;
                            i14 = i31;
                            i40 = 0;
                        } else {
                            i14 = i41;
                            i40 = iMax;
                        }
                        i33 = i42;
                        i37 = i13;
                        i38 = i37;
                        i36 = i14;
                        i31 = i31;
                        list5 = list2;
                    }
                    jA = y.k.a(i35 - iN1, i13);
                }
            }
            i22 = (int) (jA >> 32);
            int i46 = (int) (jA & 4294967295L);
            if (i22 > i11 || i46 < iMin) {
                i26 = i31 + 1;
                if (i26 > size4) {
                    return i26;
                }
            } else {
                if (i22 >= i11) {
                    return i31;
                }
                size4 = i31 - 1;
            }
            iArr3 = iArr;
            i30 = i31;
            list5 = list2;
            i15 = 1;
            i16 = 0;
        }
        return i30;
    }

    @Override // w2.q0
    public final int h(s sVar, List list, int i11) {
        ArrayList arrayListK = y2.f.k(sVar);
        j0.s0 s0Var = this.f54593a;
        j0.q0 q0Var = s0Var.f35414g;
        List list2 = (List) ry.m.t0(1, arrayListK);
        p0 p0Var = list2 != null ? (p0) ry.m.s0(list2) : null;
        List list3 = (List) ry.m.t0(2, arrayListK);
        q0Var.b(p0Var, list3 != null ? (p0) ry.m.s0(list3) : null, v3.b.b(0, i11, 7));
        List list4 = (List) ry.m.s0(arrayListK);
        if (list4 == null) {
            list4 = ry.r.f50854a;
        }
        int iN0 = sVar.n0(s0Var.f35410c);
        int i12 = s0Var.f35413f;
        int size = list4.size();
        int i13 = 0;
        int iMax = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < size) {
            int iT = ((p0) list4.get(i13)).t(i11) + iN0;
            int i16 = i13 + 1;
            if (i16 - i14 == i12 || i16 == list4.size()) {
                iMax = Math.max(iMax, (i15 + iT) - iN0);
                i14 = i13;
                i15 = 0;
            } else {
                i15 += iT;
            }
            i13 = i16;
        }
        return iMax;
    }

    public final int hashCode() {
        return this.f54593a.hashCode();
    }

    @Override // w2.q0
    public final int i(s sVar, List list, int i11) {
        ArrayList arrayListK = y2.f.k(sVar);
        j0.s0 s0Var = this.f54593a;
        j0.q0 q0Var = s0Var.f35414g;
        List list2 = (List) ry.m.t0(1, arrayListK);
        p0 p0Var = list2 != null ? (p0) ry.m.s0(list2) : null;
        List list3 = (List) ry.m.t0(2, arrayListK);
        q0Var.b(p0Var, list3 != null ? (p0) ry.m.s0(list3) : null, v3.b.b(i11, 0, 13));
        List list4 = (List) ry.m.s0(arrayListK);
        if (list4 == null) {
            list4 = ry.r.f50854a;
        }
        return j0.s0.a(list4, i11, sVar.n0(s0Var.f35410c), sVar.n0(s0Var.f35412e), s0Var.f35413f, s0Var.f35414g);
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.f54593a + ')';
    }
}
