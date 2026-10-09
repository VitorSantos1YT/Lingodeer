package l2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f39644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f39645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f39646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f39647f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f39648g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f39649h;

    public k(float f5, float f11, float f12, float f13, float f14, float f15) {
        super(2);
        this.f39644c = f5;
        this.f39645d = f11;
        this.f39646e = f12;
        this.f39647f = f13;
        this.f39648g = f14;
        this.f39649h = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Float.compare(this.f39644c, kVar.f39644c) == 0 && Float.compare(this.f39645d, kVar.f39645d) == 0 && Float.compare(this.f39646e, kVar.f39646e) == 0 && Float.compare(this.f39647f, kVar.f39647f) == 0 && Float.compare(this.f39648g, kVar.f39648g) == 0 && Float.compare(this.f39649h, kVar.f39649h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f39649h) + defpackage.e.a(defpackage.e.a(defpackage.e.a(defpackage.e.a(Float.hashCode(this.f39644c) * 31, this.f39645d, 31), this.f39646e, 31), this.f39647f, 31), this.f39648g, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CurveTo(x1=");
        sb2.append(this.f39644c);
        sb2.append(", y1=");
        sb2.append(this.f39645d);
        sb2.append(", x2=");
        sb2.append(this.f39646e);
        sb2.append(", y2=");
        sb2.append(this.f39647f);
        sb2.append(", x3=");
        sb2.append(this.f39648g);
        sb2.append(", y3=");
        return defpackage.e.o(sb2, this.f39649h, ')');
    }
}
