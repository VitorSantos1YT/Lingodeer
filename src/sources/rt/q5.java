package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q5 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f50285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r5 f50286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f50287c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(r5 r5Var, xy.c cVar) {
        super(cVar);
        this.f50286b = r5Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f50285a = obj;
        this.f50287c |= Integer.MIN_VALUE;
        return this.f50286b.t(this);
    }
}
