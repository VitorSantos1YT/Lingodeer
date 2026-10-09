package fr;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a4 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x4 f27398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27399d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(x4 x4Var, xy.c cVar) {
        super(cVar);
        this.f27398c = x4Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f27397b = obj;
        this.f27399d |= Integer.MIN_VALUE;
        return x4.c(this.f27398c, 0, this);
    }
}
