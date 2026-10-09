package zu;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g2 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b2 f59423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f59424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f59425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i2 f59426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f59427e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(i2 i2Var, xy.c cVar) {
        super(cVar);
        this.f59426d = i2Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f59425c = obj;
        this.f59427e |= Integer.MIN_VALUE;
        return this.f59426d.b(null, 0L, this);
    }
}
