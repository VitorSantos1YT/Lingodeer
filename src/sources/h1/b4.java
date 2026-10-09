package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b4 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c4 f30028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f30029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f30030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c4 f30031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f30032e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(c4 c4Var, xy.c cVar) {
        super(cVar);
        this.f30031d = c4Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f30030c = obj;
        this.f30032e |= Integer.MIN_VALUE;
        return this.f30031d.D(0L, 0L, this);
    }
}
