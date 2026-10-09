package zu;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a0 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f59372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f59373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f59374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f59375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f59376e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f59377f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f59378g;

    public a0(int i11, int i12, List lastSevenDailies, int i13, int i14, List list, List list2) {
        kotlin.jvm.internal.m.f(lastSevenDailies, "lastSevenDailies");
        this.f59372a = i11;
        this.f59373b = i12;
        this.f59374c = lastSevenDailies;
        this.f59375d = i13;
        this.f59376e = i14;
        this.f59377f = list;
        this.f59378g = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f59372a == a0Var.f59372a && this.f59373b == a0Var.f59373b && kotlin.jvm.internal.m.a(this.f59374c, a0Var.f59374c) && this.f59375d == a0Var.f59375d && this.f59376e == a0Var.f59376e && kotlin.jvm.internal.m.a(this.f59377f, a0Var.f59377f) && kotlin.jvm.internal.m.a(this.f59378g, a0Var.f59378g);
    }

    public final int hashCode() {
        return this.f59378g.hashCode() + hh.p0.b(defpackage.e.b(this.f59376e, defpackage.e.b(this.f59375d, hh.p0.b(defpackage.e.b(this.f59373b, Integer.hashCode(this.f59372a) * 31, 31), 31, this.f59374c), 31), 31), 31, this.f59377f);
    }

    public final String toString() {
        StringBuilder sbK = w4.c.k("Success(totalXP=", this.f59372a, ", totalLearnTime=", this.f59373b, ", lastSevenDailies=");
        sbK.append(this.f59374c);
        sbK.append(", weeklyXP=");
        sbK.append(this.f59375d);
        sbK.append(", weeklyLearnTime=");
        sbK.append(this.f59376e);
        sbK.append(", weekDailies=");
        sbK.append(this.f59377f);
        sbK.append(", historyDailies=");
        return b7.e0.n(sbK, this.f59378g, ")");
    }
}
