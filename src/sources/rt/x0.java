package rt;

import com.google.firebase.iid.QyE.SemtNwfPgIhi;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class x0 implements y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f50599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f50600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f50601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f50602d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f50603e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f50604f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f50605g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f50606h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f50607i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f50608j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f50609k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f50610l;
    public final Object m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f50611n;

    public x0(List list, List allTypes, int i11, List list2, List focTypes, boolean z11, boolean z12, boolean z13, List list3, List list4, List list5, List list6, List list7, List list8) {
        kotlin.jvm.internal.m.f(allTypes, "allTypes");
        kotlin.jvm.internal.m.f(focTypes, "focTypes");
        this.f50599a = list;
        this.f50600b = allTypes;
        this.f50601c = i11;
        this.f50602d = list2;
        this.f50603e = focTypes;
        this.f50604f = z11;
        this.f50605g = z12;
        this.f50606h = z13;
        this.f50607i = list3;
        this.f50608j = list4;
        this.f50609k = list5;
        this.f50610l = list6;
        this.m = list7;
        this.f50611n = list8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return this.f50599a.equals(x0Var.f50599a) && kotlin.jvm.internal.m.a(this.f50600b, x0Var.f50600b) && this.f50601c == x0Var.f50601c && this.f50602d.equals(x0Var.f50602d) && kotlin.jvm.internal.m.a(this.f50603e, x0Var.f50603e) && this.f50604f == x0Var.f50604f && this.f50605g == x0Var.f50605g && this.f50606h == x0Var.f50606h && this.f50607i.equals(x0Var.f50607i) && this.f50608j.equals(x0Var.f50608j) && this.f50609k.equals(x0Var.f50609k) && this.f50610l.equals(x0Var.f50610l) && this.m.equals(x0Var.m) && this.f50611n.equals(x0Var.f50611n);
    }

    public final int hashCode() {
        return this.f50611n.hashCode() + ((this.m.hashCode() + ((this.f50610l.hashCode() + hh.p0.b(hh.p0.b(hh.p0.b(defpackage.e.e(defpackage.e.e(defpackage.e.e(hh.p0.b(hh.p0.b(defpackage.e.b(this.f50601c, hh.p0.b(this.f50599a.hashCode() * 31, 31, this.f50600b), 31), 31, this.f50602d), 31, this.f50603e), 31, this.f50604f), 31, this.f50605g), 31, this.f50606h), 31, this.f50607i), 31, this.f50608j), 31, this.f50609k)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Success(activeUnits=");
        sb2.append(this.f50599a);
        sb2.append(", allTypes=");
        sb2.append(this.f50600b);
        sb2.append(", practiceCount=");
        sb2.append(this.f50601c);
        sb2.append(", focUnits=");
        sb2.append(this.f50602d);
        sb2.append(", focTypes=");
        sb2.append(this.f50603e);
        sb2.append(", focusWeak=");
        sb2.append(this.f50604f);
        sb2.append(", focusGood=");
        ep.a.B(", focusPerfect=", SemtNwfPgIhi.dNhKWuNIlsPcM, sb2, this.f50605g, this.f50606h);
        sb2.append(this.f50607i);
        sb2.append(", goodReviews=");
        sb2.append(this.f50608j);
        sb2.append(", perfectReviews=");
        sb2.append(this.f50609k);
        sb2.append(", selectedWeakReviews=");
        sb2.append(this.f50610l);
        sb2.append(", selectedGoodReviews=");
        sb2.append(this.m);
        sb2.append(", selectedPerfectReviews=");
        sb2.append(this.f50611n);
        sb2.append(")");
        return sb2.toString();
    }
}
