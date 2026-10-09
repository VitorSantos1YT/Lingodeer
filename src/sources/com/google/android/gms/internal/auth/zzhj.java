package com.google.android.gms.internal.auth;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzhj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f9570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f9571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zzhi f9572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f9573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f9574e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f9575f;

    /* JADX WARN: Code duplicated, block: B:11:0x0043  */
    static {
        boolean z11;
        boolean z12;
        zzhi zzhiVar;
        Unsafe unsafeE = e();
        f9570a = unsafeE;
        int i11 = zzds.f9471a;
        f9571b = Memory.class;
        Class cls = Long.TYPE;
        boolean zM = m(cls);
        Class cls2 = Integer.TYPE;
        boolean zM2 = m(cls2);
        zzhi zzhgVar = null;
        if (unsafeE != null) {
            if (zM) {
                zzhgVar = new zzhh(unsafeE);
            } else if (zM2) {
                zzhgVar = new zzhg(unsafeE);
            }
        }
        f9572c = zzhgVar;
        if (zzhgVar == null) {
            z11 = false;
        } else {
            try {
                Class<?> cls3 = zzhgVar.f9569a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (p() == null) {
                    z11 = false;
                } else {
                    z11 = true;
                }
            } catch (Throwable th2) {
                Logger.getLogger(zzhj.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
            }
        }
        f9573d = z11;
        zzhi zzhiVar2 = f9572c;
        if (zzhiVar2 == null) {
            z12 = false;
        } else {
            try {
                Class<?> cls4 = zzhiVar2.f9569a.getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z12 = true;
            } catch (Throwable th3) {
                Logger.getLogger(zzhj.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th3.toString()));
                z12 = false;
            }
        }
        f9574e = z12;
        n(byte[].class);
        n(boolean[].class);
        o(boolean[].class);
        n(int[].class);
        o(int[].class);
        n(long[].class);
        o(long[].class);
        n(float[].class);
        o(float[].class);
        n(double[].class);
        o(double[].class);
        n(Object[].class);
        o(Object[].class);
        Field fieldP = p();
        if (fieldP != null && (zzhiVar = f9572c) != null) {
            zzhiVar.f9569a.objectFieldOffset(fieldP);
        }
        f9575f = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zzhj() {
    }

    public static int a(Object obj, long j11) {
        return f9572c.f9569a.getInt(obj, j11);
    }

    public static long b(Object obj, long j11) {
        return f9572c.f9569a.getLong(obj, j11);
    }

    public static Object c(Class cls) {
        try {
            return f9570a.allocateInstance(cls);
        } catch (InstantiationException e8) {
            throw new IllegalStateException(e8);
        }
    }

    public static Object d(Object obj, long j11) {
        return f9572c.f9569a.getObject(obj, j11);
    }

    public static Unsafe e() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzhf());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ void f(Object obj, long j11, boolean z11) {
        zzhi zzhiVar = f9572c;
        long j12 = (-4) & j11;
        int i11 = zzhiVar.f9569a.getInt(obj, j12);
        int i12 = ((~((int) j11)) & 3) << 3;
        zzhiVar.f9569a.putInt(obj, j12, ((z11 ? 1 : 0) << i12) | ((~(255 << i12)) & i11));
    }

    public static /* synthetic */ void g(Object obj, long j11, boolean z11) {
        zzhi zzhiVar = f9572c;
        long j12 = (-4) & j11;
        int i11 = (((int) j11) & 3) << 3;
        zzhiVar.f9569a.putInt(obj, j12, ((z11 ? 1 : 0) << i11) | ((~(255 << i11)) & zzhiVar.f9569a.getInt(obj, j12)));
    }

    public static void h(long j11, Object obj, int i11) {
        f9572c.f9569a.putInt(obj, j11, i11);
    }

    public static void i(Object obj, long j11, long j12) {
        f9572c.f9569a.putLong(obj, j11, j12);
    }

    public static void j(Object obj, long j11, Object obj2) {
        f9572c.f9569a.putObject(obj, j11, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean k(long j11, Object obj) {
        return ((byte) ((f9572c.f9569a.getInt(obj, (-4) & j11) >>> ((int) (((~j11) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean l(long j11, Object obj) {
        return ((byte) ((f9572c.f9569a.getInt(obj, (-4) & j11) >>> ((int) ((j11 & 3) << 3))) & 255)) != 0;
    }

    public static boolean m(Class cls) {
        int i11 = zzds.f9471a;
        try {
            Class cls2 = f9571b;
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

    public static void n(Class cls) {
        if (f9574e) {
            f9572c.f9569a.arrayBaseOffset(cls);
        }
    }

    public static void o(Class cls) {
        if (f9574e) {
            f9572c.f9569a.arrayIndexScale(cls);
        }
    }

    public static Field p() {
        Field declaredField;
        Field declaredField2;
        int i11 = zzds.f9471a;
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
}
