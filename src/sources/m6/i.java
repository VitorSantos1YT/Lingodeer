package m6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f40891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public xy.i f40892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a00.e f40893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f40894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f40895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f40896f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar, xy.c cVar) {
        super(cVar);
        this.f40895e = mVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f40894d = obj;
        this.f40896f |= Integer.MIN_VALUE;
        return this.f40895e.a(null, this);
    }
}
