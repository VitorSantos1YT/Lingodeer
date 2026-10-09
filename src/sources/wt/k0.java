package wt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f55298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0 f55299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f55300c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(o0 o0Var, xy.c cVar) {
        super(cVar);
        this.f55299b = o0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f55298a = obj;
        this.f55300c |= Integer.MIN_VALUE;
        return this.f55299b.g(this);
    }
}
