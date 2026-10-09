package ot;

import com.lingodeer.data.model.CourseCharacter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j0 extends j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ht.o f45860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CourseCharacter f45861b;

    public j0(ht.o courseTestParams, CourseCharacter data) {
        kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
        kotlin.jvm.internal.m.f(data, "data");
        this.f45860a = courseTestParams;
        this.f45861b = data;
    }

    @Override // ot.j1
    public final ht.o a() {
        return this.f45860a;
    }

    public final CourseCharacter b() {
        return this.f45861b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return kotlin.jvm.internal.m.a(this.f45860a, j0Var.f45860a) && kotlin.jvm.internal.m.a(this.f45861b, j0Var.f45861b);
    }

    public final int hashCode() {
        return this.f45861b.hashCode() + (this.f45860a.hashCode() * 31);
    }

    public final String toString() {
        return "CharacterCNModel(courseTestParams=" + this.f45860a + ", data=" + this.f45861b + ")";
    }
}
