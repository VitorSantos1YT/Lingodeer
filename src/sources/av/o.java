package av;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f3176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a00.a f3177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f3179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f3180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3181f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, xy.c cVar) {
        super(cVar);
        this.f3180e = qVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f3179d = obj;
        this.f3181f |= Integer.MIN_VALUE;
        return this.f3180e.e(this);
    }
}
