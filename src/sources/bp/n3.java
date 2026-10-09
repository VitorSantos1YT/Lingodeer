package bp;

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
public final /* synthetic */ class n3 extends kotlin.jvm.internal.j implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n3 f4723a = new n3(1, hj.d0.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/lingo/lingoskill/databinding/ActivityNboExpiredPromptBinding;", 0);

    @Override // fz.c
    public final Object invoke(Object obj) {
        LayoutInflater p4 = (LayoutInflater) obj;
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.activity_nbo_expired_prompt, (ViewGroup) null, false);
        int i11 = R.id.btn_get_pro;
        MaterialButton materialButton = (MaterialButton) fr.j3.q(viewInflate, R.id.btn_get_pro);
        if (materialButton != null) {
            i11 = R.id.btn_restore;
            MaterialButton materialButton2 = (MaterialButton) fr.j3.q(viewInflate, R.id.btn_restore);
            if (materialButton2 != null) {
                i11 = R.id.iv_close;
                ImageView imageView = (ImageView) fr.j3.q(viewInflate, R.id.iv_close);
                if (imageView != null) {
                    i11 = R.id.tv_content;
                    if (((TextView) fr.j3.q(viewInflate, R.id.tv_content)) != null) {
                        i11 = R.id.tv_or;
                        if (((TextView) fr.j3.q(viewInflate, R.id.tv_or)) != null) {
                            i11 = R.id.tv_title;
                            if (((TextView) fr.j3.q(viewInflate, R.id.tv_title)) != null) {
                                return new hj.d0((ConstraintLayout) viewInflate, materialButton, materialButton2, imageView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
