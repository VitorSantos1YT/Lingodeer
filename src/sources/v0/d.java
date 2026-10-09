package v0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f53454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f53455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fz.c f53456d;

    public d(Object obj, String str, int i11, fz.c cVar) {
        super(obj);
        this.f53454b = str;
        this.f53455c = i11;
        this.f53456d = cVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextContextMenuItem(key=");
        sb2.append(this.f53451a);
        sb2.append(", label=\"");
        sb2.append(this.f53454b);
        sb2.append("\", leadingIcon=");
        return ep.a.j(sb2, this.f53455c, ')');
    }
}
