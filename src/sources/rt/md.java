package rt;

import dl.ExOZ.xItStCyvVEZ;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class md implements nd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f50095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f50096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f50097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f50098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ye f50099f;

    public md(String tips, int i11, int i12, int i13, boolean z11, ye posterState) {
        kotlin.jvm.internal.m.f(tips, "tips");
        kotlin.jvm.internal.m.f(posterState, "posterState");
        this.f50094a = tips;
        this.f50095b = i11;
        this.f50096c = i12;
        this.f50097d = i13;
        this.f50098e = z11;
        this.f50099f = posterState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof md)) {
            return false;
        }
        md mdVar = (md) obj;
        return kotlin.jvm.internal.m.a(this.f50094a, mdVar.f50094a) && this.f50095b == mdVar.f50095b && this.f50096c == mdVar.f50096c && this.f50097d == mdVar.f50097d && this.f50098e == mdVar.f50098e && kotlin.jvm.internal.m.a(this.f50099f, mdVar.f50099f);
    }

    public final int hashCode() {
        return this.f50099f.hashCode() + defpackage.e.e(defpackage.e.b(this.f50097d, defpackage.e.b(this.f50096c, defpackage.e.b(this.f50095b, this.f50094a.hashCode() * 31, 31), 31), 31), 31, this.f50098e);
    }

    public final String toString() {
        StringBuilder sbQ = defpackage.e.q(this.f50095b, "Success(tips=", this.f50094a, ", unitSortIndex=", ", themeStyle=");
        ep.a.v(this.f50096c, this.f50097d, xItStCyvVEZ.eGT, ", showBillingWall=", sbQ);
        sbQ.append(this.f50098e);
        sbQ.append(", posterState=");
        sbQ.append(this.f50099f);
        sbQ.append(")");
        return sbQ.toString();
    }
}
