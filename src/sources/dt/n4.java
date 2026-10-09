package dt;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f24040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f24041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fz.c f24042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fz.c f24043d;

    public n4(Map map, boolean z11, fz.c onClickUserRating, fz.c playSoundEffect) {
        kotlin.jvm.internal.m.f(onClickUserRating, "onClickUserRating");
        kotlin.jvm.internal.m.f(playSoundEffect, "playSoundEffect");
        this.f24040a = map;
        this.f24041b = z11;
        this.f24042c = onClickUserRating;
        this.f24043d = playSoundEffect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4)) {
            return false;
        }
        n4 n4Var = (n4) obj;
        return this.f24040a.equals(n4Var.f24040a) && this.f24041b == n4Var.f24041b && kotlin.jvm.internal.m.a(this.f24042c, n4Var.f24042c) && kotlin.jvm.internal.m.a(this.f24043d, n4Var.f24043d);
    }

    public final int hashCode() {
        return this.f24043d.hashCode() + ((this.f24042c.hashCode() + defpackage.e.e(this.f24040a.hashCode() * 31, 31, this.f24041b)) * 31);
    }

    public final String toString() {
        return "CourseTestSrsResultActions(userRatingMap=" + this.f24040a + ", showNextReviewTime=" + this.f24041b + ", onClickUserRating=" + this.f24042c + ", playSoundEffect=" + this.f24043d + ")";
    }
}
