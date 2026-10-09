package n5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f43340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v f43341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public rz.t f43342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f43343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v f43344e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f43345f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(v vVar, xy.c cVar) {
        super(cVar);
        this.f43344e = vVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f43343d = obj;
        this.f43345f |= Integer.MIN_VALUE;
        return v.c(this.f43344e, null, this);
    }
}
