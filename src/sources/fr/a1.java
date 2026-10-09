package fr;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a1 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f27386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v1 f27388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27389d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(v1 v1Var, xy.c cVar) {
        super(cVar);
        this.f27388c = v1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f27387b = obj;
        this.f27389d |= Integer.MIN_VALUE;
        return v1.a(this.f27388c, null, this);
    }
}
