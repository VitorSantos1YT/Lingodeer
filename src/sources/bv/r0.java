package bv;

import g00.d1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@c00.e
public final class r0 {
    public static final q0 Companion = new q0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6349d;

    public /* synthetic */ r0(String str, int i11, int i12, int i13, int i14) {
        if (15 != (i11 & 15)) {
            d1.k(i11, 15, p0.f6342a.getDescriptor());
            throw null;
        }
        this.f6346a = i12;
        this.f6347b = str;
        this.f6348c = i13;
        this.f6349d = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return this.f6346a == r0Var.f6346a && kotlin.jvm.internal.m.a(this.f6347b, r0Var.f6347b) && this.f6348c == r0Var.f6348c && this.f6349d == r0Var.f6349d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6349d) + defpackage.e.b(this.f6348c, defpackage.e.d(Integer.hashCode(this.f6346a) * 31, 31, this.f6347b), 31);
    }

    public final String toString() {
        return "WordPart(beginIndex=" + this.f6346a + ", part=" + this.f6347b + ", charType=" + this.f6348c + ", endIndex=" + this.f6349d + ")";
    }
}
