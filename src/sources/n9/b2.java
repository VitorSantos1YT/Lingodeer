package n9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b2 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public bq.f f43499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public rz.g1 f43500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a00.a f43501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f43502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bq.f f43503e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f43504f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(bq.f fVar, xy.c cVar) {
        super(cVar);
        this.f43503e = fVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f43502d = obj;
        this.f43504f |= Integer.MIN_VALUE;
        return this.f43503e.y(null, this);
    }
}
