package n5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c0 f43242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f43243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f43244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e0 f43245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f43246e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c0 f43247f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f43248t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, xy.c cVar) {
        super(cVar);
        this.f43247f = c0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f43246e = obj;
        this.f43248t |= Integer.MIN_VALUE;
        return this.f43247f.b(null, this);
    }
}
