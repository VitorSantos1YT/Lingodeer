package fr;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b4 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x4 f27421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27422d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(x4 x4Var, xy.c cVar) {
        super(cVar);
        this.f27421c = x4Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f27420b = obj;
        this.f27422d |= Integer.MIN_VALUE;
        return x4.d(this.f27421c, 0, this);
    }
}
