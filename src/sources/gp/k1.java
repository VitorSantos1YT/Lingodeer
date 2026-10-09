package gp;

/* JADX INFO: loaded from: classes3.dex */
public final class k1 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f29418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f29420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uz.j f29421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29422e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(g1 g1Var, vy.d dVar) {
        super(dVar);
        this.f29420c = g1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f29418a = obj;
        this.f29419b |= Integer.MIN_VALUE;
        return this.f29420c.emit(null, this);
    }
}
