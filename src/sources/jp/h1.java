package jp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.button.MaterialButton;
import com.lingodeer.R;
import fr.j3;
import hj.e3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h1 extends BottomSheetDialogFragment {
    public e3 S;
    public g1 U;
    public final n9.q T = new n9.q(29, false);
    public final Object V = com.bumptech.glide.d.u(qy.j.SYNCHRONIZED, new bj.a(this, 20));

    @Override // androidx.fragment.app.y, androidx.fragment.app.k0
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        s(R.style.AppBottomSheetDialogTheme);
    }

    @Override // androidx.fragment.app.k0
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.m.f(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.fragment_lesson_quit_dialog, viewGroup, false);
        int i11 = R.id.btn_quit;
        Button button = (Button) j3.q(viewInflate, R.id.btn_quit);
        if (button != null) {
            i11 = R.id.btn_stay;
            MaterialButton materialButton = (MaterialButton) j3.q(viewInflate, R.id.btn_stay);
            if (materialButton != null) {
                i11 = R.id.iv_cry_deer;
                if (((ImageView) j3.q(viewInflate, R.id.iv_cry_deer)) != null) {
                    i11 = R.id.tv_quit_subtitle;
                    if (((TextView) j3.q(viewInflate, R.id.tv_quit_subtitle)) != null) {
                        i11 = R.id.tv_quit_title;
                        if (((TextView) j3.q(viewInflate, R.id.tv_quit_title)) != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                            this.S = new e3(constraintLayout, button, materialButton, 2);
                            kotlin.jvm.internal.m.e(constraintLayout, "getRoot(...)");
                            return constraintLayout;
                        }
                    }
                }
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
            requireView().post(new b2.a(this, 27));
        }
    }

    @Override // androidx.fragment.app.k0
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.m.f(view, "view");
        super.onViewCreated(view, bundle);
        e3 e3Var = this.S;
        kotlin.jvm.internal.m.c(e3Var);
        final int i11 = 0;
        ((MaterialButton) e3Var.f32525d).setOnClickListener(new View.OnClickListener(this) { // from class: jp.f1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h1 f36468b;

            {
                this.f36468b = this;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qy.h] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, qy.h] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        h1 h1Var = this.f36468b;
                        b7.e0.A((ur.a) h1Var.V.getValue(), "jxz_quit_keep_learning");
                        g1 g1Var = h1Var.U;
                        if (g1Var != null) {
                            g1Var.f();
                        }
                        break;
                    default:
                        h1 h1Var2 = this.f36468b;
                        b7.e0.A((ur.a) h1Var2.V.getValue(), "jxz_quit_end_session");
                        g1 g1Var2 = h1Var2.U;
                        if (g1Var2 != null) {
                            g1Var2.e();
                        }
                        break;
                }
            }
        });
        e3 e3Var2 = this.S;
        kotlin.jvm.internal.m.c(e3Var2);
        final int i12 = 1;
        ((Button) e3Var2.f32524c).setOnClickListener(new View.OnClickListener(this) { // from class: jp.f1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h1 f36468b;

            {
                this.f36468b = this;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qy.h] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, qy.h] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        h1 h1Var = this.f36468b;
                        b7.e0.A((ur.a) h1Var.V.getValue(), "jxz_quit_keep_learning");
                        g1 g1Var = h1Var.U;
                        if (g1Var != null) {
                            g1Var.f();
                        }
                        break;
                    default:
                        h1 h1Var2 = this.f36468b;
                        b7.e0.A((ur.a) h1Var2.V.getValue(), "jxz_quit_end_session");
                        g1 g1Var2 = h1Var2.U;
                        if (g1Var2 != null) {
                            g1Var2.e();
                        }
                        break;
                }
            }
        });
    }
}
