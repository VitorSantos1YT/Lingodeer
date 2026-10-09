package gp;

/* JADX INFO: loaded from: classes3.dex */
public final class y0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f29553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bh.e0 f29555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uz.j f29556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29557e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(bh.e0 e0Var, vy.d dVar) {
        super(dVar);
        this.f29555c = e0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f29553a = obj;
        this.f29554b |= Integer.MIN_VALUE;
        return this.f29555c.emit(null, this);
    }
}
