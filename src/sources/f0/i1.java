package f0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f26302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1 f26303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26304c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(l1 l1Var, xy.c cVar) {
        super(cVar);
        this.f26303b = l1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f26302a = obj;
        this.f26304c |= Integer.MIN_VALUE;
        return this.f26303b.a(this);
    }
}
