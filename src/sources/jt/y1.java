package jt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class y1 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l1.b1 f37271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f37272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a2 f37273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f37274d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(a2 a2Var, xy.c cVar) {
        super(cVar);
        this.f37273c = a2Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f37272b = obj;
        this.f37274d |= Integer.MIN_VALUE;
        return this.f37273c.b(this);
    }
}
