package l2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f39690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f39691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f39692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f39693f;

    public w(float f5, float f11, float f12, float f13) {
        super(1);
        this.f39690c = f5;
        this.f39691d = f11;
        this.f39692e = f12;
        this.f39693f = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Float.compare(this.f39690c, wVar.f39690c) == 0 && Float.compare(this.f39691d, wVar.f39691d) == 0 && Float.compare(this.f39692e, wVar.f39692e) == 0 && Float.compare(this.f39693f, wVar.f39693f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f39693f) + defpackage.e.a(defpackage.e.a(Float.hashCode(this.f39690c) * 31, this.f39691d, 31), this.f39692e, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeQuadTo(dx1=");
        sb2.append(this.f39690c);
        sb2.append(", dy1=");
        sb2.append(this.f39691d);
        sb2.append(", dx2=");
        sb2.append(this.f39692e);
        sb2.append(", dy2=");
        return defpackage.e.o(sb2, this.f39693f, ')');
    }
}
