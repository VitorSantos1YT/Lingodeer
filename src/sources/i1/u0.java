package i1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f34080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f34081b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(float f5, l1.b1 b1Var) {
        super(1);
        this.f34080a = f5;
        this.f34081b = b1Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        long j11 = ((f2.e) obj).f26584a;
        float fD = f2.e.d(j11);
        float f5 = this.f34080a;
        float f11 = fD * f5;
        float fB = f2.e.b(j11) * f5;
        l1.b1 b1Var = this.f34081b;
        if (f2.e.d(((f2.e) b1Var.getValue()).f26584a) != f11 || f2.e.b(((f2.e) b1Var.getValue()).f26584a) != fB) {
            b1Var.setValue(new f2.e(com.bumptech.glide.g.b(f11, fB)));
        }
        return qy.b0.f48488a;
    }
}
