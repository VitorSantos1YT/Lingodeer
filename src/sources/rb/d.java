package rb;

import gp.g1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f49068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f49069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f49070c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g1 g1Var, vy.d dVar) {
        super(dVar);
        this.f49070c = g1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f49068a = obj;
        this.f49069b |= Integer.MIN_VALUE;
        return this.f49070c.emit(null, this);
    }
}
