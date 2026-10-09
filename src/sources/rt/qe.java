package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class qe implements se {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final le f50315a;

    public qe(le dateRange) {
        kotlin.jvm.internal.m.f(dateRange, "dateRange");
        this.f50315a = dateRange;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qe) && kotlin.jvm.internal.m.a(this.f50315a, ((qe) obj).f50315a);
    }

    public final int hashCode() {
        return this.f50315a.hashCode();
    }

    public final String toString() {
        return "CustomRange(dateRange=" + this.f50315a + ")";
    }
}
