package y9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f57486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f57487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f57488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f57489d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, xy.c cVar) {
        super(cVar);
        this.f57488c = jVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f57487b = obj;
        this.f57489d |= Integer.MIN_VALUE;
        return this.f57488c.a(this);
    }
}
