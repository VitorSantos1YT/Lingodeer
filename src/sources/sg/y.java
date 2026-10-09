package sg;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class y extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f51670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f51671b;

    public y(boolean z11, z alignment) {
        kotlin.jvm.internal.m.f(alignment, "alignment");
        this.f51670a = z11;
        this.f51671b = alignment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f51670a == yVar.f51670a && this.f51671b == yVar.f51671b;
    }

    public final int hashCode() {
        return this.f51671b.hashCode() + (Boolean.hashCode(this.f51670a) * 31);
    }

    public final String toString() {
        return "AstTableCell(header=" + this.f51670a + ", alignment=" + this.f51671b + ")";
    }
}
