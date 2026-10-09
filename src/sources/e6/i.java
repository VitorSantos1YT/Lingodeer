package e6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f24933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f24935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24936d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, xy.c cVar) {
        super(cVar);
        this.f24935c = lVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f24934b = obj;
        this.f24936d |= Integer.MIN_VALUE;
        return this.f24935c.c(null, null, this);
    }
}
