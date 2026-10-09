package ac;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ag.c f544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f547e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f548f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, xy.c cVar) {
        super(cVar);
        this.f547e = mVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f546d = obj;
        this.f548f |= Integer.MIN_VALUE;
        return this.f547e.a(this);
    }
}
