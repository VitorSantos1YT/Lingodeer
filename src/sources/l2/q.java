package l2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f39670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f39671d;

    public q(float f5, float f11) {
        super(1);
        this.f39670c = f5;
        this.f39671d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Float.compare(this.f39670c, qVar.f39670c) == 0 && Float.compare(this.f39671d, qVar.f39671d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f39671d) + (Float.hashCode(this.f39670c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReflectiveQuadTo(x=");
        sb2.append(this.f39670c);
        sb2.append(", y=");
        return defpackage.e.o(sb2, this.f39671d, ')');
    }
}
