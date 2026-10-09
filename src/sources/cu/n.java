package cu;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a00.e f22542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f22543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f22544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22545d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(t tVar, vy.d dVar) {
        super(dVar);
        this.f22544c = tVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f22543b = obj;
        this.f22545d |= Integer.MIN_VALUE;
        return t.b(this.f22544c, this);
    }
}
