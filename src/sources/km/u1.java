package km;

import android.view.View;
import hj.q5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u1 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x1 f38290b;

    public /* synthetic */ u1(x1 x1Var, int i11) {
        this.f38289a = i11;
        this.f38290b = x1Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        View it = (View) obj;
        switch (this.f38289a) {
            case 0:
                kotlin.jvm.internal.m.f(it, "it");
                x1 x1Var = this.f38290b;
                ta.a aVar = x1Var.f36400f;
                kotlin.jvm.internal.m.c(aVar);
                ((q5) aVar).f33167b.setEnabled(false);
                mm.a aVar2 = (mm.a) x1Var.N;
                if (aVar2 != null) {
                    aVar2.o();
                }
                break;
            default:
                jp.h1 h1Var = new jp.h1();
                x1 x1Var2 = this.f38290b;
                h1Var.u(x1Var2.getChildFragmentManager(), "LessonQuitBottomSheetDialogFragment");
                h1Var.U = new ob.l(17, x1Var2, h1Var);
                break;
        }
        return qy.b0.f48488a;
    }
}
