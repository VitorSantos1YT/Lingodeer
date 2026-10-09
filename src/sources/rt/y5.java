package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class y5 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f50680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f50681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z5 f50682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f50683d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(z5 z5Var, xy.c cVar) {
        super(cVar);
        this.f50682c = z5Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f50681b = obj;
        this.f50683d |= Integer.MIN_VALUE;
        return this.f50682c.b(0, this);
    }
}
