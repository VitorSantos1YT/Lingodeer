package rt;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final me f50356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ke f50357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f50358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f50359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final se f50360e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f50361f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f50362g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f50363h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Set f50364i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Set f50365j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f50366k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f50367l;
    public final boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f50368n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f50369o;

    public s1(me displayMode, ke contentTab, boolean z11, String query, se scheduleFilter, LinkedHashMap linkedHashMap, List timeItems, List unitGroups, Set set, Set set2, int i11, boolean z12, boolean z13, boolean z14, boolean z15) {
        kotlin.jvm.internal.m.f(displayMode, "displayMode");
        kotlin.jvm.internal.m.f(contentTab, "contentTab");
        kotlin.jvm.internal.m.f(query, "query");
        kotlin.jvm.internal.m.f(scheduleFilter, "scheduleFilter");
        kotlin.jvm.internal.m.f(timeItems, "timeItems");
        kotlin.jvm.internal.m.f(unitGroups, "unitGroups");
        this.f50356a = displayMode;
        this.f50357b = contentTab;
        this.f50358c = z11;
        this.f50359d = query;
        this.f50360e = scheduleFilter;
        this.f50361f = linkedHashMap;
        this.f50362g = timeItems;
        this.f50363h = unitGroups;
        this.f50364i = set;
        this.f50365j = set2;
        this.f50366k = i11;
        this.f50367l = z12;
        this.m = z13;
        this.f50368n = z14;
        this.f50369o = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj;
        return this.f50356a == s1Var.f50356a && this.f50357b == s1Var.f50357b && this.f50358c == s1Var.f50358c && kotlin.jvm.internal.m.a(this.f50359d, s1Var.f50359d) && kotlin.jvm.internal.m.a(this.f50360e, s1Var.f50360e) && this.f50361f.equals(s1Var.f50361f) && kotlin.jvm.internal.m.a(this.f50362g, s1Var.f50362g) && kotlin.jvm.internal.m.a(this.f50363h, s1Var.f50363h) && this.f50364i.equals(s1Var.f50364i) && this.f50365j.equals(s1Var.f50365j) && this.f50366k == s1Var.f50366k && this.f50367l == s1Var.f50367l && this.m == s1Var.m && this.f50368n == s1Var.f50368n && this.f50369o == s1Var.f50369o;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f50369o) + defpackage.e.e(defpackage.e.e(defpackage.e.e(defpackage.e.b(this.f50366k, (this.f50365j.hashCode() + ((this.f50364i.hashCode() + hh.p0.b(hh.p0.b((this.f50361f.hashCode() + ((this.f50360e.hashCode() + defpackage.e.d(defpackage.e.e((this.f50357b.hashCode() + (this.f50356a.hashCode() * 31)) * 31, 31, this.f50358c), 31, this.f50359d)) * 31)) * 31, 31, this.f50362g), 31, this.f50363h)) * 31)) * 31, 31), 31, this.f50367l), 31, this.m), 31, this.f50368n);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FutureReviewFilteredState(displayMode=");
        sb2.append(this.f50356a);
        sb2.append(", contentTab=");
        sb2.append(this.f50357b);
        sb2.append(", isSearchExpanded=");
        sb2.append(this.f50358c);
        sb2.append(", query=");
        sb2.append(this.f50359d);
        sb2.append(", scheduleFilter=");
        sb2.append(this.f50360e);
        sb2.append(", tabContents=");
        sb2.append(this.f50361f);
        sb2.append(", timeItems=");
        sb2.append(this.f50362g);
        sb2.append(", unitGroups=");
        sb2.append(this.f50363h);
        sb2.append(", selectedIds=");
        sb2.append(this.f50364i);
        sb2.append(", expandedUnitIds=");
        sb2.append(this.f50365j);
        sb2.append(", selectableCount=");
        sb2.append(this.f50366k);
        sb2.append(", areAllVisibleItemsSelected=");
        sb2.append(this.f50367l);
        sb2.append(", hasSearchResult=");
        ep.a.B(", hasVisibleItems=", ", isEmpty=", sb2, this.m, this.f50368n);
        return hh.p0.p(sb2, this.f50369o, ")");
    }
}
