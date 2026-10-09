package nz;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class r implements l, f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f44342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f44344c;

    public r(l sequence, int i11, int i12) {
        kotlin.jvm.internal.m.f(sequence, "sequence");
        this.f44342a = sequence;
        this.f44343b = i11;
        this.f44344c = i12;
        if (i11 < 0) {
            throw new IllegalArgumentException(nv.p.j(i11, "startIndex should be non-negative, but is ").toString());
        }
        if (i12 < 0) {
            throw new IllegalArgumentException(nv.p.j(i12, "endIndex should be non-negative, but is ").toString());
        }
        if (i12 < i11) {
            throw new IllegalArgumentException(nv.p.p("endIndex should be not less than startIndex, but was ", i12, i11, " < ").toString());
        }
    }

    @Override // nz.f
    public final l a(int i11) {
        int i12 = this.f44344c;
        int i13 = this.f44343b;
        return i11 >= i12 - i13 ? this : new r(this.f44342a, i13, i11 + i13);
    }

    @Override // nz.f
    public final l b(int i11) {
        int i12 = this.f44344c;
        int i13 = this.f44343b;
        return i11 >= i12 - i13 ? h.f44323a : new r(this.f44342a, i13 + i11, i12);
    }

    @Override // nz.l
    public final Iterator iterator() {
        return new k(this);
    }
}
