package tu;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f52591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f52592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f52593c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(m0 m0Var, xy.c cVar) {
        super(cVar);
        this.f52592b = m0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f52591a = obj;
        this.f52593c |= Integer.MIN_VALUE;
        return m0.a(this.f52592b, this);
    }
}
