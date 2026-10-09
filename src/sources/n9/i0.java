package n9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j0 f43586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public gh.o f43587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f43588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0 f43589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f43590e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(j0 j0Var, xy.c cVar) {
        super(cVar);
        this.f43589d = j0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f43588c = obj;
        this.f43590e |= Integer.MIN_VALUE;
        return j0.a(this.f43589d, null, this);
    }
}
