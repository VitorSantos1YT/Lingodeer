package n5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ob.i f43369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a00.a f43370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f43371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ob.i f43372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f43373e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(ob.i iVar, xy.c cVar) {
        super(cVar);
        this.f43372d = iVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f43371c = obj;
        this.f43373e |= Integer.MIN_VALUE;
        return this.f43372d.u(this);
    }
}
