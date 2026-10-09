package uz;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k1 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l1 f53336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public vz.o f53337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f53338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1 f53339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f53340e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(l1 l1Var, xy.c cVar) {
        super(cVar);
        this.f53339d = l1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f53338c = obj;
        this.f53340e |= Integer.MIN_VALUE;
        return this.f53339d.a(this);
    }
}
