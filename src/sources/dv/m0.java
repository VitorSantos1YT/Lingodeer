package dv;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f24486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f24487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24488c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(u0 u0Var, xy.c cVar) {
        super(cVar);
        this.f24487b = u0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f24486a = obj;
        this.f24488c |= Integer.MIN_VALUE;
        return this.f24487b.o(null, null, this);
    }
}
