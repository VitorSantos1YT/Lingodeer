package xu;

import com.lingodeer.data.model.AchievementLevel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AchievementLevel f56401a;

    public g(AchievementLevel achievement) {
        kotlin.jvm.internal.m.f(achievement, "achievement");
        this.f56401a = achievement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && kotlin.jvm.internal.m.a(this.f56401a, ((g) obj).f56401a);
    }

    public final int hashCode() {
        return this.f56401a.hashCode();
    }

    public final String toString() {
        return "AchievementDialog(achievement=" + this.f56401a + ")";
    }
}
