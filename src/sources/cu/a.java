package cu;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f22485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f22486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22487c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g gVar, xy.c cVar) {
        super(cVar);
        this.f22486b = gVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f22485a = obj;
        this.f22487c |= Integer.MIN_VALUE;
        return this.f22486b.g(null, this);
    }
}
