package bp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.button.MaterialButton;
import com.lingodeer.R;
import mf.sOm.txBUGYhC;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p2 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p2 f4757a = new p2(3, hj.c4.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/FragmentLoginHistoryBinding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(layoutInflater, txBUGYhC.xot);
        View viewInflate = layoutInflater.inflate(R.layout.fragment_login_history, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.btn_manager_account;
        MaterialButton materialButton = (MaterialButton) fr.j3.q(viewInflate, R.id.btn_manager_account);
        if (materialButton != null) {
            i11 = R.id.const_add_account;
            ConstraintLayout constraintLayout = (ConstraintLayout) fr.j3.q(viewInflate, R.id.const_add_account);
            if (constraintLayout != null) {
                i11 = R.id.flex_accounts;
                FlexboxLayout flexboxLayout = (FlexboxLayout) fr.j3.q(viewInflate, R.id.flex_accounts);
                if (flexboxLayout != null) {
                    i11 = R.id.iv_deer;
                    if (((ImageView) fr.j3.q(viewInflate, R.id.iv_deer)) != null) {
                        i11 = R.id.iv_login_method_add;
                        if (((ImageView) fr.j3.q(viewInflate, R.id.iv_login_method_add)) != null) {
                            i11 = R.id.status_bar_view;
                            View viewQ = fr.j3.q(viewInflate, R.id.status_bar_view);
                            if (viewQ != null) {
                                i11 = R.id.tv_login_method_add;
                                if (((TextView) fr.j3.q(viewInflate, R.id.tv_login_method_add)) != null) {
                                    i11 = R.id.tv_sub_title;
                                    if (((TextView) fr.j3.q(viewInflate, R.id.tv_sub_title)) != null) {
                                        i11 = R.id.tv_title;
                                        if (((TextView) fr.j3.q(viewInflate, R.id.tv_title)) != null) {
                                            return new hj.c4((ConstraintLayout) viewInflate, materialButton, constraintLayout, flexboxLayout, viewQ);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
