package gp;

/* JADX INFO: loaded from: classes3.dex */
public final class v0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f29519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bh.e0 f29521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uz.j f29522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29523e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(bh.e0 e0Var, vy.d dVar) {
        super(dVar);
        this.f29521c = e0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f29519a = obj;
        this.f29520b |= Integer.MIN_VALUE;
        return this.f29521c.emit(null, this);
    }
}
