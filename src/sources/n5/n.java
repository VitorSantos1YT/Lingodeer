package n5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v f43326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a00.e f43327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f43328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f43329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f43330e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(v vVar, xy.c cVar) {
        super(cVar);
        this.f43329d = vVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f43328c = obj;
        this.f43330e |= Integer.MIN_VALUE;
        return v.b(this.f43329d, this);
    }
}
