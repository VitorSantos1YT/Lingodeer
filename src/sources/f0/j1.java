package f0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f26322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1 f26323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26324c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(l1 l1Var, xy.c cVar) {
        super(cVar);
        this.f26323b = l1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f26322a = obj;
        this.f26324c |= Integer.MIN_VALUE;
        return this.f26323b.e(this);
    }
}
