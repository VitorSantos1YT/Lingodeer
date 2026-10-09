package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class x5 extends xy.c {
    public /* synthetic */ Object H;
    public final /* synthetic */ z5 K;
    public int L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ns.z f50636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a00.a f50637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f50638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f50639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f50640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f50641f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f50642t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(z5 z5Var, xy.c cVar) {
        super(cVar);
        this.K = z5Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.L |= Integer.MIN_VALUE;
        return this.K.a(null, this);
    }
}
