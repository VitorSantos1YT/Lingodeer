package fr;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class l0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f27665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0 f27666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27667c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(o0 o0Var, xy.c cVar) {
        super(cVar);
        this.f27666b = o0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f27665a = obj;
        this.f27667c |= Integer.MIN_VALUE;
        return this.f27666b.O(false, this);
    }
}
