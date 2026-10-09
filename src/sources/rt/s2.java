package rt;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f50370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f50371b;

    public s2(List reviews, Map map) {
        kotlin.jvm.internal.m.f(reviews, "reviews");
        this.f50370a = reviews;
        this.f50371b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2)) {
            return false;
        }
        s2 s2Var = (s2) obj;
        return kotlin.jvm.internal.m.a(this.f50370a, s2Var.f50370a) && kotlin.jvm.internal.m.a(this.f50371b, s2Var.f50371b);
    }

    public final int hashCode() {
        return this.f50371b.hashCode() + (this.f50370a.hashCode() * 31);
    }

    public final String toString() {
        return "CourseFlashCardSessionSnapshot(reviews=" + this.f50370a + ", preloadedUnitInfoById=" + this.f50371b + ")";
    }
}
