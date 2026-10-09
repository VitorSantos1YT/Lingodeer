package f2;

import cf.x;
import com.bumptech.glide.f;
import com.yalantis.ucrop.view.CropImageView;
import hh.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f26576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f26577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f26578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f26579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f26580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f26581f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f26582g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f26583h;

    static {
        f.c(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0L);
    }

    public d(float f5, float f11, float f12, float f13, long j11, long j12, long j13, long j14) {
        this.f26576a = f5;
        this.f26577b = f11;
        this.f26578c = f12;
        this.f26579d = f13;
        this.f26580e = j11;
        this.f26581f = j12;
        this.f26582g = j13;
        this.f26583h = j14;
    }

    public final float a() {
        return this.f26579d - this.f26577b;
    }

    public final float b() {
        return this.f26578c - this.f26576a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f26576a, dVar.f26576a) == 0 && Float.compare(this.f26577b, dVar.f26577b) == 0 && Float.compare(this.f26578c, dVar.f26578c) == 0 && Float.compare(this.f26579d, dVar.f26579d) == 0 && android.support.v4.media.session.a.n(this.f26580e, dVar.f26580e) && android.support.v4.media.session.a.n(this.f26581f, dVar.f26581f) && android.support.v4.media.session.a.n(this.f26582g, dVar.f26582g) && android.support.v4.media.session.a.n(this.f26583h, dVar.f26583h);
    }

    public final int hashCode() {
        return Long.hashCode(this.f26583h) + defpackage.e.f(this.f26582g, defpackage.e.f(this.f26581f, defpackage.e.f(this.f26580e, defpackage.e.a(defpackage.e.a(defpackage.e.a(Float.hashCode(this.f26576a) * 31, this.f26577b, 31), this.f26578c, 31), this.f26579d, 31), 31), 31), 31);
    }

    public final String toString() {
        String str = x.P(this.f26576a) + ", " + x.P(this.f26577b) + ", " + x.P(this.f26578c) + ", " + x.P(this.f26579d);
        long j11 = this.f26580e;
        long j12 = this.f26581f;
        boolean zN = android.support.v4.media.session.a.n(j11, j12);
        long j13 = this.f26582g;
        long j14 = this.f26583h;
        if (!zN || !android.support.v4.media.session.a.n(j12, j13) || !android.support.v4.media.session.a.n(j13, j14)) {
            StringBuilder sbQ = p0.q("RoundRect(rect=", str, ", topLeft=");
            sbQ.append((Object) android.support.v4.media.session.a.L(j11));
            sbQ.append(", topRight=");
            sbQ.append((Object) android.support.v4.media.session.a.L(j12));
            sbQ.append(", bottomRight=");
            sbQ.append((Object) android.support.v4.media.session.a.L(j13));
            sbQ.append(", bottomLeft=");
            sbQ.append((Object) android.support.v4.media.session.a.L(j14));
            sbQ.append(')');
            return sbQ.toString();
        }
        int i11 = (int) (j11 >> 32);
        int i12 = (int) (j11 & 4294967295L);
        if (Float.intBitsToFloat(i11) == Float.intBitsToFloat(i12)) {
            StringBuilder sbQ2 = p0.q("RoundRect(rect=", str, ", radius=");
            sbQ2.append(x.P(Float.intBitsToFloat(i11)));
            sbQ2.append(')');
            return sbQ2.toString();
        }
        StringBuilder sbQ3 = p0.q("RoundRect(rect=", str, ", x=");
        sbQ3.append(x.P(Float.intBitsToFloat(i11)));
        sbQ3.append(", y=");
        sbQ3.append(x.P(Float.intBitsToFloat(i12)));
        sbQ3.append(')');
        return sbQ3.toString();
    }
}
