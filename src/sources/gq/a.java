package gq;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f29564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a00.e f29565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f29566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f29567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29568e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, xy.c cVar) {
        super(cVar);
        this.f29567d = dVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f29566c = obj;
        this.f29568e |= Integer.MIN_VALUE;
        return this.f29567d.a(false, this);
    }
}
