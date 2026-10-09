package l2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f39658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f39659d;

    public m(float f5, float f11) {
        super(3);
        this.f39658c = f5;
        this.f39659d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Float.compare(this.f39658c, mVar.f39658c) == 0 && Float.compare(this.f39659d, mVar.f39659d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f39659d) + (Float.hashCode(this.f39658c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LineTo(x=");
        sb2.append(this.f39658c);
        sb2.append(", y=");
        return defpackage.e.o(sb2, this.f39659d, ')');
    }
}
