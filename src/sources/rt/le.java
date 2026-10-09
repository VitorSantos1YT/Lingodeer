package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class le {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f50034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f50035b;

    public le(long j11, long j12) {
        this.f50034a = j11;
        this.f50035b = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof le)) {
            return false;
        }
        le leVar = (le) obj;
        return this.f50034a == leVar.f50034a && this.f50035b == leVar.f50035b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f50035b) + (Long.hashCode(this.f50034a) * 31);
    }

    public final String toString() {
        return defpackage.e.i(this.f50035b, ")", w4.c.j(this.f50034a, "FutureReviewDateRange(startEpochDay=", ", endEpochDay="));
    }
}
