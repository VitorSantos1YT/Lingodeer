package i1;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z1.f f34015a;

    public f1(z1.f fVar) {
        this.f34015a = fVar;
    }

    @Override // i1.p0
    public final int a(v3.k kVar, long j11, int i11, v3.m mVar) {
        int i12 = (int) (j11 >> 32);
        if (i11 < i12) {
            return hz.b.l(this.f34015a.a(i11, i12, mVar), 0, i12 - i11);
        }
        float f5 = (i12 - i11) / 2.0f;
        v3.m mVar2 = v3.m.Ltr;
        float f11 = CropImageView.DEFAULT_ASPECT_RATIO;
        if (mVar != mVar2) {
            f11 = CropImageView.DEFAULT_ASPECT_RATIO * (-1);
        }
        return Math.round((1 + f11) * f5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f1) && this.f34015a.equals(((f1) obj).f34015a);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Float.hashCode(this.f34015a.f58470a) * 31);
    }

    public final String toString() {
        return "Horizontal(alignment=" + this.f34015a + ", margin=0)";
    }
}
