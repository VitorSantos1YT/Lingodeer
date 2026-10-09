package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g5 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f49776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f49777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f49778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r5 f49779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f49780e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(r5 r5Var, xy.c cVar) {
        super(cVar);
        this.f49779d = r5Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f49778c = obj;
        this.f49780e |= Integer.MIN_VALUE;
        return this.f49779d.i(0L, this);
    }
}
