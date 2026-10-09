package f0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v1 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f26466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f26467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w1 f26468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26469d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(w1 w1Var, xy.c cVar) {
        super(cVar);
        this.f26468c = w1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f26467b = obj;
        this.f26469d |= Integer.MIN_VALUE;
        return this.f26468c.D(0L, 0L, this);
    }
}
