package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f49705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f49706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f49707c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, xy.c cVar) {
        super(cVar);
        this.f49706b = jVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f49705a = obj;
        this.f49707c |= Integer.MIN_VALUE;
        return j.b(this.f49706b, this);
    }
}
