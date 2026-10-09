package bp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.lingo.lingoskill.ui.base.LoginHistoryManagerActivity;
import com.lingo.lingoskill.ui.base.LoginMethodAddActivity;
import com.tbruyelle.rxpermissions3.BuildConfig;
import rt.m9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class r2 extends ji.e {
    public lc.d N;
    public final i.c O;
    public final Object P;
    public final Object Q;

    public r2() {
        super(p2.f4757a, BuildConfig.VERSION_NAME);
        i.c cVarRegisterForActivityResult = registerForActivityResult(new androidx.fragment.app.e1(4), new app.rive.runtime.kotlin.core.a(this, 6));
        kotlin.jvm.internal.m.e(cVarRegisterForActivityResult, "registerForActivityResult(...)");
        this.O = cVarRegisterForActivityResult;
        this.P = com.bumptech.glide.d.u(qy.j.SYNCHRONIZED, new q2(this, 0));
        this.Q = com.bumptech.glide.d.u(qy.j.NONE, new b1(1, this, new q2(this, 1)));
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        t().c("jxz_sign_back_page_enter", new m9(26));
        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new b0.a1(this, null, 5), 3);
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        final int i11 = 0;
        bq.z.b(((hj.c4) aVar).f32464c, new fz.c(this) { // from class: bp.o2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r2 f4746b;

            {
                this.f4746b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                View it = (View) obj;
                switch (i11) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        r2 r2Var = this.f4746b;
                        r2Var.t().c("jxz_sign_back_click_add_account", new m9(26));
                        r2Var.startActivity(new Intent(r2Var.requireContext(), (Class<?>) LoginMethodAddActivity.class));
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        r2 r2Var2 = this.f4746b;
                        r2Var2.O.a(new Intent(r2Var2.requireContext(), (Class<?>) LoginHistoryManagerActivity.class));
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        final int i12 = 1;
        bq.z.b(((hj.c4) aVar2).f32463b, new fz.c(this) { // from class: bp.o2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r2 f4746b;

            {
                this.f4746b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                View it = (View) obj;
                switch (i12) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        r2 r2Var = this.f4746b;
                        r2Var.t().c("jxz_sign_back_click_add_account", new m9(26));
                        r2Var.startActivity(new Intent(r2Var.requireContext(), (Class<?>) LoginMethodAddActivity.class));
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        r2 r2Var2 = this.f4746b;
                        r2Var2.O.a(new Intent(r2Var2.requireContext(), (Class<?>) LoginHistoryManagerActivity.class));
                        break;
                }
                return qy.b0.f48488a;
            }
        });
    }
}
