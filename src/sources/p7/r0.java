package p7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f46459b;

    public r0(int i11, boolean z11) {
        this.f46458a = i11;
        this.f46459b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r0.class != obj.getClass()) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return this.f46458a == r0Var.f46458a && this.f46459b == r0Var.f46459b;
    }

    public final int hashCode() {
        return (this.f46458a * 31) + (this.f46459b ? 1 : 0);
    }
}
