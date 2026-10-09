package dt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f23894b;

    public i5(boolean z11, boolean z12) {
        this.f23893a = z11;
        this.f23894b = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5)) {
            return false;
        }
        i5 i5Var = (i5) obj;
        return this.f23893a == i5Var.f23893a && this.f23894b == i5Var.f23894b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f23894b) + (Boolean.hashCode(this.f23893a) * 31);
    }

    public final String toString() {
        return "GroupedSentenceResultRenderConfig(shouldRenderGrouped=" + this.f23893a + ", highlightWrongChars=" + this.f23894b + ")";
    }
}
