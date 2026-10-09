package j0;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class j extends y2.d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f35317a;

    public j(float f5) {
        this.f35317a = f5;
        if (f5 > CropImageView.DEFAULT_ASPECT_RATIO) {
            return;
        }
        k0.a.a("aspectRatio " + f5 + " must be > 0");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        j jVar = obj instanceof j ? (j) obj : null;
        if (jVar == null || this.f35317a != jVar.f35317a) {
            return false;
        }
        ((j) obj).getClass();
        return true;
    }

    @Override // y2.d1
    public final z1.q f() {
        k kVar = new k();
        kVar.Q = this.f35317a;
        return kVar;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Float.hashCode(this.f35317a) * 31);
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        ((k) qVar).Q = this.f35317a;
    }
}
