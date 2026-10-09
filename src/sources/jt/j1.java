package jt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j1 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a00.e f36995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f36996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m1 f36997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f36998d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(m1 m1Var, xy.c cVar) {
        super(cVar);
        this.f36997c = m1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f36996b = obj;
        this.f36998d |= Integer.MIN_VALUE;
        return this.f36997c.a(this);
    }
}
