package n5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ob.i f43271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f43272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ob.i f43273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f43274d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ob.i iVar, xy.c cVar) {
        super(cVar);
        this.f43273c = iVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f43272b = obj;
        this.f43274d |= Integer.MIN_VALUE;
        return this.f43273c.i(this);
    }
}
