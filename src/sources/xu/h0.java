package xu;

import bw.ORXQ.ADSb;
import com.lingodeer.data.model.AchievementLanguage;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h0 implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AchievementLanguage f56410a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0) && kotlin.jvm.internal.m.a(this.f56410a, ((h0) obj).f56410a);
    }

    public final int hashCode() {
        return this.f56410a.hashCode();
    }

    public final String toString() {
        return "OnClickAchievementLanguage(achievementLanguage=" + this.f56410a + ")";
    }

    public h0(AchievementLanguage achievementLanguage) {
        kotlin.jvm.internal.m.f(achievementLanguage, ADSb.BLWmEKRArVq);
        this.f56410a = achievementLanguage;
    }
}
