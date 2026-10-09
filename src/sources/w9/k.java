package w9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f54821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t7.d f54822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f54823c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(t7.d dVar, xy.c cVar) {
        super(cVar);
        this.f54822b = dVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f54821a = obj;
        this.f54823c |= Integer.MIN_VALUE;
        return this.f54822b.d(null, this);
    }
}
