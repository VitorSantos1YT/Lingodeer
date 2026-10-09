package j1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f35503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f35504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f35505c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, xy.c cVar) {
        super(cVar);
        this.f35504b = pVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f35503a = obj;
        this.f35505c |= Integer.MIN_VALUE;
        return this.f35504b.W(0L, this);
    }
}
