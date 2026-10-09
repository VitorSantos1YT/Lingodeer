package r0;

import com.yalantis.ucrop.view.CropImageView;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f48727a;

    public c(float f5) {
        this.f48727a = f5;
        if (f5 < CropImageView.DEFAULT_ASPECT_RATIO || f5 > 100.0f) {
            i0.a.a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // r0.a
    public final float a(long j11, v3.c cVar) {
        return (this.f48727a / 100.0f) * f2.e.c(j11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Float.compare(this.f48727a, ((c) obj).f48727a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f48727a);
    }

    public final String toString() {
        return p.h(this.f48727a, "%)", new StringBuilder("CornerSize(size = "));
    }
}
