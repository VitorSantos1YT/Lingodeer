package gp;

/* JADX INFO: loaded from: classes3.dex */
public final class b1 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f29344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bh.e0 f29346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uz.j f29347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29348e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(bh.e0 e0Var, vy.d dVar) {
        super(dVar);
        this.f29346c = e0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f29344a = obj;
        this.f29345b |= Integer.MIN_VALUE;
        return this.f29346c.emit(null, this);
    }
}
