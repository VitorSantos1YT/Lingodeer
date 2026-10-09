package f7;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f26812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f26813c;

    public j0(i0 i0Var) {
        this.f26811a = i0Var.f26797a;
        this.f26812b = i0Var.f26798b;
        this.f26813c = i0Var.f26799c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return this.f26811a == j0Var.f26811a && this.f26812b == j0Var.f26812b && this.f26813c == j0Var.f26813c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f26811a), Float.valueOf(this.f26812b), Long.valueOf(this.f26813c));
    }
}
