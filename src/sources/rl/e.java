package rl;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f49270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f49271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f49272c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, xy.c cVar) {
        super(cVar);
        this.f49271b = hVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f49270a = obj;
        this.f49272c |= Integer.MIN_VALUE;
        return this.f49271b.c(null, this);
    }
}
