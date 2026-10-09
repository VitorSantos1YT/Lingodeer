package g3;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f28652d = new j(CropImageView.DEFAULT_ASPECT_RATIO, new lz.d(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO), 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f28653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lz.d f28654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28655c;

    public j(float f5, lz.d dVar, int i11) {
        this.f28653a = f5;
        this.f28654b = dVar;
        this.f28655c = i11;
        if (Float.isNaN(f5)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f28653a == jVar.f28653a && kotlin.jvm.internal.m.a(this.f28654b, jVar.f28654b) && this.f28655c == jVar.f28655c;
    }

    public final int hashCode() {
        return ((this.f28654b.hashCode() + (Float.hashCode(this.f28653a) * 31)) * 31) + this.f28655c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProgressBarRangeInfo(current=");
        sb2.append(this.f28653a);
        sb2.append(", range=");
        sb2.append(this.f28654b);
        sb2.append(", steps=");
        return ep.a.j(sb2, this.f28655c, ')');
    }
}
