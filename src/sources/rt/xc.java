package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class xc extends xy.c {
    public /* synthetic */ Object H;
    public final /* synthetic */ dd K;
    public int L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f50656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f50657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f50658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f50659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f50660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f50661f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f50662t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc(dd ddVar, xy.c cVar) {
        super(cVar);
        this.K = ddVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.L |= Integer.MIN_VALUE;
        return this.K.A(0, 0L, 0, false, false, 0L, false, this);
    }
}
