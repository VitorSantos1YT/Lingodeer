package n9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a0.d0 f43598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public kotlin.jvm.internal.y f43599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f43600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0.d0 f43601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f43602e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(a0.d0 d0Var, vy.d dVar) {
        super(dVar);
        this.f43601d = d0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f43600c = obj;
        this.f43602e |= Integer.MIN_VALUE;
        return this.f43601d.emit(null, this);
    }
}
