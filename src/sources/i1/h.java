package i1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z1.h f34020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1.h f34021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f34022c;

    public h(z1.h hVar, z1.h hVar2, int i11) {
        this.f34020a = hVar;
        this.f34021b = hVar2;
        this.f34022c = i11;
    }

    @Override // i1.p0
    public final int a(v3.k kVar, long j11, int i11, v3.m mVar) {
        int iA = this.f34021b.a(0, kVar.d(), mVar);
        int i12 = -this.f34020a.a(0, i11, mVar);
        v3.m mVar2 = v3.m.Ltr;
        int i13 = this.f34022c;
        if (mVar != mVar2) {
            i13 = -i13;
        }
        return kVar.f53494a + iA + i12 + i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f34020a.equals(hVar.f34020a) && this.f34021b.equals(hVar.f34021b) && this.f34022c == hVar.f34022c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f34022c) + defpackage.e.a(Float.hashCode(this.f34020a.f58472a) * 31, this.f34021b.f58472a, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Horizontal(menuAlignment=");
        sb2.append(this.f34020a);
        sb2.append(", anchorAlignment=");
        sb2.append(this.f34021b);
        sb2.append(", offset=");
        return ep.a.j(sb2, this.f34022c, ')');
    }
}
