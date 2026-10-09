package cu;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f22488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f22489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22490c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g gVar, xy.c cVar) {
        super(cVar);
        this.f22489b = gVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f22488a = obj;
        this.f22490c |= Integer.MIN_VALUE;
        return g.a(this.f22489b, null, this);
    }
}
