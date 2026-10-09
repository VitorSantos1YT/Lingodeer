package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u2 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f50467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e3 f50468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f50469c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(e3 e3Var, xy.c cVar) {
        super(cVar);
        this.f50468b = e3Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f50467a = obj;
        this.f50469c |= Integer.MIN_VALUE;
        return this.f50468b.J(this);
    }
}
