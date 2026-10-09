package rl;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f49267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f49268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f49269c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, xy.c cVar) {
        super(cVar);
        this.f49268b = hVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f49267a = obj;
        this.f49269c |= Integer.MIN_VALUE;
        return this.f49268b.b(null, this);
    }
}
