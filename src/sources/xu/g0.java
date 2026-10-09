package xu;

import com.lingodeer.data.model.AchievementLevel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g0 implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AchievementLevel f56402a;

    public g0(AchievementLevel achievement) {
        kotlin.jvm.internal.m.f(achievement, "achievement");
        this.f56402a = achievement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0) && kotlin.jvm.internal.m.a(this.f56402a, ((g0) obj).f56402a);
    }

    public final int hashCode() {
        return this.f56402a.hashCode();
    }

    public final String toString() {
        return "OnClickAchievement(achievement=" + this.f56402a + ")";
    }
}
