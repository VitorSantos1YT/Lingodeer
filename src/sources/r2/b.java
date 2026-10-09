package r2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f48743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f48744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f48745c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, xy.c cVar) {
        super(cVar);
        this.f48744b = dVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f48743a = obj;
        this.f48745c |= Integer.MIN_VALUE;
        return this.f48744b.a(0L, 0L, this);
    }
}
