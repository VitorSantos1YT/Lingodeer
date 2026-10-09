package dv;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f24483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f24484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24485c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(u0 u0Var, xy.c cVar) {
        super(cVar);
        this.f24484b = u0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f24483a = obj;
        this.f24485c |= Integer.MIN_VALUE;
        return this.f24484b.m(null, this);
    }
}
