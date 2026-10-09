package tz;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f52671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f52672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f52673c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, xy.c cVar) {
        super(cVar);
        this.f52672b = hVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f52671a = obj;
        this.f52673c |= Integer.MIN_VALUE;
        Object objC = h.C(this.f52672b, this);
        return objC == wy.a.COROUTINE_SUSPENDED ? objC : new o(objC);
    }
}
