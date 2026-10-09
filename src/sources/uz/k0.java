package uz;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f53333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n9.b f53334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f53335c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(n9.b bVar, vy.d dVar) {
        super(dVar);
        this.f53334b = bVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f53333a = obj;
        this.f53335c |= Integer.MIN_VALUE;
        return this.f53334b.emit(null, this);
    }
}
