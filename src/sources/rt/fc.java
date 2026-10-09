package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class fc implements gc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f49762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f49763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f49764c;

    public fc(int i11, float f5, int i12) {
        this.f49762a = f5;
        this.f49763b = i11;
        this.f49764c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fc)) {
            return false;
        }
        fc fcVar = (fc) obj;
        return Float.compare(this.f49762a, fcVar.f49762a) == 0 && this.f49763b == fcVar.f49763b && this.f49764c == fcVar.f49764c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f49764c) + defpackage.e.b(this.f49763b, Float.hashCode(this.f49762a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Success(progress=");
        sb2.append(this.f49762a);
        sb2.append(", comboCount=");
        sb2.append(this.f49763b);
        sb2.append(", wrongCount=");
        return hh.p0.i(this.f49764c, ")", sb2);
    }
}
