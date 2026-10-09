package gp;

/* JADX INFO: loaded from: classes3.dex */
public final class i1 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f29394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f29396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uz.j f29397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29398e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(g1 g1Var, vy.d dVar) {
        super(dVar);
        this.f29396c = g1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f29394a = obj;
        this.f29395b |= Integer.MIN_VALUE;
        return this.f29396c.emit(null, this);
    }
}
