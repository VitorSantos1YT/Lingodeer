package h1;

import com.google.android.gms.measurement.zfxB.ypOOxsaJG;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v6 implements w2.q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fz.c f31192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f31193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f31194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j0.t1 f31195d;

    public v6(fz.c cVar, boolean z11, float f5, j0.t1 t1Var) {
        this.f31192a = cVar;
        this.f31193b = z11;
        this.f31194c = f5;
        this.f31195d = t1Var;
    }

    @Override // w2.q0
    public final int a(w2.s sVar, List list, int i11) {
        return b(sVar, list, i11, x1.R);
    }

    public final int b(w2.s sVar, List list, int i11, fz.e eVar) {
        Object obj;
        int iT;
        int iIntValue;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int iIntValue3;
        Object obj5;
        int i12;
        Object obj6;
        Object obj7;
        int size = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i13);
            if (kotlin.jvm.internal.m.a(i1.d1.e((w2.p0) obj), "Leading")) {
                break;
            }
            i13++;
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
        int i14 = 0;
        while (true) {
            if (i14 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i14);
            if (kotlin.jvm.internal.m.a(i1.d1.e((w2.p0) obj2), "Trailing")) {
                break;
            }
            i14++;
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
        int i15 = 0;
        while (true) {
            if (i15 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i15);
            if (kotlin.jvm.internal.m.a(i1.d1.e((w2.p0) obj3), "Label")) {
                break;
            }
            i15++;
        }
        Object obj8 = (w2.p0) obj3;
        int iIntValue4 = obj8 != null ? ((Number) eVar.invoke(obj8, Integer.valueOf(android.support.v4.media.session.a.B(iT, this.f31194c, i11)))).intValue() : 0;
        int size4 = list.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i16);
            if (kotlin.jvm.internal.m.a(i1.d1.e((w2.p0) obj4), "Prefix")) {
                break;
            }
            i16++;
        }
        w2.p0 p0Var3 = (w2.p0) obj4;
        if (p0Var3 != null) {
            iIntValue3 = ((Number) eVar.invoke(p0Var3, Integer.valueOf(iT))).intValue();
            int iT3 = p0Var3.t(Integer.MAX_VALUE);
            if (iT != Integer.MAX_VALUE) {
                iT -= iT3;
            }
        } else {
            iIntValue3 = 0;
        }
        int size5 = list.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i17);
            if (kotlin.jvm.internal.m.a(i1.d1.e((w2.p0) obj5), "Suffix")) {
                break;
            }
            i17++;
        }
        w2.p0 p0Var4 = (w2.p0) obj5;
        if (p0Var4 != null) {
            int iIntValue5 = ((Number) eVar.invoke(p0Var4, Integer.valueOf(iT))).intValue();
            int iT4 = p0Var4.t(Integer.MAX_VALUE);
            if (iT != Integer.MAX_VALUE) {
                iT -= iT4;
            }
            i12 = iIntValue5;
        } else {
            i12 = 0;
        }
        int size6 = list.size();
        for (int i18 = 0; i18 < size6; i18++) {
            Object obj9 = list.get(i18);
            if (kotlin.jvm.internal.m.a(i1.d1.e((w2.p0) obj9), "TextField")) {
                int iIntValue6 = ((Number) eVar.invoke(obj9, Integer.valueOf(iT))).intValue();
                int size7 = list.size();
                int i19 = 0;
                while (true) {
                    if (i19 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i19);
                    if (kotlin.jvm.internal.m.a(i1.d1.e((w2.p0) obj6), "Hint")) {
                        break;
                    }
                    i19++;
                }
                Object obj10 = (w2.p0) obj6;
                int iIntValue7 = obj10 != null ? ((Number) eVar.invoke(obj10, Integer.valueOf(iT))).intValue() : 0;
                int size8 = list.size();
                int i21 = 0;
                while (true) {
                    if (i21 >= size8) {
                        obj7 = null;
                        break;
                    }
                    Object obj11 = list.get(i21);
                    if (kotlin.jvm.internal.m.a(i1.d1.e((w2.p0) obj11), "Supporting")) {
                        obj7 = obj11;
                        break;
                    }
                    i21++;
                }
                Object obj12 = (w2.p0) obj7;
                return t6.d(iIntValue, iIntValue2, iIntValue3, i12, iIntValue6, iIntValue4, iIntValue7, obj12 != null ? ((Number) eVar.invoke(obj12, Integer.valueOf(i11))).intValue() : 0, this.f31194c, i1.d1.f33992a, sVar.getDensity(), this.f31195d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final int c(w2.s sVar, List list, int i11, fz.e eVar) {
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
                    if (kotlin.jvm.internal.m.a(i1.d1.e((w2.p0) obj4), "Leading")) {
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
                    if (kotlin.jvm.internal.m.a(i1.d1.e((w2.p0) obj5), "Prefix")) {
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
                    if (kotlin.jvm.internal.m.a(i1.d1.e((w2.p0) obj6), "Suffix")) {
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
                return t6.e(iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, p0Var6 != null ? ((Number) eVar.invoke(p0Var6, Integer.valueOf(i11))).intValue() : 0, this.f31194c, i1.d1.f33992a, sVar.getDensity(), this.f31195d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // w2.q0
    public final int f(w2.s sVar, List list, int i11) {
        return c(sVar, list, i11, x1.U);
    }

    @Override // w2.q0
    public final int h(w2.s sVar, List list, int i11) {
        return c(sVar, list, i11, x1.S);
    }

    @Override // w2.q0
    public final int i(w2.s sVar, List list, int i11) {
        return b(sVar, list, i11, x1.T);
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
        Object obj7;
        String str;
        w2.g1 g1VarB;
        v6 v6Var = this;
        List list2 = list;
        j0.t1 t1Var = v6Var.f31195d;
        int iN0 = s0Var.n0(t1Var.a());
        long jA = v3.a.a(0, 0, 0, 0, 10, j11);
        int size = list2.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i12);
            if (kotlin.jvm.internal.m.a(w2.a0.i((w2.p0) obj), "Leading")) {
                break;
            }
            i12++;
        }
        w2.p0 p0Var = (w2.p0) obj;
        w2.g1 g1VarB2 = p0Var != null ? p0Var.B(jA) : null;
        float f5 = i1.d1.f33993b;
        int i13 = g1VarB2 != null ? g1VarB2.f54501a : 0;
        int iMax = Math.max(0, g1VarB2 != null ? g1VarB2.f54502b : 0);
        int size2 = list2.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list2.get(i14);
            if (kotlin.jvm.internal.m.a(w2.a0.i((w2.p0) obj2), ypOOxsaJG.vBcbhgPXVRod)) {
                break;
            }
            i14++;
        }
        w2.p0 p0Var2 = (w2.p0) obj2;
        w2.g1 g1VarB3 = p0Var2 != null ? p0Var2.B(v3.b.j(-i13, 0, 2, jA)) : null;
        int i15 = i13 + (g1VarB3 != null ? g1VarB3.f54501a : 0);
        int iMax2 = Math.max(iMax, g1VarB3 != null ? g1VarB3.f54502b : 0);
        int size3 = list2.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list2.get(i16);
            if (kotlin.jvm.internal.m.a(w2.a0.i((w2.p0) obj3), "Prefix")) {
                break;
            }
            i16++;
        }
        w2.p0 p0Var3 = (w2.p0) obj3;
        w2.g1 g1VarB4 = p0Var3 != null ? p0Var3.B(v3.b.j(-i15, 0, 2, jA)) : null;
        int i17 = (g1VarB4 != null ? g1VarB4.f54501a : 0) + i15;
        int iMax3 = Math.max(iMax2, g1VarB4 != null ? g1VarB4.f54502b : 0);
        int size4 = list2.size();
        int i18 = 0;
        while (true) {
            if (i18 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list2.get(i18);
            int i19 = size4;
            if (kotlin.jvm.internal.m.a(w2.a0.i((w2.p0) obj4), "Suffix")) {
                break;
            }
            i18++;
            size4 = i19;
        }
        w2.p0 p0Var4 = (w2.p0) obj4;
        w2.g1 g1VarB5 = p0Var4 != null ? p0Var4.B(v3.b.j(-i17, 0, 2, jA)) : null;
        int i21 = i17 + (g1VarB5 != null ? g1VarB5.f54501a : 0);
        int iMax4 = Math.max(iMax3, g1VarB5 != null ? g1VarB5.f54502b : 0);
        int iN1 = s0Var.n0(t1Var.d(s0Var.getLayoutDirection())) + s0Var.n0(t1Var.b(s0Var.getLayoutDirection()));
        int i22 = -i21;
        int iB = android.support.v4.media.session.a.B(i22 - iN1, v6Var.f31194c, -iN1);
        int i23 = -iN0;
        long jI = v3.b.i(jA, iB, i23);
        int size5 = list2.size();
        int i24 = 0;
        while (true) {
            if (i24 >= size5) {
                i11 = iN0;
                obj5 = null;
                break;
            }
            obj5 = list2.get(i24);
            int i25 = i24;
            i11 = iN0;
            if (kotlin.jvm.internal.m.a(w2.a0.i((w2.p0) obj5), "Label")) {
                break;
            }
            i24 = i25 + 1;
            iN0 = i11;
        }
        w2.p0 p0Var5 = (w2.p0) obj5;
        w2.g1 g1VarB6 = p0Var5 != null ? p0Var5.B(jI) : null;
        v6Var.f31192a.invoke(new f2.e(g1VarB6 != null ? com.bumptech.glide.g.b(g1VarB6.f54501a, g1VarB6.f54502b) : 0L));
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
        int iMax5 = Math.max((g1VarB6 != null ? g1VarB6.f54502b : 0) / 2, s0Var.n0(t1Var.c()));
        int i28 = (i23 - iMax5) - iW;
        int i29 = iMax5;
        long jA2 = v3.a.a(0, 0, 0, 0, 11, v3.b.i(j11, i22, i28));
        int size7 = list2.size();
        int i30 = 0;
        while (i30 < size7) {
            int i31 = size7;
            w2.p0 p0Var7 = (w2.p0) list2.get(i30);
            int i32 = i29;
            int i33 = i30;
            if (kotlin.jvm.internal.m.a(w2.a0.i(p0Var7), "TextField")) {
                w2.g1 g1VarB7 = p0Var7.B(jA2);
                long jA3 = v3.a.a(0, 0, 0, 0, 14, jA2);
                int size8 = list2.size();
                int i34 = 0;
                while (true) {
                    if (i34 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list2.get(i34);
                    int i35 = size8;
                    int i36 = i34;
                    if (kotlin.jvm.internal.m.a(w2.a0.i((w2.p0) obj7), "Hint")) {
                        break;
                    }
                    i34 = i36 + 1;
                    size8 = i35;
                }
                w2.p0 p0Var8 = (w2.p0) obj7;
                w2.g1 g1VarB8 = p0Var8 != null ? p0Var8.B(jA3) : null;
                int iMax6 = Math.max(iMax4, Math.max(g1VarB7.f54502b, g1VarB8 != null ? g1VarB8.f54502b : 0) + i32 + i11);
                int i37 = g1VarB2 != null ? g1VarB2.f54501a : 0;
                int i38 = g1VarB3 != null ? g1VarB3.f54501a : 0;
                w2.g1 g1Var = g1VarB4;
                int i39 = g1VarB4 != null ? g1Var.f54501a : 0;
                int i40 = g1VarB5 != null ? g1VarB5.f54501a : 0;
                int iE = t6.e(i37, i38, i39, i40, g1VarB7.f54501a, g1VarB6 != null ? g1VarB6.f54501a : 0, g1VarB8 != null ? g1VarB8.f54501a : 0, v6Var.f31194c, j11, s0Var.getDensity(), v6Var.f31195d);
                int i41 = 0;
                long jA4 = v3.a.a(0, iE, 0, 0, 9, v3.b.j(0, -iMax6, 1, jA));
                if (p0Var6 != null) {
                    g1VarB = p0Var6.B(jA4);
                    str = "Collection contains no element matching the predicate.";
                } else {
                    str = "Collection contains no element matching the predicate.";
                    g1VarB = null;
                }
                int i42 = g1VarB != null ? g1VarB.f54502b : 0;
                int i43 = g1VarB2 != null ? g1VarB2.f54502b : 0;
                if (g1VarB3 != null) {
                    i41 = g1VarB3.f54502b;
                }
                int i44 = i42;
                w2.g1 g1Var2 = g1VarB6;
                int iD = t6.d(i43, i41, g1Var != null ? g1Var.f54502b : i41, g1VarB5 != null ? g1VarB5.f54502b : i41, g1VarB7.f54502b, g1VarB6 != null ? g1VarB6.f54502b : i41, g1VarB8 != null ? g1VarB8.f54502b : i41, g1VarB != null ? g1VarB.f54502b : i41, v6Var.f31194c, j11, s0Var.getDensity(), v6Var.f31195d);
                int i45 = iD - i44;
                int size9 = list2.size();
                int i46 = i41;
                while (i46 < size9) {
                    w2.p0 p0Var9 = (w2.p0) list2.get(i46);
                    int i47 = iD;
                    if (kotlin.jvm.internal.m.a(w2.a0.i(p0Var9), "Container")) {
                        return s0Var.q0(iE, i47, ry.s.f50855a, new u6(i47, iE, g1VarB2, g1VarB3, g1Var, g1VarB5, g1VarB7, g1Var2, g1VarB8, p0Var9.B(v3.b.a(iE != Integer.MAX_VALUE ? iE : i41, iE, i45 != Integer.MAX_VALUE ? i45 : 0, i45)), g1VarB, v6Var, s0Var));
                    }
                    iD = i47;
                    i46++;
                    v6Var = this;
                    list2 = list;
                    g1Var = g1Var;
                }
                throw new NoSuchElementException(str);
            }
            i30 = i33 + 1;
            v6Var = this;
            list2 = list;
            i29 = i32;
            size7 = i31;
            jA2 = jA2;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
