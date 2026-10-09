package dr;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f23570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f23571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23572c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, xy.c cVar) {
        super(cVar);
        this.f23571b = oVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f23570a = obj;
        this.f23572c |= Integer.MIN_VALUE;
        return o.a(this.f23571b, this);
    }
}
