package fd;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27187a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f27188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ed.b f27189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f27190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ed.f f27191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f27192f;

    public n(String str, ed.b bVar, ed.b bVar2, ed.e eVar, boolean z11) {
        this.f27188b = str;
        this.f27189c = bVar;
        this.f27191e = bVar2;
        this.f27192f = eVar;
        this.f27190d = z11;
    }

    @Override // fd.b
    public final yc.c a(wc.v vVar, wc.h hVar, gd.c cVar) {
        switch (this.f27187a) {
            case 0:
                return new yc.q(vVar, cVar, this);
            case 1:
                return new yc.r(vVar, cVar, this);
            default:
                return new yc.v(cVar, this);
        }
    }

    public String toString() {
        switch (this.f27187a) {
            case 0:
                return "RectangleShape{position=" + this.f27191e + ", size=" + ((ed.f) this.f27192f) + '}';
            case 1:
            default:
                return super.toString();
            case 2:
                return "Trim Path: {start: " + this.f27189c + ", end: " + ((ed.b) this.f27191e) + ", offset: " + ((ed.b) this.f27192f) + "}";
        }
    }

    public n(String str, ed.f fVar, ed.a aVar, ed.b bVar, boolean z11) {
        this.f27188b = str;
        this.f27191e = fVar;
        this.f27192f = aVar;
        this.f27189c = bVar;
        this.f27190d = z11;
    }

    public n(String str, w wVar, ed.b bVar, ed.b bVar2, ed.b bVar3, boolean z11) {
        this.f27188b = wVar;
        this.f27189c = bVar;
        this.f27191e = bVar2;
        this.f27192f = bVar3;
        this.f27190d = z11;
    }
}
