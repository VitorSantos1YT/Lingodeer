package jt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l2 f37000b;

    public j2(int i11, l2 step) {
        kotlin.jvm.internal.m.f(step, "step");
        this.f36999a = i11;
        this.f37000b = step;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2)) {
            return false;
        }
        j2 j2Var = (j2) obj;
        return this.f36999a == j2Var.f36999a && this.f37000b == j2Var.f37000b;
    }

    public final int hashCode() {
        return this.f37000b.hashCode() + (Integer.hashCode(this.f36999a) * 31);
    }

    public final String toString() {
        return "SentenceM5AlignmentCandidate(cost=" + this.f36999a + ", step=" + this.f37000b + ")";
    }
}
