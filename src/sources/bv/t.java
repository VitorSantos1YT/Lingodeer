package bv;

import g00.d1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@c00.e
public final class t {
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6355c;

    public /* synthetic */ t(int i11, int i12, int i13, int i14) {
        if (7 != (i11 & 7)) {
            d1.k(i11, 7, r.f6345a.getDescriptor());
            throw null;
        }
        this.f6353a = i12;
        this.f6354b = i13;
        this.f6355c = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f6353a == tVar.f6353a && this.f6354b == tVar.f6354b && this.f6355c == tVar.f6355c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6355c) + defpackage.e.b(this.f6354b, Integer.hashCode(this.f6353a) * 31, 31);
    }

    public final String toString() {
        return hh.p0.i(this.f6355c, ")", w4.c.k("RepetitionResult(overall=", this.f6353a, ", end=", this.f6354b, ", start="));
    }
}
