package y6;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f57334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f57335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f57336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f57337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f57338e;

    static {
        new j7.t().a();
        b7.f0.G(0);
        b7.f0.G(1);
        b7.f0.G(2);
        b7.f0.G(3);
        b7.f0.G(4);
    }

    public t(j7.t tVar) {
        long j11 = tVar.f36168a;
        long j12 = tVar.f36169b;
        long j13 = tVar.f36170c;
        float f5 = tVar.f36171d;
        float f11 = tVar.f36172e;
        this.f57334a = j11;
        this.f57335b = j12;
        this.f57336c = j13;
        this.f57337d = f5;
        this.f57338e = f11;
    }

    public final j7.t a() {
        j7.t tVar = new j7.t();
        tVar.f36168a = this.f57334a;
        tVar.f36169b = this.f57335b;
        tVar.f36170c = this.f57336c;
        tVar.f36171d = this.f57337d;
        tVar.f36172e = this.f57338e;
        return tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f57334a == tVar.f57334a && this.f57335b == tVar.f57335b && this.f57336c == tVar.f57336c && this.f57337d == tVar.f57337d && this.f57338e == tVar.f57338e;
    }

    public final int hashCode() {
        long j11 = this.f57334a;
        long j12 = this.f57335b;
        int i11 = ((((int) (j11 ^ (j11 >>> 32))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.f57336c;
        int i12 = (i11 + ((int) ((j13 >>> 32) ^ j13))) * 31;
        float f5 = this.f57337d;
        int iFloatToIntBits = (i12 + (f5 != CropImageView.DEFAULT_ASPECT_RATIO ? Float.floatToIntBits(f5) : 0)) * 31;
        float f11 = this.f57338e;
        return iFloatToIntBits + (f11 != CropImageView.DEFAULT_ASPECT_RATIO ? Float.floatToIntBits(f11) : 0);
    }
}
