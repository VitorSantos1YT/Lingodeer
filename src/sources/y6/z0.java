package y6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z0 f57406d = new z0(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f57407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f57408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f57409c;

    static {
        b7.f0.G(0);
        b7.f0.G(1);
        b7.f0.G(3);
    }

    public z0(int i11, int i12) {
        this(i11, 1.0f, i12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z0) {
            z0 z0Var = (z0) obj;
            if (this.f57407a == z0Var.f57407a && this.f57408b == z0Var.f57408b && this.f57409c == z0Var.f57409c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f57409c) + ((((217 + this.f57407a) * 31) + this.f57408b) * 31);
    }

    public z0(int i11, float f5, int i12) {
        this.f57407a = i11;
        this.f57408b = i12;
        this.f57409c = f5;
    }
}
