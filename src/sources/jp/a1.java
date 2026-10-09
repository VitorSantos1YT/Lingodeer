package jp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import bp.t2;
import bp.v2;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.lingodeer.R;
import com.lingodeer.data.model.LoginHistory;
import fr.j3;
import hj.d4;
import hj.e3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a1 extends BottomSheetDialogFragment {
    public e3 S;
    public final n9.q T = new n9.q(29, false);
    public dm.c U;

    @Override // androidx.fragment.app.y, androidx.fragment.app.k0
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        s(R.style.AppBottomSheetDialogTheme);
    }

    @Override // androidx.fragment.app.k0
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.m.f(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.fragment_confirm_remove_account, viewGroup, false);
        int i11 = R.id.tv_cancel;
        TextView textView = (TextView) j3.q(viewInflate, R.id.tv_cancel);
        if (textView != null) {
            i11 = R.id.tv_remove;
            TextView textView2 = (TextView) j3.q(viewInflate, R.id.tv_remove);
            if (textView2 != null) {
                LinearLayout linearLayout = (LinearLayout) viewInflate;
                this.S = new e3(linearLayout, textView, textView2, 1);
                kotlin.jvm.internal.m.e(linearLayout, "getRoot(...)");
                return linearLayout;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.k0
    public final void onDestroyView() {
        super.onDestroyView();
        this.T.f();
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.k0
    public final void onStart() {
        super.onStart();
        if (this.N != null) {
            requireView().post(new b2.a(this, 26));
        }
    }

    @Override // androidx.fragment.app.k0
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.m.f(view, "view");
        super.onViewCreated(view, bundle);
        e3 e3Var = this.S;
        kotlin.jvm.internal.m.c(e3Var);
        final int i11 = 0;
        ((TextView) e3Var.f32524c).setOnClickListener(new View.OnClickListener(this) { // from class: jp.z0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a1 f36555b;

            {
                this.f36555b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        this.f36555b.v();
                        break;
                    default:
                        a1 a1Var = this.f36555b;
                        a1Var.v();
                        dm.c cVar = a1Var.U;
                        if (cVar != null) {
                            ((t2) cVar.f23490b).invoke((LoginHistory) cVar.f23491c);
                            ta.a aVar = ((v2) cVar.f23492d).f36400f;
                            kotlin.jvm.internal.m.c(aVar);
                            ((d4) aVar).f32493c.removeView((View) cVar.f23493e);
                        }
                        break;
                }
            }
        });
        e3 e3Var2 = this.S;
        kotlin.jvm.internal.m.c(e3Var2);
        final int i12 = 1;
        ((TextView) e3Var2.f32525d).setOnClickListener(new View.OnClickListener(this) { // from class: jp.z0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a1 f36555b;

            {
                this.f36555b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        this.f36555b.v();
                        break;
                    default:
                        a1 a1Var = this.f36555b;
                        a1Var.v();
                        dm.c cVar = a1Var.U;
                        if (cVar != null) {
                            ((t2) cVar.f23490b).invoke((LoginHistory) cVar.f23491c);
                            ta.a aVar = ((v2) cVar.f23492d).f36400f;
                            kotlin.jvm.internal.m.c(aVar);
                            ((d4) aVar).f32493c.removeView((View) cVar.f23493e);
                        }
                        break;
                }
            }
        });
    }
}
