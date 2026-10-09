package androidx.glance.appwidget.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends e1 {
    @Override // androidx.glance.appwidget.protobuf.e1
    public final boolean c(long j11, Object obj) {
        return this.f1922a.getBoolean(obj, j11);
    }

    @Override // androidx.glance.appwidget.protobuf.e1
    public final double d(long j11, Object obj) {
        return this.f1922a.getDouble(obj, j11);
    }

    @Override // androidx.glance.appwidget.protobuf.e1
    public final float e(long j11, Object obj) {
        return this.f1922a.getFloat(obj, j11);
    }

    @Override // androidx.glance.appwidget.protobuf.e1
    public final void j(Object obj, long j11, boolean z11) {
        this.f1922a.putBoolean(obj, j11, z11);
    }

    @Override // androidx.glance.appwidget.protobuf.e1
    public final void k(Object obj, long j11, byte b3) {
        this.f1922a.putByte(obj, j11, b3);
    }

    @Override // androidx.glance.appwidget.protobuf.e1
    public final void l(Object obj, long j11, double d5) {
        this.f1922a.putDouble(obj, j11, d5);
    }

    @Override // androidx.glance.appwidget.protobuf.e1
    public final void m(Object obj, long j11, float f5) {
        this.f1922a.putFloat(obj, j11, f5);
    }

    @Override // androidx.glance.appwidget.protobuf.e1
    public final boolean q() {
        if (!super.q()) {
            return false;
        }
        try {
            Class<?> cls = this.f1922a.getClass();
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
            f1.a(th2);
            return false;
        }
    }

    @Override // androidx.glance.appwidget.protobuf.e1
    public final boolean r() {
        Unsafe unsafe = this.f1922a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (f1.g() != null) {
                    try {
                        Class<?> cls3 = this.f1922a.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th2) {
                        f1.a(th2);
                        return false;
                    }
                }
            } catch (Throwable th3) {
                f1.a(th3);
            }
        }
        return false;
    }
}
