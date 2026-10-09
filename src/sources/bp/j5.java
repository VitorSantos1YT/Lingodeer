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
public final /* synthetic */ class j5 extends kotlin.jvm.internal.j implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j5 f4662a = new j5(1, hj.w0.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/lingo/lingoskill/databinding/ActivitySplashDiscountBinding;", 0);

    @Override // fz.c
    public final Object invoke(Object obj) {
        LayoutInflater p4 = (LayoutInflater) obj;
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.activity_splash_discount, (ViewGroup) null, false);
        int i11 = R.id.iv_background;
        if (((ImageView) fr.j3.q(viewInflate, R.id.iv_background)) != null) {
            i11 = R.id.iv_close;
            ImageView imageView = (ImageView) fr.j3.q(viewInflate, R.id.iv_close);
            if (imageView != null) {
                i11 = R.id.learn_more;
                MaterialButton materialButton = (MaterialButton) fr.j3.q(viewInflate, R.id.learn_more);
                if (materialButton != null) {
                    i11 = R.id.maybe_later;
                    TextView textView = (TextView) fr.j3.q(viewInflate, R.id.maybe_later);
                    if (textView != null) {
                        i11 = R.id.status_bar_view;
                        View viewQ = fr.j3.q(viewInflate, R.id.status_bar_view);
                        if (viewQ != null) {
                            i11 = R.id.tv_benefit_1;
                            if (((TextView) fr.j3.q(viewInflate, R.id.tv_benefit_1)) != null) {
                                i11 = R.id.tv_benefit_2;
                                if (((TextView) fr.j3.q(viewInflate, R.id.tv_benefit_2)) != null) {
                                    i11 = R.id.tv_benefit_3;
                                    if (((TextView) fr.j3.q(viewInflate, R.id.tv_benefit_3)) != null) {
                                        i11 = R.id.tv_title;
                                        if (((TextView) fr.j3.q(viewInflate, R.id.tv_title)) != null) {
                                            return new hj.w0((ConstraintLayout) viewInflate, imageView, materialButton, textView, viewQ);
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
