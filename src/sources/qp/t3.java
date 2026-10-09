package qp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t3 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t3 f48203a = new t3(3, hj.e.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/AbsTestoutIntroModel01Binding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.abs_testout_intro_model_01, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.btn_continue;
        MaterialButton materialButton = (MaterialButton) fr.j3.q(viewInflate, R.id.btn_continue);
        if (materialButton != null) {
            i11 = R.id.ic_encourage_deer;
            if (((ImageView) fr.j3.q(viewInflate, R.id.ic_encourage_deer)) != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                if (((TextView) fr.j3.q(viewInflate, R.id.tv_subtitle)) != null) {
                    return new hj.e(constraintLayout, materialButton);
                }
                i11 = R.id.tv_subtitle;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
