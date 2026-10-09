package d1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f22936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f22937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a00.e f22938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f22939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f22940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r f22941f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f22942t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(r rVar, xy.c cVar) {
        super(cVar);
        this.f22941f = rVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f22940e = obj;
        this.f22942t |= Integer.MIN_VALUE;
        return r.a(this.f22941f, null, 0L, null, this);
    }
}
