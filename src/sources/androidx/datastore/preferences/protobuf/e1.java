package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f1465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j1 f1466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l1 f1467c;

    static {
        Class<?> cls;
        Class<?> cls2;
        a1 a1Var = a1.f1445c;
        j1 j1Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f1465a = cls;
        try {
            a1 a1Var2 = a1.f1445c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                j1Var = (j1) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        f1466b = j1Var;
        f1467c = new l1();
    }

    public static void A(int i11, List list, l0 l0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o oVar = (o) l0Var.f1512a;
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                long jLongValue = ((Long) list.get(i12)).longValue();
                oVar.B0(i11, (jLongValue >> 63) ^ (jLongValue << 1));
                i12++;
            }
            return;
        }
        oVar.y0(i11, 2);
        int iH0 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            long jLongValue2 = ((Long) list.get(i13)).longValue();
            iH0 += o.h0((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        oVar.A0(iH0);
        while (i12 < list.size()) {
            long jLongValue3 = ((Long) list.get(i12)).longValue();
            oVar.C0((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i12++;
        }
    }

    public static void B(int i11, List list, l0 l0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.getClass();
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((o) l0Var.f1512a).w0(i11, (String) list.get(i12));
        }
    }

    public static void C(int i11, List list, l0 l0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o oVar = (o) l0Var.f1512a;
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                oVar.z0(i11, ((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        oVar.y0(i11, 2);
        int iG0 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            iG0 += o.g0(((Integer) list.get(i13)).intValue());
        }
        oVar.A0(iG0);
        while (i12 < list.size()) {
            oVar.A0(((Integer) list.get(i12)).intValue());
            i12++;
        }
    }

    public static void D(int i11, List list, l0 l0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o oVar = (o) l0Var.f1512a;
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                oVar.B0(i11, ((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        oVar.y0(i11, 2);
        int iH0 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            iH0 += o.h0(((Long) list.get(i13)).longValue());
        }
        oVar.A0(iH0);
        while (i12 < list.size()) {
            oVar.C0(((Long) list.get(i12)).longValue());
            i12++;
        }
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iH0 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iH0 += o.h0(((Integer) list.get(i11)).intValue());
        }
        return iH0;
    }

    public static int b(int i11, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (o.f0(i11) + 4) * size;
    }

    public static int c(int i11, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (o.f0(i11) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iH0 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iH0 += o.h0(((Integer) list.get(i11)).intValue());
        }
        return iH0;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iH0 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iH0 += o.h0(((Long) list.get(i11)).longValue());
        }
        return iH0;
    }

    public static int f(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iG0 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            int iIntValue = ((Integer) list.get(i11)).intValue();
            iG0 += o.g0((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return iG0;
    }

    public static int g(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iH0 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            long jLongValue = ((Long) list.get(i11)).longValue();
            iH0 += o.h0((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iH0;
    }

    public static int h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iG0 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iG0 += o.g0(((Integer) list.get(i11)).intValue());
        }
        return iG0;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iH0 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iH0 += o.h0(((Long) list.get(i11)).longValue());
        }
        return iH0;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void k(j1 j1Var, Object obj, Object obj2) {
        ((l1) j1Var).getClass();
        c0 c0Var = (c0) obj;
        k1 k1Var = c0Var.unknownFields;
        k1 k1Var2 = ((c0) obj2).unknownFields;
        k1 k1Var3 = k1.f1503f;
        if (!k1Var3.equals(k1Var2)) {
            if (k1Var3.equals(k1Var)) {
                int i11 = k1Var.f1504a + k1Var2.f1504a;
                int[] iArrCopyOf = Arrays.copyOf(k1Var.f1505b, i11);
                System.arraycopy(k1Var2.f1505b, 0, iArrCopyOf, k1Var.f1504a, k1Var2.f1504a);
                Object[] objArrCopyOf = Arrays.copyOf(k1Var.f1506c, i11);
                System.arraycopy(k1Var2.f1506c, 0, objArrCopyOf, k1Var.f1504a, k1Var2.f1504a);
                k1Var = new k1(i11, iArrCopyOf, objArrCopyOf, true);
            } else {
                k1Var.getClass();
                if (!k1Var2.equals(k1Var3)) {
                    if (!k1Var.f1508e) {
                        throw new UnsupportedOperationException();
                    }
                    int i12 = k1Var.f1504a + k1Var2.f1504a;
                    k1Var.a(i12);
                    System.arraycopy(k1Var2.f1505b, 0, k1Var.f1505b, k1Var.f1504a, k1Var2.f1504a);
                    System.arraycopy(k1Var2.f1506c, 0, k1Var.f1506c, k1Var.f1504a, k1Var2.f1504a);
                    k1Var.f1504a = i12;
                }
            }
        }
        c0Var.unknownFields = k1Var;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i11, List list, l0 l0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o oVar = (o) l0Var.f1512a;
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                oVar.m0(i11, ((Boolean) list.get(i12)).booleanValue());
                i12++;
            }
            return;
        }
        oVar.y0(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            ((Boolean) list.get(i14)).getClass();
            Logger logger = o.f1523f;
            i13++;
        }
        oVar.A0(i13);
        while (i12 < list.size()) {
            oVar.k0(((Boolean) list.get(i12)).booleanValue() ? (byte) 1 : (byte) 0);
            i12++;
        }
    }

    public static void n(int i11, List list, l0 l0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.getClass();
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((o) l0Var.f1512a).n0(i11, (i) list.get(i12));
        }
    }

    public static void o(int i11, List list, l0 l0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o oVar = (o) l0Var.f1512a;
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                double dDoubleValue = ((Double) list.get(i12)).doubleValue();
                oVar.getClass();
                oVar.r0(i11, Double.doubleToRawLongBits(dDoubleValue));
                i12++;
            }
            return;
        }
        oVar.y0(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            ((Double) list.get(i14)).getClass();
            Logger logger = o.f1523f;
            i13 += 8;
        }
        oVar.A0(i13);
        while (i12 < list.size()) {
            oVar.s0(Double.doubleToRawLongBits(((Double) list.get(i12)).doubleValue()));
            i12++;
        }
    }

    public static void p(int i11, List list, l0 l0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o oVar = (o) l0Var.f1512a;
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                oVar.t0(i11, ((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        oVar.y0(i11, 2);
        int iH0 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            iH0 += o.h0(((Integer) list.get(i13)).intValue());
        }
        oVar.A0(iH0);
        while (i12 < list.size()) {
            oVar.u0(((Integer) list.get(i12)).intValue());
            i12++;
        }
    }

    public static void q(int i11, List list, l0 l0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o oVar = (o) l0Var.f1512a;
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                oVar.p0(i11, ((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        oVar.y0(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            ((Integer) list.get(i14)).getClass();
            Logger logger = o.f1523f;
            i13 += 4;
        }
        oVar.A0(i13);
        while (i12 < list.size()) {
            oVar.q0(((Integer) list.get(i12)).intValue());
            i12++;
        }
    }

    public static void r(int i11, List list, l0 l0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o oVar = (o) l0Var.f1512a;
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                oVar.r0(i11, ((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        oVar.y0(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            ((Long) list.get(i14)).getClass();
            Logger logger = o.f1523f;
            i13 += 8;
        }
        oVar.A0(i13);
        while (i12 < list.size()) {
            oVar.s0(((Long) list.get(i12)).longValue());
            i12++;
        }
    }

    public static void s(int i11, List list, l0 l0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o oVar = (o) l0Var.f1512a;
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                float fFloatValue = ((Float) list.get(i12)).floatValue();
                oVar.getClass();
                oVar.p0(i11, Float.floatToRawIntBits(fFloatValue));
                i12++;
            }
            return;
        }
        oVar.y0(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            ((Float) list.get(i14)).getClass();
            Logger logger = o.f1523f;
            i13 += 4;
        }
        oVar.A0(i13);
        while (i12 < list.size()) {
            oVar.q0(Float.floatToRawIntBits(((Float) list.get(i12)).floatValue()));
            i12++;
        }
    }

    public static void t(int i11, List list, l0 l0Var, d1 d1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.getClass();
        for (int i12 = 0; i12 < list.size(); i12++) {
            l0Var.b(i11, list.get(i12), d1Var);
        }
    }

    public static void u(int i11, List list, l0 l0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o oVar = (o) l0Var.f1512a;
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                oVar.t0(i11, ((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        oVar.y0(i11, 2);
        int iH0 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            iH0 += o.h0(((Integer) list.get(i13)).intValue());
        }
        oVar.A0(iH0);
        while (i12 < list.size()) {
            oVar.u0(((Integer) list.get(i12)).intValue());
            i12++;
        }
    }

    public static void v(int i11, List list, l0 l0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o oVar = (o) l0Var.f1512a;
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                oVar.B0(i11, ((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        oVar.y0(i11, 2);
        int iH0 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            iH0 += o.h0(((Long) list.get(i13)).longValue());
        }
        oVar.A0(iH0);
        while (i12 < list.size()) {
            oVar.C0(((Long) list.get(i12)).longValue());
            i12++;
        }
    }

    public static void w(int i11, List list, l0 l0Var, d1 d1Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.getClass();
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((o) l0Var.f1512a).v0(i11, (a) list.get(i12), d1Var);
        }
    }

    public static void x(int i11, List list, l0 l0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o oVar = (o) l0Var.f1512a;
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                oVar.p0(i11, ((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        oVar.y0(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            ((Integer) list.get(i14)).getClass();
            Logger logger = o.f1523f;
            i13 += 4;
        }
        oVar.A0(i13);
        while (i12 < list.size()) {
            oVar.q0(((Integer) list.get(i12)).intValue());
            i12++;
        }
    }

    public static void y(int i11, List list, l0 l0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o oVar = (o) l0Var.f1512a;
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                oVar.r0(i11, ((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        oVar.y0(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            ((Long) list.get(i14)).getClass();
            Logger logger = o.f1523f;
            i13 += 8;
        }
        oVar.A0(i13);
        while (i12 < list.size()) {
            oVar.s0(((Long) list.get(i12)).longValue());
            i12++;
        }
    }

    public static void z(int i11, List list, l0 l0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o oVar = (o) l0Var.f1512a;
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                int iIntValue = ((Integer) list.get(i12)).intValue();
                oVar.z0(i11, (iIntValue >> 31) ^ (iIntValue << 1));
                i12++;
            }
            return;
        }
        oVar.y0(i11, 2);
        int iG0 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            int iIntValue2 = ((Integer) list.get(i13)).intValue();
            iG0 += o.g0((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        oVar.A0(iG0);
        while (i12 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i12)).intValue();
            oVar.A0((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i12++;
        }
    }

    public static Object j(Object obj, int i11, d0 d0Var, Object obj2, j1 j1Var) {
        return obj2;
    }
}
