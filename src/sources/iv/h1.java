package iv;

import com.lingo.lingoskill.http.oss.MYmT.bjXGJ;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w2.g1 f34744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f34746c;

    public h1(int i11, int i12, w2.g1 g1Var) {
        this.f34744a = g1Var;
        this.f34745b = i11;
        this.f34746c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return kotlin.jvm.internal.m.a(this.f34744a, h1Var.f34744a) && this.f34745b == h1Var.f34745b && this.f34746c == h1Var.f34746c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f34746c) + defpackage.e.b(this.f34745b, this.f34744a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlacedItem(placeable=");
        sb2.append(this.f34744a);
        sb2.append(", x=");
        sb2.append(this.f34745b);
        sb2.append(bjXGJ.FxWjgmrWuIDc);
        return hh.p0.i(this.f34746c, ")", sb2);
    }
}
