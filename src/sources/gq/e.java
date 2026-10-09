package gq;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f29582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f29583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f29584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29585d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, vy.d dVar) {
        super(dVar);
        this.f29584c = fVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f29583b = obj;
        this.f29585d |= Integer.MIN_VALUE;
        return this.f29584c.b(false, this);
    }
}
