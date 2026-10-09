package li;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.lingodeer.R;
import fr.j3;
import hj.y0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g extends j implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f40168a = new g(1, y0.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/lingo/lingoskill/databinding/ActivitySubscriptionHelpBinding;", 0);

    @Override // fz.c
    public final Object invoke(Object obj) {
        LayoutInflater p4 = (LayoutInflater) obj;
        m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.activity_subscription_help, (ViewGroup) null, false);
        int i11 = R.id.at_your_ser;
        if (((TextView) j3.q(viewInflate, R.id.at_your_ser)) != null) {
            i11 = R.id.card_gmail;
            MaterialCardView materialCardView = (MaterialCardView) j3.q(viewInflate, R.id.card_gmail);
            if (materialCardView != null) {
                i11 = R.id.card_messager;
                MaterialCardView materialCardView2 = (MaterialCardView) j3.q(viewInflate, R.id.card_messager);
                if (materialCardView2 != null) {
                    i11 = R.id.chat_in_mes;
                    if (((TextView) j3.q(viewInflate, R.id.chat_in_mes)) != null) {
                        i11 = R.id.contact_us_;
                        if (((TextView) j3.q(viewInflate, R.id.contact_us_)) != null) {
                            i11 = R.id.have_questi;
                            if (((TextView) j3.q(viewInflate, R.id.have_questi)) != null) {
                                i11 = R.id.iv_close;
                                ImageView imageView = (ImageView) j3.q(viewInflate, R.id.iv_close);
                                if (imageView != null) {
                                    i11 = R.id.iv_pic;
                                    if (((ImageView) j3.q(viewInflate, R.id.iv_pic)) != null) {
                                        i11 = R.id.status_bar_view;
                                        View viewQ = j3.q(viewInflate, R.id.status_bar_view);
                                        if (viewQ != null) {
                                            return new y0((ConstraintLayout) viewInflate, materialCardView, materialCardView2, imageView, viewQ);
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
