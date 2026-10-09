package rt;

import com.lingodeer.data.model.CourseUnit;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f4 implements g4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CourseUnit f49723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f49724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uf f49725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ee f49726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f49727e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f49728f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ed f49729g;

    public f4(CourseUnit courseUnit, List learnLessons, uf ufVar, ee eeVar, List list, boolean z11, ed edVar) {
        kotlin.jvm.internal.m.f(courseUnit, "courseUnit");
        kotlin.jvm.internal.m.f(learnLessons, "learnLessons");
        this.f49723a = courseUnit;
        this.f49724b = learnLessons;
        this.f49725c = ufVar;
        this.f49726d = eeVar;
        this.f49727e = list;
        this.f49728f = z11;
        this.f49729g = edVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f4)) {
            return false;
        }
        f4 f4Var = (f4) obj;
        return kotlin.jvm.internal.m.a(this.f49723a, f4Var.f49723a) && kotlin.jvm.internal.m.a(this.f49724b, f4Var.f49724b) && kotlin.jvm.internal.m.a(this.f49725c, f4Var.f49725c) && kotlin.jvm.internal.m.a(this.f49726d, f4Var.f49726d) && this.f49727e.equals(f4Var.f49727e) && this.f49728f == f4Var.f49728f && this.f49729g.equals(f4Var.f49729g);
    }

    public final int hashCode() {
        int iB = hh.p0.b(this.f49723a.hashCode() * 31, 31, this.f49724b);
        uf ufVar = this.f49725c;
        int iHashCode = (iB + (ufVar == null ? 0 : ufVar.hashCode())) * 31;
        ee eeVar = this.f49726d;
        return this.f49729g.hashCode() + defpackage.e.e(defpackage.e.e((this.f49727e.hashCode() + ((iHashCode + (eeVar == null ? 0 : eeVar.hashCode())) * 31)) * 31, 31, false), 31, this.f49728f);
    }

    public final String toString() {
        return "Success(courseUnit=" + this.f49723a + ", learnLessons=" + this.f49724b + ", tipsLesson=" + this.f49725c + ", dialogueLesson=" + this.f49726d + ", storyLessons=" + this.f49727e + ", hasWordReviews=false, hasReadTips=" + this.f49728f + ", courseUnitColors=" + this.f49729g + ")";
    }
}
