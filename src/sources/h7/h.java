package h7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f31871d = new g().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f31872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f31873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f31874c;

    public h(g gVar) {
        this.f31872a = gVar.f31868a;
        this.f31873b = gVar.f31869b;
        this.f31874c = gVar.f31870c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return this.f31872a == hVar.f31872a && this.f31873b == hVar.f31873b && this.f31874c == hVar.f31874c;
    }

    public final int hashCode() {
        return ((this.f31872a ? 1 : 0) << 2) + ((this.f31873b ? 1 : 0) << 1) + (this.f31874c ? 1 : 0);
    }
}
