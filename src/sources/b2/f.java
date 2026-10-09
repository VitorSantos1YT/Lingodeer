package b2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public tz.c f3857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f3859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3860d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, xy.c cVar) {
        super(cVar);
        this.f3859c = iVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f3858b = obj;
        this.f3860d |= Integer.MIN_VALUE;
        return this.f3859c.a(this);
    }
}
