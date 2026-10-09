package n9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ij.d f43573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ry.v f43574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a00.e f43575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f43576d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ij.d f43577e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f43578f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ij.d dVar, xy.c cVar) {
        super(cVar);
        this.f43577e = dVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f43576d = obj;
        this.f43578f |= Integer.MIN_VALUE;
        return this.f43577e.A(null, this);
    }
}
