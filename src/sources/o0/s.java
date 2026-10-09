package o0;

import d0.l1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t f44426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l1 f44427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public xy.i f44428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f44429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f44430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f44431f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, xy.c cVar) {
        super(cVar);
        this.f44430e = tVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f44429d = obj;
        this.f44431f |= Integer.MIN_VALUE;
        return t.s(this.f44430e, null, null, this);
    }
}
