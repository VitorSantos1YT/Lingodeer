package bp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.lingo.lingoskill.ui.base.LoginActivity;
import com.lingo.splash.SplashIndexActivity;
import com.tbruyelle.rxpermissions3.BuildConfig;
import rt.m9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class z2 extends ji.e {
    public final i.c N;

    public z2() {
        super(y2.f4916a, BuildConfig.VERSION_NAME);
        i.c cVarRegisterForActivityResult = registerForActivityResult(new androidx.fragment.app.e1(4), new app.rive.runtime.kotlin.core.a(this, 7));
        kotlin.jvm.internal.m.e(cVarRegisterForActivityResult, "registerForActivityResult(...)");
        this.N = cVarRegisterForActivityResult;
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        final int i11 = 0;
        bq.z.b(((hj.e4) aVar).f32529d, new fz.c(this) { // from class: bp.x2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z2 f4899b;

            {
                this.f4899b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i12 = i11;
                qy.b0 b0Var = qy.b0.f48488a;
                z2 z2Var = this.f4899b;
                View it = (View) obj;
                switch (i12) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        z2Var.requireActivity().finish();
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        b7.e0.A(z2Var.t(), "jxz_sign_back_add_account_click_sign_in");
                        i.c cVar = z2Var.N;
                        int i13 = LoginActivity.Q;
                        l.m mVar = z2Var.f36398d;
                        kotlin.jvm.internal.m.c(mVar);
                        cVar.a(g1.p(mVar, 1));
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        z2Var.t().c("jxz_sign_back_add_account_click_start", new m9(26));
                        z2Var.startActivity(new Intent(z2Var.f36398d, (Class<?>) SplashIndexActivity.class));
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        final int i12 = 1;
        bq.z.b(((hj.e4) aVar2).f32528c, new fz.c(this) { // from class: bp.x2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z2 f4899b;

            {
                this.f4899b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i13 = i12;
                qy.b0 b0Var = qy.b0.f48488a;
                z2 z2Var = this.f4899b;
                View it = (View) obj;
                switch (i13) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        z2Var.requireActivity().finish();
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        b7.e0.A(z2Var.t(), "jxz_sign_back_add_account_click_sign_in");
                        i.c cVar = z2Var.N;
                        int i14 = LoginActivity.Q;
                        l.m mVar = z2Var.f36398d;
                        kotlin.jvm.internal.m.c(mVar);
                        cVar.a(g1.p(mVar, 1));
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        z2Var.t().c("jxz_sign_back_add_account_click_start", new m9(26));
                        z2Var.startActivity(new Intent(z2Var.f36398d, (Class<?>) SplashIndexActivity.class));
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        final int i13 = 2;
        bq.z.b(((hj.e4) aVar3).f32527b, new fz.c(this) { // from class: bp.x2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z2 f4899b;

            {
                this.f4899b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i14 = i13;
                qy.b0 b0Var = qy.b0.f48488a;
                z2 z2Var = this.f4899b;
                View it = (View) obj;
                switch (i14) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        z2Var.requireActivity().finish();
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        b7.e0.A(z2Var.t(), "jxz_sign_back_add_account_click_sign_in");
                        i.c cVar = z2Var.N;
                        int i15 = LoginActivity.Q;
                        l.m mVar = z2Var.f36398d;
                        kotlin.jvm.internal.m.c(mVar);
                        cVar.a(g1.p(mVar, 1));
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        z2Var.t().c("jxz_sign_back_add_account_click_start", new m9(26));
                        z2Var.startActivity(new Intent(z2Var.f36398d, (Class<?>) SplashIndexActivity.class));
                        break;
                }
                return b0Var;
            }
        });
    }
}
