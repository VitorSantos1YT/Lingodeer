package f7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e1 f26712c = new e1(0, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f26714b;

    public e1(int i11, boolean z11) {
        this.f26713a = i11;
        this.f26714b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e1.class != obj.getClass()) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return this.f26713a == e1Var.f26713a && this.f26714b == e1Var.f26714b;
    }

    public final int hashCode() {
        return (this.f26713a << 1) + (this.f26714b ? 1 : 0);
    }
}
