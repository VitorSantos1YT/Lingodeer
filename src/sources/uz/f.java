package uz;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f53289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f53290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f53291c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, vy.d dVar) {
        super(dVar);
        this.f53290b = gVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f53289a = obj;
        this.f53291c |= Integer.MIN_VALUE;
        return this.f53290b.emit(null, this);
    }
}
