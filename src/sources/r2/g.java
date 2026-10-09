package r2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f48755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f48756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f48757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f48758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f48759e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, xy.c cVar) {
        super(cVar);
        this.f48758d = iVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f48757c = obj;
        this.f48759e |= Integer.MIN_VALUE;
        return this.f48758d.D(0L, 0L, this);
    }
}
