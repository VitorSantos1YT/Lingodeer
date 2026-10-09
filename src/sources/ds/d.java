package ds;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f23602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f23603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f23604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f23605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23606e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, xy.c cVar) {
        super(cVar);
        this.f23605d = gVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f23604c = obj;
        this.f23606e |= Integer.MIN_VALUE;
        return this.f23605d.c(0L, 0L, this);
    }
}
