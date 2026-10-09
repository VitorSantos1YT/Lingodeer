package n5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f43393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a00.e f43394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f43395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w0 f43396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f43397e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(w0 w0Var, xy.c cVar) {
        super(cVar);
        this.f43396d = w0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f43395c = obj;
        this.f43397e |= Integer.MIN_VALUE;
        return this.f43396d.b(null, this);
    }
}
