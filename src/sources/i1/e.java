package i1;

import b0.i2;
import b0.w1;
import com.yalantis.ucrop.view.CropImageView;
import h1.b7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.n implements fz.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f34001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f34002c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34003a;

    static {
        int i11 = 3;
        f34001b = new e(i11, 0);
        f34002c = new e(i11, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i11, int i12) {
        super(i11);
        this.f34003a = i12;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object i2Var;
        switch (this.f34003a) {
            case 0:
                w2.s0 s0Var = (w2.s0) obj;
                long j11 = ((v3.a) obj3).f53483a;
                int iN0 = s0Var.n0(g.f34016a);
                int i11 = iN0 * 2;
                w2.g1 g1VarB = ((w2.p0) obj2).B(v3.b.i(j11, i11, 0));
                return s0Var.q0(g1VarB.f54501a - i11, g1VarB.f54502b, ry.s.f50855a, new b7(iN0, 1, g1VarB));
            default:
                w1 w1Var = (w1) obj;
                ((Number) obj3).intValue();
                l1.s sVar = (l1.s) ((l1.n) obj2);
                sVar.d0(-1154662212);
                g0 g0Var = g0.Focused;
                g0 g0Var2 = g0.UnfocusedEmpty;
                if (w1Var.b(g0Var, g0Var2)) {
                    i2Var = b0.e.r(67, 0, b0.b0.f3441d, 2);
                } else {
                    i2Var = (w1Var.b(g0Var2, g0Var) || w1Var.b(g0.UnfocusedNotEmpty, g0Var2)) ? new i2(83, 67, b0.b0.f3441d) : b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 7);
                }
                sVar.p(false);
                return i2Var;
        }
    }
}
