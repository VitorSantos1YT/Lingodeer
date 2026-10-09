package androidx.glance.appwidget.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f2008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y0 f2009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a1 f2010c;

    static {
        Class<?> cls;
        Class<?> cls2;
        t0 t0Var = t0.f1996c;
        y0 y0Var = null;
        try {
            cls = Class.forName("androidx.glance.appwidget.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f2008a = cls;
        try {
            t0 t0Var2 = t0.f1996c;
            try {
                cls2 = Class.forName("androidx.glance.appwidget.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                y0Var = (y0) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        f2009b = y0Var;
        f2010c = new a1();
    }

    public static void A(int i11, List list, h0 h0Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) h0Var.f1938a;
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                long jLongValue = ((Long) list.get(i12)).longValue();
                lVar.t0(i11, (jLongValue >> 63) ^ (jLongValue << 1));
                i12++;
            }
            return;
        }
        lVar.q0(i11, 2);
        int iC0 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            long jLongValue2 = ((Long) list.get(i13)).longValue();
            iC0 += l.c0((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        lVar.s0(iC0);
        while (i12 < list.size()) {
            long jLongValue3 = ((Long) list.get(i12)).longValue();
            lVar.u0((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i12++;
        }
    }

    public static void B(int i11, List list, h0 h0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h0Var.getClass();
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((l) h0Var.f1938a).p0(i11, (String) list.get(i12));
        }
    }

    public static void C(int i11, List list, h0 h0Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) h0Var.f1938a;
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                lVar.r0(i11, ((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        lVar.q0(i11, 2);
        int iB0 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            iB0 += l.b0(((Integer) list.get(i13)).intValue());
        }
        lVar.s0(iB0);
        while (i12 < list.size()) {
            lVar.s0(((Integer) list.get(i12)).intValue());
            i12++;
        }
    }

    public static void D(int i11, List list, h0 h0Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) h0Var.f1938a;
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                lVar.t0(i11, ((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        lVar.q0(i11, 2);
        int iC0 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            iC0 += l.c0(((Long) list.get(i13)).longValue());
        }
        lVar.s0(iC0);
        while (i12 < list.size()) {
            lVar.u0(((Long) list.get(i12)).longValue());
            i12++;
        }
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iC0 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iC0 += l.c0(((Integer) list.get(i11)).intValue());
        }
        return iC0;
    }

    public static int b(int i11, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (l.a0(i11) + 4) * size;
    }

    public static int c(int i11, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (l.a0(i11) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iC0 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iC0 += l.c0(((Integer) list.get(i11)).intValue());
        }
        return iC0;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iC0 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iC0 += l.c0(((Long) list.get(i11)).longValue());
        }
        return iC0;
    }

    public static int f(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iB0 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            int iIntValue = ((Integer) list.get(i11)).intValue();
            iB0 += l.b0((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return iB0;
    }

    public static int g(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iC0 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            long jLongValue = ((Long) list.get(i11)).longValue();
            iC0 += l.c0((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iC0;
    }

    public static int h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iB0 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iB0 += l.b0(((Integer) list.get(i11)).intValue());
        }
        return iB0;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iC0 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iC0 += l.c0(((Long) list.get(i11)).longValue());
        }
        return iC0;
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
    public static void k(y0 y0Var, Object obj, Object obj2) {
        ((a1) y0Var).getClass();
        x xVar = (x) obj;
        z0 z0Var = xVar.unknownFields;
        z0 z0Var2 = ((x) obj2).unknownFields;
        z0 z0Var3 = z0.f2011f;
        if (!z0Var3.equals(z0Var2)) {
            if (z0Var3.equals(z0Var)) {
                int i11 = z0Var.f2012a + z0Var2.f2012a;
                int[] iArrCopyOf = Arrays.copyOf(z0Var.f2013b, i11);
                System.arraycopy(z0Var2.f2013b, 0, iArrCopyOf, z0Var.f2012a, z0Var2.f2012a);
                Object[] objArrCopyOf = Arrays.copyOf(z0Var.f2014c, i11);
                System.arraycopy(z0Var2.f2014c, 0, objArrCopyOf, z0Var.f2012a, z0Var2.f2012a);
                z0Var = new z0(i11, iArrCopyOf, objArrCopyOf, true);
            } else {
                z0Var.getClass();
                if (!z0Var2.equals(z0Var3)) {
                    if (!z0Var.f2016e) {
                        throw new UnsupportedOperationException();
                    }
                    int i12 = z0Var.f2012a + z0Var2.f2012a;
                    z0Var.a(i12);
                    System.arraycopy(z0Var2.f2013b, 0, z0Var.f2013b, z0Var.f2012a, z0Var2.f2012a);
                    System.arraycopy(z0Var2.f2014c, 0, z0Var.f2014c, z0Var.f2012a, z0Var2.f2012a);
                    z0Var.f2012a = i12;
                }
            }
        }
        xVar.unknownFields = z0Var;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i11, List list, h0 h0Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) h0Var.f1938a;
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                lVar.g0(i11, ((Boolean) list.get(i12)).booleanValue());
                i12++;
            }
            return;
        }
        lVar.q0(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            ((Boolean) list.get(i14)).getClass();
            Logger logger = l.f1958h;
            i13++;
        }
        lVar.s0(i13);
        while (i12 < list.size()) {
            byte b3 = ((Boolean) list.get(i12)).booleanValue() ? (byte) 1 : (byte) 0;
            if (lVar.f1963f == lVar.f1962e) {
                lVar.d0();
            }
            byte[] bArr = lVar.f1961d;
            int i15 = lVar.f1963f;
            lVar.f1963f = i15 + 1;
            bArr[i15] = b3;
            i12++;
        }
    }

    public static void n(int i11, List list, h0 h0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h0Var.getClass();
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((l) h0Var.f1938a).h0(i11, (h) list.get(i12));
        }
    }

    public static void o(int i11, List list, h0 h0Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) h0Var.f1938a;
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                double dDoubleValue = ((Double) list.get(i12)).doubleValue();
                lVar.getClass();
                lVar.k0(i11, Double.doubleToRawLongBits(dDoubleValue));
                i12++;
            }
            return;
        }
        lVar.q0(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            ((Double) list.get(i14)).getClass();
            Logger logger = l.f1958h;
            i13 += 8;
        }
        lVar.s0(i13);
        while (i12 < list.size()) {
            lVar.l0(Double.doubleToRawLongBits(((Double) list.get(i12)).doubleValue()));
            i12++;
        }
    }

    public static void p(int i11, List list, h0 h0Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) h0Var.f1938a;
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                lVar.m0(i11, ((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        lVar.q0(i11, 2);
        int iC0 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            iC0 += l.c0(((Integer) list.get(i13)).intValue());
        }
        lVar.s0(iC0);
        while (i12 < list.size()) {
            lVar.n0(((Integer) list.get(i12)).intValue());
            i12++;
        }
    }

    public static void q(int i11, List list, h0 h0Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) h0Var.f1938a;
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                lVar.i0(i11, ((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        lVar.q0(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            ((Integer) list.get(i14)).getClass();
            Logger logger = l.f1958h;
            i13 += 4;
        }
        lVar.s0(i13);
        while (i12 < list.size()) {
            lVar.j0(((Integer) list.get(i12)).intValue());
            i12++;
        }
    }

    public static void r(int i11, List list, h0 h0Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) h0Var.f1938a;
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                lVar.k0(i11, ((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        lVar.q0(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            ((Long) list.get(i14)).getClass();
            Logger logger = l.f1958h;
            i13 += 8;
        }
        lVar.s0(i13);
        while (i12 < list.size()) {
            lVar.l0(((Long) list.get(i12)).longValue());
            i12++;
        }
    }

    public static void s(int i11, List list, h0 h0Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) h0Var.f1938a;
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                float fFloatValue = ((Float) list.get(i12)).floatValue();
                lVar.getClass();
                lVar.i0(i11, Float.floatToRawIntBits(fFloatValue));
                i12++;
            }
            return;
        }
        lVar.q0(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            ((Float) list.get(i14)).getClass();
            Logger logger = l.f1958h;
            i13 += 4;
        }
        lVar.s0(i13);
        while (i12 < list.size()) {
            lVar.j0(Float.floatToRawIntBits(((Float) list.get(i12)).floatValue()));
            i12++;
        }
    }

    public static void t(int i11, List list, h0 h0Var, w0 w0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h0Var.getClass();
        for (int i12 = 0; i12 < list.size(); i12++) {
            h0Var.b(i11, list.get(i12), w0Var);
        }
    }

    public static void u(int i11, List list, h0 h0Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) h0Var.f1938a;
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                lVar.m0(i11, ((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        lVar.q0(i11, 2);
        int iC0 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            iC0 += l.c0(((Integer) list.get(i13)).intValue());
        }
        lVar.s0(iC0);
        while (i12 < list.size()) {
            lVar.n0(((Integer) list.get(i12)).intValue());
            i12++;
        }
    }

    public static void v(int i11, List list, h0 h0Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) h0Var.f1938a;
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                lVar.t0(i11, ((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        lVar.q0(i11, 2);
        int iC0 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            iC0 += l.c0(((Long) list.get(i13)).longValue());
        }
        lVar.s0(iC0);
        while (i12 < list.size()) {
            lVar.u0(((Long) list.get(i12)).longValue());
            i12++;
        }
    }

    public static void w(int i11, List list, h0 h0Var, w0 w0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        h0Var.getClass();
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((l) h0Var.f1938a).o0(i11, (a) list.get(i12), w0Var);
        }
    }

    public static void x(int i11, List list, h0 h0Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) h0Var.f1938a;
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                lVar.i0(i11, ((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        lVar.q0(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            ((Integer) list.get(i14)).getClass();
            Logger logger = l.f1958h;
            i13 += 4;
        }
        lVar.s0(i13);
        while (i12 < list.size()) {
            lVar.j0(((Integer) list.get(i12)).intValue());
            i12++;
        }
    }

    public static void y(int i11, List list, h0 h0Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) h0Var.f1938a;
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                lVar.k0(i11, ((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        lVar.q0(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            ((Long) list.get(i14)).getClass();
            Logger logger = l.f1958h;
            i13 += 8;
        }
        lVar.s0(i13);
        while (i12 < list.size()) {
            lVar.l0(((Long) list.get(i12)).longValue());
            i12++;
        }
    }

    public static void z(int i11, List list, h0 h0Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) h0Var.f1938a;
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                int iIntValue = ((Integer) list.get(i12)).intValue();
                lVar.r0(i11, (iIntValue >> 31) ^ (iIntValue << 1));
                i12++;
            }
            return;
        }
        lVar.q0(i11, 2);
        int iB0 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            int iIntValue2 = ((Integer) list.get(i13)).intValue();
            iB0 += l.b0((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        lVar.s0(iB0);
        while (i12 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i12)).intValue();
            lVar.s0((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i12++;
        }
    }

    public static Object j(Object obj, int i11, a0 a0Var, Object obj2, y0 y0Var) {
        return obj2;
    }
}
