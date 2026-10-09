package j9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f36277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f36278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f36279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f36280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f36281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f36282f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f36283g;

    public z() {
        x xVar = new x();
        xVar.f36263a = -1;
        xVar.f36267e = -1;
        xVar.f36268f = -1;
        this.f36277a = xVar;
        this.f36280d = -1;
    }

    public final void a(String route, fz.c cVar) {
        kotlin.jvm.internal.m.f(route, "route");
        if (oz.q.K0(route)) {
            throw new IllegalArgumentException("Cannot pop up to an empty route");
        }
        this.f36281e = route;
        this.f36280d = -1;
        this.f36282f = false;
        e0 e0Var = new e0();
        cVar.invoke(e0Var);
        this.f36282f = e0Var.f36194a;
        this.f36283g = e0Var.f36195b;
    }
}
