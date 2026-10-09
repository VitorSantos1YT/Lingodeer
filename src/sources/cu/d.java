package cu;

import bh.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f22498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f22500c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e0 e0Var, vy.d dVar) {
        super(dVar);
        this.f22500c = e0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f22498a = obj;
        this.f22499b |= Integer.MIN_VALUE;
        return this.f22500c.emit(null, this);
    }
}
