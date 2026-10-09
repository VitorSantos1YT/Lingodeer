package uz;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m1 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f53360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n1 f53361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f53362c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(n1 n1Var, vy.d dVar) {
        super(dVar);
        this.f53361b = n1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f53360a = obj;
        this.f53362c |= Integer.MIN_VALUE;
        return this.f53361b.collect(null, this);
    }
}
