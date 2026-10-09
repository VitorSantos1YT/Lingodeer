package l1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t1 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.n f39469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f39470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u1 f39471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f39472d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(u1 u1Var, xy.c cVar) {
        super(cVar);
        this.f39471c = u1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f39470b = obj;
        this.f39472d |= Integer.MIN_VALUE;
        return this.f39471c.b(null, this);
    }
}
