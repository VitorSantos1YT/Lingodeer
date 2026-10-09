package e6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s0 f25035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s0 f25037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25038d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(s0 s0Var, xy.c cVar) {
        super(cVar);
        this.f25037c = s0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f25036b = obj;
        this.f25038d |= Integer.MIN_VALUE;
        return s0.a(this.f25037c, null, this);
    }
}
