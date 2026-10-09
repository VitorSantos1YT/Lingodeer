package p5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f46299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f46300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f46301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f46302d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, xy.c cVar2) {
        super(cVar2);
        this.f46301c = cVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f46300b = obj;
        this.f46302d |= Integer.MIN_VALUE;
        return this.f46301c.a(null, this);
    }
}
