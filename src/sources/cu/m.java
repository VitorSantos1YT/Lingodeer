package cu;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f22539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f22540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22541c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(t tVar, xy.c cVar) {
        super(cVar);
        this.f22540b = tVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f22539a = obj;
        this.f22541c |= Integer.MIN_VALUE;
        return this.f22540b.f(null, false, false, this);
    }
}
