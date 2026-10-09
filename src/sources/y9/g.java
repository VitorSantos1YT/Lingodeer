package y9;

import a0.d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f57482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f57483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public uz.j f57484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0 f57485d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(d0 d0Var, vy.d dVar) {
        super(dVar);
        this.f57485d = d0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f57482a = obj;
        this.f57483b |= Integer.MIN_VALUE;
        return this.f57485d.emit(null, this);
    }
}
