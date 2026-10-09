package bp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.button.MaterialButton;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b3 extends kotlin.jvm.internal.j implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b3 f4505a = new b3(1, hj.a0.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/lingo/lingoskill/databinding/ActivityLoginPromptBinding;", 0);

    @Override // fz.c
    public final Object invoke(Object obj) {
        LayoutInflater p4 = (LayoutInflater) obj;
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.activity_login_prompt, (ViewGroup) null, false);
        int i11 = R.id.btn_create;
        MaterialButton materialButton = (MaterialButton) fr.j3.q(viewInflate, R.id.btn_create);
        if (materialButton != null) {
            i11 = R.id.btn_later;
            MaterialButton materialButton2 = (MaterialButton) fr.j3.q(viewInflate, R.id.btn_later);
            if (materialButton2 != null) {
                i11 = R.id.status_bar_view;
                View viewQ = fr.j3.q(viewInflate, R.id.status_bar_view);
                if (viewQ != null) {
                    i11 = R.id.tv_prompt_second_title;
                    TextView textView = (TextView) fr.j3.q(viewInflate, R.id.tv_prompt_second_title);
                    if (textView != null) {
                        i11 = R.id.tv_prompt_title;
                        TextView textView2 = (TextView) fr.j3.q(viewInflate, R.id.tv_prompt_title);
                        if (textView2 != null) {
                            return new hj.a0((NestedScrollView) viewInflate, materialButton, materialButton2, viewQ, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
