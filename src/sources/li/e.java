package li;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import b7.e0;
import com.lingo.lingoskill.billing.Subscription2Activity;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fb.g0;
import hj.e5;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends ji.e {
    public e() {
        super(d.f40165a, BuildConfig.VERSION_NAME);
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        e0.A(t(), "jxz_enter_review_billing");
        ta.a aVar = this.f36400f;
        m.c(aVar);
        final int i11 = 0;
        ((e5) aVar).f32534c.setOnClickListener(new View.OnClickListener(this) { // from class: li.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f40164b;

            {
                this.f40164b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = i11;
                e eVar = this.f40164b;
                switch (i12) {
                    case 0:
                        eVar.requireActivity().finish();
                        break;
                    default:
                        e0.A(eVar.t(), "jxz_upgrade_now");
                        int i13 = Subscription2Activity.K;
                        Context contextRequireContext = eVar.requireContext();
                        m.e(contextRequireContext, "requireContext(...)");
                        eVar.startActivity(g0.u(contextRequireContext, "enter_review_billing"));
                        eVar.requireActivity().finish();
                        break;
                }
            }
        });
        ta.a aVar2 = this.f36400f;
        m.c(aVar2);
        final int i12 = 1;
        ((e5) aVar2).f32533b.setOnClickListener(new View.OnClickListener(this) { // from class: li.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f40164b;

            {
                this.f40164b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i13 = i12;
                e eVar = this.f40164b;
                switch (i13) {
                    case 0:
                        eVar.requireActivity().finish();
                        break;
                    default:
                        e0.A(eVar.t(), "jxz_upgrade_now");
                        int i14 = Subscription2Activity.K;
                        Context contextRequireContext = eVar.requireContext();
                        m.e(contextRequireContext, "requireContext(...)");
                        eVar.startActivity(g0.u(contextRequireContext, "enter_review_billing"));
                        eVar.requireActivity().finish();
                        break;
                }
            }
        });
    }
}
