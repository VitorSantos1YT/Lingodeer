package d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f22808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f22809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22810c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(w0 w0Var, xy.c cVar) {
        super(cVar);
        this.f22809b = w0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f22808a = obj;
        this.f22810c |= Integer.MIN_VALUE;
        return w0.U0(this.f22809b, this);
    }
}
