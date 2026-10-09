package rt;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f50163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final me f50164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ke f50165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f50166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f50167e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f50168f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f50169g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f50170h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Set f50171i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Set f50172j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f50173k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f50174l;
    public final boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final se f50175n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ne f50176o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f50177p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f50178q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f50179r;

    public o1(boolean z11, me displayMode, ke contentTab, boolean z12, String query, Map tabContents, List timeItems, List unitGroups, Set selectedIds, Set expandedUnitIds, int i11, int i12, boolean z13, se scheduleFilter, ne neVar, boolean z14, boolean z15, boolean z16) {
        kotlin.jvm.internal.m.f(displayMode, "displayMode");
        kotlin.jvm.internal.m.f(contentTab, "contentTab");
        kotlin.jvm.internal.m.f(query, "query");
        kotlin.jvm.internal.m.f(tabContents, "tabContents");
        kotlin.jvm.internal.m.f(timeItems, "timeItems");
        kotlin.jvm.internal.m.f(unitGroups, "unitGroups");
        kotlin.jvm.internal.m.f(selectedIds, "selectedIds");
        kotlin.jvm.internal.m.f(expandedUnitIds, "expandedUnitIds");
        kotlin.jvm.internal.m.f(scheduleFilter, "scheduleFilter");
        this.f50163a = z11;
        this.f50164b = displayMode;
        this.f50165c = contentTab;
        this.f50166d = z12;
        this.f50167e = query;
        this.f50168f = tabContents;
        this.f50169g = timeItems;
        this.f50170h = unitGroups;
        this.f50171i = selectedIds;
        this.f50172j = expandedUnitIds;
        this.f50173k = i11;
        this.f50174l = i12;
        this.m = z13;
        this.f50175n = scheduleFilter;
        this.f50176o = neVar;
        this.f50177p = z14;
        this.f50178q = z15;
        this.f50179r = z16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return this.f50163a == o1Var.f50163a && this.f50164b == o1Var.f50164b && this.f50165c == o1Var.f50165c && this.f50166d == o1Var.f50166d && kotlin.jvm.internal.m.a(this.f50167e, o1Var.f50167e) && kotlin.jvm.internal.m.a(this.f50168f, o1Var.f50168f) && kotlin.jvm.internal.m.a(this.f50169g, o1Var.f50169g) && kotlin.jvm.internal.m.a(this.f50170h, o1Var.f50170h) && kotlin.jvm.internal.m.a(this.f50171i, o1Var.f50171i) && kotlin.jvm.internal.m.a(this.f50172j, o1Var.f50172j) && this.f50173k == o1Var.f50173k && this.f50174l == o1Var.f50174l && this.m == o1Var.m && kotlin.jvm.internal.m.a(this.f50175n, o1Var.f50175n) && kotlin.jvm.internal.m.a(this.f50176o, o1Var.f50176o) && this.f50177p == o1Var.f50177p && this.f50178q == o1Var.f50178q && this.f50179r == o1Var.f50179r;
    }

    public final int hashCode() {
        int iHashCode = (this.f50175n.hashCode() + defpackage.e.e(defpackage.e.b(this.f50174l, defpackage.e.b(this.f50173k, (this.f50172j.hashCode() + ((this.f50171i.hashCode() + hh.p0.b(hh.p0.b((this.f50168f.hashCode() + defpackage.e.d(defpackage.e.e((this.f50165c.hashCode() + ((this.f50164b.hashCode() + (Boolean.hashCode(this.f50163a) * 31)) * 31)) * 31, 31, this.f50166d), 31, this.f50167e)) * 31, 31, this.f50169g), 31, this.f50170h)) * 31)) * 31, 31), 31), 31, this.m)) * 31;
        ne neVar = this.f50176o;
        return Boolean.hashCode(this.f50179r) + defpackage.e.e(defpackage.e.e((iHashCode + (neVar == null ? 0 : neVar.f50158a.hashCode())) * 31, 31, this.f50177p), 31, this.f50178q);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CourseFlashCardFutureReviewUiState(showCharacterTab=");
        sb2.append(this.f50163a);
        sb2.append(", displayMode=");
        sb2.append(this.f50164b);
        sb2.append(", contentTab=");
        sb2.append(this.f50165c);
        sb2.append(", isSearchExpanded=");
        sb2.append(this.f50166d);
        sb2.append(", query=");
        sb2.append(this.f50167e);
        sb2.append(", tabContents=");
        sb2.append(this.f50168f);
        sb2.append(", timeItems=");
        sb2.append(this.f50169g);
        sb2.append(", unitGroups=");
        sb2.append(this.f50170h);
        sb2.append(", selectedIds=");
        sb2.append(this.f50171i);
        sb2.append(", expandedUnitIds=");
        sb2.append(this.f50172j);
        sb2.append(", selectedCount=");
        ep.a.v(this.f50173k, this.f50174l, ", selectableCount=", ", areAllVisibleItemsSelected=", sb2);
        sb2.append(this.m);
        sb2.append(", scheduleFilter=");
        sb2.append(this.f50175n);
        sb2.append(", editingState=");
        sb2.append(this.f50176o);
        sb2.append(", hasSearchResult=");
        sb2.append(this.f50177p);
        sb2.append(", hasVisibleItems=");
        sb2.append(this.f50178q);
        sb2.append(", isEmpty=");
        sb2.append(this.f50179r);
        sb2.append(")");
        return sb2.toString();
    }
}
