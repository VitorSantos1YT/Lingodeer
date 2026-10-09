package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final se f50466b;

    public u1(String query, se scheduleFilter) {
        kotlin.jvm.internal.m.f(query, "query");
        kotlin.jvm.internal.m.f(scheduleFilter, "scheduleFilter");
        this.f50465a = query;
        this.f50466b = scheduleFilter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        return kotlin.jvm.internal.m.a(this.f50465a, u1Var.f50465a) && kotlin.jvm.internal.m.a(this.f50466b, u1Var.f50466b);
    }

    public final int hashCode() {
        return this.f50466b.hashCode() + (this.f50465a.hashCode() * 31);
    }

    public final String toString() {
        return "FutureReviewSearchFilter(query=" + this.f50465a + ", scheduleFilter=" + this.f50466b + ")";
    }
}
