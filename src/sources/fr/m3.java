package fr;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m3 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f27701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f27702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f27703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n3 f27704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27705e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(n3 n3Var, xy.c cVar) {
        super(cVar);
        this.f27704d = n3Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f27703c = obj;
        this.f27705e |= Integer.MIN_VALUE;
        return this.f27704d.b(null, 0L, this);
    }
}
