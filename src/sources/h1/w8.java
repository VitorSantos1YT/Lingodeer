package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w8 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x8 f31246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v8 f31247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a00.a f31248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f31249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x8 f31250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f31251f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8(x8 x8Var, xy.c cVar) {
        super(cVar);
        this.f31250e = x8Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f31249d = obj;
        this.f31251f |= Integer.MIN_VALUE;
        return this.f31250e.a(null, this);
    }
}
