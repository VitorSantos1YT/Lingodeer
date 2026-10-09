package cu;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a00.e f22567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f22568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f22569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22570d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, xy.c cVar) {
        super(cVar);
        this.f22569c = tVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f22568b = obj;
        this.f22570d |= Integer.MIN_VALUE;
        return t.c(this.f22569c, this);
    }
}
