package xq;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f56170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f56171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f56172c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, xy.c cVar2) {
        super(cVar2);
        this.f56171b = cVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f56170a = obj;
        this.f56172c |= Integer.MIN_VALUE;
        return this.f56171b.N(this);
    }
}
