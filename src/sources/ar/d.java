package ar;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f2839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f2840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2841c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, xy.c cVar) {
        super(cVar);
        this.f2840b = eVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f2839a = obj;
        this.f2841c |= Integer.MIN_VALUE;
        return this.f2840b.d(this);
    }
}
