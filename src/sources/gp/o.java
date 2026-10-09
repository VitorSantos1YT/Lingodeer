package gp;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f29462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a00.e f29463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f29464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f29465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29466e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(w wVar, xy.c cVar) {
        super(cVar);
        this.f29465d = wVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f29464c = obj;
        this.f29466e |= Integer.MIN_VALUE;
        return w.b(this.f29465d, 0L, this);
    }
}
