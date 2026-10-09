package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i4 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k4 f30406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h0.h f30407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f30408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k4 f30409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f30410e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(k4 k4Var, xy.c cVar) {
        super(cVar);
        this.f30409d = k4Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f30408c = obj;
        this.f30410e |= Integer.MIN_VALUE;
        return this.f30409d.a(null, this);
    }
}
