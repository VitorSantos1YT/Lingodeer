package gp;

/* JADX INFO: loaded from: classes3.dex */
public final class f1 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f29374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f29376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uz.j f29377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29378e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(g1 g1Var, vy.d dVar) {
        super(dVar);
        this.f29376c = g1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f29374a = obj;
        this.f29375b |= Integer.MIN_VALUE;
        return this.f29376c.emit(null, this);
    }
}
