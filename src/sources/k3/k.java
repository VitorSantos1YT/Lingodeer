package k3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f37877c;

    public k(int i11, int i12, boolean z11) {
        this.f37875a = i11;
        this.f37876b = i12;
        this.f37877c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f37875a == kVar.f37875a && this.f37876b == kVar.f37876b && this.f37877c == kVar.f37877c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f37877c) + defpackage.e.b(this.f37876b, Integer.hashCode(this.f37875a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BidiRun(start=");
        sb2.append(this.f37875a);
        sb2.append(", end=");
        sb2.append(this.f37876b);
        sb2.append(", isRtl=");
        return ep.a.l(sb2, this.f37877c, ')');
    }
}
