package l2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f39662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f39663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f39664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f39665f;

    public o(float f5, float f11, float f12, float f13) {
        super(1);
        this.f39662c = f5;
        this.f39663d = f11;
        this.f39664e = f12;
        this.f39665f = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Float.compare(this.f39662c, oVar.f39662c) == 0 && Float.compare(this.f39663d, oVar.f39663d) == 0 && Float.compare(this.f39664e, oVar.f39664e) == 0 && Float.compare(this.f39665f, oVar.f39665f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f39665f) + defpackage.e.a(defpackage.e.a(Float.hashCode(this.f39662c) * 31, this.f39663d, 31), this.f39664e, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("QuadTo(x1=");
        sb2.append(this.f39662c);
        sb2.append(", y1=");
        sb2.append(this.f39663d);
        sb2.append(", x2=");
        sb2.append(this.f39664e);
        sb2.append(", y2=");
        return defpackage.e.o(sb2, this.f39665f, ')');
    }
}
