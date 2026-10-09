package h1;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.internal.platform.ZjS.OYAvlbfUyD;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 implements w2.q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g1 f30266b = new g1(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g1 f30267c = new g1(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g1 f30268d = new g1(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30269a;

    public /* synthetic */ g1(int i11) {
        this.f30269a = i11;
    }

    public static final void b(ArrayList arrayList, kotlin.jvm.internal.w wVar, w2.s0 s0Var, ArrayList arrayList2, ArrayList arrayList3, kotlin.jvm.internal.w wVar2, ArrayList arrayList4, kotlin.jvm.internal.w wVar3, kotlin.jvm.internal.w wVar4) {
        float f5 = k.f30510d;
        if (!arrayList.isEmpty()) {
            wVar.f38359a = s0Var.n0(f5) + wVar.f38359a;
        }
        arrayList.add(0, ry.m.a1(arrayList2));
        arrayList3.add(Integer.valueOf(wVar2.f38359a));
        arrayList4.add(Integer.valueOf(wVar.f38359a));
        wVar.f38359a += wVar2.f38359a;
        wVar3.f38359a = Math.max(wVar3.f38359a, wVar4.f38359a);
        arrayList2.clear();
        wVar4.f38359a = 0;
        wVar2.f38359a = 0;
    }

    /* JADX WARN: Code duplicated, block: B:187:0x0205 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0123 A[PHI: r6 r8
      0x0123: PHI (r6v5 int) = (r6v4 int), (r6v9 int), (r6v9 int) binds: [B:68:0x013c, B:61:0x0117, B:63:0x011d] A[DONT_GENERATE, DONT_INLINE]
      0x0123: PHI (r8v14 int) = (r8v13 int), (r8v19 int), (r8v19 int) binds: [B:68:0x013c, B:61:0x0117, B:63:0x011d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x01fb  */
    @Override // w2.q0
    public final w2.r0 e(w2.s0 s0Var, List list, long j11) {
        Object obj;
        Object obj2;
        long j12;
        w2.g1 g1VarB;
        ArrayList arrayList;
        w2.g1 g1Var;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Object obj3;
        Object obj4;
        int iN0;
        int iMax;
        int i11;
        int iX;
        int i12 = this.f30269a;
        ry.s sVar = ry.s.f50855a;
        switch (i12) {
            case 0:
                int size = list.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size) {
                        obj = list.get(i13);
                        if (!kotlin.jvm.internal.m.a(w2.a0.i((w2.p0) obj), "leadingIcon")) {
                            i13++;
                        }
                    } else {
                        obj = null;
                    }
                }
                w2.p0 p0Var = (w2.p0) obj;
                w2.g1 g1VarB2 = p0Var != null ? p0Var.B(v3.a.a(0, 0, 0, 0, 10, j11)) : null;
                float f5 = i1.d1.f33993b;
                int i14 = g1VarB2 != null ? g1VarB2.f54501a : 0;
                int i15 = g1VarB2 != null ? g1VarB2.f54502b : 0;
                int size2 = list.size();
                int i16 = 0;
                while (true) {
                    if (i16 < size2) {
                        obj2 = list.get(i16);
                        if (!kotlin.jvm.internal.m.a(w2.a0.i((w2.p0) obj2), "trailingIcon")) {
                            i16++;
                        }
                    } else {
                        obj2 = null;
                    }
                }
                w2.p0 p0Var2 = (w2.p0) obj2;
                if (p0Var2 != null) {
                    j12 = j11;
                    g1VarB = p0Var2.B(v3.a.a(0, 0, 0, 0, 10, j12));
                } else {
                    j12 = j11;
                    g1VarB = null;
                }
                int i17 = g1VarB != null ? g1VarB.f54501a : 0;
                int i18 = g1VarB != null ? g1VarB.f54502b : 0;
                int size3 = list.size();
                for (int i19 = 0; i19 < size3; i19++) {
                    w2.p0 p0Var3 = (w2.p0) list.get(i19);
                    if (kotlin.jvm.internal.m.a(w2.a0.i(p0Var3), "label")) {
                        w2.g1 g1VarB3 = p0Var3.B(v3.b.j(-(i14 + i17), 0, 2, j12));
                        int i21 = i14 + g1VarB3.f54501a + i17;
                        int iMax2 = Math.max(i15, Math.max(g1VarB3.f54502b, i18));
                        return s0Var.q0(i21, iMax2, sVar, new f1(g1VarB2, i15, iMax2, g1VarB3, i14, g1VarB, i18));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 1:
                int size4 = list.size();
                for (int i22 = 0; i22 < size4; i22++) {
                    w2.p0 p0Var4 = (w2.p0) list.get(i22);
                    if (kotlin.jvm.internal.m.a(w2.a0.i(p0Var4), "Spacer")) {
                        w2.g1 g1VarB4 = p0Var4.B(v3.a.a(0, s0Var.n0(k1.k0.f37590o), 0, 0, 12, j11));
                        ArrayList arrayList4 = new ArrayList(list.size());
                        int size5 = list.size();
                        for (int i23 = 0; i23 < size5; i23++) {
                            Object obj5 = list.get(i23);
                            if (!kotlin.jvm.internal.m.a(w2.a0.i((w2.p0) obj5), "Spacer")) {
                                arrayList4.add(obj5);
                            }
                        }
                        ArrayList arrayList5 = new ArrayList(arrayList4.size());
                        int size6 = arrayList4.size();
                        for (int i24 = 0; i24 < size6; i24++) {
                            arrayList5.add(((w2.p0) arrayList4.get(i24)).B(v3.a.a(0, v3.a.h(j11) / 2, 0, 0, 12, j11)));
                        }
                        return s0Var.q0(v3.a.h(j11), v3.a.g(j11), sVar, new mb(arrayList5, g1VarB4, 0));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 2:
                int size7 = list.size();
                for (int i25 = 0; i25 < size7; i25++) {
                    w2.p0 p0Var5 = (w2.p0) list.get(i25);
                    if (kotlin.jvm.internal.m.a(w2.a0.i(p0Var5), "Spacer")) {
                        w2.g1 g1VarB5 = p0Var5.B(v3.a.a(0, 0, 0, s0Var.n0(k1.k0.f37590o), 3, j11));
                        ArrayList arrayList6 = new ArrayList(list.size());
                        int size8 = list.size();
                        for (int i26 = 0; i26 < size8; i26++) {
                            Object obj6 = list.get(i26);
                            if (!kotlin.jvm.internal.m.a(w2.a0.i((w2.p0) obj6), "Spacer")) {
                                arrayList6.add(obj6);
                            }
                        }
                        ArrayList arrayList7 = new ArrayList(arrayList6.size());
                        int size9 = arrayList6.size();
                        for (int i27 = 0; i27 < size9; i27++) {
                            arrayList7.add(((w2.p0) arrayList6.get(i27)).B(v3.a.a(0, 0, 0, v3.a.g(j11) / 2, 3, j11)));
                        }
                        return s0Var.q0(v3.a.h(j11), v3.a.g(j11), sVar, new mb(arrayList7, g1VarB5, 1));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 3:
                long j13 = j11;
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                ArrayList arrayList10 = new ArrayList();
                kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
                kotlin.jvm.internal.w wVar2 = new kotlin.jvm.internal.w();
                ArrayList arrayList11 = new ArrayList();
                kotlin.jvm.internal.w wVar3 = new kotlin.jvm.internal.w();
                ArrayList arrayList12 = arrayList9;
                kotlin.jvm.internal.w wVar4 = new kotlin.jvm.internal.w();
                float f11 = k.f30509c;
                float f12 = k.f30507a;
                int size10 = list.size();
                int i28 = 0;
                while (i28 < size10) {
                    ArrayList arrayList13 = arrayList8;
                    w2.g1 g1VarB6 = ((w2.p0) list.get(i28)).B(j13);
                    if (arrayList11.isEmpty()) {
                        g1Var = g1VarB6;
                    } else {
                        kotlin.jvm.internal.w wVar5 = wVar2;
                        if (s0Var.n0(f11) + wVar3.f38359a + g1VarB6.f54501a <= v3.a.h(j13)) {
                            wVar2 = wVar5;
                            g1Var = g1VarB6;
                        } else {
                            arrayList11 = arrayList11;
                            arrayList2 = arrayList12;
                            wVar2 = wVar5;
                            arrayList3 = arrayList13;
                            g1Var = g1VarB6;
                            b(arrayList3, wVar2, s0Var, arrayList11, arrayList2, wVar4, arrayList10, wVar, wVar3);
                        }
                        if (!arrayList11.isEmpty()) {
                            wVar3.f38359a = s0Var.n0(f11) + wVar3.f38359a;
                        }
                        arrayList11.add(g1Var);
                        wVar3.f38359a += g1Var.f54501a;
                        wVar4.f38359a = Math.max(wVar4.f38359a, g1Var.f54502b);
                        i28++;
                        arrayList11 = arrayList11;
                        arrayList12 = arrayList2;
                        arrayList8 = arrayList3;
                        j13 = j11;
                    }
                    arrayList2 = arrayList12;
                    arrayList3 = arrayList13;
                    if (!arrayList11.isEmpty()) {
                        wVar3.f38359a = s0Var.n0(f11) + wVar3.f38359a;
                    }
                    arrayList11.add(g1Var);
                    wVar3.f38359a += g1Var.f54501a;
                    wVar4.f38359a = Math.max(wVar4.f38359a, g1Var.f54502b);
                    i28++;
                    arrayList11 = arrayList11;
                    arrayList12 = arrayList2;
                    arrayList8 = arrayList3;
                    j13 = j11;
                }
                ArrayList arrayList14 = arrayList8;
                ArrayList arrayList15 = arrayList11;
                ArrayList arrayList16 = arrayList12;
                if (arrayList15.isEmpty()) {
                    arrayList = arrayList14;
                } else {
                    float f13 = k.f30507a;
                    arrayList = arrayList14;
                    b(arrayList, wVar2, s0Var, arrayList15, arrayList16, wVar4, arrayList10, wVar, wVar3);
                }
                int iMax3 = Math.max(wVar.f38359a, v3.a.j(j11));
                int iMax4 = Math.max(wVar2.f38359a, v3.a.i(j11));
                float f14 = k.f30507a;
                return s0Var.q0(iMax3, iMax4, sVar, new e(arrayList, s0Var, iMax3, arrayList10));
            default:
                int iMin = Math.min(v3.a.h(j11), s0Var.n0(d9.f30151a));
                int size11 = list.size();
                int i29 = 0;
                while (true) {
                    if (i29 < size11) {
                        obj3 = list.get(i29);
                        if (!kotlin.jvm.internal.m.a(w2.a0.i((w2.p0) obj3), "action")) {
                            i29++;
                        }
                    } else {
                        obj3 = null;
                    }
                }
                w2.p0 p0Var6 = (w2.p0) obj3;
                w2.g1 g1VarB7 = p0Var6 != null ? p0Var6.B(j11) : null;
                int size12 = list.size();
                int i30 = 0;
                while (true) {
                    if (i30 < size12) {
                        obj4 = list.get(i30);
                        if (!kotlin.jvm.internal.m.a(w2.a0.i((w2.p0) obj4), OYAvlbfUyD.DeOrsKPIcDc)) {
                            i30++;
                        }
                    } else {
                        obj4 = null;
                    }
                }
                w2.p0 p0Var7 = (w2.p0) obj4;
                w2.g1 g1VarB8 = p0Var7 != null ? p0Var7.B(j11) : null;
                int i31 = g1VarB7 != null ? g1VarB7.f54501a : 0;
                int i32 = g1VarB7 != null ? g1VarB7.f54502b : 0;
                int i33 = g1VarB8 != null ? g1VarB8.f54501a : 0;
                int i34 = g1VarB8 != null ? g1VarB8.f54502b : 0;
                int iN1 = ((iMin - i31) - i33) - (i33 == 0 ? s0Var.n0(d9.f30156f) : 0);
                int iJ = v3.a.j(j11);
                if (iN1 < iJ) {
                    iN1 = iJ;
                }
                int size13 = list.size();
                int i35 = 0;
                while (i35 < size13) {
                    w2.p0 p0Var8 = (w2.p0) list.get(i35);
                    int i36 = i32;
                    int i37 = i34;
                    if (kotlin.jvm.internal.m.a(w2.a0.i(p0Var8), "text")) {
                        w2.g1 g1VarB9 = p0Var8.B(v3.a.a(0, iN1, 0, 0, 9, j11));
                        w2.n nVar = w2.c.f54475a;
                        int iX2 = g1VarB9.X(nVar);
                        int iX3 = g1VarB9.X(w2.c.f54476b);
                        int i38 = iMin - i33;
                        int i39 = i38 - i31;
                        if (iX2 == iX3 || !(iX2 != Integer.MIN_VALUE && iX3 != Integer.MIN_VALUE)) {
                            iMax = Math.max(s0Var.n0(k1.g0.f37535i), Math.max(i36, i37));
                            iN0 = (iMax - g1VarB9.f54502b) / 2;
                            if (g1VarB7 == null || (iX = g1VarB7.X(nVar)) == Integer.MIN_VALUE) {
                                i11 = 0;
                            } else {
                                i11 = (iX2 + iN0) - iX;
                            }
                        } else {
                            iN0 = s0Var.n0(d9.f30152b) - iX2;
                            iMax = Math.max(s0Var.n0(k1.g0.f37536j), g1VarB9.f54502b + iN0);
                            if (g1VarB7 != null) {
                                i11 = (iMax - g1VarB7.f54502b) / 2;
                            } else {
                                i11 = 0;
                            }
                        }
                        return s0Var.q0(iMin, iMax, sVar, new y8(g1VarB9, iN0, g1VarB8, i38, g1VarB8 != null ? (iMax - g1VarB8.f54502b) / 2 : 0, g1VarB7, i39, i11));
                    }
                    i35++;
                    i34 = i37;
                    i32 = i36;
                    g1VarB7 = g1VarB7;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }
}
