package wt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class v extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f55349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f55350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f55351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f55352d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(b0 b0Var, xy.c cVar) {
        super(cVar);
        this.f55351c = b0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f55350b = obj;
        this.f55352d |= Integer.MIN_VALUE;
        return b0.a(this.f55351c, 0, this);
    }
}
