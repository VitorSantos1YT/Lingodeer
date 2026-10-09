package n9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c2 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public lp.b f43522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f43523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lp.b f43524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f43525d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(lp.b bVar, xy.c cVar) {
        super(cVar);
        this.f43524c = bVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f43523b = obj;
        this.f43525d |= Integer.MIN_VALUE;
        return this.f43524c.l(null, this);
    }
}
