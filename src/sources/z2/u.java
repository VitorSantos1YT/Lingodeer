package z2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y.y f58674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public tz.c f58675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f58676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f58677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f58678e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(x xVar, xy.c cVar) {
        super(cVar);
        this.f58677d = xVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f58676c = obj;
        this.f58678e |= Integer.MIN_VALUE;
        return this.f58677d.l(this);
    }
}
