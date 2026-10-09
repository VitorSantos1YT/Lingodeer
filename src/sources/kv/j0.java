package kv;

import com.lingodeer.data.model.SyllableLessonStatus;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f38762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x0 f38763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f38764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f38765f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SyllableLessonStatus f38766g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s0 f38767h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f38768i;

    public j0(String str, int i11, String str2, x0 x0Var, List list, List list2, SyllableLessonStatus status, s0 script, boolean z11) {
        kotlin.jvm.internal.m.f(status, "status");
        kotlin.jvm.internal.m.f(script, "script");
        this.f38760a = str;
        this.f38761b = i11;
        this.f38762c = str2;
        this.f38763d = x0Var;
        this.f38764e = list;
        this.f38765f = list2;
        this.f38766g = status;
        this.f38767h = script;
        this.f38768i = z11;
    }

    public static j0 a(j0 j0Var, String lessonID, int i11, String title, x0 x0Var, List list, List list2, SyllableLessonStatus syllableLessonStatus, s0 script, int i12) {
        if ((i12 & 2) != 0) {
            i11 = j0Var.f38761b;
        }
        int i13 = i11;
        SyllableLessonStatus status = (i12 & 64) != 0 ? j0Var.f38766g : syllableLessonStatus;
        boolean z11 = j0Var.f38768i;
        j0Var.getClass();
        kotlin.jvm.internal.m.f(lessonID, "lessonID");
        kotlin.jvm.internal.m.f(title, "title");
        kotlin.jvm.internal.m.f(status, "status");
        kotlin.jvm.internal.m.f(script, "script");
        return new j0(lessonID, i13, title, x0Var, list, list2, status, script, z11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return this.f38760a.equals(j0Var.f38760a) && this.f38761b == j0Var.f38761b && this.f38762c.equals(j0Var.f38762c) && this.f38763d.equals(j0Var.f38763d) && this.f38764e.equals(j0Var.f38764e) && this.f38765f.equals(j0Var.f38765f) && this.f38766g == j0Var.f38766g && this.f38767h == j0Var.f38767h && this.f38768i == j0Var.f38768i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f38768i) + ((this.f38767h.hashCode() + ((this.f38766g.hashCode() + hh.p0.b(hh.p0.b((this.f38763d.hashCode() + defpackage.e.d(defpackage.e.b(this.f38761b, this.f38760a.hashCode() * 31, 31), 31, this.f38762c)) * 31, 31, this.f38764e), 31, this.f38765f)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = defpackage.e.q(this.f38761b, "JPSyllableLessonContent(lessonID=", this.f38760a, ", sortIndex=", ", title=");
        sbQ.append(this.f38762c);
        sbQ.append(", description=");
        sbQ.append(this.f38763d);
        sbQ.append(", introSections=");
        sbQ.append(this.f38764e);
        sbQ.append(", models=");
        sbQ.append(this.f38765f);
        sbQ.append(", status=");
        sbQ.append(this.f38766g);
        sbQ.append(", script=");
        sbQ.append(this.f38767h);
        sbQ.append(", isExam=");
        return hh.p0.p(sbQ, this.f38768i, ")");
    }
}
