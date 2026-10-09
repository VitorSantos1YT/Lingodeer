package rt;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final me f50400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ke f50401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f50402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f50403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final se f50404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f50405f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f50406g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f50407h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Set f50408i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Set f50409j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f50410k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f50411l;
    public final ne m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f50412n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f50413o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f50414p;

    public t1(me displayMode, ke contentTab, boolean z11, String query, se scheduleFilter, LinkedHashMap linkedHashMap, List timeItems, List unitGroups, Set set, Set set2, int i11, boolean z12, ne neVar, boolean z13, boolean z14, boolean z15) {
        kotlin.jvm.internal.m.f(displayMode, "displayMode");
        kotlin.jvm.internal.m.f(contentTab, "contentTab");
        kotlin.jvm.internal.m.f(query, "query");
        kotlin.jvm.internal.m.f(scheduleFilter, "scheduleFilter");
        kotlin.jvm.internal.m.f(timeItems, "timeItems");
        kotlin.jvm.internal.m.f(unitGroups, "unitGroups");
        this.f50400a = displayMode;
        this.f50401b = contentTab;
        this.f50402c = z11;
        this.f50403d = query;
        this.f50404e = scheduleFilter;
        this.f50405f = linkedHashMap;
        this.f50406g = timeItems;
        this.f50407h = unitGroups;
        this.f50408i = set;
        this.f50409j = set2;
        this.f50410k = i11;
        this.f50411l = z12;
        this.m = neVar;
        this.f50412n = z13;
        this.f50413o = z14;
        this.f50414p = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return this.f50400a == t1Var.f50400a && this.f50401b == t1Var.f50401b && this.f50402c == t1Var.f50402c && kotlin.jvm.internal.m.a(this.f50403d, t1Var.f50403d) && kotlin.jvm.internal.m.a(this.f50404e, t1Var.f50404e) && this.f50405f.equals(t1Var.f50405f) && kotlin.jvm.internal.m.a(this.f50406g, t1Var.f50406g) && kotlin.jvm.internal.m.a(this.f50407h, t1Var.f50407h) && this.f50408i.equals(t1Var.f50408i) && this.f50409j.equals(t1Var.f50409j) && this.f50410k == t1Var.f50410k && this.f50411l == t1Var.f50411l && kotlin.jvm.internal.m.a(this.m, t1Var.m) && this.f50412n == t1Var.f50412n && this.f50413o == t1Var.f50413o && this.f50414p == t1Var.f50414p;
    }

    public final int hashCode() {
        int iE = defpackage.e.e(defpackage.e.b(this.f50410k, (this.f50409j.hashCode() + ((this.f50408i.hashCode() + hh.p0.b(hh.p0.b((this.f50405f.hashCode() + ((this.f50404e.hashCode() + defpackage.e.d(defpackage.e.e((this.f50401b.hashCode() + (this.f50400a.hashCode() * 31)) * 31, 31, this.f50402c), 31, this.f50403d)) * 31)) * 31, 31, this.f50406g), 31, this.f50407h)) * 31)) * 31, 31), 31, this.f50411l);
        ne neVar = this.m;
        return Boolean.hashCode(this.f50414p) + defpackage.e.e(defpackage.e.e((iE + (neVar == null ? 0 : neVar.f50158a.hashCode())) * 31, 31, this.f50412n), 31, this.f50413o);
    }

    public final String toString() {
        return "FutureReviewIntermediateState(displayMode=" + this.f50400a + ", contentTab=" + this.f50401b + ", isSearchExpanded=" + this.f50402c + ", query=" + this.f50403d + ", scheduleFilter=" + this.f50404e + ", tabContents=" + this.f50405f + ", timeItems=" + this.f50406g + ", unitGroups=" + this.f50407h + ", selectedIds=" + this.f50408i + ", expandedUnitIds=" + this.f50409j + ", selectableCount=" + this.f50410k + ", areAllVisibleItemsSelected=" + this.f50411l + ", editingState=" + this.m + ", hasSearchResult=" + this.f50412n + ", hasVisibleItems=" + this.f50413o + ", isEmpty=" + this.f50414p + ")";
    }
}
