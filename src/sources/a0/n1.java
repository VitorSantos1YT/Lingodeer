package a0;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0.c0 f150a;

    public n1(b0.c0 c0Var) {
        this.f150a = c0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n1) {
            return Float.compare(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO) == 0 && kotlin.jvm.internal.m.a(this.f150a, ((n1) obj).f150a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f150a.hashCode() + (Float.hashCode(CropImageView.DEFAULT_ASPECT_RATIO) * 31);
    }

    public final String toString() {
        return "Fade(alpha=0.0, animationSpec=" + this.f150a + ')';
    }
}
