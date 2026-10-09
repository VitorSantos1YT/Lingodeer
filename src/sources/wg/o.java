package wg;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f55156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f55157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f55158c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, xy.c cVar) {
        super(cVar);
        this.f55157b = qVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f55156a = obj;
        this.f55158c |= Integer.MIN_VALUE;
        return this.f55157b.a(null, this);
    }
}
