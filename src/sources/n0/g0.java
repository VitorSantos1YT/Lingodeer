package n0;

import l1.b3;
import l1.k1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements b3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f42943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k1 f42944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f42945d;

    public g0(int i11, int i12, int i13) {
        this.f42942a = i12;
        this.f42943b = i13;
        int i14 = (i11 / i12) * i12;
        this.f42944c = new k1(hz.b.U(Math.max(i14 - i13, 0), i14 + i12 + i13), l1.g.f39303t);
        this.f42945d = i11;
    }

    public final void b(int i11) {
        if (i11 != this.f42945d) {
            this.f42945d = i11;
            int i12 = this.f42942a;
            int i13 = (i11 / i12) * i12;
            int i14 = this.f42943b;
            this.f42944c.setValue(hz.b.U(Math.max(i13 - i14, 0), i13 + i12 + i14));
        }
    }

    @Override // l1.b3
    public final Object getValue() {
        return (lz.g) this.f42944c.getValue();
    }
}
