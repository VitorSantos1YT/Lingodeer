package p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f2.c f46239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f46240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f46242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f46243e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f46244f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f46245t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, xy.c cVar2) {
        super(cVar2);
        this.f46244f = cVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f46243e = obj;
        this.f46245t |= Integer.MIN_VALUE;
        return this.f46244f.a(null, this);
    }
}
