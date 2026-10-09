package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class xa extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w2.g1 f31322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ya f31323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f31324c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa(w2.g1 g1Var, ya yaVar, float f5) {
        super(1);
        this.f31322a = g1Var;
        this.f31323b = yaVar;
        this.f31324c = f5;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        w2.f1 f1Var = (w2.f1) obj;
        b0.d dVar = this.f31323b.T;
        w2.f1.k(f1Var, this.f31322a, (int) (dVar != null ? ((Number) dVar.d()).floatValue() : this.f31324c), 0);
        return qy.b0.f48488a;
    }
}
