package rt;

/* JADX INFO: loaded from: classes4.dex */
public final class v6 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f50529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f50530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q6 f50531c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6(q6 q6Var, vy.d dVar) {
        super(dVar);
        this.f50531c = q6Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f50529a = obj;
        this.f50530b |= Integer.MIN_VALUE;
        return this.f50531c.emit(null, this);
    }
}
