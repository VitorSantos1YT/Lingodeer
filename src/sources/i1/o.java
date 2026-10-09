package i1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a0.d0 f34050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f34051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f34052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0.d0 f34053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f34054e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(a0.d0 d0Var, vy.d dVar) {
        super(dVar);
        this.f34053d = d0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f34052c = obj;
        this.f34054e |= Integer.MIN_VALUE;
        return this.f34053d.emit(null, this);
    }
}
