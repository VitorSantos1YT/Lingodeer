package dr;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Exception f23576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f23577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f23578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23579d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, xy.c cVar) {
        super(cVar);
        this.f23578c = oVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f23577b = obj;
        this.f23579d |= Integer.MIN_VALUE;
        return o.b(this.f23578c, this);
    }
}
