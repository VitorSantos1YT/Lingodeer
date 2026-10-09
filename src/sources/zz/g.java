package zz;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f59655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f59656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f59657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f59658d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, xy.c cVar) {
        super(cVar);
        this.f59657c = hVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f59656b = obj;
        this.f59658d |= Integer.MIN_VALUE;
        return this.f59657c.d(this);
    }
}
