package z2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f58598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f58599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f58600c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(m0 m0Var, xy.c cVar) {
        super(cVar);
        this.f58599b = m0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f58598a = obj;
        this.f58600c |= Integer.MIN_VALUE;
        return this.f58599b.a(null, this);
    }
}
