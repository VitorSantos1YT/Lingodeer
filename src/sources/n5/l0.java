package n5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f43310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f43311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f43312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f43313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0 f43314e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f43315f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(n0 n0Var, xy.c cVar) {
        super(cVar);
        this.f43314e = n0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f43313d = obj;
        this.f43315f |= Integer.MIN_VALUE;
        return this.f43314e.b(null, this);
    }
}
