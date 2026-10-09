package ys;

import com.lingodeer.data.model.AchievementLevel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o0 implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AchievementLevel f58191a;

    public o0(AchievementLevel achievement) {
        kotlin.jvm.internal.m.f(achievement, "achievement");
        this.f58191a = achievement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0) && kotlin.jvm.internal.m.a(this.f58191a, ((o0) obj).f58191a);
    }

    public final int hashCode() {
        return this.f58191a.hashCode();
    }

    public final String toString() {
        return "Achievement(achievement=" + this.f58191a + ")";
    }
}
