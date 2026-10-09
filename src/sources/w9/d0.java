package w9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends xy.c {
    public int H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f54788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f54789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f54790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f54791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f54792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f54793f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g0 f54794t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(g0 g0Var, xy.c cVar) {
        super(cVar);
        this.f54794t = g0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f54793f = obj;
        this.H |= Integer.MIN_VALUE;
        return g0.d(this.f54794t, null, 0, this);
    }
}
