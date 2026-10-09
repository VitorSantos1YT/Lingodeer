package l2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f39634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f39635d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f39636e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f39637f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f39638g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f39639h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f39640i;

    public i(float f5, float f11, float f12, boolean z11, boolean z12, float f13, float f14) {
        super(3);
        this.f39634c = f5;
        this.f39635d = f11;
        this.f39636e = f12;
        this.f39637f = z11;
        this.f39638g = z12;
        this.f39639h = f13;
        this.f39640i = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Float.compare(this.f39634c, iVar.f39634c) == 0 && Float.compare(this.f39635d, iVar.f39635d) == 0 && Float.compare(this.f39636e, iVar.f39636e) == 0 && this.f39637f == iVar.f39637f && this.f39638g == iVar.f39638g && Float.compare(this.f39639h, iVar.f39639h) == 0 && Float.compare(this.f39640i, iVar.f39640i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f39640i) + defpackage.e.a(defpackage.e.e(defpackage.e.e(defpackage.e.a(defpackage.e.a(Float.hashCode(this.f39634c) * 31, this.f39635d, 31), this.f39636e, 31), 31, this.f39637f), 31, this.f39638g), this.f39639h, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ArcTo(horizontalEllipseRadius=");
        sb2.append(this.f39634c);
        sb2.append(", verticalEllipseRadius=");
        sb2.append(this.f39635d);
        sb2.append(", theta=");
        sb2.append(this.f39636e);
        sb2.append(", isMoreThanHalf=");
        sb2.append(this.f39637f);
        sb2.append(", isPositiveArc=");
        sb2.append(this.f39638g);
        sb2.append(", arcStartX=");
        sb2.append(this.f39639h);
        sb2.append(", arcStartY=");
        return defpackage.e.o(sb2, this.f39640i, ')');
    }
}
