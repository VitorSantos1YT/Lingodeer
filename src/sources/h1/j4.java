package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j4 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k4 f30472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f30473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k4 f30474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f30475d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(k4 k4Var, xy.c cVar) {
        super(cVar);
        this.f30474c = k4Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f30473b = obj;
        this.f30475d |= Integer.MIN_VALUE;
        return this.f30474c.b(this);
    }
}
