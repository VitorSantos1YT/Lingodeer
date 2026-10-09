package vt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f54277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f54278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f54279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f54280d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, xy.c cVar) {
        super(cVar);
        this.f54279c = rVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f54278b = obj;
        this.f54280d |= Integer.MIN_VALUE;
        return r.a(this.f54279c, null, null, null, null, this);
    }
}
