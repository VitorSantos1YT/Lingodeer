package gh;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f29210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f29211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f29212c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(o oVar, xy.c cVar) {
        super(cVar);
        this.f29211b = oVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f29210a = obj;
        this.f29212c |= Integer.MIN_VALUE;
        return this.f29211b.e(0, 0, this);
    }
}
