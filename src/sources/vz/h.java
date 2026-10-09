package vz;

import d0.g0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g0 f54341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f54342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f54343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g0 f54344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f54345e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g0 g0Var, vy.d dVar) {
        super(dVar);
        this.f54344d = g0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f54343c = obj;
        this.f54345e |= Integer.MIN_VALUE;
        return this.f54344d.emit(null, this);
    }
}
