package zr;

import com.lingodeer.data.model.CourseCharacterGroup;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class u implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f59325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CourseCharacterGroup f59326b;

    public u(String query, CourseCharacterGroup courseCharacterGroup) {
        kotlin.jvm.internal.m.f(query, "query");
        this.f59325a = query;
        this.f59326b = courseCharacterGroup;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return kotlin.jvm.internal.m.a(this.f59325a, uVar.f59325a) && kotlin.jvm.internal.m.a(this.f59326b, uVar.f59326b);
    }

    public final int hashCode() {
        return this.f59326b.hashCode() + (this.f59325a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(query=" + this.f59325a + ", resultGroup=" + this.f59326b + ")";
    }
}
