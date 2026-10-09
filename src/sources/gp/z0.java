package gp;

/* JADX INFO: loaded from: classes3.dex */
public final class z0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f29559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bh.e0 f29561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uz.j f29562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29563e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(bh.e0 e0Var, vy.d dVar) {
        super(dVar);
        this.f29561c = e0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f29559a = obj;
        this.f29560b |= Integer.MIN_VALUE;
        return this.f29561c.emit(null, this);
    }
}
