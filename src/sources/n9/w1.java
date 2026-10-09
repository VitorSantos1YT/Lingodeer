package n9;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f43728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f43729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c7.j f43730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f43731d;

    public w1(List list, Integer num, c7.j jVar, int i11) {
        this.f43728a = list;
        this.f43729b = num;
        this.f43730c = jVar;
        this.f43731d = i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj;
        return kotlin.jvm.internal.m.a(this.f43728a, w1Var.f43728a) && kotlin.jvm.internal.m.a(this.f43729b, w1Var.f43729b) && kotlin.jvm.internal.m.a(this.f43730c, w1Var.f43730c) && this.f43731d == w1Var.f43731d;
    }

    public final int hashCode() {
        int iHashCode = this.f43728a.hashCode();
        Integer num = this.f43729b;
        return Integer.hashCode(this.f43731d) + this.f43730c.hashCode() + iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PagingState(pages=");
        sb2.append(this.f43728a);
        sb2.append(", anchorPosition=");
        sb2.append(this.f43729b);
        sb2.append(", config=");
        sb2.append(this.f43730c);
        sb2.append(", leadingPlaceholderCount=");
        return ep.a.j(sb2, this.f43731d, ')');
    }
}
