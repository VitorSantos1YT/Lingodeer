package jp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.lingodeer.R;
import fr.j3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f36464a = new e(3, hj.a.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/AbsDialogModelViewBinding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.abs_dialog_model_view, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.btn_finish;
        LinearLayout linearLayout = (LinearLayout) j3.q(viewInflate, R.id.btn_finish);
        if (linearLayout != null) {
            i11 = R.id.btn_redo;
            LinearLayout linearLayout2 = (LinearLayout) j3.q(viewInflate, R.id.btn_redo);
            if (linearLayout2 != null) {
                i11 = R.id.btn_replay;
                LinearLayout linearLayout3 = (LinearLayout) j3.q(viewInflate, R.id.btn_replay);
                if (linearLayout3 != null) {
                    i11 = R.id.check_button;
                    MaterialButton materialButton = (MaterialButton) j3.q(viewInflate, R.id.check_button);
                    if (materialButton != null) {
                        i11 = R.id.ll_finish_parent;
                        LinearLayout linearLayout4 = (LinearLayout) j3.q(viewInflate, R.id.ll_finish_parent);
                        if (linearLayout4 != null) {
                            i11 = R.id.recycler_view;
                            RecyclerView recyclerView = (RecyclerView) j3.q(viewInflate, R.id.recycler_view);
                            if (recyclerView != null) {
                                return new hj.a((ConstraintLayout) viewInflate, linearLayout, linearLayout2, linearLayout3, materialButton, linearLayout4, recyclerView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
