package uz;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class x extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a0.d0 f53429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f53430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f53431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0.d0 f53432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f53433e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(a0.d0 d0Var, vy.d dVar) {
        super(dVar);
        this.f53432d = d0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f53431c = obj;
        this.f53433e |= Integer.MIN_VALUE;
        return this.f53432d.emit(null, this);
    }
}
