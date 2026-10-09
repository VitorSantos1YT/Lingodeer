package rt;

/* JADX INFO: loaded from: classes4.dex */
public final class x9 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f50648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f50649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t6 f50650c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9(t6 t6Var, vy.d dVar) {
        super(dVar);
        this.f50650c = t6Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f50648a = obj;
        this.f50649b |= Integer.MIN_VALUE;
        return this.f50650c.emit(null, this);
    }
}
