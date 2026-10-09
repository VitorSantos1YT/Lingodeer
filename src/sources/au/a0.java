package au;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f0 f2931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f2932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f2934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f0 f2935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2936f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(f0 f0Var, xy.c cVar) {
        super(cVar);
        this.f2935e = f0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f2934d = obj;
        this.f2936f |= Integer.MIN_VALUE;
        return f0.b(this.f2935e, null, 0, this);
    }
}
