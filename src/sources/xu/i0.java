package xu;

import com.lingodeer.data.model.AchievementLeaderBoard;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i0 implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AchievementLeaderBoard f56412a;

    public i0(AchievementLeaderBoard achievementLeaderBoard) {
        kotlin.jvm.internal.m.f(achievementLeaderBoard, "achievementLeaderBoard");
        this.f56412a = achievementLeaderBoard;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && kotlin.jvm.internal.m.a(this.f56412a, ((i0) obj).f56412a);
    }

    public final int hashCode() {
        return this.f56412a.hashCode();
    }

    public final String toString() {
        return "OnClickAchievementLeaderBoard(achievementLeaderBoard=" + this.f56412a + ")";
    }
}
