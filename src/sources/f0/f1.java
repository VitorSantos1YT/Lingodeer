package f0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f26265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f26266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26267c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(g1 g1Var, xy.c cVar) {
        super(cVar);
        this.f26266b = g1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f26265a = obj;
        this.f26267c |= Integer.MIN_VALUE;
        return this.f26266b.h(null, null, this);
    }
}
