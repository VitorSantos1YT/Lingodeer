package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k9 extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n9 f30553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f30554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f30555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f30556d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9(n9 n9Var, boolean z11, boolean z12, boolean z13) {
        super(2);
        this.f30553a = n9Var;
        this.f30554b = z11;
        this.f30555c = z12;
        this.f30556d = z13;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        long j11 = ((v3.l) obj).f53498a;
        long j12 = ((v3.a) obj2).f53483a;
        j9 j9Var = new j9(this.f30554b, this.f30555c, (int) (j11 >> 32), this.f30556d);
        i1.b0 b0Var = new i1.b0();
        j9Var.invoke(b0Var);
        return new qy.l(new i1.o0(b0Var.f33980a), (o9) ((l1.g0) this.f30553a.f30744b.f44882h).getValue());
    }
}
