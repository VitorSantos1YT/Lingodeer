package bp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.button.MaterialButton;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u2 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u2 f4839a = new u2(3, hj.d4.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/FragmentLoginHistoryManagerBinding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.fragment_login_history_manager, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.btn_done;
        MaterialButton materialButton = (MaterialButton) fr.j3.q(viewInflate, R.id.btn_done);
        if (materialButton != null) {
            i11 = R.id.flex_accounts;
            FlexboxLayout flexboxLayout = (FlexboxLayout) fr.j3.q(viewInflate, R.id.flex_accounts);
            if (flexboxLayout != null) {
                i11 = R.id.status_bar_view;
                View viewQ = fr.j3.q(viewInflate, R.id.status_bar_view);
                if (viewQ != null) {
                    i11 = R.id.tv_sub_title;
                    if (((TextView) fr.j3.q(viewInflate, R.id.tv_sub_title)) != null) {
                        i11 = R.id.tv_title;
                        if (((TextView) fr.j3.q(viewInflate, R.id.tv_title)) != null) {
                            return new hj.d4((ConstraintLayout) viewInflate, materialButton, flexboxLayout, viewQ);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
