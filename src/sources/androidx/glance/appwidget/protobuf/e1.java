package androidx.glance.appwidget.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unsafe f1922a;

    public e1(Unsafe unsafe) {
        this.f1922a = unsafe;
    }

    public final int a(Class cls) {
        return this.f1922a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f1922a.arrayIndexScale(cls);
    }

    public abstract boolean c(long j11, Object obj);

    public abstract double d(long j11, Object obj);

    public abstract float e(long j11, Object obj);

    public final int f(long j11, Object obj) {
        return this.f1922a.getInt(obj, j11);
    }

    public final long g(long j11, Object obj) {
        return this.f1922a.getLong(obj, j11);
    }

    public final Object h(long j11, Object obj) {
        return this.f1922a.getObject(obj, j11);
    }

    public final long i(Field field) {
        return this.f1922a.objectFieldOffset(field);
    }

    public abstract void j(Object obj, long j11, boolean z11);

    public abstract void k(Object obj, long j11, byte b3);

    public abstract void l(Object obj, long j11, double d5);

    public abstract void m(Object obj, long j11, float f5);

    public final void n(long j11, Object obj, int i11) {
        this.f1922a.putInt(obj, j11, i11);
    }

    public final void o(Object obj, long j11, long j12) {
        this.f1922a.putLong(obj, j11, j12);
    }

    public final void p(Object obj, long j11, Object obj2) {
        this.f1922a.putObject(obj, j11, obj2);
    }

    public boolean q() {
        Unsafe unsafe = this.f1922a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th2) {
            f1.a(th2);
            return false;
        }
    }

    public abstract boolean r();
}
