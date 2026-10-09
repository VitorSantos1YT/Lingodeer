package jt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ry.z f37011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ry.z f37012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f37013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f37014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f37015e;

    public k2(ry.z zVar, ry.z zVar2, int i11, int i12, int i13) {
        this.f37011a = zVar;
        this.f37012b = zVar2;
        this.f37013c = i11;
        this.f37014d = i12;
        this.f37015e = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2)) {
            return false;
        }
        k2 k2Var = (k2) obj;
        return this.f37011a.equals(k2Var.f37011a) && this.f37012b.equals(k2Var.f37012b) && this.f37013c == k2Var.f37013c && this.f37014d == k2Var.f37014d && this.f37015e == k2Var.f37015e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f37015e) + defpackage.e.b(this.f37014d, defpackage.e.b(this.f37013c, (this.f37012b.hashCode() + (this.f37011a.hashCode() * 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SentenceM5AlignmentResult(markedAnswerWords=");
        sb2.append(this.f37011a);
        sb2.append(", markedUserWords=");
        sb2.append(this.f37012b);
        sb2.append(", totalCost=");
        ep.a.v(this.f37013c, this.f37014d, ", matchCount=", ", wrongCount=", sb2);
        return hh.p0.i(this.f37015e, ")", sb2);
    }
}
