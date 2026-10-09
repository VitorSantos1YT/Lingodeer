package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f49890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f49891b;

    public ie(int i11, Integer num) {
        this.f49890a = i11;
        this.f49891b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ie)) {
            return false;
        }
        ie ieVar = (ie) obj;
        return this.f49890a == ieVar.f49890a && kotlin.jvm.internal.m.a(this.f49891b, ieVar.f49891b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f49890a) * 31;
        Integer num = this.f49891b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "FutureReviewBatchDayRange(minDaysInclusive=" + this.f49890a + ", maxDaysInclusive=" + this.f49891b + ")";
    }
}
