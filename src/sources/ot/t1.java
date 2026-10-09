package ot;

import com.lingodeer.data.model.CourseWord;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CourseWord f45997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CourseWord f45998b;

    public t1(CourseWord word, CourseWord option) {
        kotlin.jvm.internal.m.f(word, "word");
        kotlin.jvm.internal.m.f(option, "option");
        this.f45997a = word;
        this.f45998b = option;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return kotlin.jvm.internal.m.a(this.f45997a, t1Var.f45997a) && kotlin.jvm.internal.m.a(this.f45998b, t1Var.f45998b);
    }

    public final int hashCode() {
        return this.f45998b.hashCode() + (this.f45997a.hashCode() * 31);
    }

    public final String toString() {
        return "CourseWordJudge(word=" + this.f45997a + ", option=" + this.f45998b + ")";
    }
}
