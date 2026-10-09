package fd;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ed.a f27208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f27209d;

    public s(String str, int i11, ed.a aVar, boolean z11) {
        this.f27206a = str;
        this.f27207b = i11;
        this.f27208c = aVar;
        this.f27209d = z11;
    }

    @Override // fd.b
    public final yc.c a(wc.v vVar, wc.h hVar, gd.c cVar) {
        return new yc.t(vVar, cVar, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShapePath{name=");
        sb2.append(this.f27206a);
        sb2.append(", index=");
        return ep.a.j(sb2, this.f27207b, '}');
    }
}
