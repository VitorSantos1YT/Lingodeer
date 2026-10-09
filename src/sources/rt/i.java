package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r8 f49854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f49855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f49856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f49857d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, xy.c cVar) {
        super(cVar);
        this.f49856c = jVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f49855b = obj;
        this.f49857d |= Integer.MIN_VALUE;
        return j.c(this.f49856c, null, this);
    }
}
