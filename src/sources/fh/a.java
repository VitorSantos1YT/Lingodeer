package fh;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends xy.c {
    public final /* synthetic */ e H;
    public int K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f27269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f27270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a00.a f27271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f27274f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f27275t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, xy.c cVar) {
        super(cVar);
        this.H = eVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f27275t = obj;
        this.K |= Integer.MIN_VALUE;
        return this.H.a(null, null, 0, 0, this);
    }
}
