package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class t9 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f50431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f50432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ot.j1 f50433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f50434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y9 f50435e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f50436f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9(y9 y9Var, xy.c cVar) {
        super(cVar);
        this.f50435e = y9Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f50434d = obj;
        this.f50436f |= Integer.MIN_VALUE;
        return this.f50435e.u(false, false, this);
    }
}
