package rt;

/* JADX INFO: loaded from: classes4.dex */
public final class w2 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f50567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f50568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0.g0 f50569c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(d0.g0 g0Var, vy.d dVar) {
        super(dVar);
        this.f50569c = g0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f50567a = obj;
        this.f50568b |= Integer.MIN_VALUE;
        return this.f50569c.emit(null, this);
    }
}
