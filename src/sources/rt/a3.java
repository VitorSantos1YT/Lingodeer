package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a3 extends xy.c {
    public /* synthetic */ Object H;
    public final /* synthetic */ e3 K;
    public int L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f49425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f49426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f49427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f49428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f49429e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f49430f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f49431t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(e3 e3Var, xy.c cVar) {
        super(cVar);
        this.K = e3Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.L |= Integer.MIN_VALUE;
        return this.K.A(0, 0L, 0, false, false, 0L, false, this);
    }
}
