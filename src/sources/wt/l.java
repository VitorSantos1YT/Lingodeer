package wt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f55301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public vt.k0 f55302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f55303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f55304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f55305e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, xy.c cVar) {
        super(cVar);
        this.f55304d = mVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f55303c = obj;
        this.f55305e |= Integer.MIN_VALUE;
        return this.f55304d.j(0, this);
    }
}
