package au;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k0 f3005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f3006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f3008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k0 f3009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3010f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(k0 k0Var, xy.c cVar) {
        super(cVar);
        this.f3009e = k0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f3008d = obj;
        this.f3010f |= Integer.MIN_VALUE;
        return k0.b(this.f3009e, null, 0, this);
    }
}
