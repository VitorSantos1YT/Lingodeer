package n9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f43569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f43571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f43572e;

    public g1(int i11, int i12, int i13, int i14) {
        this.f43569b = i11;
        this.f43570c = i12;
        this.f43571d = i13;
        this.f43572e = i14;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return this.f43569b == g1Var.f43569b && this.f43570c == g1Var.f43570c && this.f43571d == g1Var.f43571d && this.f43572e == g1Var.f43572e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f43572e) + Integer.hashCode(this.f43571d) + Integer.hashCode(this.f43570c) + Integer.hashCode(this.f43569b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PagingDataEvent.DropAppend dropped ");
        int i11 = this.f43570c;
        sb2.append(i11);
        sb2.append(" items (\n                    |   startIndex: ");
        ep.a.v(this.f43569b, i11, "\n                    |   dropCount: ", "\n                    |   newPlaceholdersBefore: ", sb2);
        sb2.append(this.f43571d);
        sb2.append("\n                    |   oldPlaceholdersBefore: ");
        sb2.append(this.f43572e);
        sb2.append("\n                    |)\n                    |");
        return oz.r.h0(sb2.toString());
    }
}
