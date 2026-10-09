package androidx.glance.appwidget.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends e1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1916b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(Unsafe unsafe, int i11) {
        super(unsafe);
        this.f1916b = i11;
    }

    @Override // androidx.glance.appwidget.protobuf.e1
    public final boolean c(long j11, Object obj) {
        switch (this.f1916b) {
            case 0:
                return f1.f1930g ? f1.b(j11, obj) : f1.c(j11, obj);
            default:
                return f1.f1930g ? f1.b(j11, obj) : f1.c(j11, obj);
        }
    }

    @Override // androidx.glance.appwidget.protobuf.e1
    public final double d(long j11, Object obj) {
        switch (this.f1916b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(g(j11, obj));
    }

    @Override // androidx.glance.appwidget.protobuf.e1
    public final float e(long j11, Object obj) {
        switch (this.f1916b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(f(j11, obj));
    }

    @Override // androidx.glance.appwidget.protobuf.e1
    public final void j(Object obj, long j11, boolean z11) {
        switch (this.f1916b) {
            case 0:
                if (!f1.f1930g) {
                    f1.l(obj, j11, z11 ? (byte) 1 : (byte) 0);
                } else {
                    f1.k(obj, j11, z11 ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!f1.f1930g) {
                    f1.l(obj, j11, z11 ? (byte) 1 : (byte) 0);
                } else {
                    f1.k(obj, j11, z11 ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // androidx.glance.appwidget.protobuf.e1
    public final void k(Object obj, long j11, byte b3) {
        switch (this.f1916b) {
            case 0:
                if (!f1.f1930g) {
                    f1.l(obj, j11, b3);
                } else {
                    f1.k(obj, j11, b3);
                }
                break;
            default:
                if (!f1.f1930g) {
                    f1.l(obj, j11, b3);
                } else {
                    f1.k(obj, j11, b3);
                }
                break;
        }
    }

    @Override // androidx.glance.appwidget.protobuf.e1
    public final void l(Object obj, long j11, double d5) {
        switch (this.f1916b) {
            case 0:
                o(obj, j11, Double.doubleToLongBits(d5));
                break;
            default:
                o(obj, j11, Double.doubleToLongBits(d5));
                break;
        }
    }

    @Override // androidx.glance.appwidget.protobuf.e1
    public final void m(Object obj, long j11, float f5) {
        switch (this.f1916b) {
            case 0:
                n(j11, obj, Float.floatToIntBits(f5));
                break;
            default:
                n(j11, obj, Float.floatToIntBits(f5));
                break;
        }
    }

    @Override // androidx.glance.appwidget.protobuf.e1
    public final boolean r() {
        switch (this.f1916b) {
        }
        return false;
    }
}
