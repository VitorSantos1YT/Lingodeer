package i1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ob.s f34057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f34058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ob.s f34059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f34060d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ob.s sVar, xy.c cVar) {
        super(cVar);
        this.f34059c = sVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f34058b = obj;
        this.f34060d |= Integer.MIN_VALUE;
        return this.f34059c.c(null, null, this);
    }
}
