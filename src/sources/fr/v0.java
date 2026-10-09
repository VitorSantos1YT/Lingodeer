package fr;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class v0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f27906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0 f27908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27909d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(x0 x0Var, xy.c cVar) {
        super(cVar);
        this.f27908c = x0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f27907b = obj;
        this.f27909d |= Integer.MIN_VALUE;
        return x0.a(this.f27908c, null, this);
    }
}
