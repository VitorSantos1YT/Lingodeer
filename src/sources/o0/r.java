package o0;

import b0.i1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f44421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i1 f44422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f44423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f44424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f44425e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(t tVar, vy.d dVar) {
        super(dVar);
        this.f44424d = tVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f44423c = obj;
        this.f44425e |= Integer.MIN_VALUE;
        return this.f44424d.f(0, null, this);
    }
}
