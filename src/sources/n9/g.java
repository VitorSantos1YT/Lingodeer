package n9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ij.d f43561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a00.e f43562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f43563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ij.d f43564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f43565e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ij.d dVar, xy.c cVar) {
        super(cVar);
        this.f43564d = dVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f43563c = obj;
        this.f43565e |= Integer.MIN_VALUE;
        return this.f43564d.v(this);
    }
}
