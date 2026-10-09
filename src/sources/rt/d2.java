package rt;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f49604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f49605b;

    public d2(ArrayList arrayList, ArrayList arrayList2) {
        this.f49604a = arrayList;
        this.f49605b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj;
        return this.f49604a.equals(d2Var.f49604a) && this.f49605b.equals(d2Var.f49605b);
    }

    public final int hashCode() {
        return this.f49605b.hashCode() + (this.f49604a.hashCode() * 31);
    }

    public final String toString() {
        return "CourseFlashCardIndexResolution(validReviews=" + this.f49604a + ", invalidStatuses=" + this.f49605b + ")";
    }
}
