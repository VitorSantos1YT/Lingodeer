package rt;

/* JADX INFO: loaded from: classes4.dex */
public final class e6 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f49681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f49682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gp.g1 f49683c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6(gp.g1 g1Var, vy.d dVar) {
        super(dVar);
        this.f49683c = g1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f49681a = obj;
        this.f49682b |= Integer.MIN_VALUE;
        return this.f49683c.emit(null, this);
    }
}
