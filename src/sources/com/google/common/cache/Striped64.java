package com.google.common.cache;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
abstract class Striped64 extends Number {
    public static final long H;
    public static final long K;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f16523d = new ThreadLocal();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Random f16524e = new Random();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f16525f = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Unsafe f16526t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile transient Cell[] f16527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile transient long f16528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile transient int f16529c;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Cell {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Unsafe f16530b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final long f16531c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile long f16532a;

        static {
            try {
                Unsafe unsafeD = Striped64.d();
                f16530b = unsafeD;
                f16531c = unsafeD.objectFieldOffset(Cell.class.getDeclaredField("a"));
            } catch (Exception e8) {
                throw new Error(e8);
            }
        }

        public Cell(long j11) {
            this.f16532a = j11;
        }

        public final boolean a(long j11, long j12) {
            return f16530b.compareAndSwapLong(this, f16531c, j11, j12);
        }
    }

    static {
        try {
            Unsafe unsafeD = d();
            f16526t = unsafeD;
            H = unsafeD.objectFieldOffset(Striped64.class.getDeclaredField("b"));
            K = unsafeD.objectFieldOffset(Striped64.class.getDeclaredField("c"));
        } catch (Exception e8) {
            throw new Error(e8);
        }
    }

    public static Unsafe d() {
        try {
            try {
                return Unsafe.getUnsafe();
            } catch (PrivilegedActionException e8) {
                throw new RuntimeException("Could not initialize intrinsics", e8.getCause());
            }
        } catch (SecurityException unused) {
            return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.common.cache.Striped64.1
                public static Unsafe a() throws IllegalAccessException {
                    for (Field field : Unsafe.class.getDeclaredFields()) {
                        field.setAccessible(true);
                        Object obj = field.get(null);
                        if (Unsafe.class.isInstance(obj)) {
                            return (Unsafe) Unsafe.class.cast(obj);
                        }
                    }
                    throw new NoSuchFieldError("the Unsafe");
                }

                @Override // java.security.PrivilegedExceptionAction
                public final /* bridge */ /* synthetic */ Unsafe run() {
                    return a();
                }
            });
        }
    }

    public final boolean b(long j11, long j12) {
        return f16526t.compareAndSwapLong(this, H, j11, j12);
    }

    public final boolean c() {
        return f16526t.compareAndSwapInt(this, K, 0, 1);
    }
}
