package b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f3481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1 f3483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3484d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(f1 f1Var, xy.c cVar) {
        super(cVar);
        this.f3483c = f1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f3482b = obj;
        this.f3484d |= Integer.MIN_VALUE;
        return f1.u0(this.f3483c, this);
    }
}
