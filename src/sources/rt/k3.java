package rt;

/* JADX INFO: loaded from: classes4.dex */
public final class k3 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f49963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f49964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gp.g1 f49965c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(gp.g1 g1Var, vy.d dVar) {
        super(dVar);
        this.f49965c = g1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f49963a = obj;
        this.f49964b |= Integer.MIN_VALUE;
        return this.f49965c.emit(null, this);
    }
}
