package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class hd implements id {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f49849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f49850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f49851c;

    public hd(float f5, boolean z11, boolean z12) {
        this.f49849a = f5;
        this.f49850b = z11;
        this.f49851c = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hd)) {
            return false;
        }
        hd hdVar = (hd) obj;
        return Float.compare(this.f49849a, hdVar.f49849a) == 0 && this.f49850b == hdVar.f49850b && this.f49851c == hdVar.f49851c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f49851c) + defpackage.e.e(Float.hashCode(this.f49849a) * 31, 31, this.f49850b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Success(progress=");
        sb2.append(this.f49849a);
        sb2.append(", completed=");
        sb2.append(this.f49850b);
        sb2.append(", downloadedAlready=");
        return hh.p0.p(sb2, this.f49851c, ")");
    }
}
