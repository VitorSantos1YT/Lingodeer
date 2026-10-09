package gp;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class p extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f29472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f29473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f29474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w f29475f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f29476t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(w wVar, xy.c cVar) {
        super(cVar);
        this.f29475f = wVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f29474e = obj;
        this.f29476t |= Integer.MIN_VALUE;
        return w.c(this.f29475f, 0, false, this);
    }
}
