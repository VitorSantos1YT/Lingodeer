package gh;

import n9.s1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends xy.c {
    public int H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Exception f29203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s1 f29204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f29205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f29208f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o f29209t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o oVar, xy.c cVar) {
        super(cVar);
        this.f29209t = oVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f29208f = obj;
        this.H |= Integer.MIN_VALUE;
        return this.f29209t.d(null, 0, 0, null, 0, this);
    }
}
