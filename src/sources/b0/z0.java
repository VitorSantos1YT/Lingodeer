package b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1 f3754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3755c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(f1 f1Var, xy.c cVar) {
        super(cVar);
        this.f3754b = f1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f3753a = obj;
        this.f3755c |= Integer.MIN_VALUE;
        return f1.t0(this.f3754b, this);
    }
}
