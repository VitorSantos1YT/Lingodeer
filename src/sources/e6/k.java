package e6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f24949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f24951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24952d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, xy.c cVar) {
        super(cVar);
        this.f24951c = lVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f24950b = obj;
        this.f24952d |= Integer.MIN_VALUE;
        return this.f24951c.f(this);
    }
}
