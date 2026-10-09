package rt;

import com.google.firebase.iid.QyE.SemtNwfPgIhi;
import com.lingodeer.data.model.CourseUnit;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CourseUnit f49920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f49921b;

    public j6(CourseUnit courseUnit, LinkedHashMap linkedHashMap) {
        kotlin.jvm.internal.m.f(courseUnit, "courseUnit");
        this.f49920a = courseUnit;
        this.f49921b = linkedHashMap;
    }

    public final List a(x8 reviewType) {
        kotlin.jvm.internal.m.f(reviewType, "reviewType");
        List list = (List) this.f49921b.get(reviewType);
        return list == null ? ry.r.f50854a : list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6)) {
            return false;
        }
        j6 j6Var = (j6) obj;
        return kotlin.jvm.internal.m.a(this.f49920a, j6Var.f49920a) && this.f49921b.equals(j6Var.f49921b);
    }

    public final int hashCode() {
        return this.f49921b.hashCode() + (this.f49920a.hashCode() * 31);
    }

    public final String toString() {
        return SemtNwfPgIhi.RLifTEVCdxqvANC + this.f49920a + ", reviewsByType=" + this.f49921b + ")";
    }
}
