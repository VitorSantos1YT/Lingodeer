package nz;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements l, f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f44316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f44317c;

    public e(l sequence, int i11, int i12) {
        this.f44315a = i12;
        switch (i12) {
            case 1:
                this.f44316b = sequence;
                this.f44317c = i11;
                if (i11 < 0) {
                    throw new IllegalArgumentException(nv.p.o("count must be non-negative, but was ", i11, '.').toString());
                }
                return;
            default:
                kotlin.jvm.internal.m.f(sequence, "sequence");
                this.f44316b = sequence;
                this.f44317c = i11;
                if (i11 < 0) {
                    throw new IllegalArgumentException(nv.p.o("count must be non-negative, but was ", i11, '.').toString());
                }
                return;
        }
    }

    @Override // nz.f
    public final l a(int i11) {
        switch (this.f44315a) {
            case 0:
                int i12 = this.f44317c;
                int i13 = i12 + i11;
                return i13 < 0 ? new e(this, i11, 1) : new r(this.f44316b, i12, i13);
            default:
                return i11 >= this.f44317c ? this : new e(this.f44316b, i11, 1);
        }
    }

    @Override // nz.f
    public final l b(int i11) {
        switch (this.f44315a) {
            case 0:
                int i12 = this.f44317c + i11;
                return i12 < 0 ? new e(this, i11, 0) : new e(this.f44316b, i12, 0);
            default:
                int i13 = this.f44317c;
                return i11 >= i13 ? h.f44323a : new r(this.f44316b, i11, i13);
        }
    }

    @Override // nz.l
    public final Iterator iterator() {
        switch (this.f44315a) {
            case 0:
                return new d(this);
            default:
                return new d(this, (byte) 0);
        }
    }
}
