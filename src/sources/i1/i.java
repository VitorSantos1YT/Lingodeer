package i1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z1.i f34025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1.i f34026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f34027c;

    public i(z1.i iVar, z1.i iVar2, int i11) {
        this.f34025a = iVar;
        this.f34026b = iVar2;
        this.f34027c = i11;
    }

    @Override // i1.q0
    public final int a(v3.k kVar, long j11, int i11) {
        int iA = this.f34026b.a(0, kVar.b());
        return kVar.f53495b + iA + (-this.f34025a.a(0, i11)) + this.f34027c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f34025a.equals(iVar.f34025a) && this.f34026b.equals(iVar.f34026b) && this.f34027c == iVar.f34027c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f34027c) + defpackage.e.a(Float.hashCode(this.f34025a.f58473a) * 31, this.f34026b.f58473a, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Vertical(menuAlignment=");
        sb2.append(this.f34025a);
        sb2.append(", anchorAlignment=");
        sb2.append(this.f34026b);
        sb2.append(", offset=");
        return ep.a.j(sb2, this.f34027c, ')');
    }
}
