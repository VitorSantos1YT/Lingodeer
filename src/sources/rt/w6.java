package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class w6 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x8 f50573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f50574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x6 f50575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f50576d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6(x6 x6Var, xy.c cVar) {
        super(cVar);
        this.f50575c = x6Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f50574b = obj;
        this.f50576d |= Integer.MIN_VALUE;
        return this.f50575c.d(null, null, this);
    }
}
