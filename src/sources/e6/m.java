package e6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f24973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f24974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24975c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, xy.c cVar) {
        super(cVar);
        this.f24974b = nVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f24973a = obj;
        this.f24975c |= Integer.MIN_VALUE;
        return this.f24974b.a(null, this);
    }
}
