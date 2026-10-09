package s2;

import rz.z1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z1 f51305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f51306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k0 f51307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f51308d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(k0 k0Var, xy.c cVar) {
        super(cVar);
        this.f51307c = k0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f51306b = obj;
        this.f51308d |= Integer.MIN_VALUE;
        return this.f51307c.f(0L, null, this);
    }
}
