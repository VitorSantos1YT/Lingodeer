package i1;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z1.i f34018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34019b;

    public g1(z1.i iVar, int i11) {
        this.f34018a = iVar;
        this.f34019b = i11;
    }

    @Override // i1.q0
    public final int a(v3.k kVar, long j11, int i11) {
        int i12 = (int) (j11 & 4294967295L);
        int i13 = this.f34019b;
        if (i11 < i12 - (i13 * 2)) {
            return hz.b.l(this.f34018a.a(i11, i12), i13, (i12 - i13) - i11);
        }
        return Math.round((1 + CropImageView.DEFAULT_ASPECT_RATIO) * ((i12 - i11) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return this.f34018a.equals(g1Var.f34018a) && this.f34019b == g1Var.f34019b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f34019b) + (Float.hashCode(this.f34018a.f58473a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Vertical(alignment=");
        sb2.append(this.f34018a);
        sb2.append(", margin=");
        return ep.a.j(sb2, this.f34019b, ')');
    }
}
