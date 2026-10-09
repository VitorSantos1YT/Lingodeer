package n5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c0 f43234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x f43235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f43236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f43237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c0 f43238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f43239f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(c0 c0Var, xy.c cVar) {
        super(cVar);
        this.f43238e = c0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f43237d = obj;
        this.f43239f |= Integer.MIN_VALUE;
        return this.f43238e.a(null, this);
    }
}
