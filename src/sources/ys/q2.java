package ys;

import com.lingodeer.data.model.CoursePracticeType;
import java.util.List;
import rt.r8;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f58223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f58224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoursePracticeType f58225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f58226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f58227e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f58228f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f58229g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r8 f58230h;

    public q2(long j11, long j12, CoursePracticeType practiceType, String regex, int i11, List reviews, List testOutUnitIds, r8 r8Var) {
        kotlin.jvm.internal.m.f(practiceType, "practiceType");
        kotlin.jvm.internal.m.f(regex, "regex");
        kotlin.jvm.internal.m.f(reviews, "reviews");
        kotlin.jvm.internal.m.f(testOutUnitIds, "testOutUnitIds");
        this.f58223a = j11;
        this.f58224b = j12;
        this.f58225c = practiceType;
        this.f58226d = regex;
        this.f58227e = i11;
        this.f58228f = reviews;
        this.f58229g = testOutUnitIds;
        this.f58230h = r8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2)) {
            return false;
        }
        q2 q2Var = (q2) obj;
        return this.f58223a == q2Var.f58223a && this.f58224b == q2Var.f58224b && this.f58225c == q2Var.f58225c && kotlin.jvm.internal.m.a(this.f58226d, q2Var.f58226d) && this.f58227e == q2Var.f58227e && kotlin.jvm.internal.m.a(this.f58228f, q2Var.f58228f) && kotlin.jvm.internal.m.a(this.f58229g, q2Var.f58229g) && this.f58230h == q2Var.f58230h;
    }

    public final int hashCode() {
        int iB = hh.p0.b(hh.p0.b(defpackage.e.b(this.f58227e, defpackage.e.d((this.f58225c.hashCode() + defpackage.e.f(this.f58224b, Long.hashCode(this.f58223a) * 31, 31)) * 31, 31, this.f58226d), 31), 31, this.f58228f), 31, this.f58229g);
        r8 r8Var = this.f58230h;
        return iB + (r8Var == null ? 0 : r8Var.hashCode());
    }

    public final String toString() {
        StringBuilder sbJ = w4.c.j(this.f58223a, "CourseTestRouteParameters(lessonId=", ", unitId=");
        sbJ.append(this.f58224b);
        sbJ.append(", practiceType=");
        sbJ.append(this.f58225c);
        sbJ.append(", regex=");
        sbJ.append(this.f58226d);
        sbJ.append(", elemType=");
        sbJ.append(this.f58227e);
        sbJ.append(", reviews=");
        sbJ.append(this.f58228f);
        sbJ.append(", testOutUnitIds=");
        sbJ.append(this.f58229g);
        sbJ.append(", practiceModelOverride=");
        sbJ.append(this.f58230h);
        sbJ.append(")");
        return sbJ.toString();
    }

    public /* synthetic */ q2(long j11, long j12, CoursePracticeType coursePracticeType, String str, List list) {
        this(j11, j12, coursePracticeType, str, -1, ry.r.f50854a, list, null);
    }
}
