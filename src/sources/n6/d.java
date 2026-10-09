package n6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f43449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f43450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f43451c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, xy.c cVar) {
        super(cVar);
        this.f43450b = fVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f43449a = obj;
        this.f43451c |= Integer.MIN_VALUE;
        return this.f43450b.c(null, null, null, this);
    }
}
