package n9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f43685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1.b f43686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f43687c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(b1.b bVar, vy.d dVar) {
        super(dVar);
        this.f43686b = bVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f43685a = obj;
        this.f43687c |= Integer.MIN_VALUE;
        return this.f43686b.b(null, this);
    }
}
