package gq;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class r extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f29625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f29626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f29627c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(u uVar, xy.c cVar) {
        super(cVar);
        this.f29626b = uVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f29625a = obj;
        this.f29627c |= Integer.MIN_VALUE;
        return u.b(this.f29626b, this);
    }
}
