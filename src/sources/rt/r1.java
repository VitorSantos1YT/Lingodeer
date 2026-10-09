package rt;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f50323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final me f50324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ke f50325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f50326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f50327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final se f50328f;

    public r1(List items, me displayMode, ke contentTab, boolean z11, String query, se scheduleFilter) {
        kotlin.jvm.internal.m.f(items, "items");
        kotlin.jvm.internal.m.f(displayMode, "displayMode");
        kotlin.jvm.internal.m.f(contentTab, "contentTab");
        kotlin.jvm.internal.m.f(query, "query");
        kotlin.jvm.internal.m.f(scheduleFilter, "scheduleFilter");
        this.f50323a = items;
        this.f50324b = displayMode;
        this.f50325c = contentTab;
        this.f50326d = z11;
        this.f50327e = query;
        this.f50328f = scheduleFilter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj;
        return kotlin.jvm.internal.m.a(this.f50323a, r1Var.f50323a) && this.f50324b == r1Var.f50324b && this.f50325c == r1Var.f50325c && this.f50326d == r1Var.f50326d && kotlin.jvm.internal.m.a(this.f50327e, r1Var.f50327e) && kotlin.jvm.internal.m.a(this.f50328f, r1Var.f50328f);
    }

    public final int hashCode() {
        return this.f50328f.hashCode() + defpackage.e.d(defpackage.e.e((this.f50325c.hashCode() + ((this.f50324b.hashCode() + (this.f50323a.hashCode() * 31)) * 31)) * 31, 31, this.f50326d), 31, this.f50327e);
    }

    public final String toString() {
        return "FutureReviewFilterInput(items=" + this.f50323a + ", displayMode=" + this.f50324b + ", contentTab=" + this.f50325c + ", isSearchExpanded=" + this.f50326d + ", query=" + this.f50327e + ", scheduleFilter=" + this.f50328f + ")";
    }
}
