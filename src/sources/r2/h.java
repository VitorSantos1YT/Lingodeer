package r2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f48760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f48761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f48762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f48763d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, xy.c cVar) {
        super(cVar);
        this.f48762c = iVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f48761b = obj;
        this.f48763d |= Integer.MIN_VALUE;
        return this.f48762c.W(0L, this);
    }
}
