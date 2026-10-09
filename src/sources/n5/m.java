package n5;

import gp.g1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f43316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f43318c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(g1 g1Var, vy.d dVar) {
        super(dVar);
        this.f43318c = g1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f43316a = obj;
        this.f43317b |= Integer.MIN_VALUE;
        return this.f43318c.emit(null, this);
    }
}
