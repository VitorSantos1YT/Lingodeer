package l2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f39660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f39661d;

    public n(float f5, float f11) {
        super(3);
        this.f39660c = f5;
        this.f39661d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Float.compare(this.f39660c, nVar.f39660c) == 0 && Float.compare(this.f39661d, nVar.f39661d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f39661d) + (Float.hashCode(this.f39660c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MoveTo(x=");
        sb2.append(this.f39660c);
        sb2.append(", y=");
        return defpackage.e.o(sb2, this.f39661d, ')');
    }
}
