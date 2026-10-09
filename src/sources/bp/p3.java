package bp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p3 extends kotlin.jvm.internal.j implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p3 f4758a = new p3(1, hj.e0.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/lingo/lingoskill/databinding/ActivityNboPromptBinding;", 0);

    @Override // fz.c
    public final Object invoke(Object obj) {
        LayoutInflater p4 = (LayoutInflater) obj;
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.activity_nbo_prompt, (ViewGroup) null, false);
        int i11 = R.id.btn_continue;
        MaterialButton materialButton = (MaterialButton) fr.j3.q(viewInflate, R.id.btn_continue);
        if (materialButton != null) {
            i11 = R.id.iv_close;
            ImageView imageView = (ImageView) fr.j3.q(viewInflate, R.id.iv_close);
            if (imageView != null) {
                i11 = R.id.iv_main;
                if (((ImageView) fr.j3.q(viewInflate, R.id.iv_main)) != null) {
                    return new hj.e0((ConstraintLayout) viewInflate, materialButton, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
