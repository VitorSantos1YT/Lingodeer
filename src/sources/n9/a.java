package n9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f43475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ry.v f43476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f43477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f43478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f43479e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, vy.d dVar) {
        super(dVar);
        this.f43478d = bVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f43477c = obj;
        this.f43479e |= Integer.MIN_VALUE;
        return this.f43478d.a(null, this);
    }
}
