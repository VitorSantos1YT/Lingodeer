package xq;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f56190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f56191b;

    public k(int i11, d displayState) {
        kotlin.jvm.internal.m.f(displayState, "displayState");
        this.f56190a = i11;
        this.f56191b = displayState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f56190a == kVar.f56190a && this.f56191b == kVar.f56191b;
    }

    public final int hashCode() {
        return this.f56191b.hashCode() + (Integer.hashCode(this.f56190a) * 31);
    }

    public final String toString() {
        return "DayStreakWidgetUiModel(streakCount=" + this.f56190a + ", displayState=" + this.f56191b + ")";
    }
}
