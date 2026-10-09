package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ac implements cc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f49456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f49457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f49458c;

    public ac(long j11, long j12, boolean z11) {
        this.f49456a = j11;
        this.f49457b = j12;
        this.f49458c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac)) {
            return false;
        }
        ac acVar = (ac) obj;
        return this.f49456a == acVar.f49456a && this.f49457b == acVar.f49457b && this.f49458c == acVar.f49458c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f49458c) + defpackage.e.f(this.f49457b, Long.hashCode(this.f49456a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbJ = w4.c.j(this.f49456a, "WordMatchFailed(wordId=", ", unitId=");
        sbJ.append(this.f49457b);
        sbJ.append(", recordToReview=");
        sbJ.append(this.f49458c);
        sbJ.append(")");
        return sbJ.toString();
    }
}
