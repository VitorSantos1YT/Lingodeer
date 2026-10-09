package gp;

/* JADX INFO: loaded from: classes3.dex */
public final class c1 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f29353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bh.e0 f29355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uz.j f29356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29357e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(bh.e0 e0Var, vy.d dVar) {
        super(dVar);
        this.f29355c = e0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f29353a = obj;
        this.f29354b |= Integer.MIN_VALUE;
        return this.f29355c.emit(null, this);
    }
}
