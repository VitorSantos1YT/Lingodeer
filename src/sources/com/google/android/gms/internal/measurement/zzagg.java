package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzagg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f11352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f11353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zzagf f11354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f11355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f11356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f11357f;

    static {
        boolean z11;
        zzagf zzagfVar;
        Unsafe unsafeL = l();
        f11352a = unsafeL;
        int i11 = zzacf.f11197a;
        f11353b = Memory.class;
        Class cls = Long.TYPE;
        boolean zM = m(cls);
        Class cls2 = Integer.TYPE;
        boolean zM2 = m(cls2);
        zzagf zzagdVar = null;
        if (unsafeL != null) {
            if (zM) {
                zzagdVar = new zzage(unsafeL);
            } else if (zM2) {
                zzagdVar = new zzagd(unsafeL);
            }
        }
        f11354c = zzagdVar;
        if (zzagdVar != null) {
            try {
                Class<?> cls3 = zzagdVar.f11351a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                a();
            } catch (Throwable th2) {
                Logger.getLogger(zzagg.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
            }
        }
        zzagf zzagfVar2 = f11354c;
        if (zzagfVar2 == null) {
            z11 = false;
        } else {
            try {
                Class<?> cls4 = zzagfVar2.f11351a.getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z11 = true;
            } catch (Throwable th3) {
                Logger.getLogger(zzagg.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th3.toString()));
                z11 = false;
            }
        }
        f11355d = z11;
        f11356e = p(byte[].class);
        p(boolean[].class);
        q(boolean[].class);
        p(int[].class);
        q(int[].class);
        p(long[].class);
        q(long[].class);
        p(float[].class);
        q(float[].class);
        p(double[].class);
        q(double[].class);
        p(Object[].class);
        q(Object[].class);
        Field fieldA = a();
        if (fieldA != null && (zzagfVar = f11354c) != null) {
            zzagfVar.f11351a.objectFieldOffset(fieldA);
        }
        f11357f = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zzagg() {
    }

    public static Field a() {
        Field declaredField;
        Field declaredField2;
        int i11 = zzacf.f11197a;
        try {
            declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            declaredField = null;
        }
        if (declaredField != null) {
            return declaredField;
        }
        try {
            declaredField2 = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField2 = null;
        }
        if (declaredField2 == null || declaredField2.getType() != Long.TYPE) {
            return null;
        }
        return declaredField2;
    }

    public static void b(Object obj, long j11, byte b3) {
        Unsafe unsafe = f11354c.f11351a;
        long j12 = (-4) & j11;
        int i11 = unsafe.getInt(obj, j12);
        int i12 = ((~((int) j11)) & 3) << 3;
        unsafe.putInt(obj, j12, ((255 & b3) << i12) | (i11 & (~(255 << i12))));
    }

    public static void c(Object obj, long j11, byte b3) {
        Unsafe unsafe = f11354c.f11351a;
        long j12 = (-4) & j11;
        int i11 = (((int) j11) & 3) << 3;
        unsafe.putInt(obj, j12, ((255 & b3) << i11) | (unsafe.getInt(obj, j12) & (~(255 << i11))));
    }

    public static Object d(Class cls) {
        try {
            return f11352a.allocateInstance(cls);
        } catch (InstantiationException e8) {
            throw new IllegalStateException(e8);
        }
    }

    public static int e(Object obj, long j11) {
        return f11354c.f11351a.getInt(obj, j11);
    }

    public static void f(long j11, Object obj, int i11) {
        f11354c.f11351a.putInt(obj, j11, i11);
    }

    public static long g(long j11, Object obj) {
        return f11354c.f11351a.getLong(obj, j11);
    }

    public static void h(Object obj, long j11, long j12) {
        f11354c.f11351a.putLong(obj, j11, j12);
    }

    public static Object i(long j11, Object obj) {
        return f11354c.f11351a.getObject(obj, j11);
    }

    public static void j(Object obj, long j11, Object obj2) {
        f11354c.f11351a.putObject(obj, j11, obj2);
    }

    public static void k(byte[] bArr, long j11, byte b3) {
        f11354c.a(bArr, f11356e + j11, b3);
    }

    public static Unsafe l() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new zzagc());
        } catch (Throwable unused) {
            unsafe = null;
        }
        if (unsafe == null) {
            return null;
        }
        try {
            unsafe.arrayBaseOffset(byte[].class);
            return unsafe;
        } catch (Exception unused2) {
            Logger.getLogger(zzagg.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    public static boolean m(Class cls) {
        int i11 = zzacf.f11197a;
        try {
            Class cls2 = f11353b;
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

    public static /* synthetic */ boolean n(Object obj, long j11) {
        return ((byte) ((f11354c.f11351a.getInt(obj, (-4) & j11) >>> ((int) (((~j11) & 3) << 3))) & 255)) != 0;
    }

    public static /* synthetic */ boolean o(Object obj, long j11) {
        return ((byte) ((f11354c.f11351a.getInt(obj, (-4) & j11) >>> ((int) ((j11 & 3) << 3))) & 255)) != 0;
    }

    public static int p(Class cls) {
        if (f11355d) {
            return f11354c.f11351a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void q(Class cls) {
        if (f11355d) {
            f11354c.f11351a.arrayIndexScale(cls);
        }
    }
}
