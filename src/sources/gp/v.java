package gp;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class v extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f29515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f29516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1.b f29517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29518d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(b1.b bVar, vy.d dVar) {
        super(dVar);
        this.f29517c = bVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f29516b = obj;
        this.f29518d |= Integer.MIN_VALUE;
        return this.f29517c.g(false, this);
    }
}
