package dr;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f23523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f23524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23525c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, xy.c cVar) {
        super(cVar);
        this.f23524b = fVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f23523a = obj;
        this.f23525c |= Integer.MIN_VALUE;
        return this.f23524b.a(this);
    }
}
