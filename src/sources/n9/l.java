package n9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a0.d0 f43623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public kotlin.jvm.internal.y f43624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f43625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0.d0 f43626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f43627e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(a0.d0 d0Var, vy.d dVar) {
        super(dVar);
        this.f43626d = d0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f43625c = obj;
        this.f43627e |= Integer.MIN_VALUE;
        return this.f43626d.emit(null, this);
    }
}
