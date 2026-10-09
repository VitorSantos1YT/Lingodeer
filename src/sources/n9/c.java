package n9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b1.b f43505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ry.v f43506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f43507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b1.b f43508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f43509e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b1.b bVar, vy.d dVar) {
        super(dVar);
        this.f43508d = bVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f43507c = obj;
        this.f43509e |= Integer.MIN_VALUE;
        return this.f43508d.e(null, this);
    }
}
