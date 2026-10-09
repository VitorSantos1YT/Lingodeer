package xb;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f55978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a00.g f55979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f55980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f55981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f55982e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, xy.c cVar) {
        super(cVar);
        this.f55981d = dVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f55980c = obj;
        this.f55982e |= Integer.MIN_VALUE;
        return this.f55981d.b(this);
    }
}
