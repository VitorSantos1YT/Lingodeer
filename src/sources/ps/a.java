package ps;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f47118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f47120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f47121d;

    public a(float f5, int i11, int i12, long j11) {
        this.f47118a = j11;
        this.f47119b = i11;
        this.f47120c = i12;
        this.f47121d = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f47118a == aVar.f47118a && this.f47119b == aVar.f47119b && this.f47120c == aVar.f47120c && Float.compare(this.f47121d, aVar.f47121d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f47121d) + defpackage.e.b(this.f47120c, defpackage.e.b(this.f47119b, Long.hashCode(this.f47118a) * 31, 31), 31);
    }

    public final String toString() {
        return "DownloadProgress(unitId=" + this.f47118a + ", current=" + this.f47119b + ", total=" + this.f47120c + ", progress=" + this.f47121d + ")";
    }
}
