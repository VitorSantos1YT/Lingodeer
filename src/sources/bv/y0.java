package bv;

import g00.d1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@c00.e
public final class y0 {
    public static final x0 Companion = new x0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f6376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f6377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f6378c;

    public /* synthetic */ y0(int i11, double d5, double d11, double d12) {
        if (7 != (i11 & 7)) {
            d1.k(i11, 7, w0.f6374a.getDescriptor());
            throw null;
        }
        this.f6376a = d5;
        this.f6377b = d11;
        this.f6378c = d12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return Double.compare(this.f6376a, y0Var.f6376a) == 0 && Double.compare(this.f6377b, y0Var.f6377b) == 0 && Double.compare(this.f6378c, y0Var.f6378c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f6378c) + ((Double.hashCode(this.f6377b) + (Double.hashCode(this.f6376a) * 31)) * 31);
    }

    public final String toString() {
        return "WordScores(overall=" + this.f6376a + ", tone=" + this.f6377b + ", pronunciation=" + this.f6378c + ")";
    }
}
