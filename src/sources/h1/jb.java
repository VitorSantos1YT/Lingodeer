package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class jb extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f30500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rz.b0 f30501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f30502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f30503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f30504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f30505f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f30506t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb(boolean z11, rz.b0 b0Var, n nVar, float f5, boolean z12, l1.b1 b1Var, l1.b1 b1Var2) {
        super(1);
        this.f30500a = z11;
        this.f30501b = b0Var;
        this.f30502c = nVar;
        this.f30503d = f5;
        this.f30504e = z12;
        this.f30505f = b1Var;
        this.f30506t = b1Var2;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        g3.b0 b0Var = (g3.b0) obj;
        ib ibVar = new ib(this.f30501b, this.f30502c, this.f30503d, this.f30504e, this.f30505f, this.f30506t);
        mz.j[] jVarArr = g3.z.f28737a;
        b0Var.b(g3.n.f28667b, new g3.a(null, ibVar));
        g3.z.e(b0Var, this.f30500a);
        return qy.b0.f48488a;
    }
}
