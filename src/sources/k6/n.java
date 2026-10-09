package k6;

import com.yalantis.ucrop.view.CropImageView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f37938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f37939b;

    static {
        new n(3, CropImageView.DEFAULT_ASPECT_RATIO);
    }

    public n(float f5, List list) {
        this.f37938a = f5;
        this.f37939b = list;
    }

    public final n a(n nVar) {
        return new n(this.f37938a + nVar.f37938a, ry.m.H0(this.f37939b, nVar.f37939b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return v3.f.b(this.f37938a, nVar.f37938a) && kotlin.jvm.internal.m.a(this.f37939b, nVar.f37939b);
    }

    public final int hashCode() {
        return this.f37939b.hashCode() + (Float.hashCode(this.f37938a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PaddingDimension(dp=");
        com.google.android.material.datepicker.d.s(this.f37938a, ", resourceIds=", sb2);
        sb2.append(this.f37939b);
        sb2.append(')');
        return sb2.toString();
    }

    public n(int i11, float f5) {
        this((i11 & 1) != 0 ? 0 : f5, ry.r.f50854a);
    }
}
