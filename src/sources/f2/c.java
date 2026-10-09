package f2;

import cf.x;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f26571e = new c(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f26572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f26573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f26574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f26575d;

    public c(float f5, float f11, float f12, float f13) {
        this.f26572a = f5;
        this.f26573b = f11;
        this.f26574c = f12;
        this.f26575d = f13;
    }

    public final boolean a(long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L));
        return (fIntBitsToFloat >= this.f26572a) & (fIntBitsToFloat < this.f26574c) & (fIntBitsToFloat2 >= this.f26573b) & (fIntBitsToFloat2 < this.f26575d);
    }

    public final long b() {
        float f5 = this.f26574c;
        float f11 = this.f26572a;
        float f12 = ((f5 - f11) / 2.0f) + f11;
        float f13 = this.f26575d;
        float f14 = this.f26573b;
        return (((long) Float.floatToRawIntBits(((f13 - f14) / 2.0f) + f14)) & 4294967295L) | (Float.floatToRawIntBits(f12) << 32);
    }

    public final long c() {
        float f5 = this.f26574c - this.f26572a;
        return (((long) Float.floatToRawIntBits(this.f26575d - this.f26573b)) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32);
    }

    public final long d() {
        return (((long) Float.floatToRawIntBits(this.f26572a)) << 32) | (((long) Float.floatToRawIntBits(this.f26573b)) & 4294967295L);
    }

    public final c e(c cVar) {
        return new c(Math.max(this.f26572a, cVar.f26572a), Math.max(this.f26573b, cVar.f26573b), Math.min(this.f26574c, cVar.f26574c), Math.min(this.f26575d, cVar.f26575d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f26572a, cVar.f26572a) == 0 && Float.compare(this.f26573b, cVar.f26573b) == 0 && Float.compare(this.f26574c, cVar.f26574c) == 0 && Float.compare(this.f26575d, cVar.f26575d) == 0;
    }

    public final boolean f() {
        return (this.f26572a >= this.f26574c) | (this.f26573b >= this.f26575d);
    }

    public final boolean g(c cVar) {
        return (this.f26572a < cVar.f26574c) & (cVar.f26572a < this.f26574c) & (this.f26573b < cVar.f26575d) & (cVar.f26573b < this.f26575d);
    }

    public final c h(float f5, float f11) {
        return new c(this.f26572a + f5, this.f26573b + f11, this.f26574c + f5, this.f26575d + f11);
    }

    public final int hashCode() {
        return Float.hashCode(this.f26575d) + defpackage.e.a(defpackage.e.a(Float.hashCode(this.f26572a) * 31, this.f26573b, 31), this.f26574c, 31);
    }

    public final c i(long j11) {
        int i11 = (int) (j11 >> 32);
        int i12 = (int) (j11 & 4294967295L);
        return new c(Float.intBitsToFloat(i11) + this.f26572a, Float.intBitsToFloat(i12) + this.f26573b, Float.intBitsToFloat(i11) + this.f26574c, Float.intBitsToFloat(i12) + this.f26575d);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + x.P(this.f26572a) + ", " + x.P(this.f26573b) + ", " + x.P(this.f26574c) + ", " + x.P(this.f26575d) + ')';
    }
}
