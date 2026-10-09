package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzank {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f10223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f10224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zzc f10225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f10226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f10227e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f10228f;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza extends zzc {
        @Override // com.google.android.gms.internal.firebase-auth-api.zzank.zzc
        public final double a(Object obj, long j11) {
            return Double.longBitsToDouble(k(j11, obj));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzank.zzc
        public final void c(Object obj, long j11, byte b3) {
            if (zzank.f10228f) {
                zzank.i(obj, j11, b3);
            } else {
                zzank.k(obj, j11, b3);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzank.zzc
        public final void d(Object obj, long j11, double d5) {
            f(obj, j11, Double.doubleToLongBits(d5));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzank.zzc
        public final void e(Object obj, long j11, float f5) {
            b(j11, obj, Float.floatToIntBits(f5));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzank.zzc
        public final void g(Object obj, long j11, boolean z11) {
            if (zzank.f10228f) {
                zzank.i(obj, j11, z11 ? (byte) 1 : (byte) 0);
            } else {
                zzank.k(obj, j11, z11 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzank.zzc
        public final float h(Object obj, long j11) {
            return Float.intBitsToFloat(j(j11, obj));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzank.zzc
        public final boolean i(long j11, Object obj) {
            if (zzank.f10228f) {
                return ((byte) (zzank.f10225c.j((-4) & j11, obj) >>> ((int) (((~j11) & 3) << 3)))) != 0;
            }
            return ((byte) (zzank.f10225c.j((-4) & j11, obj) >>> ((int) ((j11 & 3) << 3)))) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zzb extends zzc {
        @Override // com.google.android.gms.internal.firebase-auth-api.zzank.zzc
        public final double a(Object obj, long j11) {
            return Double.longBitsToDouble(k(j11, obj));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzank.zzc
        public final void c(Object obj, long j11, byte b3) {
            if (zzank.f10228f) {
                zzank.i(obj, j11, b3);
            } else {
                zzank.k(obj, j11, b3);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzank.zzc
        public final void d(Object obj, long j11, double d5) {
            f(obj, j11, Double.doubleToLongBits(d5));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzank.zzc
        public final void e(Object obj, long j11, float f5) {
            b(j11, obj, Float.floatToIntBits(f5));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzank.zzc
        public final void g(Object obj, long j11, boolean z11) {
            if (zzank.f10228f) {
                zzank.i(obj, j11, z11 ? (byte) 1 : (byte) 0);
            } else {
                zzank.k(obj, j11, z11 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzank.zzc
        public final float h(Object obj, long j11) {
            return Float.intBitsToFloat(j(j11, obj));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzank.zzc
        public final boolean i(long j11, Object obj) {
            if (zzank.f10228f) {
                return ((byte) (zzank.f10225c.j((-4) & j11, obj) >>> ((int) (((~j11) & 3) << 3)))) != 0;
            }
            return ((byte) (zzank.f10225c.j((-4) & j11, obj) >>> ((int) ((j11 & 3) << 3)))) != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class zzc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Unsafe f10229a;

        public zzc(Unsafe unsafe) {
            this.f10229a = unsafe;
        }

        public abstract double a(Object obj, long j11);

        public final void b(long j11, Object obj, int i11) {
            this.f10229a.putInt(obj, j11, i11);
        }

        public abstract void c(Object obj, long j11, byte b3);

        public abstract void d(Object obj, long j11, double d5);

        public abstract void e(Object obj, long j11, float f5);

        public final void f(Object obj, long j11, long j12) {
            this.f10229a.putLong(obj, j11, j12);
        }

        public abstract void g(Object obj, long j11, boolean z11);

        public abstract float h(Object obj, long j11);

        public abstract boolean i(long j11, Object obj);

        public final int j(long j11, Object obj) {
            return this.f10229a.getInt(obj, j11);
        }

        public final long k(long j11, Object obj) {
            return this.f10229a.getLong(obj, j11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0028  */
    static {
        zzc zzbVar;
        Unsafe unsafe;
        boolean z11;
        zzc zzcVar;
        Unsafe unsafe2;
        Unsafe unsafeG = g();
        f10223a = unsafeG;
        f10224b = zzajb.f10057a;
        Class cls = Long.TYPE;
        boolean zL = l(cls);
        Class cls2 = Integer.TYPE;
        boolean zL2 = l(cls2);
        if (unsafeG == null) {
            zzbVar = null;
        } else if (zL) {
            zzbVar = new zza(unsafeG);
        } else if (zL2) {
            zzbVar = new zzb(unsafeG);
        } else {
            zzbVar = null;
        }
        f10225c = zzbVar;
        if (zzbVar != null && (unsafe2 = zzbVar.f10229a) != null) {
            try {
                Class<?> cls3 = unsafe2.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                j();
            } catch (Throwable th2) {
                Logger.getLogger(zzank.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(String.valueOf(th2)));
            }
        }
        zzc zzcVar2 = f10225c;
        if (zzcVar2 == null || (unsafe = zzcVar2.f10229a) == null) {
            z11 = false;
        } else {
            try {
                Class<?> cls4 = unsafe.getClass();
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
                Logger.getLogger(zzank.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(String.valueOf(th3)));
                z11 = false;
            }
        }
        f10226d = z11;
        f10227e = f(byte[].class);
        f(boolean[].class);
        h(boolean[].class);
        f(int[].class);
        h(int[].class);
        f(long[].class);
        h(long[].class);
        f(float[].class);
        h(float[].class);
        f(double[].class);
        h(double[].class);
        f(Object[].class);
        h(Object[].class);
        Field fieldJ = j();
        if (fieldJ != null && (zzcVar = f10225c) != null) {
            zzcVar.f10229a.objectFieldOffset(fieldJ);
        }
        f10228f = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zzank() {
    }

    public static Object a(Class cls) {
        try {
            return f10223a.allocateInstance(cls);
        } catch (InstantiationException e8) {
            throw new IllegalStateException(e8);
        }
    }

    public static void b(long j11, Object obj, int i11) {
        f10225c.b(j11, obj, i11);
    }

    public static void c(Object obj, long j11, long j12) {
        f10225c.f(obj, j11, j12);
    }

    public static void d(Object obj, long j11, Object obj2) {
        f10225c.f10229a.putObject(obj, j11, obj2);
    }

    public static void e(byte[] bArr, long j11, byte b3) {
        f10225c.c(bArr, f10227e + j11, b3);
    }

    public static int f(Class cls) {
        if (f10226d) {
            return f10225c.f10229a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static Unsafe g() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new zzanj());
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
            Logger.getLogger(zzank.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    public static void h(Class cls) {
        if (f10226d) {
            f10225c.f10229a.arrayIndexScale(cls);
        }
    }

    public static void i(Object obj, long j11, byte b3) {
        long j12 = (-4) & j11;
        int iJ = f10225c.j(j12, obj);
        int i11 = ((~((int) j11)) & 3) << 3;
        b(j12, obj, ((255 & b3) << i11) | (iJ & (~(255 << i11))));
    }

    public static Field j() {
        Field declaredField;
        Field declaredField2;
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

    public static void k(Object obj, long j11, byte b3) {
        long j12 = (-4) & j11;
        int i11 = (((int) j11) & 3) << 3;
        b(j12, obj, ((255 & b3) << i11) | (f10225c.j(j12, obj) & (~(255 << i11))));
    }

    public static boolean l(Class cls) {
        try {
            Class cls2 = f10224b;
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

    public static Object m(long j11, Object obj) {
        return f10225c.f10229a.getObject(obj, j11);
    }
}
