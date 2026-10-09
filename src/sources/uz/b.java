package uz;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public tz.t f53256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f53257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f53258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f53259d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, xy.c cVar2) {
        super(cVar2);
        this.f53258c = cVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f53257b = obj;
        this.f53259d |= Integer.MIN_VALUE;
        return this.f53258c.f(null, this);
    }
}
