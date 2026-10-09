package rt;

/* JADX INFO: loaded from: classes4.dex */
public final class j9 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f49924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f49925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k9 f49926c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9(k9 k9Var, vy.d dVar) {
        super(dVar);
        this.f49926c = k9Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f49924a = obj;
        this.f49925b |= Integer.MIN_VALUE;
        return this.f49926c.emit(null, this);
    }
}
