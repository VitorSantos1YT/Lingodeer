package g00;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class z extends f1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e00.l f28502l;
    public final qy.q m;

    public z(String str, int i11) {
        super(str, null, i11);
        this.f28502l = e00.l.f24699c;
        this.m = com.bumptech.glide.d.v(new y(str, i11, 0, this));
    }

    @Override // g00.f1, e00.g
    public final o00.a e() {
        return this.f28502l;
    }

    @Override // g00.f1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof e00.g)) {
            return false;
        }
        e00.g gVar = (e00.g) obj;
        return gVar.e() == e00.l.f24699c && this.f28389a.equals(gVar.a()) && kotlin.jvm.internal.m.a(d1.b(this), d1.b(gVar));
    }

    @Override // g00.f1
    public final int hashCode() {
        int iHashCode = this.f28389a.hashCode();
        e00.i iVar = new e00.i(this);
        int iHashCode2 = 1;
        while (iVar.hasNext()) {
            int i11 = iHashCode2 * 31;
            String str = (String) iVar.next();
            iHashCode2 = i11 + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // g00.f1, e00.g
    public final e00.g i(int i11) {
        return ((e00.g[]) this.m.getValue())[i11];
    }

    @Override // g00.f1
    public final String toString() {
        return ry.m.y0(new e00.j(this, 0), ", ", this.f28389a.concat("("), ")", null, 56);
    }
}
