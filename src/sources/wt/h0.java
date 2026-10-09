package wt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f55278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f55279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f55280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o0 f55281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f55282e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(o0 o0Var, xy.c cVar) {
        super(cVar);
        this.f55281d = o0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f55280c = obj;
        this.f55282e |= Integer.MIN_VALUE;
        return this.f55281d.e(this);
    }
}
