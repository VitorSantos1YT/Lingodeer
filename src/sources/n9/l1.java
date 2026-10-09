package n9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f43635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public uz.j f43637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m1 f43638d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(m1 m1Var, vy.d dVar) {
        super(dVar);
        this.f43638d = m1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f43635a = obj;
        this.f43636b |= Integer.MIN_VALUE;
        return this.f43638d.emit(null, this);
    }
}
