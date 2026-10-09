package zs;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f59362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f59363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f59364c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, xy.c cVar) {
        super(cVar);
        this.f59363b = fVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f59362a = obj;
        this.f59364c |= Integer.MIN_VALUE;
        return this.f59363b.b(null, null, this);
    }
}
