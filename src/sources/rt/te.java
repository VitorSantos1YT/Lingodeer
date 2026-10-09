package rt;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class te {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f50457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f50458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f50459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f50460d;

    public te(List timeItems, List unitGroups, boolean z11, boolean z12) {
        kotlin.jvm.internal.m.f(timeItems, "timeItems");
        kotlin.jvm.internal.m.f(unitGroups, "unitGroups");
        this.f50457a = timeItems;
        this.f50458b = unitGroups;
        this.f50459c = z11;
        this.f50460d = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof te)) {
            return false;
        }
        te teVar = (te) obj;
        return kotlin.jvm.internal.m.a(this.f50457a, teVar.f50457a) && kotlin.jvm.internal.m.a(this.f50458b, teVar.f50458b) && this.f50459c == teVar.f50459c && this.f50460d == teVar.f50460d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f50460d) + defpackage.e.e(hh.p0.b(this.f50457a.hashCode() * 31, 31, this.f50458b), 31, this.f50459c);
    }

    public final String toString() {
        return "FutureReviewTabContentUi(timeItems=" + this.f50457a + ", unitGroups=" + this.f50458b + ", hasSearchResult=" + this.f50459c + ", hasVisibleItems=" + this.f50460d + ")";
    }
}
