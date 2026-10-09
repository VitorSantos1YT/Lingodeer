package y9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f57518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f57519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f57520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f57521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f57522e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f57523f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s sVar, xy.c cVar) {
        super(cVar);
        this.f57522e = sVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f57521d = obj;
        this.f57523f |= Integer.MIN_VALUE;
        return this.f57522e.f(false, this);
    }
}
