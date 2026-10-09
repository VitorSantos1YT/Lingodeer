package wt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f55293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public vt.k0 f55294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f55295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f55296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f55297e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, xy.c cVar) {
        super(cVar);
        this.f55296d = mVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f55295c = obj;
        this.f55297e |= Integer.MIN_VALUE;
        return this.f55296d.i(0, this);
    }
}
