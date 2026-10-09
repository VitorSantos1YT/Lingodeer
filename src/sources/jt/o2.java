package jt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f37094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37095b;

    public o2(boolean z11, int i11) {
        this.f37094a = z11;
        this.f37095b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2)) {
            return false;
        }
        o2 o2Var = (o2) obj;
        return this.f37094a == o2Var.f37094a && this.f37095b == o2Var.f37095b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f37095b) + (Boolean.hashCode(this.f37094a) * 31);
    }

    public final String toString() {
        return "SentenceSpellWordMatchResult(isMatched=" + this.f37094a + ", consumedLength=" + this.f37095b + ")";
    }
}
