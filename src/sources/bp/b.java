package bp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.button.MaterialButton;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.j implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f4493a = new b(1, hj.r.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/lingo/lingoskill/databinding/ActivityFinishAdBinding;", 0);

    @Override // fz.c
    public final Object invoke(Object obj) {
        LayoutInflater p4 = (LayoutInflater) obj;
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.activity_finish_ad, (ViewGroup) null, false);
        int i11 = R.id.btn_upgrade_to_pro;
        MaterialButton materialButton = (MaterialButton) fr.j3.q(viewInflate, R.id.btn_upgrade_to_pro);
        if (materialButton != null) {
            i11 = R.id.card_parent;
            if (((CardView) fr.j3.q(viewInflate, R.id.card_parent)) != null) {
                i11 = R.id.ic_close;
                ImageView imageView = (ImageView) fr.j3.q(viewInflate, R.id.ic_close);
                if (imageView != null) {
                    i11 = R.id.tv_prompt;
                    if (((TextView) fr.j3.q(viewInflate, R.id.tv_prompt)) != null) {
                        return new hj.r((NestedScrollView) viewInflate, materialButton, imageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
