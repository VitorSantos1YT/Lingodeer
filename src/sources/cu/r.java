package cu;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class r extends xy.c {
    public int H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f22560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u f22561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f22562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f22564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f22565f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ t f22566t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(t tVar, xy.c cVar) {
        super(cVar);
        this.f22566t = tVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f22565f = obj;
        this.H |= Integer.MIN_VALUE;
        return this.f22566t.i(null, null, this);
    }
}
