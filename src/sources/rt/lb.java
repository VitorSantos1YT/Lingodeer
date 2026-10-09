package rt;

/* JADX INFO: loaded from: classes4.dex */
public final class lb extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f50028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f50029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0.d0 f50030c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb(a0.d0 d0Var, vy.d dVar) {
        super(dVar);
        this.f50030c = d0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f50028a = obj;
        this.f50029b |= Integer.MIN_VALUE;
        return this.f50030c.emit(null, this);
    }
}
