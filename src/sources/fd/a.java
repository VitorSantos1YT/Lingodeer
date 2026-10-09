package fd;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ed.f f27144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ed.a f27145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f27146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f27147e;

    public a(String str, ed.f fVar, ed.a aVar, boolean z11, boolean z12) {
        this.f27143a = str;
        this.f27144b = fVar;
        this.f27145c = aVar;
        this.f27146d = z11;
        this.f27147e = z12;
    }

    @Override // fd.b
    public final yc.c a(wc.v vVar, wc.h hVar, gd.c cVar) {
        return new yc.f(vVar, cVar, this);
    }
}
