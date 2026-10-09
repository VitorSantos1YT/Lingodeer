package xu;

import com.lingodeer.data.model.AchievementRecord;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j0 implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AchievementRecord f56413a;

    public j0(AchievementRecord achievementRecord) {
        kotlin.jvm.internal.m.f(achievementRecord, "achievementRecord");
        this.f56413a = achievementRecord;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0) && kotlin.jvm.internal.m.a(this.f56413a, ((j0) obj).f56413a);
    }

    public final int hashCode() {
        return this.f56413a.hashCode();
    }

    public final String toString() {
        return "OnClickAchievementRecord(achievementRecord=" + this.f56413a + ")";
    }
}
