package jp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.lingodeer.R;
import fr.j3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d1 extends kotlin.jvm.internal.j implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d1 f36463a = new d1(1, hj.n.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/lingo/lingoskill/databinding/ActivityDebugTestBinding;", 0);

    @Override // fz.c
    public final Object invoke(Object obj) {
        LayoutInflater p4 = (LayoutInflater) obj;
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.activity_debug_test, (ViewGroup) null, false);
        int i11 = R.id.confirm;
        MaterialButton materialButton = (MaterialButton) j3.q(viewInflate, R.id.confirm);
        if (materialButton != null) {
            i11 = R.id.edt_text;
            EditText editText = (EditText) j3.q(viewInflate, R.id.edt_text);
            if (editText != null) {
                i11 = R.id.edt_text_ai_prompt;
                EditText editText2 = (EditText) j3.q(viewInflate, R.id.edt_text_ai_prompt);
                if (editText2 != null) {
                    i11 = R.id.f22242go;
                    MaterialButton materialButton2 = (MaterialButton) j3.q(viewInflate, R.id.f22242go);
                    if (materialButton2 != null) {
                        i11 = R.id.status_bar_view;
                        View viewQ = j3.q(viewInflate, R.id.status_bar_view);
                        if (viewQ != null) {
                            return new hj.n((LinearLayout) viewInflate, materialButton, editText, editText2, materialButton2, viewQ);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
