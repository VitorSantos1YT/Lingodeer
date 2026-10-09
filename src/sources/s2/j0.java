package s2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f51317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f51318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f51319c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(k0 k0Var, xy.a aVar) {
        super(aVar);
        this.f51318b = k0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f51317a = obj;
        this.f51319c |= Integer.MIN_VALUE;
        return this.f51318b.i(0L, null, this);
    }
}
