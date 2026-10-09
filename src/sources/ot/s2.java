package ot;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s2 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f45989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u2 f45990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f45991c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(u2 u2Var, xy.c cVar) {
        super(cVar);
        this.f45990b = u2Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f45989a = obj;
        this.f45991c |= Integer.MIN_VALUE;
        return u2.a(this.f45990b, null, null, this);
    }
}
