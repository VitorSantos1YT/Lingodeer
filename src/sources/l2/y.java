package l2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f39698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f39699d;

    public y(float f5, float f11) {
        super(1);
        this.f39698c = f5;
        this.f39699d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Float.compare(this.f39698c, yVar.f39698c) == 0 && Float.compare(this.f39699d, yVar.f39699d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f39699d) + (Float.hashCode(this.f39698c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb2.append(this.f39698c);
        sb2.append(", dy=");
        return defpackage.e.o(sb2, this.f39699d, ')');
    }
}
