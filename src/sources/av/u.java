package av;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f3197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3198c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(y yVar, xy.c cVar) {
        super(cVar);
        this.f3197b = yVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f3196a = obj;
        this.f3198c |= Integer.MIN_VALUE;
        return this.f3197b.b(this);
    }
}
