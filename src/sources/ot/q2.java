package ot;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f45959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f45960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f45961c;

    public q2(long j11, int i11, int i12) {
        this.f45959a = j11;
        this.f45960b = i11;
        this.f45961c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2)) {
            return false;
        }
        q2 q2Var = (q2) obj;
        return this.f45959a == q2Var.f45959a && this.f45960b == q2Var.f45960b && this.f45961c == q2Var.f45961c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f45961c) + defpackage.e.b(this.f45960b, Long.hashCode(this.f45959a) * 31, 31);
    }

    public final String toString() {
        return "FallbackWordCandidateId(wordId=" + this.f45959a + ", sourceRank=" + this.f45960b + ", sourceIndex=" + this.f45961c + ")";
    }
}
