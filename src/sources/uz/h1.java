package uz;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h1 extends xy.c {
    public int H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i1 f53308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f53309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j1 f53310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public rz.g1 f53311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f53312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f53313f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i1 f53314t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(i1 i1Var, vy.d dVar) {
        super(dVar);
        this.f53314t = i1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f53313f = obj;
        this.H |= Integer.MIN_VALUE;
        return this.f53314t.collect(null, this);
    }
}
