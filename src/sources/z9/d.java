package z9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f59036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ka.a f59037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f59038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f59039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f59040e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, xy.c cVar) {
        super(cVar);
        this.f59039d = eVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f59038c = obj;
        this.f59040e |= Integer.MIN_VALUE;
        return this.f59039d.e(null, null, this);
    }
}
