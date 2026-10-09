package o3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44698b;

    public t(int i11, int i12) {
        this.f44697a = i11;
        this.f44698b = i12;
    }

    @Override // o3.g
    public final void a(b7.p pVar) {
        boolean z11 = pVar.f4018d != -1;
        ar.f fVar = (ar.f) pVar.f4020f;
        if (z11) {
            pVar.f4018d = -1;
            pVar.f4019e = -1;
        }
        int iL = hz.b.l(this.f44697a, 0, fVar.e());
        int iL2 = hz.b.l(this.f44698b, 0, fVar.e());
        if (iL != iL2) {
            if (iL < iL2) {
                pVar.g(iL, iL2);
            } else {
                pVar.g(iL2, iL);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f44697a == tVar.f44697a && this.f44698b == tVar.f44698b;
    }

    public final int hashCode() {
        return (this.f44697a * 31) + this.f44698b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetComposingRegionCommand(start=");
        sb2.append(this.f44697a);
        sb2.append(", end=");
        return ep.a.j(sb2, this.f44698b, ')');
    }
}
