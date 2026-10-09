package w9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f54874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f54875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g0 f54876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f54877d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(g0 g0Var, xy.c cVar) {
        super(cVar);
        this.f54876c = g0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f54875b = obj;
        this.f54877d |= Integer.MIN_VALUE;
        return g0.a(this.f54876c, null, this);
    }
}
