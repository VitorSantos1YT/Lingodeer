package wt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class w extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f55353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f55354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f55355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f55356d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(b0 b0Var, xy.c cVar) {
        super(cVar);
        this.f55355c = b0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f55354b = obj;
        this.f55356d |= Integer.MIN_VALUE;
        return b0.b(this.f55355c, null, null, 0, this);
    }
}
