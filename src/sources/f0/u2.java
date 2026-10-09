package f0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u2 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public qy.e f26448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public fz.a f26449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f26450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f26451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v2 f26452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f26453f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(v2 v2Var, xy.c cVar) {
        super(cVar);
        this.f26452e = v2Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f26451d = obj;
        this.f26453f |= Integer.MIN_VALUE;
        return this.f26452e.a(null, null, this);
    }
}
