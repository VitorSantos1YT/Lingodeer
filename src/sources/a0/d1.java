package a0;

import h1.l8;
import h1.p8;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f51b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f52c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(boolean z11, Object obj, int i11) {
        super(1);
        this.f50a = i11;
        this.f51b = z11;
        this.f52c = obj;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11 = this.f50a;
        Object obj2 = this.f52c;
        boolean z11 = this.f51b;
        qy.b0 b0Var = qy.b0.f48488a;
        switch (i11) {
            case 0:
                ((g2.t0) obj).e(!z11 && ((Boolean) ((fz.a) obj2).invoke()).booleanValue());
                break;
            default:
                g3.b0 b0Var2 = (g3.b0) obj;
                if (!z11) {
                    mz.j[] jVarArr = g3.z.f28737a;
                    b0Var2.b(g3.x.f28718i, b0Var);
                }
                l8 l8Var = new l8((p8) obj2, 1);
                mz.j[] jVarArr2 = g3.z.f28737a;
                b0Var2.b(g3.n.f28674i, new g3.a(null, l8Var));
                break;
        }
        return b0Var;
    }
}
