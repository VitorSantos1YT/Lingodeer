package com.google.protobuf;

import com.lingo.lingoskill.ui.base.ENO.MzwEyWCkjXL;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class UnsafeUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f21415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f21416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final MemoryAccessor f21417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f21418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f21419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f21420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f21421g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f21422h;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Android32MemoryAccessor extends MemoryAccessor {
        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public final void c(long j11, byte[] bArr, long j12, long j13) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public final void d(byte[] bArr, long j11, long j12, long j13) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public final boolean e(long j11, Object obj) {
            if (UnsafeUtil.f21422h) {
                return UnsafeUtil.i(j11, obj) != 0;
            }
            return UnsafeUtil.j(j11, obj) != 0;
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public final byte f(long j11) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public final byte g(long j11, Object obj) {
            return UnsafeUtil.f21422h ? UnsafeUtil.i(j11, obj) : UnsafeUtil.j(j11, obj);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public final double h(long j11, Object obj) {
            return Double.longBitsToDouble(l(j11, obj));
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public final float i(long j11, Object obj) {
            return Float.intBitsToFloat(j(j11, obj));
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public final long k(long j11) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public final void o(Object obj, long j11, boolean z11) {
            if (UnsafeUtil.f21422h) {
                UnsafeUtil.n(obj, j11, z11 ? (byte) 1 : (byte) 0);
            } else {
                UnsafeUtil.o(obj, j11, z11 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public final void p(long j11, byte b3) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public final void q(Object obj, long j11, byte b3) {
            if (UnsafeUtil.f21422h) {
                UnsafeUtil.n(obj, j11, b3);
            } else {
                UnsafeUtil.o(obj, j11, b3);
            }
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public final void r(Object obj, long j11, double d5) {
            u(obj, j11, Double.doubleToLongBits(d5));
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public final void s(Object obj, long j11, float f5) {
            t(j11, obj, Float.floatToIntBits(f5));
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public final boolean x() {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Android64MemoryAccessor extends MemoryAccessor {
        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public final void c(long j11, byte[] bArr, long j12, long j13) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public final void d(byte[] bArr, long j11, long j12, long j13) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public final boolean e(long j11, Object obj) {
            if (UnsafeUtil.f21422h) {
                return UnsafeUtil.i(j11, obj) != 0;
            }
            return UnsafeUtil.j(j11, obj) != 0;
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public final byte f(long j11) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public final byte g(long j11, Object obj) {
            return UnsafeUtil.f21422h ? UnsafeUtil.i(j11, obj) : UnsafeUtil.j(j11, obj);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public final double h(long j11, Object obj) {
            return Double.longBitsToDouble(l(j11, obj));
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public final float i(long j11, Object obj) {
            return Float.intBitsToFloat(j(j11, obj));
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public final long k(long j11) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public final void o(Object obj, long j11, boolean z11) {
            if (UnsafeUtil.f21422h) {
                UnsafeUtil.n(obj, j11, z11 ? (byte) 1 : (byte) 0);
            } else {
                UnsafeUtil.o(obj, j11, z11 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public final void p(long j11, byte b3) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public final void q(Object obj, long j11, byte b3) {
            if (UnsafeUtil.f21422h) {
                UnsafeUtil.n(obj, j11, b3);
            } else {
                UnsafeUtil.o(obj, j11, b3);
            }
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public final void r(Object obj, long j11, double d5) {
            u(obj, j11, Double.doubleToLongBits(d5));
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public final void s(Object obj, long j11, float f5) {
            t(j11, obj, Float.floatToIntBits(f5));
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public final boolean x() {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class JvmMemoryAccessor extends MemoryAccessor {
        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public final void c(long j11, byte[] bArr, long j12, long j13) {
            this.f21423a.copyMemory((Object) null, j11, bArr, UnsafeUtil.f21420f + j12, j13);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public final void d(byte[] bArr, long j11, long j12, long j13) {
            this.f21423a.copyMemory(bArr, UnsafeUtil.f21420f + j11, (Object) null, j12, j13);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public final boolean e(long j11, Object obj) {
            return this.f21423a.getBoolean(obj, j11);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public final byte f(long j11) {
            return this.f21423a.getByte(j11);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public final byte g(long j11, Object obj) {
            return this.f21423a.getByte(obj, j11);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public final double h(long j11, Object obj) {
            return this.f21423a.getDouble(obj, j11);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public final float i(long j11, Object obj) {
            return this.f21423a.getFloat(obj, j11);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public final long k(long j11) {
            return this.f21423a.getLong(j11);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public final void o(Object obj, long j11, boolean z11) {
            this.f21423a.putBoolean(obj, j11, z11);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public final void p(long j11, byte b3) {
            this.f21423a.putByte(j11, b3);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public final void q(Object obj, long j11, byte b3) {
            this.f21423a.putByte(obj, j11, b3);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public final void r(Object obj, long j11, double d5) {
            this.f21423a.putDouble(obj, j11, d5);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public final void s(Object obj, long j11, float f5) {
            this.f21423a.putFloat(obj, j11, f5);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public final boolean w() {
            if (!super.w()) {
                return false;
            }
            try {
                Class<?> cls = this.f21423a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th2) {
                UnsafeUtil.a(th2);
                return false;
            }
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public final boolean x() {
            if (!super.x()) {
                return false;
            }
            try {
                Class<?> cls = this.f21423a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", cls2);
                cls.getMethod("putByte", cls2, Byte.TYPE);
                cls.getMethod("getInt", cls2);
                cls.getMethod("putInt", cls2, Integer.TYPE);
                cls.getMethod("getLong", cls2);
                cls.getMethod("putLong", cls2, cls2);
                cls.getMethod("copyMemory", cls2, cls2, cls2);
                cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                return true;
            } catch (Throwable th2) {
                UnsafeUtil.a(th2);
                return false;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class MemoryAccessor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Unsafe f21423a;

        public MemoryAccessor(Unsafe unsafe) {
            this.f21423a = unsafe;
        }

        public final int a(Class cls) {
            return this.f21423a.arrayBaseOffset(cls);
        }

        public final int b(Class cls) {
            return this.f21423a.arrayIndexScale(cls);
        }

        public abstract void c(long j11, byte[] bArr, long j12, long j13);

        public abstract void d(byte[] bArr, long j11, long j12, long j13);

        public abstract boolean e(long j11, Object obj);

        public abstract byte f(long j11);

        public abstract byte g(long j11, Object obj);

        public abstract double h(long j11, Object obj);

        public abstract float i(long j11, Object obj);

        public final int j(long j11, Object obj) {
            return this.f21423a.getInt(obj, j11);
        }

        public abstract long k(long j11);

        public final long l(long j11, Object obj) {
            return this.f21423a.getLong(obj, j11);
        }

        public final Object m(long j11, Object obj) {
            return this.f21423a.getObject(obj, j11);
        }

        public final long n(java.lang.reflect.Field field) {
            return this.f21423a.objectFieldOffset(field);
        }

        public abstract void o(Object obj, long j11, boolean z11);

        public abstract void p(long j11, byte b3);

        public abstract void q(Object obj, long j11, byte b3);

        public abstract void r(Object obj, long j11, double d5);

        public abstract void s(Object obj, long j11, float f5);

        public final void t(long j11, Object obj, int i11) {
            this.f21423a.putInt(obj, j11, i11);
        }

        public final void u(Object obj, long j11, long j12) {
            this.f21423a.putLong(obj, j11, j12);
        }

        public final void v(Object obj, long j11, Object obj2) {
            this.f21423a.putObject(obj, j11, obj2);
        }

        public boolean x() {
            Unsafe unsafe = this.f21423a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return UnsafeUtil.f() != null;
            } catch (Throwable th2) {
                UnsafeUtil.a(th2);
                return false;
            }
        }

        public boolean w() {
            Unsafe unsafe = this.f21423a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod(MzwEyWCkjXL.PTtQeDObUaH, Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th2) {
                UnsafeUtil.a(th2);
                return false;
            }
        }
    }

    static {
        Unsafe unsafeK = k();
        f21415a = unsafeK;
        f21416b = Android.f21143a;
        boolean zG = g(Long.TYPE);
        boolean zG2 = g(Integer.TYPE);
        MemoryAccessor jvmMemoryAccessor = null;
        if (unsafeK != null) {
            if (!Android.a()) {
                jvmMemoryAccessor = new JvmMemoryAccessor(unsafeK);
            } else if (zG) {
                jvmMemoryAccessor = new Android64MemoryAccessor(unsafeK);
            } else if (zG2) {
                jvmMemoryAccessor = new Android32MemoryAccessor(unsafeK);
            }
        }
        f21417c = jvmMemoryAccessor;
        f21418d = jvmMemoryAccessor == null ? false : jvmMemoryAccessor.x();
        f21419e = jvmMemoryAccessor == null ? false : jvmMemoryAccessor.w();
        f21420f = d(byte[].class);
        d(boolean[].class);
        e(boolean[].class);
        d(int[].class);
        e(int[].class);
        d(long[].class);
        e(long[].class);
        d(float[].class);
        e(float[].class);
        d(double[].class);
        e(double[].class);
        d(Object[].class);
        e(Object[].class);
        java.lang.reflect.Field fieldF = f();
        f21421g = (fieldF == null || jvmMemoryAccessor == null) ? -1L : jvmMemoryAccessor.n(fieldF);
        f21422h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private UnsafeUtil() {
    }

    public static void a(Throwable th2) {
        Logger.getLogger(UnsafeUtil.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    public static long b(ByteBuffer byteBuffer) {
        return f21417c.l(f21421g, byteBuffer);
    }

    public static Object c(Class cls) {
        try {
            return f21415a.allocateInstance(cls);
        } catch (InstantiationException e8) {
            throw new IllegalStateException(e8);
        }
    }

    public static int d(Class cls) {
        if (f21419e) {
            return f21417c.a(cls);
        }
        return -1;
    }

    public static void e(Class cls) {
        if (f21419e) {
            f21417c.b(cls);
        }
    }

    public static java.lang.reflect.Field f() {
        java.lang.reflect.Field declaredField;
        java.lang.reflect.Field declaredField2;
        if (Android.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
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

    public static boolean g(Class cls) {
        if (!Android.a()) {
            return false;
        }
        try {
            Class cls2 = f21416b;
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

    public static byte h(long j11, byte[] bArr) {
        return f21417c.g(f21420f + j11, bArr);
    }

    public static byte i(long j11, Object obj) {
        return (byte) ((f21417c.j((-4) & j11, obj) >>> ((int) (((~j11) & 3) << 3))) & 255);
    }

    public static byte j(long j11, Object obj) {
        return (byte) ((f21417c.j((-4) & j11, obj) >>> ((int) ((j11 & 3) << 3))) & 255);
    }

    public static Unsafe k() {
        try {
            return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.protobuf.UnsafeUtil.1
                public static Unsafe a() throws IllegalAccessException {
                    for (java.lang.reflect.Field field : Unsafe.class.getDeclaredFields()) {
                        field.setAccessible(true);
                        Object obj = field.get(null);
                        if (Unsafe.class.isInstance(obj)) {
                            return (Unsafe) Unsafe.class.cast(obj);
                        }
                    }
                    return null;
                }

                @Override // java.security.PrivilegedExceptionAction
                public final /* bridge */ /* synthetic */ Unsafe run() {
                    return a();
                }
            });
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void l(long j11, byte b3) {
        f21417c.p(j11, b3);
    }

    public static void m(byte[] bArr, long j11, byte b3) {
        f21417c.q(bArr, f21420f + j11, b3);
    }

    public static void n(Object obj, long j11, byte b3) {
        long j12 = (-4) & j11;
        int iJ = f21417c.j(j12, obj);
        int i11 = ((~((int) j11)) & 3) << 3;
        p(j12, obj, ((255 & b3) << i11) | (iJ & (~(255 << i11))));
    }

    public static void o(Object obj, long j11, byte b3) {
        long j12 = (-4) & j11;
        int i11 = (((int) j11) & 3) << 3;
        p(j12, obj, ((255 & b3) << i11) | (f21417c.j(j12, obj) & (~(255 << i11))));
    }

    public static void p(long j11, Object obj, int i11) {
        f21417c.t(j11, obj, i11);
    }

    public static void q(Object obj, long j11, long j12) {
        f21417c.u(obj, j11, j12);
    }

    public static void r(Object obj, long j11, Object obj2) {
        f21417c.v(obj, j11, obj2);
    }
}
