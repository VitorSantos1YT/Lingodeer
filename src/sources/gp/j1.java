package gp;

/* JADX INFO: loaded from: classes3.dex */
public final class j1 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f29406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f29408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uz.j f29409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29410e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(g1 g1Var, vy.d dVar) {
        super(dVar);
        this.f29408c = g1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f29406a = obj;
        this.f29407b |= Integer.MIN_VALUE;
        return this.f29408c.emit(null, this);
    }
}
