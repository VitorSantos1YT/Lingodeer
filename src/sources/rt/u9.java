package rt;

/* JADX INFO: loaded from: classes4.dex */
public final class u9 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f50488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f50489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gp.g1 f50490c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9(gp.g1 g1Var, vy.d dVar) {
        super(dVar);
        this.f50490c = g1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f50488a = obj;
        this.f50489b |= Integer.MIN_VALUE;
        return this.f50490c.emit(null, this);
    }
}
