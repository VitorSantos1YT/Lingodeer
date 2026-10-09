package dd;

import android.graphics.PointF;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PointF f23354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PointF f23355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PointF f23356c;

    public a() {
        this.f23354a = new PointF();
        this.f23355b = new PointF();
        this.f23356c = new PointF();
    }

    public final String toString() {
        PointF pointF = this.f23356c;
        Float fValueOf = Float.valueOf(pointF.x);
        Float fValueOf2 = Float.valueOf(pointF.y);
        PointF pointF2 = this.f23354a;
        Float fValueOf3 = Float.valueOf(pointF2.x);
        Float fValueOf4 = Float.valueOf(pointF2.y);
        PointF pointF3 = this.f23355b;
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", fValueOf, fValueOf2, fValueOf3, fValueOf4, Float.valueOf(pointF3.x), Float.valueOf(pointF3.y));
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f23354a = pointF;
        this.f23355b = pointF2;
        this.f23356c = pointF3;
    }
}
