package f0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f26319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n0 f26320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26321c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(n0 n0Var, xy.c cVar) {
        super(cVar);
        this.f26320b = n0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f26319a = obj;
        this.f26321c |= Integer.MIN_VALUE;
        return n0.W0(this.f26320b, this);
    }
}
