package b7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x f4042c = new x(-1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4044b;

    static {
        new x(0, 0);
    }

    public x(int i11, int i12) {
        a.d((i11 == -1 || i11 >= 0) && (i12 == -1 || i12 >= 0));
        this.f4043a = i11;
        this.f4044b = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            if (this.f4043a == xVar.f4043a && this.f4044b == xVar.f4044b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11 = this.f4043a;
        return ((i11 >>> 16) | (i11 << 16)) ^ this.f4044b;
    }

    public final String toString() {
        return this.f4043a + "x" + this.f4044b;
    }
}
