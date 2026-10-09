package y9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f57530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f57531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public fz.c f57532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f57533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f57534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s f57535f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f57536t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, xy.c cVar) {
        super(cVar);
        this.f57535f = sVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f57534e = obj;
        this.f57536t |= Integer.MIN_VALUE;
        return this.f57535f.a(null, null, this);
    }
}
