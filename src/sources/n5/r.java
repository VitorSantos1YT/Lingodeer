package n5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v f43363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x0 f43364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f43365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f43366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v f43367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f43368f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(v vVar, vy.d dVar) {
        super(dVar);
        this.f43367e = vVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f43366d = obj;
        this.f43368f |= Integer.MIN_VALUE;
        return v.e(this.f43367e, false, this);
    }
}
