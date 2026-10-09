package gp;

/* JADX INFO: loaded from: classes3.dex */
public final class h1 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f29388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f29390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uz.j f29391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29392e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(g1 g1Var, vy.d dVar) {
        super(dVar);
        this.f29390c = g1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f29388a = obj;
        this.f29389b |= Integer.MIN_VALUE;
        return this.f29390c.emit(null, this);
    }
}
