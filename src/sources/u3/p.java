package u3;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f52757c = new p(1.0f, CropImageView.DEFAULT_ASPECT_RATIO);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f52758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f52759b;

    public p(float f5, float f11) {
        this.f52758a = f5;
        this.f52759b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f52758a == pVar.f52758a && this.f52759b == pVar.f52759b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f52759b) + (Float.hashCode(this.f52758a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextGeometricTransform(scaleX=");
        sb2.append(this.f52758a);
        sb2.append(", skewX=");
        return defpackage.e.o(sb2, this.f52759b, ')');
    }
}
