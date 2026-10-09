package xu;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u0 implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f56522a;

    public u0(int i11) {
        this.f56522a = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u0) && this.f56522a == ((u0) obj).f56522a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f56522a);
    }

    public final String toString() {
        return hh.p0.h(this.f56522a, "UpdateDailyGoal(dailyGoalXP=", ")");
    }
}
