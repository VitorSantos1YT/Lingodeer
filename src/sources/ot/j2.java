package ot;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j2 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f45862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l2 f45863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f45864c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(l2 l2Var, xy.c cVar) {
        super(cVar);
        this.f45863b = l2Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f45862a = obj;
        this.f45864c |= Integer.MIN_VALUE;
        Object objA = this.f45863b.a(0L, null, this);
        return objA == wy.a.COROUTINE_SUSPENDED ? objA : new qy.o(objA);
    }
}
