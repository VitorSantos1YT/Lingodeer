package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r8 extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u8 f30994b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r8(u8 u8Var, int i11) {
        super(1);
        this.f30993a = i11;
        this.f30994b = u8Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11 = this.f30993a;
        u8 u8Var = this.f30994b;
        switch (i11) {
            case 0:
                g3.b0 b0Var = (g3.b0) obj;
                mz.j[] jVarArr = g3.z.f28737a;
                g3.a0 a0Var = g3.x.f28719j;
                mz.j jVar = g3.z.f28737a[3];
                b0Var.b(a0Var, new g3.h());
                b0Var.b(g3.n.f28686v, new g3.a(null, new a0.c0(u8Var, 10)));
                return qy.b0.f48488a;
            default:
                return Boolean.valueOf(kotlin.jvm.internal.m.a(((d4) obj).f30137a, u8Var));
        }
    }
}
