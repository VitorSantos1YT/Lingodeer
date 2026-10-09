package l2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f39672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f39673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f39674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f39675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f39676g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f39677h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f39678i;

    public r(float f5, float f11, float f12, boolean z11, boolean z12, float f13, float f14) {
        super(3);
        this.f39672c = f5;
        this.f39673d = f11;
        this.f39674e = f12;
        this.f39675f = z11;
        this.f39676g = z12;
        this.f39677h = f13;
        this.f39678i = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Float.compare(this.f39672c, rVar.f39672c) == 0 && Float.compare(this.f39673d, rVar.f39673d) == 0 && Float.compare(this.f39674e, rVar.f39674e) == 0 && this.f39675f == rVar.f39675f && this.f39676g == rVar.f39676g && Float.compare(this.f39677h, rVar.f39677h) == 0 && Float.compare(this.f39678i, rVar.f39678i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f39678i) + defpackage.e.a(defpackage.e.e(defpackage.e.e(defpackage.e.a(defpackage.e.a(Float.hashCode(this.f39672c) * 31, this.f39673d, 31), this.f39674e, 31), 31, this.f39675f), 31, this.f39676g), this.f39677h, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb2.append(this.f39672c);
        sb2.append(", verticalEllipseRadius=");
        sb2.append(this.f39673d);
        sb2.append(", theta=");
        sb2.append(this.f39674e);
        sb2.append(", isMoreThanHalf=");
        sb2.append(this.f39675f);
        sb2.append(", isPositiveArc=");
        sb2.append(this.f39676g);
        sb2.append(", arcStartDx=");
        sb2.append(this.f39677h);
        sb2.append(", arcStartDy=");
        return defpackage.e.o(sb2, this.f39678i, ')');
    }
}
