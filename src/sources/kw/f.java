package kw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f38859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f38860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f38861c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, xy.c cVar) {
        super(cVar);
        this.f38860b = gVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f38859a = obj;
        this.f38861c |= Integer.MIN_VALUE;
        return this.f38860b.W(0L, this);
    }
}
