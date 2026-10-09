package n9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f43664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f43665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f43666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a00.e f43667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f43668e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w0 f43669f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f43670t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(w0 w0Var, xy.c cVar) {
        super(cVar);
        this.f43669f = w0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f43668e = obj;
        this.f43670t |= Integer.MIN_VALUE;
        return this.f43669f.f(this);
    }
}
