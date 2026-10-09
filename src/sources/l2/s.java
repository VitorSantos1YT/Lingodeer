package l2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f39679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f39680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f39681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f39682f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f39683g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f39684h;

    public s(float f5, float f11, float f12, float f13, float f14, float f15) {
        super(2);
        this.f39679c = f5;
        this.f39680d = f11;
        this.f39681e = f12;
        this.f39682f = f13;
        this.f39683g = f14;
        this.f39684h = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Float.compare(this.f39679c, sVar.f39679c) == 0 && Float.compare(this.f39680d, sVar.f39680d) == 0 && Float.compare(this.f39681e, sVar.f39681e) == 0 && Float.compare(this.f39682f, sVar.f39682f) == 0 && Float.compare(this.f39683g, sVar.f39683g) == 0 && Float.compare(this.f39684h, sVar.f39684h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f39684h) + defpackage.e.a(defpackage.e.a(defpackage.e.a(defpackage.e.a(Float.hashCode(this.f39679c) * 31, this.f39680d, 31), this.f39681e, 31), this.f39682f, 31), this.f39683g, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeCurveTo(dx1=");
        sb2.append(this.f39679c);
        sb2.append(", dy1=");
        sb2.append(this.f39680d);
        sb2.append(", dx2=");
        sb2.append(this.f39681e);
        sb2.append(", dy2=");
        sb2.append(this.f39682f);
        sb2.append(", dx3=");
        sb2.append(this.f39683g);
        sb2.append(", dy3=");
        return defpackage.e.o(sb2, this.f39684h, ')');
    }
}
