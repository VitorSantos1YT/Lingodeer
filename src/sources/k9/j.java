package k9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends j9.r {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f37983f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t1.d f37984g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public fz.c f37985h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public fz.c f37986i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public fz.c f37987j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public fz.c f37988k;

    public j(i iVar, String str, t1.d dVar) {
        super(iVar, str);
        this.f37983f = iVar;
        this.f37984g = dVar;
    }

    @Override // j9.r
    public final j9.q a() {
        h hVar = (h) super.a();
        hVar.f37981t = this.f37985h;
        hVar.H = this.f37986i;
        hVar.K = this.f37987j;
        hVar.L = this.f37988k;
        return hVar;
    }

    @Override // j9.r
    public final j9.q b() {
        return new h(this.f37983f, this.f37984g);
    }
}
