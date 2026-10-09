package om;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class p extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f45627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ oi.c f45628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f45629c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(oi.c cVar, xy.c cVar2) {
        super(cVar2);
        this.f45628b = cVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f45627a = obj;
        this.f45629c |= Integer.MIN_VALUE;
        return this.f45628b.r(this);
    }
}
