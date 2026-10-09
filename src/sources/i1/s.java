package i1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ob.s f34064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f34065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ob.s f34066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f34067d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ob.s sVar, xy.c cVar) {
        super(cVar);
        this.f34066c = sVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f34065b = obj;
        this.f34067d |= Integer.MIN_VALUE;
        return this.f34066c.d(null, null, null, this);
    }
}
