package a0;

import h1.o7;
import h1.p7;
import h1.q7;
import h1.wb;
import h1.yb;
import h1.za;
import j0.n2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.n implements fz.e {
    public final /* synthetic */ Object H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f137e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f138f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f139t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(int i11, fz.e eVar, t1.d dVar, fz.e eVar2, fz.e eVar3, i1.r0 r0Var, fz.e eVar4) {
        super(2);
        this.f133a = 2;
        this.f137e = i11;
        this.f134b = eVar;
        this.H = dVar;
        this.f136d = eVar2;
        this.f135c = eVar3;
        this.f138f = r0Var;
        this.f139t = eVar4;
    }

    /* JADX WARN: Code duplicated, block: B:165:0x0408  */
    /* JADX WARN: Code duplicated, block: B:167:0x041b  */
    /* JADX WARN: Code duplicated, block: B:168:0x0420  */
    /* JADX WARN: Code duplicated, block: B:175:0x0440  */
    /* JADX WARN: Code duplicated, block: B:185:0x0487  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        j0.a1 a1Var;
        float fQ;
        float fA;
        Integer num;
        Object obj3;
        Object obj4;
        Object obj5;
        ArrayList arrayList;
        a9.e eVar;
        Object obj6;
        Integer numValueOf;
        int i11;
        int iIntValue;
        int iN0;
        int iD;
        Object obj7;
        Object obj8;
        int i12;
        int iN1;
        int iN2;
        switch (this.f133a) {
            case 0:
                ((Number) obj2).intValue();
                o.a((b0.c2) this.f134b, (z1.r) this.f136d, (fz.c) this.f135c, (z1.e) this.f139t, (fz.c) this.f138f, (t1.d) this.H, (l1.n) obj, l1.t.M(this.f137e | 1));
                return qy.b0.f48488a;
            case 1:
                ((Number) obj2).intValue();
                j0.e((b0.c2) this.f134b, (fz.c) this.f135c, (z1.r) this.f136d, (l1) this.f138f, (m1) this.f139t, (fz.f) this.H, (l1.n) obj, l1.t.M(this.f137e | 1));
                return qy.b0.f48488a;
            case 2:
                l1.n nVar = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar = (l1.s) nVar;
                    if (sVar.F()) {
                        sVar.W();
                    } else {
                        p7.b(this.f137e, (fz.e) this.f134b, (t1.d) this.H, (fz.e) this.f136d, (fz.e) this.f135c, (i1.r0) this.f138f, (fz.e) this.f139t, nVar, 0);
                    }
                } else {
                    p7.b(this.f137e, (fz.e) this.f134b, (t1.d) this.H, (fz.e) this.f136d, (fz.e) this.f135c, (i1.r0) this.f138f, (fz.e) this.f139t, nVar, 0);
                }
                return qy.b0.f48488a;
            case 3:
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                w2.q1 q1Var = (w2.q1) this.f136d;
                if ((iIntValue2 & 3) == 2) {
                    l1.s sVar2 = (l1.s) nVar2;
                    if (sVar2.F()) {
                        sVar2.W();
                    } else {
                        a1Var = new j0.a1((n2) this.f134b, q1Var);
                        if (((ArrayList) this.f135c).isEmpty()) {
                            fQ = a1Var.c();
                        } else {
                            fQ = q1Var.Q(this.f137e);
                        }
                        if (!((ArrayList) this.f138f).isEmpty() || (num = (Integer) this.f139t) == null) {
                            fA = a1Var.a();
                        } else {
                            fA = q1Var.Q(num.intValue());
                        }
                        ((t1.d) this.H).invoke(new j0.v1(j0.c.l(a1Var, q1Var.getLayoutDirection()), fQ, j0.c.k(a1Var, q1Var.getLayoutDirection()), fA), nVar2, 0);
                    }
                } else {
                    a1Var = new j0.a1((n2) this.f134b, q1Var);
                    if (((ArrayList) this.f135c).isEmpty()) {
                        fQ = a1Var.c();
                    } else {
                        fQ = q1Var.Q(this.f137e);
                    }
                    if (((ArrayList) this.f138f).isEmpty()) {
                        fA = a1Var.a();
                    } else {
                        fA = a1Var.a();
                    }
                    ((t1.d) this.H).invoke(new j0.v1(j0.c.l(a1Var, q1Var.getLayoutDirection()), fQ, j0.c.k(a1Var, q1Var.getLayoutDirection()), fA), nVar2, 0);
                }
                return qy.b0.f48488a;
            case 4:
                w2.q1 q1Var2 = (w2.q1) obj;
                long j11 = ((v3.a) obj2).f53483a;
                n2 n2Var = (n2) this.f138f;
                int iH = v3.a.h(j11);
                int iG = v3.a.g(j11);
                long jA = v3.a.a(0, 0, 0, 0, 10, j11);
                List listC = q1Var2.C(q7.TopBar, (fz.e) this.f134b);
                ArrayList arrayList2 = new ArrayList(listC.size());
                int size = listC.size();
                for (int i13 = 0; i13 < size; i13++) {
                    arrayList2.add(((w2.p0) listC.get(i13)).B(jA));
                }
                if (arrayList2.isEmpty()) {
                    obj3 = null;
                } else {
                    obj3 = arrayList2.get(0);
                    int i14 = ((w2.g1) obj3).f54502b;
                    int iA = ns.o.A(arrayList2);
                    if (1 <= iA) {
                        int i15 = 1;
                        while (true) {
                            Object obj9 = arrayList2.get(i15);
                            int i16 = ((w2.g1) obj9).f54502b;
                            if (i14 < i16) {
                                i14 = i16;
                                obj3 = obj9;
                            }
                            if (i15 != iA) {
                                i15++;
                            }
                        }
                    }
                }
                w2.g1 g1Var = (w2.g1) obj3;
                int i17 = g1Var != null ? g1Var.f54502b : 0;
                List listC2 = q1Var2.C(q7.Snackbar, (fz.e) this.f136d);
                ArrayList arrayList3 = new ArrayList(listC2.size());
                int size2 = listC2.size();
                int i18 = 0;
                while (i18 < size2) {
                    arrayList3.add(((w2.p0) listC2.get(i18)).B(v3.b.i(jA, (-n2Var.c(q1Var2, q1Var2.getLayoutDirection())) - n2Var.b(q1Var2, q1Var2.getLayoutDirection()), -n2Var.d(q1Var2))));
                    i18++;
                    listC2 = listC2;
                    i17 = i17;
                }
                int i19 = i17;
                if (arrayList3.isEmpty()) {
                    obj4 = null;
                } else {
                    obj4 = arrayList3.get(0);
                    int i21 = ((w2.g1) obj4).f54502b;
                    int iA2 = ns.o.A(arrayList3);
                    if (1 <= iA2) {
                        Object obj10 = obj4;
                        int i22 = i21;
                        int i23 = 1;
                        while (true) {
                            Object obj11 = arrayList3.get(i23);
                            int i24 = ((w2.g1) obj11).f54502b;
                            if (i22 < i24) {
                                obj10 = obj11;
                                i22 = i24;
                            }
                            if (i23 != iA2) {
                                i23++;
                            } else {
                                obj4 = obj10;
                            }
                        }
                    }
                }
                w2.g1 g1Var2 = (w2.g1) obj4;
                int i25 = g1Var2 != null ? g1Var2.f54502b : 0;
                if (arrayList3.isEmpty()) {
                    obj5 = null;
                } else {
                    obj5 = arrayList3.get(0);
                    int i26 = ((w2.g1) obj5).f54501a;
                    int iA3 = ns.o.A(arrayList3);
                    if (1 <= iA3) {
                        Object obj12 = obj5;
                        int i27 = i26;
                        int i28 = 1;
                        while (true) {
                            Object obj13 = arrayList3.get(i28);
                            int i29 = ((w2.g1) obj13).f54501a;
                            if (i27 < i29) {
                                obj12 = obj13;
                                i27 = i29;
                            }
                            if (i28 != iA3) {
                                i28++;
                            } else {
                                obj5 = obj12;
                            }
                        }
                    }
                }
                w2.g1 g1Var3 = (w2.g1) obj5;
                int i30 = g1Var3 != null ? g1Var3.f54501a : 0;
                List listC3 = q1Var2.C(q7.Fab, (fz.e) this.f135c);
                ArrayList arrayList4 = new ArrayList(listC3.size());
                int size3 = listC3.size();
                int i31 = 0;
                while (i31 < size3) {
                    int i32 = i25;
                    List list = listC3;
                    w2.g1 g1VarB = ((w2.p0) listC3.get(i31)).B(v3.b.i(jA, (-n2Var.c(q1Var2, q1Var2.getLayoutDirection())) - n2Var.b(q1Var2, q1Var2.getLayoutDirection()), -n2Var.d(q1Var2)));
                    if (g1VarB.f54502b == 0 || g1VarB.f54501a == 0) {
                        g1VarB = null;
                    }
                    if (g1VarB != null) {
                        arrayList4.add(g1VarB);
                    }
                    i31++;
                    i25 = i32;
                    listC3 = list;
                }
                int i33 = i25;
                boolean zIsEmpty = arrayList4.isEmpty();
                int i34 = this.f137e;
                if (zIsEmpty) {
                    arrayList = arrayList2;
                    eVar = null;
                } else {
                    if (arrayList4.isEmpty()) {
                        arrayList = arrayList2;
                        obj7 = null;
                    } else {
                        obj7 = arrayList4.get(0);
                        int i35 = ((w2.g1) obj7).f54501a;
                        int iA4 = ns.o.A(arrayList4);
                        if (1 <= iA4) {
                            int i36 = i35;
                            int i37 = 1;
                            while (true) {
                                Object obj14 = arrayList4.get(i37);
                                arrayList = arrayList2;
                                int i38 = ((w2.g1) obj14).f54501a;
                                if (i36 < i38) {
                                    i36 = i38;
                                    obj7 = obj14;
                                }
                                if (i37 != iA4) {
                                    i37++;
                                    arrayList2 = arrayList;
                                }
                            }
                        } else {
                            arrayList = arrayList2;
                        }
                    }
                    kotlin.jvm.internal.m.c(obj7);
                    int i39 = ((w2.g1) obj7).f54501a;
                    if (arrayList4.isEmpty()) {
                        i12 = i39;
                        obj8 = null;
                    } else {
                        obj8 = arrayList4.get(0);
                        int i40 = ((w2.g1) obj8).f54502b;
                        int iA5 = ns.o.A(arrayList4);
                        if (1 <= iA5) {
                            Object obj15 = obj8;
                            int i41 = i40;
                            int i42 = 1;
                            while (true) {
                                Object obj16 = arrayList4.get(i42);
                                i12 = i39;
                                int i43 = ((w2.g1) obj16).f54502b;
                                if (i41 < i43) {
                                    i41 = i43;
                                    obj15 = obj16;
                                }
                                if (i42 != iA5) {
                                    i42++;
                                    i39 = i12;
                                } else {
                                    obj8 = obj15;
                                }
                            }
                        } else {
                            i12 = i39;
                        }
                    }
                    kotlin.jvm.internal.m.c(obj8);
                    int i44 = ((w2.g1) obj8).f54502b;
                    if (i34 == 0) {
                        if (q1Var2.getLayoutDirection() == v3.m.Ltr) {
                            iN1 = q1Var2.n0(p7.f30851a);
                        } else {
                            iN2 = q1Var2.n0(p7.f30851a);
                            iN1 = (iH - iN2) - i12;
                        }
                    } else if (i34 != 2 && i34 != 3) {
                        iN1 = (iH - i12) / 2;
                    } else if (q1Var2.getLayoutDirection() == v3.m.Ltr) {
                        iN2 = q1Var2.n0(p7.f30851a);
                        iN1 = (iH - iN2) - i12;
                    } else {
                        iN1 = q1Var2.n0(p7.f30851a);
                    }
                    eVar = new a9.e(iN1, i44, 3);
                }
                List listC4 = q1Var2.C(q7.BottomBar, new t1.d(new h1.b(3, (fz.e) this.f139t), true, -2146438447));
                ArrayList arrayList5 = new ArrayList(listC4.size());
                int size4 = listC4.size();
                for (int i45 = 0; i45 < size4; i45++) {
                    arrayList5.add(((w2.p0) listC4.get(i45)).B(jA));
                }
                if (arrayList5.isEmpty()) {
                    obj6 = null;
                } else {
                    obj6 = arrayList5.get(0);
                    int i46 = ((w2.g1) obj6).f54502b;
                    int iA6 = ns.o.A(arrayList5);
                    if (1 <= iA6) {
                        int i47 = 1;
                        int i48 = i46;
                        while (true) {
                            Object obj17 = arrayList5.get(i47);
                            Object obj18 = obj6;
                            int i49 = ((w2.g1) obj17).f54502b;
                            if (i48 < i49) {
                                i48 = i49;
                                obj6 = obj17;
                            } else {
                                obj6 = obj18;
                            }
                            if (i47 != iA6) {
                                i47++;
                            }
                        }
                    }
                }
                w2.g1 g1Var4 = (w2.g1) obj6;
                Integer numValueOf2 = g1Var4 != null ? Integer.valueOf(g1Var4.f54502b) : null;
                if (eVar != null) {
                    int i50 = eVar.f479c;
                    if (numValueOf2 == null || i34 == 3) {
                        iN0 = q1Var2.n0(p7.f30851a) + i50;
                        iD = n2Var.d(q1Var2);
                    } else {
                        iN0 = numValueOf2.intValue() + i50;
                        iD = q1Var2.n0(p7.f30851a);
                    }
                    numValueOf = Integer.valueOf(iD + iN0);
                } else {
                    numValueOf = null;
                }
                if (i33 != 0) {
                    iIntValue = i33 + (numValueOf != null ? numValueOf.intValue() : numValueOf2 != null ? numValueOf2.intValue() : n2Var.d(q1Var2));
                    i11 = iH;
                } else {
                    i11 = iH;
                    iIntValue = 0;
                }
                a9.e eVar2 = eVar;
                Integer num2 = numValueOf2;
                int i51 = i11;
                int i52 = i30;
                ArrayList arrayList6 = arrayList;
                List listC5 = q1Var2.C(q7.MainContent, new t1.d(new m((n2) this.f138f, q1Var2, arrayList6, i19, arrayList5, num2, (t1.d) this.H, 3), true, -1213360416));
                ArrayList arrayList7 = new ArrayList(listC5.size());
                int size5 = listC5.size();
                for (int i53 = 0; i53 < size5; i53++) {
                    arrayList7.add(((w2.p0) listC5.get(i53)).B(jA));
                }
                return q1Var2.q0(i51, iG, ry.s.f50855a, new o7(arrayList7, arrayList6, arrayList3, arrayList5, eVar2, i51, i52, (n2) this.f138f, q1Var2, iG, iIntValue, num2, arrayList4, numValueOf));
            default:
                ((Number) obj2).intValue();
                wb.f((z1.r) this.f136d, (yb) this.f134b, (za) this.f135c, (w2.q0) this.f138f, (r0.e) this.f139t, (r0.e) this.H, (l1.n) obj, l1.t.M(this.f137e | 1));
                return qy.b0.f48488a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(b0.c2 c2Var, fz.c cVar, z1.r rVar, l1 l1Var, m1 m1Var, fz.f fVar, int i11) {
        super(2);
        this.f133a = 1;
        this.f134b = c2Var;
        this.f135c = cVar;
        this.f136d = rVar;
        this.f138f = l1Var;
        this.f139t = m1Var;
        this.H = fVar;
        this.f137e = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(b0.c2 c2Var, z1.r rVar, fz.c cVar, z1.e eVar, fz.c cVar2, t1.d dVar, int i11) {
        super(2);
        this.f133a = 0;
        this.f134b = c2Var;
        this.f136d = rVar;
        this.f135c = cVar;
        this.f139t = eVar;
        this.f138f = cVar2;
        this.H = dVar;
        this.f137e = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj, Object obj2, Object obj3, int i11, Object obj4, Object obj5, t1.d dVar, int i12) {
        super(2);
        this.f133a = i12;
        this.f134b = obj;
        this.f136d = obj2;
        this.f135c = obj3;
        this.f137e = i11;
        this.f138f = obj4;
        this.f139t = obj5;
        this.H = dVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(z1.r rVar, yb ybVar, za zaVar, w2.q0 q0Var, r0.e eVar, r0.e eVar2, int i11) {
        super(2);
        this.f133a = 5;
        this.f136d = rVar;
        this.f134b = ybVar;
        this.f135c = zaVar;
        this.f138f = q0Var;
        this.f139t = eVar;
        this.H = eVar2;
        this.f137e = i11;
    }
}
