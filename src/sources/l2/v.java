package l2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f39688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f39689d;

    public v(float f5, float f11) {
        super(3);
        this.f39688c = f5;
        this.f39689d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Float.compare(this.f39688c, vVar.f39688c) == 0 && Float.compare(this.f39689d, vVar.f39689d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f39689d) + (Float.hashCode(this.f39688c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeMoveTo(dx=");
        sb2.append(this.f39688c);
        sb2.append(", dy=");
        return defpackage.e.o(sb2, this.f39689d, ')');
    }
}
