package rt;

/* JADX INFO: loaded from: classes4.dex */
public final class r3 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f50329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f50330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gp.g1 f50331c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(gp.g1 g1Var, vy.d dVar) {
        super(dVar);
        this.f50331c = g1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f50329a = obj;
        this.f50330b |= Integer.MIN_VALUE;
        return this.f50331c.emit(null, this);
    }
}
