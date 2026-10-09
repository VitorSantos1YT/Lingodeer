package wt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class x extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f55357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f55358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f55359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f55360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b0 f55361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f55362f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(b0 b0Var, xy.c cVar) {
        super(cVar);
        this.f55361e = b0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f55360d = obj;
        this.f55362f |= Integer.MIN_VALUE;
        return this.f55361e.d(0L, 0L, this);
    }
}
