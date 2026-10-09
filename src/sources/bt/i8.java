package bt;

import com.google.zxing.pdf417.decoder.vBn.xTCJ;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f5549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f5550b;

    public i8(float f5, float f11) {
        this.f5549a = f5;
        this.f5550b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8)) {
            return false;
        }
        i8 i8Var = (i8) obj;
        return Float.compare(this.f5549a, i8Var.f5549a) == 0 && Float.compare(this.f5550b, i8Var.f5550b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5550b) + (Float.hashCode(this.f5549a) * 31);
    }

    public final String toString() {
        return "StemRowBounds(top=" + this.f5549a + xTCJ.JehA + this.f5550b + ")";
    }
}
