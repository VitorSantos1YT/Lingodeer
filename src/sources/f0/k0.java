package f0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q f26333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h0.b f26334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f26335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0 f26336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26337e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(n0 n0Var, xy.c cVar) {
        super(cVar);
        this.f26336d = n0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f26335c = obj;
        this.f26337e |= Integer.MIN_VALUE;
        return n0.X0(this.f26336d, null, this);
    }
}
