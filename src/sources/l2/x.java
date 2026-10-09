package l2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f39694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f39695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f39696e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f39697f;

    public x(float f5, float f11, float f12, float f13) {
        super(2);
        this.f39694c = f5;
        this.f39695d = f11;
        this.f39696e = f12;
        this.f39697f = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Float.compare(this.f39694c, xVar.f39694c) == 0 && Float.compare(this.f39695d, xVar.f39695d) == 0 && Float.compare(this.f39696e, xVar.f39696e) == 0 && Float.compare(this.f39697f, xVar.f39697f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f39697f) + defpackage.e.a(defpackage.e.a(Float.hashCode(this.f39694c) * 31, this.f39695d, 31), this.f39696e, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb2.append(this.f39694c);
        sb2.append(", dy1=");
        sb2.append(this.f39695d);
        sb2.append(", dx2=");
        sb2.append(this.f39696e);
        sb2.append(", dy2=");
        return defpackage.e.o(sb2, this.f39697f, ')');
    }
}
