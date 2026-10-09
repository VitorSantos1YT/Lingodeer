package rt;

/* JADX INFO: loaded from: classes4.dex */
public final class p9 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f50243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f50244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gp.g1 f50245c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9(gp.g1 g1Var, vy.d dVar) {
        super(dVar);
        this.f50245c = g1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f50243a = obj;
        this.f50244b |= Integer.MIN_VALUE;
        return this.f50245c.emit(null, this);
    }
}
