package f0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r f26347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f26348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n0 f26349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26350d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(n0 n0Var, xy.c cVar) {
        super(cVar);
        this.f26349c = n0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f26348b = obj;
        this.f26350d |= Integer.MIN_VALUE;
        return n0.Y0(this.f26349c, null, this);
    }
}
