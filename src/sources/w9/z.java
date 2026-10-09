package w9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d0.g0 f54878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f54879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f54880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0.g0 f54881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f54882e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(d0.g0 g0Var, vy.d dVar) {
        super(dVar);
        this.f54881d = g0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f54880c = obj;
        this.f54882e |= Integer.MIN_VALUE;
        return this.f54881d.a(null, this);
    }
}
