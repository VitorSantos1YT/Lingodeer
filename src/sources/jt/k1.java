package jt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k1 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f37008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m1 f37009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37010c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(m1 m1Var, xy.c cVar) {
        super(cVar);
        this.f37009b = m1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f37008a = obj;
        this.f37010c |= Integer.MIN_VALUE;
        return this.f37009b.b(this);
    }
}
