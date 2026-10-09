package tz;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f52674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f52675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f52676c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, xy.c cVar) {
        super(cVar);
        this.f52675b = hVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f52674a = obj;
        this.f52676c |= Integer.MIN_VALUE;
        Object objD = this.f52675b.D(null, 0, 0L, this);
        return objD == wy.a.COROUTINE_SUSPENDED ? objD : new o(objD);
    }
}
