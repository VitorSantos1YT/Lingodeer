package fr;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f27617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f27619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27620d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, xy.c cVar) {
        super(cVar);
        this.f27619c = kVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f27618b = obj;
        this.f27620d |= Integer.MIN_VALUE;
        return this.f27619c.a(0L, this);
    }
}
