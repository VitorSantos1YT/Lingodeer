package p7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d7.e f46498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hh.c f46499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f10.i f46500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final re.v f46501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f46502e;

    public u0(d7.e eVar, x7.k kVar) {
        hh.c cVar = new hh.c(kVar, 16);
        f10.i iVar = new f10.i();
        re.v vVar = new re.v(2);
        this.f46498a = eVar;
        this.f46499b = cVar;
        this.f46500c = iVar;
        this.f46501d = vVar;
        this.f46502e = 1048576;
    }

    @Override // p7.a0
    public final a c(y6.x xVar) {
        xVar.f57373b.getClass();
        return new v0(xVar, this.f46498a, this.f46499b, this.f46500c.b(xVar), this.f46501d, this.f46502e, null);
    }
}
