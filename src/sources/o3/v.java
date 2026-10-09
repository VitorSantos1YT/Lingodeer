package o3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44702b;

    public v(int i11, int i12) {
        this.f44701a = i11;
        this.f44702b = i12;
    }

    @Override // o3.g
    public final void a(b7.p pVar) {
        int iL = hz.b.l(this.f44701a, 0, ((ar.f) pVar.f4020f).e());
        int iL2 = hz.b.l(this.f44702b, 0, ((ar.f) pVar.f4020f).e());
        if (iL < iL2) {
            pVar.h(iL, iL2);
        } else {
            pVar.h(iL2, iL);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f44701a == vVar.f44701a && this.f44702b == vVar.f44702b;
    }

    public final int hashCode() {
        return (this.f44701a * 31) + this.f44702b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetSelectionCommand(start=");
        sb2.append(this.f44701a);
        sb2.append(", end=");
        return ep.a.j(sb2, this.f44702b, ')');
    }
}
