package n9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 extends i2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f43559e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f43560f;

    public f2(int i11, int i12, int i13, int i14, int i15, int i16) {
        super(i13, i14, i15, i16);
        this.f43559e = i11;
        this.f43560f = i12;
    }

    @Override // n9.i2
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2)) {
            return false;
        }
        f2 f2Var = (f2) obj;
        return this.f43559e == f2Var.f43559e && this.f43560f == f2Var.f43560f && this.f43594a == f2Var.f43594a && this.f43595b == f2Var.f43595b && this.f43596c == f2Var.f43596c && this.f43597d == f2Var.f43597d;
    }

    @Override // n9.i2
    public final int hashCode() {
        return Integer.hashCode(this.f43560f) + Integer.hashCode(this.f43559e) + super.hashCode();
    }

    public final String toString() {
        return oz.r.h0("ViewportHint.Access(\n            |    pageOffset=" + this.f43559e + ",\n            |    indexInPage=" + this.f43560f + ",\n            |    presentedItemsBefore=" + this.f43594a + ",\n            |    presentedItemsAfter=" + this.f43595b + ",\n            |    originalPageOffsetFirst=" + this.f43596c + ",\n            |    originalPageOffsetLast=" + this.f43597d + ",\n            |)");
    }
}
