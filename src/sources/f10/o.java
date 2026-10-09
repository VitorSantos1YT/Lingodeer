package f10;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f26563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f26564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f26565c = true;

    public o(Object obj, m mVar) {
        this.f26563a = obj;
        this.f26564b = mVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f26563a == oVar.f26563a && this.f26564b.equals(oVar.f26564b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f26564b.f26560f.hashCode() + this.f26563a.hashCode();
    }
}
