package xu;

import com.lingodeer.data.model.DayStreakFinishedStatus;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DayStreakFinishedStatus f56411a;

    public i(DayStreakFinishedStatus dayStreakFinishedStatus) {
        kotlin.jvm.internal.m.f(dayStreakFinishedStatus, "dayStreakFinishedStatus");
        this.f56411a = dayStreakFinishedStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && kotlin.jvm.internal.m.a(this.f56411a, ((i) obj).f56411a);
    }

    public final int hashCode() {
        return this.f56411a.hashCode();
    }

    public final String toString() {
        return "DayStreakShieldDialog(dayStreakFinishedStatus=" + this.f56411a + ")";
    }
}
