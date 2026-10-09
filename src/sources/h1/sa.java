package h1;

import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class sa implements w2.q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f31073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f31074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0.t1 f31075c;

    public sa(boolean z11, float f5, j0.t1 t1Var) {
        this.f31073a = z11;
        this.f31074b = f5;
        this.f31075c = t1Var;
    }

    public static int c(List list, int i11, fz.e eVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            Object obj7 = list.get(i12);
            if (kotlin.jvm.internal.m.a(i1.d1.e((w2.p0) obj7), "TextField")) {
                int iIntValue = ((Number) eVar.invoke(obj7, Integer.valueOf(i11))).intValue();
                int size2 = list.size();
                int i13 = 0;
                while (true) {
                    obj = null;
                    if (i13 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i13);
                    if (kotlin.jvm.internal.m.a(i1.d1.e((w2.p0) obj2), "Label")) {
                        break;
                    }
                    i13++;
                }
                w2.p0 p0Var = (w2.p0) obj2;
                int iIntValue2 = p0Var != null ? ((Number) eVar.invoke(p0Var, Integer.valueOf(i11))).intValue() : 0;
                int size3 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i14);
                    if (kotlin.jvm.internal.m.a(i1.d1.e((w2.p0) obj3), "Trailing")) {
                        break;
                    }
                    i14++;
                }
                w2.p0 p0Var2 = (w2.p0) obj3;
                int iIntValue3 = p0Var2 != null ? ((Number) eVar.invoke(p0Var2, Integer.valueOf(i11))).intValue() : 0;
                int size4 = list.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i15);
                    if (kotlin.jvm.internal.m.a(i1.d1.e((w2.p0) obj4), "Prefix")) {
                        break;
                    }
                    i15++;
                }
                w2.p0 p0Var3 = (w2.p0) obj4;
                int iIntValue4 = p0Var3 != null ? ((Number) eVar.invoke(p0Var3, Integer.valueOf(i11))).intValue() : 0;
                int size5 = list.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i16);
                    if (kotlin.jvm.internal.m.a(i1.d1.e((w2.p0) obj5), "Suffix")) {
                        break;
                    }
                    i16++;
                }
                w2.p0 p0Var4 = (w2.p0) obj5;
                int iIntValue5 = p0Var4 != null ? ((Number) eVar.invoke(p0Var4, Integer.valueOf(i11))).intValue() : 0;
                int size6 = list.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i17);
                    if (kotlin.jvm.internal.m.a(i1.d1.e((w2.p0) obj6), "Leading")) {
                        break;
                    }
                    i17++;
                }
                w2.p0 p0Var5 = (w2.p0) obj6;
                int iIntValue6 = p0Var5 != null ? ((Number) eVar.invoke(p0Var5, Integer.valueOf(i11))).intValue() : 0;
                int size7 = list.size();
                for (int i18 = 0; i18 < size7; i18++) {
                    Object obj8 = list.get(i18);
                    if (kotlin.jvm.internal.m.a(i1.d1.e((w2.p0) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                }
                w2.p0 p0Var6 = (w2.p0) obj;
                int iIntValue7 = p0Var6 != null ? ((Number) eVar.invoke(p0Var6, Integer.valueOf(i11))).intValue() : 0;
                long j11 = i1.d1.f33992a;
                int i19 = qa.f30936a;
                int i21 = iIntValue4 + iIntValue5;
                return Math.max(Math.max(iIntValue + i21, Math.max(iIntValue7 + i21, iIntValue2)) + iIntValue6 + iIntValue3, v3.a.j(j11));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // w2.q0
    public final int a(w2.s sVar, List list, int i11) {
        return b(sVar, list, i11, x1.X);
    }

    public final int b(w2.s sVar, List list, int i11, fz.e eVar) {
        Object obj;
        int iT;
        int iIntValue;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int i12;
        Object obj5;
        int i13;
        Object obj6;
        Object obj7;
        int size = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i14);
            if (kotlin.jvm.internal.m.a(i1.d1.e((w2.p0) obj), "Leading")) {
                break;
            }
            i14++;
        }
        w2.p0 p0Var = (w2.p0) obj;
        if (p0Var != null) {
            iT = i11 == Integer.MAX_VALUE ? i11 : i11 - p0Var.t(Integer.MAX_VALUE);
            iIntValue = ((Number) eVar.invoke(p0Var, Integer.valueOf(i11))).intValue();
        } else {
            iT = i11;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i15);
            if (kotlin.jvm.internal.m.a(i1.d1.e((w2.p0) obj2), "Trailing")) {
                break;
            }
            i15++;
        }
        w2.p0 p0Var2 = (w2.p0) obj2;
        if (p0Var2 != null) {
            int iT2 = p0Var2.t(Integer.MAX_VALUE);
            if (iT != Integer.MAX_VALUE) {
                iT -= iT2;
            }
            iIntValue2 = ((Number) eVar.invoke(p0Var2, Integer.valueOf(i11))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i16);
            if (kotlin.jvm.internal.m.a(i1.d1.e((w2.p0) obj3), "Label")) {
                break;
            }
            i16++;
        }
        Object obj8 = (w2.p0) obj3;
        int iIntValue3 = obj8 != null ? ((Number) eVar.invoke(obj8, Integer.valueOf(iT))).intValue() : 0;
        int size4 = list.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i17);
            if (kotlin.jvm.internal.m.a(i1.d1.e((w2.p0) obj4), "Prefix")) {
                break;
            }
            i17++;
        }
        w2.p0 p0Var3 = (w2.p0) obj4;
        if (p0Var3 != null) {
            int iIntValue4 = ((Number) eVar.invoke(p0Var3, Integer.valueOf(iT))).intValue();
            int iT3 = p0Var3.t(Integer.MAX_VALUE);
            if (iT != Integer.MAX_VALUE) {
                iT -= iT3;
            }
            i12 = iIntValue4;
        } else {
            i12 = 0;
        }
        int size5 = list.size();
        int i18 = 0;
        while (true) {
            if (i18 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i18);
            if (kotlin.jvm.internal.m.a(i1.d1.e((w2.p0) obj5), "Suffix")) {
                break;
            }
            i18++;
        }
        w2.p0 p0Var4 = (w2.p0) obj5;
        if (p0Var4 != null) {
            int iIntValue5 = ((Number) eVar.invoke(p0Var4, Integer.valueOf(iT))).intValue();
            int iT4 = p0Var4.t(Integer.MAX_VALUE);
            if (iT != Integer.MAX_VALUE) {
                iT -= iT4;
            }
            i13 = iIntValue5;
        } else {
            i13 = 0;
        }
        int size6 = list.size();
        for (int i19 = 0; i19 < size6; i19++) {
            Object obj9 = list.get(i19);
            if (kotlin.jvm.internal.m.a(i1.d1.e((w2.p0) obj9), "TextField")) {
                int iIntValue6 = ((Number) eVar.invoke(obj9, Integer.valueOf(iT))).intValue();
                int size7 = list.size();
                int i21 = 0;
                while (true) {
                    if (i21 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i21);
                    if (kotlin.jvm.internal.m.a(i1.d1.e((w2.p0) obj6), "Hint")) {
                        break;
                    }
                    i21++;
                }
                Object obj10 = (w2.p0) obj6;
                int iIntValue7 = obj10 != null ? ((Number) eVar.invoke(obj10, Integer.valueOf(iT))).intValue() : 0;
                int size8 = list.size();
                int i22 = 0;
                while (true) {
                    if (i22 >= size8) {
                        obj7 = null;
                        break;
                    }
                    Object obj11 = list.get(i22);
                    if (kotlin.jvm.internal.m.a(i1.d1.e((w2.p0) obj11), "Supporting")) {
                        obj7 = obj11;
                        break;
                    }
                    i22++;
                }
                Object obj12 = (w2.p0) obj7;
                return qa.c(iIntValue6, iIntValue3, iIntValue, iIntValue2, i12, i13, iIntValue7, obj12 != null ? ((Number) eVar.invoke(obj12, Integer.valueOf(i11))).intValue() : 0, this.f31074b, i1.d1.f33992a, sVar.getDensity(), this.f31075c);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // w2.q0
    public final w2.r0 e(w2.s0 s0Var, List list, long j11) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int i11;
        Object obj5;
        Object obj6;
        int i12;
        Object obj7;
        List list2 = list;
        j0.t1 t1Var = this.f31075c;
        int iN0 = s0Var.n0(t1Var.c());
        int iN1 = s0Var.n0(t1Var.a());
        long jA = v3.a.a(0, 0, 0, 0, 10, j11);
        int size = list2.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i13);
            if (kotlin.jvm.internal.m.a(w2.a0.i((w2.p0) obj), "Leading")) {
                break;
            }
            i13++;
        }
        w2.p0 p0Var = (w2.p0) obj;
        w2.g1 g1VarB = p0Var != null ? p0Var.B(jA) : null;
        float f5 = i1.d1.f33993b;
        int i14 = g1VarB != null ? g1VarB.f54501a : 0;
        int iMax = Math.max(0, g1VarB != null ? g1VarB.f54502b : 0);
        int size2 = list2.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list2.get(i15);
            if (kotlin.jvm.internal.m.a(w2.a0.i((w2.p0) obj2), "Trailing")) {
                break;
            }
            i15++;
        }
        w2.p0 p0Var2 = (w2.p0) obj2;
        w2.g1 g1VarB2 = p0Var2 != null ? p0Var2.B(v3.b.j(-i14, 0, 2, jA)) : null;
        int i16 = (g1VarB2 != null ? g1VarB2.f54501a : 0) + i14;
        int iMax2 = Math.max(iMax, g1VarB2 != null ? g1VarB2.f54502b : 0);
        int size3 = list2.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list2.get(i17);
            if (kotlin.jvm.internal.m.a(w2.a0.i((w2.p0) obj3), "Prefix")) {
                break;
            }
            i17++;
        }
        w2.p0 p0Var3 = (w2.p0) obj3;
        w2.g1 g1VarB3 = p0Var3 != null ? p0Var3.B(v3.b.j(-i16, 0, 2, jA)) : null;
        int i18 = i16 + (g1VarB3 != null ? g1VarB3.f54501a : 0);
        int iMax3 = Math.max(iMax2, g1VarB3 != null ? g1VarB3.f54502b : 0);
        int size4 = list2.size();
        int i19 = 0;
        while (true) {
            if (i19 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list2.get(i19);
            int i21 = size4;
            if (kotlin.jvm.internal.m.a(w2.a0.i((w2.p0) obj4), "Suffix")) {
                break;
            }
            i19++;
            size4 = i21;
        }
        w2.p0 p0Var4 = (w2.p0) obj4;
        w2.g1 g1VarB4 = p0Var4 != null ? p0Var4.B(v3.b.j(-i18, 0, 2, jA)) : null;
        int i22 = i18 + (g1VarB4 != null ? g1VarB4.f54501a : 0);
        int iMax4 = Math.max(iMax3, g1VarB4 != null ? g1VarB4.f54502b : 0);
        int i23 = -i22;
        long jI = v3.b.i(jA, i23, -iN1);
        int size5 = list2.size();
        int i24 = 0;
        while (true) {
            if (i24 >= size5) {
                i11 = iMax4;
                obj5 = null;
                break;
            }
            obj5 = list2.get(i24);
            int i25 = i24;
            i11 = iMax4;
            if (kotlin.jvm.internal.m.a(w2.a0.i((w2.p0) obj5), "Label")) {
                break;
            }
            i24 = i25 + 1;
            iMax4 = i11;
        }
        w2.p0 p0Var5 = (w2.p0) obj5;
        w2.g1 g1VarB5 = p0Var5 != null ? p0Var5.B(jI) : null;
        int size6 = list2.size();
        int i26 = 0;
        while (true) {
            if (i26 >= size6) {
                obj6 = null;
                break;
            }
            obj6 = list2.get(i26);
            int i27 = size6;
            if (kotlin.jvm.internal.m.a(w2.a0.i((w2.p0) obj6), "Supporting")) {
                break;
            }
            i26++;
            size6 = i27;
        }
        w2.p0 p0Var6 = (w2.p0) obj6;
        int iW = p0Var6 != null ? p0Var6.W(v3.a.j(j11)) : 0;
        int i28 = (g1VarB5 != null ? g1VarB5.f54502b : 0) + iN0;
        int i29 = i11;
        w2.g1 g1Var = g1VarB4;
        w2.g1 g1Var2 = g1VarB2;
        w2.g1 g1Var3 = g1VarB;
        int i30 = i28;
        long jI2 = v3.b.i(v3.a.a(0, 0, 0, 0, 11, j11), i23, ((-i30) - iN1) - iW);
        int size7 = list2.size();
        int i31 = 0;
        while (i31 < size7) {
            w2.p0 p0Var7 = (w2.p0) list2.get(i31);
            if (kotlin.jvm.internal.m.a(w2.a0.i(p0Var7), "TextField")) {
                w2.g1 g1VarB6 = p0Var7.B(jI2);
                long jA2 = v3.a.a(0, 0, 0, 0, 14, jI2);
                int size8 = list2.size();
                int i32 = 0;
                while (true) {
                    if (i32 >= size8) {
                        i12 = i30;
                        obj7 = null;
                        break;
                    }
                    obj7 = list2.get(i32);
                    i12 = i30;
                    if (kotlin.jvm.internal.m.a(w2.a0.i((w2.p0) obj7), "Hint")) {
                        break;
                    }
                    i32++;
                    i30 = i12;
                }
                w2.p0 p0Var8 = (w2.p0) obj7;
                w2.g1 g1VarB7 = p0Var8 != null ? p0Var8.B(jA2) : null;
                int iMax5 = Math.max(i29, Math.max(g1VarB6.f54502b, g1VarB7 != null ? g1VarB7.f54502b : 0) + i12 + iN1);
                int i33 = g1Var3 != null ? g1Var3.f54501a : 0;
                int i34 = g1Var2 != null ? g1Var2.f54501a : 0;
                int i35 = (g1VarB3 != null ? g1VarB3.f54501a : 0) + (g1Var != null ? g1Var.f54501a : 0);
                int iMax6 = Math.max(Math.max(g1VarB6.f54501a + i35, Math.max((g1VarB7 != null ? g1VarB7.f54501a : 0) + i35, g1VarB5 != null ? g1VarB5.f54501a : 0)) + i33 + i34, v3.a.j(j11));
                w2.g1 g1VarB8 = p0Var6 != null ? p0Var6.B(v3.a.a(0, iMax6, 0, 0, 9, v3.b.j(0, -iMax5, 1, jA))) : null;
                int i36 = g1VarB8 != null ? g1VarB8.f54502b : 0;
                sa saVar = this;
                w2.g1 g1Var4 = g1VarB3;
                int iC = qa.c(g1VarB6.f54502b, g1VarB5 != null ? g1VarB5.f54502b : 0, g1Var3 != null ? g1Var3.f54502b : 0, g1Var2 != null ? g1Var2.f54502b : 0, g1VarB3 != null ? g1VarB3.f54502b : 0, g1Var != null ? g1Var.f54502b : 0, g1VarB7 != null ? g1VarB7.f54502b : 0, g1VarB8 != null ? g1VarB8.f54502b : 0, saVar.f31074b, j11, s0Var.getDensity(), saVar.f31075c);
                int i37 = iC - i36;
                int size9 = list2.size();
                int i38 = 0;
                while (i38 < size9) {
                    w2.p0 p0Var9 = (w2.p0) list2.get(i38);
                    w2.g1 g1Var5 = g1VarB5;
                    w2.g1 g1Var6 = g1VarB6;
                    if (kotlin.jvm.internal.m.a(w2.a0.i(p0Var9), "Container")) {
                        w2.g1 g1Var7 = g1VarB8;
                        int i39 = iC;
                        return s0Var.q0(iMax6, i39, ry.s.f50855a, new ra(g1Var5, iMax6, i39, g1Var6, g1VarB7, g1Var3, g1Var2, g1Var4, g1Var, p0Var9.B(v3.b.a(iMax6 != Integer.MAX_VALUE ? iMax6 : 0, iMax6, i37 != Integer.MAX_VALUE ? i37 : 0, i37)), g1Var7, saVar, iN0, s0Var));
                    }
                    g1VarB5 = g1Var5;
                    i38++;
                    saVar = this;
                    g1VarB6 = g1Var6;
                    g1Var = g1Var;
                    list2 = list;
                    g1Var2 = g1Var2;
                    iC = iC;
                    g1VarB8 = g1VarB8;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i31++;
            g1Var = g1Var;
            list2 = list;
            g1Var2 = g1Var2;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // w2.q0
    public final int f(w2.s sVar, List list, int i11) {
        return c(list, i11, x1.f31282a0);
    }

    @Override // w2.q0
    public final int h(w2.s sVar, List list, int i11) {
        return c(list, i11, x1.Y);
    }

    @Override // w2.q0
    public final int i(w2.s sVar, List list, int i11) {
        return b(sVar, list, i11, x1.Z);
    }
}
