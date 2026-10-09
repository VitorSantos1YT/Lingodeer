package f0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f26338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1 f26339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26340c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(l1 l1Var, xy.c cVar) {
        super(cVar);
        this.f26339b = l1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f26338a = obj;
        this.f26340c |= Integer.MIN_VALUE;
        return this.f26339b.f(this);
    }
}
