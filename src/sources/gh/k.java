package gh;

import n9.s1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s1 f29213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f29215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f29216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f29217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f29218f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, xy.c cVar) {
        super(cVar);
        this.f29217e = oVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f29216d = obj;
        this.f29218f |= Integer.MIN_VALUE;
        return this.f29217e.f(null, this);
    }
}
