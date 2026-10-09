package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class p5 extends xy.c {
    public t4 H;
    public /* synthetic */ Object K;
    public final /* synthetic */ r5 L;
    public int M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f50232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f50233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f50234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f50235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f50236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public kotlin.jvm.internal.w f50237f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public b5 f50238t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(r5 r5Var, xy.c cVar) {
        super(cVar);
        this.L = r5Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.K = obj;
        this.M |= Integer.MIN_VALUE;
        return r5.f(this.L, 0, this);
    }
}
