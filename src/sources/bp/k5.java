package bp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k5 extends kotlin.jvm.internal.j implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k5 f4674a = new k5(1, hj.b1.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/lingo/lingoskill/databinding/ActivityTestUiJsonBinding;", 0);

    @Override // fz.c
    public final Object invoke(Object obj) {
        LayoutInflater p4 = (LayoutInflater) obj;
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.activity_test_ui_json, (ViewGroup) null, false);
        int i11 = R.id.btn_apply;
        MaterialButton materialButton = (MaterialButton) fr.j3.q(viewInflate, R.id.btn_apply);
        if (materialButton != null) {
            i11 = R.id.edt_json;
            EditText editText = (EditText) fr.j3.q(viewInflate, R.id.edt_json);
            if (editText != null) {
                i11 = R.id.status_bar_view;
                View viewQ = fr.j3.q(viewInflate, R.id.status_bar_view);
                if (viewQ != null) {
                    return new hj.b1((ConstraintLayout) viewInflate, materialButton, editText, viewQ);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
