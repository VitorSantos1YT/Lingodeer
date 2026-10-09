package rt;

import com.lingodeer.data.model.CourseUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class kd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CourseUnit f49992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f49993b;

    public kd(CourseUnit courseUnit, int i11) {
        kotlin.jvm.internal.m.f(courseUnit, "courseUnit");
        this.f49992a = courseUnit;
        this.f49993b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kd)) {
            return false;
        }
        kd kdVar = (kd) obj;
        return kotlin.jvm.internal.m.a(this.f49992a, kdVar.f49992a) && this.f49993b == kdVar.f49993b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f49993b) + (this.f49992a.hashCode() * 31);
    }

    public final String toString() {
        return "CourseUnitTipsData(courseUnit=" + this.f49992a + ", posterUnitSortIndex=" + this.f49993b + ")";
    }
}
