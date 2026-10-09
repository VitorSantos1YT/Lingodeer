package n9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends xy.c {
    public w0 H;
    public /* synthetic */ Object K;
    public final /* synthetic */ u0 L;
    public int M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f43693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f43694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f43695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f43696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f43697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f43698f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f43699t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(u0 u0Var, vy.d dVar) {
        super(dVar);
        this.L = u0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.K = obj;
        this.M |= Integer.MIN_VALUE;
        return this.L.emit(null, this);
    }
}
