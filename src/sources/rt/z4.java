package rt;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class z4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f50760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f50761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f50762c;

    public z4(ArrayList arrayList, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        this.f50760a = arrayList;
        this.f50761b = linkedHashMap;
        this.f50762c = linkedHashMap2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4)) {
            return false;
        }
        z4 z4Var = (z4) obj;
        return this.f50760a.equals(z4Var.f50760a) && this.f50761b.equals(z4Var.f50761b) && this.f50762c.equals(z4Var.f50762c);
    }

    public final int hashCode() {
        return this.f50762c.hashCode() + ((this.f50761b.hashCode() + (this.f50760a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CourseListenAlongSourceSnapshot(units=" + this.f50760a + ", sentenceReviewsByUnitId=" + this.f50761b + ", wordReviewsByUnitId=" + this.f50762c + ")";
    }
}
