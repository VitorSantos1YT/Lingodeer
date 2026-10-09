package n9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w0 f43656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x0 f43657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a00.e f43658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f43659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w0 f43660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f43661f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(w0 w0Var, xy.c cVar) {
        super(cVar);
        this.f43660e = w0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f43659d = obj;
        this.f43661f |= Integer.MIN_VALUE;
        return this.f43660e.e(this);
    }
}
