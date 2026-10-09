package d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h0.f f22801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f22802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w0 f22803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22804d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(w0 w0Var, xy.c cVar) {
        super(cVar);
        this.f22803c = w0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f22802b = obj;
        this.f22804d |= Integer.MIN_VALUE;
        return w0.T0(this.f22803c, this);
    }
}
