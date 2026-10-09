package l1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fz.c f39336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f39337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f39338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f39339d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(f fVar, vy.d dVar) {
        super(dVar);
        this.f39338c = fVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f39337b = obj;
        this.f39339d |= Integer.MIN_VALUE;
        return this.f39338c.p(null, this);
    }
}
