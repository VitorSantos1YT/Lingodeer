package bv;

import g00.d1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@c00.e
public final class o0 {
    public static final n0 Companion = new n0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6338b;

    public /* synthetic */ o0(int i11, int i12, String str) {
        if (3 != (i11 & 3)) {
            d1.k(i11, 3, m0.f6330a.getDescriptor());
            throw null;
        }
        this.f6337a = str;
        this.f6338b = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return kotlin.jvm.internal.m.a(this.f6337a, o0Var.f6337a) && this.f6338b == o0Var.f6338b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6338b) + (this.f6337a.hashCode() * 31);
    }

    public final String toString() {
        return "WarningInfo(message=" + this.f6337a + ", code=" + this.f6338b + ")";
    }
}
