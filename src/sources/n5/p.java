package n5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v f43349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a00.e f43350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f43351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f43352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f43353e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(v vVar, xy.c cVar) {
        super(cVar);
        this.f43352d = vVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f43351c = obj;
        this.f43353e |= Integer.MIN_VALUE;
        return v.d(this.f43352d, this);
    }
}
