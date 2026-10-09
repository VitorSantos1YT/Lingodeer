package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ua extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f50491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bb f50492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f50493c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua(bb bbVar, xy.c cVar) {
        super(cVar);
        this.f50492b = bbVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f50491a = obj;
        this.f50493c |= Integer.MIN_VALUE;
        return this.f50492b.b(null, this);
    }
}
