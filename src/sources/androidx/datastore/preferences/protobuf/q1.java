package androidx.datastore.preferences.protobuf;

import androidx.lifecycle.viewmodel.compose.NP.IMCc;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f1539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f1540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p1 f1541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f1542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f1543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f1544f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f1545g;

    static {
        Unsafe unsafeI = i();
        f1539a = unsafeI;
        f1540b = c.f1452a;
        boolean zH = h(Long.TYPE);
        boolean zH2 = h(Integer.TYPE);
        p1 o1Var = null;
        if (unsafeI != null) {
            if (!c.a()) {
                o1Var = new o1(unsafeI);
            } else if (zH) {
                o1Var = new n1(unsafeI, 1);
            } else if (zH2) {
                o1Var = new n1(unsafeI, 0);
            }
        }
        f1541c = o1Var;
        f1542d = o1Var == null ? false : o1Var.r();
        f1543e = o1Var == null ? false : o1Var.q();
        f1544f = e(byte[].class);
        e(boolean[].class);
        f(boolean[].class);
        e(int[].class);
        f(int[].class);
        e(long[].class);
        f(long[].class);
        e(float[].class);
        f(float[].class);
        e(double[].class);
        f(double[].class);
        e(Object[].class);
        f(Object[].class);
        Field fieldG = g();
        if (fieldG != null && o1Var != null) {
            o1Var.i(fieldG);
        }
        f1545g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th2) {
        Logger.getLogger(q1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    public static boolean b(long j11, Object obj) {
        return ((byte) ((f1541c.f((-4) & j11, obj) >>> ((int) (((~j11) & 3) << 3))) & 255)) != 0;
    }

    public static boolean c(long j11, Object obj) {
        return ((byte) ((f1541c.f((-4) & j11, obj) >>> ((int) ((j11 & 3) << 3))) & 255)) != 0;
    }

    public static Object d(Class cls) {
        try {
            return f1539a.allocateInstance(cls);
        } catch (InstantiationException e8) {
            throw new IllegalStateException(e8);
        }
    }

    public static int e(Class cls) {
        if (f1543e) {
            return f1541c.a(cls);
        }
        return -1;
    }

    public static void f(Class cls) {
        if (f1543e) {
            f1541c.b(cls);
        }
    }

    public static boolean h(Class cls) {
        if (!c.a()) {
            return false;
        }
        try {
            Class cls2 = f1540b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new m1());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, long j11, byte b3) {
        f1541c.k(bArr, f1544f + j11, b3);
    }

    public static void k(Object obj, long j11, byte b3) {
        long j12 = (-4) & j11;
        int iF = f1541c.f(j12, obj);
        int i11 = ((~((int) j11)) & 3) << 3;
        m(j12, obj, ((255 & b3) << i11) | (iF & (~(255 << i11))));
    }

    public static void l(Object obj, long j11, byte b3) {
        long j12 = (-4) & j11;
        int i11 = (((int) j11) & 3) << 3;
        m(j12, obj, ((255 & b3) << i11) | (f1541c.f(j12, obj) & (~(255 << i11))));
    }

    public static void m(long j11, Object obj, int i11) {
        f1541c.n(j11, obj, i11);
    }

    public static void n(Object obj, long j11, long j12) {
        f1541c.o(obj, j11, j12);
    }

    public static void o(Object obj, long j11, Object obj2) {
        f1541c.p(obj, j11, obj2);
    }

    public static Field g() {
        Field declaredField;
        Field declaredField2;
        if (c.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField(IMCc.IOt);
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }
}
