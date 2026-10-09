package d1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f23022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z0 f23023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23024c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(z0 z0Var, xy.c cVar) {
        super(cVar);
        this.f23023b = z0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f23022a = obj;
        this.f23024c |= Integer.MIN_VALUE;
        return z0.b(this.f23023b, this);
    }
}
