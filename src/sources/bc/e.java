package bc;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f4100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f4101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f4102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f4103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4104e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, xy.c cVar) {
        super(cVar);
        this.f4103d = gVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f4102c = obj;
        this.f4104e |= Integer.MIN_VALUE;
        return this.f4103d.d(null, this);
    }
}
