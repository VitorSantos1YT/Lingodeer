package gq;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f29608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f29609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29610d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(u uVar, xy.c cVar) {
        super(cVar);
        this.f29609c = uVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f29608b = obj;
        this.f29610d |= Integer.MIN_VALUE;
        return this.f29609c.f(this);
    }
}
