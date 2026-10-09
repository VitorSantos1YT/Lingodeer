package xu;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k0 implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f56417a;

    public k0(List achievementLanguages) {
        kotlin.jvm.internal.m.f(achievementLanguages, "achievementLanguages");
        this.f56417a = achievementLanguages;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0) && kotlin.jvm.internal.m.a(this.f56417a, ((k0) obj).f56417a);
    }

    public final int hashCode() {
        return this.f56417a.hashCode();
    }

    public final String toString() {
        return com.google.android.material.datepicker.d.l(this.f56417a, "OnClickAllLanguageAchievements(achievementLanguages=", ")");
    }
}
