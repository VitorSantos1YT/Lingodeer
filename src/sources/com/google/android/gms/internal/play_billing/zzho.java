package com.google.android.gms.internal.play_billing;

import com.google.firebase.annotations.jjzf.kHfjNGauVgdF;
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
final class zzho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f12456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f12457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zzhn f12458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f12459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f12460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f12461f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f12462g;

    private zzho() {
    }

    public static void a(Class cls) {
        if (f12460e) {
            f12458c.f12455a.arrayIndexScale(cls);
        }
    }

    public static Field b() {
        Field declaredField;
        Field declaredField2;
        int i11 = zzdv.f12333a;
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

    public static void c(Object obj, long j11, byte b3) {
        Unsafe unsafe = f12458c.f12455a;
        long j12 = (-4) & j11;
        int i11 = unsafe.getInt(obj, j12);
        int i12 = ((~((int) j11)) & 3) << 3;
        unsafe.putInt(obj, j12, ((255 & b3) << i12) | (i11 & (~(255 << i12))));
    }

    public static void d(Object obj, long j11, byte b3) {
        Unsafe unsafe = f12458c.f12455a;
        long j12 = (-4) & j11;
        int i11 = (((int) j11) & 3) << 3;
        unsafe.putInt(obj, j12, ((255 & b3) << i11) | (unsafe.getInt(obj, j12) & (~(255 << i11))));
    }

    public static int e(Object obj, long j11) {
        return f12458c.f12455a.getInt(obj, j11);
    }

    public static long f(Object obj, long j11) {
        return f12458c.f12455a.getLong(obj, j11);
    }

    public static Object g(Class cls) {
        try {
            return f12456a.allocateInstance(cls);
        } catch (InstantiationException e8) {
            throw new IllegalStateException(e8);
        }
    }

    public static Object h(Object obj, long j11) {
        return f12458c.f12455a.getObject(obj, j11);
    }

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzhk());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(Object obj, long j11, int i11) {
        f12458c.f12455a.putInt(obj, j11, i11);
    }

    public static void k(Object obj, long j11, long j12) {
        f12458c.f12455a.putLong(obj, j11, j12);
    }

    public static void l(Object obj, long j11, Object obj2) {
        f12458c.f12455a.putObject(obj, j11, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean m(Object obj, long j11) {
        return ((byte) ((f12458c.f12455a.getInt(obj, (-4) & j11) >>> ((int) (((~j11) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean n(Object obj, long j11) {
        return ((byte) ((f12458c.f12455a.getInt(obj, (-4) & j11) >>> ((int) ((j11 & 3) << 3))) & 255)) != 0;
    }

    public static boolean o(Class cls) {
        int i11 = zzdv.f12333a;
        try {
            Class cls2 = f12457b;
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

    public static int p(Class cls) {
        if (f12460e) {
            return f12458c.f12455a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0044  */
    static {
        boolean z11;
        boolean z12;
        zzhn zzhnVar;
        Unsafe unsafeI = i();
        f12456a = unsafeI;
        int i11 = zzdv.f12333a;
        f12457b = Memory.class;
        Class cls = Long.TYPE;
        boolean zO = o(cls);
        Class cls2 = Integer.TYPE;
        boolean zO2 = o(cls2);
        zzhn zzhlVar = null;
        if (unsafeI != null) {
            if (zO) {
                zzhlVar = new zzhm(unsafeI);
            } else if (zO2) {
                zzhlVar = new zzhl(unsafeI);
            }
        }
        f12458c = zzhlVar;
        String str = kHfjNGauVgdF.hKgLltNmI;
        if (zzhlVar == null) {
            z11 = false;
        } else {
            try {
                Class<?> cls3 = zzhlVar.f12455a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod(str, Object.class, cls);
                if (b() == null) {
                    z11 = false;
                } else {
                    z11 = true;
                }
            } catch (Throwable th2) {
                Logger.getLogger(zzho.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
            }
        }
        f12459d = z11;
        zzhn zzhnVar2 = f12458c;
        if (zzhnVar2 == null) {
            z12 = false;
        } else {
            try {
                Class<?> cls4 = zzhnVar2.f12455a.getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod(str, Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z12 = true;
            } catch (Throwable th3) {
                Logger.getLogger(zzho.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th3.toString()));
                z12 = false;
            }
        }
        f12460e = z12;
        f12461f = p(byte[].class);
        p(boolean[].class);
        a(boolean[].class);
        p(int[].class);
        a(int[].class);
        p(long[].class);
        a(long[].class);
        p(float[].class);
        a(float[].class);
        p(double[].class);
        a(double[].class);
        p(Object[].class);
        a(Object[].class);
        Field fieldB = b();
        if (fieldB != null && (zzhnVar = f12458c) != null) {
            zzhnVar.f12455a.objectFieldOffset(fieldB);
        }
        f12462g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }
}
