package fr;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class p2 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f27775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i3 f27776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27777c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(i3 i3Var, xy.c cVar) {
        super(cVar);
        this.f27776b = i3Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f27775a = obj;
        this.f27777c |= Integer.MIN_VALUE;
        return this.f27776b.f(this);
    }
}
