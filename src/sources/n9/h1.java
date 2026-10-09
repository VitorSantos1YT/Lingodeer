package n9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f43581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f43583d;

    public h1(int i11, int i12, int i13) {
        this.f43581b = i11;
        this.f43582c = i12;
        this.f43583d = i13;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return this.f43581b == h1Var.f43581b && this.f43582c == h1Var.f43582c && this.f43583d == h1Var.f43583d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f43583d) + Integer.hashCode(this.f43582c) + Integer.hashCode(this.f43581b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PagingDataEvent.DropPrepend dropped ");
        int i11 = this.f43581b;
        ep.a.v(i11, i11, " items (\n                    |   dropCount: ", "\n                    |   newPlaceholdersBefore: ", sb2);
        sb2.append(this.f43582c);
        sb2.append("\n                    |   oldPlaceholdersBefore: ");
        sb2.append(this.f43583d);
        sb2.append("\n                    |)\n                    |");
        return oz.r.h0(sb2.toString());
    }
}
