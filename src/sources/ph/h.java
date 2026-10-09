package ph;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f46869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f46870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f46871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f46872d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, vy.d dVar) {
        super(dVar);
        this.f46871c = iVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f46870b = obj;
        this.f46872d |= Integer.MIN_VALUE;
        return this.f46871c.a(null, this);
    }
}
