package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 extends p1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1522b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n1(Unsafe unsafe, int i11) {
        super(unsafe);
        this.f1522b = i11;
    }

    @Override // androidx.datastore.preferences.protobuf.p1
    public final boolean c(long j11, Object obj) {
        switch (this.f1522b) {
            case 0:
                return q1.f1545g ? q1.b(j11, obj) : q1.c(j11, obj);
            default:
                return q1.f1545g ? q1.b(j11, obj) : q1.c(j11, obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p1
    public final double d(long j11, Object obj) {
        switch (this.f1522b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(g(j11, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.p1
    public final float e(long j11, Object obj) {
        switch (this.f1522b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(f(j11, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.p1
    public final void j(Object obj, long j11, boolean z11) {
        switch (this.f1522b) {
            case 0:
                if (!q1.f1545g) {
                    q1.l(obj, j11, z11 ? (byte) 1 : (byte) 0);
                } else {
                    q1.k(obj, j11, z11 ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!q1.f1545g) {
                    q1.l(obj, j11, z11 ? (byte) 1 : (byte) 0);
                } else {
                    q1.k(obj, j11, z11 ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p1
    public final void k(Object obj, long j11, byte b3) {
        switch (this.f1522b) {
            case 0:
                if (!q1.f1545g) {
                    q1.l(obj, j11, b3);
                } else {
                    q1.k(obj, j11, b3);
                }
                break;
            default:
                if (!q1.f1545g) {
                    q1.l(obj, j11, b3);
                } else {
                    q1.k(obj, j11, b3);
                }
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p1
    public final void l(Object obj, long j11, double d5) {
        switch (this.f1522b) {
            case 0:
                o(obj, j11, Double.doubleToLongBits(d5));
                break;
            default:
                o(obj, j11, Double.doubleToLongBits(d5));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p1
    public final void m(Object obj, long j11, float f5) {
        switch (this.f1522b) {
            case 0:
                n(j11, obj, Float.floatToIntBits(f5));
                break;
            default:
                n(j11, obj, Float.floatToIntBits(f5));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p1
    public final boolean r() {
        switch (this.f1522b) {
        }
        return false;
    }
}
