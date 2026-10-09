package rl;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f49261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f49262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f49263c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h hVar, xy.c cVar) {
        super(cVar);
        this.f49262b = hVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f49261a = obj;
        this.f49263c |= Integer.MIN_VALUE;
        return this.f49262b.a(null, this);
    }
}
