package mt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g5 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r4 f41493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f41494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h5 f41495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f41496d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(h5 h5Var, vy.d dVar) {
        super(dVar);
        this.f41495c = h5Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f41494b = obj;
        this.f41496d |= Integer.MIN_VALUE;
        return this.f41495c.a(false, this);
    }
}
