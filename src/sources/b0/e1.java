package b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f3506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1 f3508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3509d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(f1 f1Var, xy.c cVar) {
        super(cVar);
        this.f3508c = f1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f3507b = obj;
        this.f3509d |= Integer.MIN_VALUE;
        return f1.v0(this.f3508c, this);
    }
}
