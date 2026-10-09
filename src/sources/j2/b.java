package j2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f35540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f35541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f35542c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, xy.c cVar2) {
        super(cVar2);
        this.f35541b = cVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f35540a = obj;
        this.f35542c |= Integer.MIN_VALUE;
        return this.f35541b.i(this);
    }
}
