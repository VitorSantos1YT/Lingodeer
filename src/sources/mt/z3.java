package mt;

import androidx.lifecycle.ViewModelKt;
import com.lingodeer.data.model.SRSStatus;
import java.util.List;
import rt.fb;
import rt.yb;
import rt.zb;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z3 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rt.e3 f42123b;

    public /* synthetic */ z3(rt.e3 e3Var, int i11) {
        this.f42122a = i11;
        this.f42123b = e3Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f42122a) {
            case 0:
                this.f42123b.d(((Long) obj).longValue());
                return qy.b0.f48488a;
            case 1:
                wt.c0 it = (wt.c0) obj;
                kotlin.jvm.internal.m.f(it, "it");
                rt.e3 e3Var = this.f42123b;
                e3Var.getClass();
                if (e3Var.H0) {
                    ot.j1 j1Var = (ot.j1) ry.m.t0(((Number) e3Var.W.getValue()).intValue(), (List) e3Var.V.getValue());
                    if (j1Var != null) {
                        String strK = rt.e3.K(j1Var.a().f33753a, j1Var.a().f33754b);
                        SRSStatus sRSStatus = (SRSStatus) e3Var.f49678z0.get(strK);
                        if (sRSStatus != null) {
                            rz.e0.B(ViewModelKt.getViewModelScope(e3Var), null, null, new rt.z2(sRSStatus, e3Var, it, strK, j1Var, null, 0), 3);
                        }
                    }
                }
                return qy.b0.f48488a;
            case 2:
                ht.o params = (ht.o) obj;
                kotlin.jvm.internal.m.f(params, "params");
                return this.f42123b.i(params);
            case 3:
                ht.o testModel = (ht.o) obj;
                kotlin.jvm.internal.m.f(testModel, "testModel");
                int i11 = testModel.f33755c;
                int i12 = testModel.f33753a;
                rt.e3 e3Var2 = this.f42123b;
                yb ybVar = yb.f50724a;
                if (i12 == -1) {
                    e3Var2.t(ybVar);
                } else if ((i12 == 1 && ry.l.D(new Integer[]{13, 31}, Integer.valueOf(i11))) || i12 == 2 || (i12 == 0 && ry.l.D(new Integer[]{5, 9, 10}, Integer.valueOf(i11)))) {
                    e3Var2.t(zb.f50802a);
                } else {
                    e3Var2.t(ybVar);
                }
                return qy.b0.f48488a;
            case 4:
                ht.o params2 = (ht.o) obj;
                kotlin.jvm.internal.m.f(params2, "params");
                return this.f42123b.w(params2);
            case 5:
                this.f42123b.f50706c0.k((fb) obj);
                return qy.b0.f48488a;
            default:
                this.f42123b.f50706c0.k((fb) obj);
                return qy.b0.f48488a;
        }
    }
}
