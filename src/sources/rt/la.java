package rt;

/* JADX INFO: loaded from: classes4.dex */
public final class la extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f50025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f50026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gp.g1 f50027c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la(gp.g1 g1Var, vy.d dVar) {
        super(dVar);
        this.f50027c = g1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f50025a = obj;
        this.f50026b |= Integer.MIN_VALUE;
        return this.f50027c.emit(null, this);
    }
}
