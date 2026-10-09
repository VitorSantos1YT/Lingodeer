package li;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.lingodeer.R;
import fr.j3;
import hj.e5;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d extends j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f40165a = new d(3, e5.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/FragmentSubscriptionBenefitInfoBinding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.fragment_subscription_benefit_info, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.btn_upgrade;
        MaterialButton materialButton = (MaterialButton) j3.q(viewInflate, R.id.btn_upgrade);
        if (materialButton != null) {
            i11 = R.id.iv_banner;
            if (((ImageView) j3.q(viewInflate, R.id.iv_banner)) != null) {
                i11 = R.id.iv_benefit_1;
                if (((ImageView) j3.q(viewInflate, R.id.iv_benefit_1)) != null) {
                    i11 = R.id.iv_benefit_2;
                    if (((ImageView) j3.q(viewInflate, R.id.iv_benefit_2)) != null) {
                        i11 = R.id.iv_benefit_3;
                        if (((ImageView) j3.q(viewInflate, R.id.iv_benefit_3)) != null) {
                            i11 = R.id.iv_close;
                            ImageView imageView = (ImageView) j3.q(viewInflate, R.id.iv_close);
                            if (imageView != null) {
                                i11 = R.id.root_parent;
                                if (((ConstraintLayout) j3.q(viewInflate, R.id.root_parent)) != null) {
                                    i11 = R.id.status_bar_view;
                                    View viewQ = j3.q(viewInflate, R.id.status_bar_view);
                                    if (viewQ != null) {
                                        i11 = R.id.tv_benefit_1;
                                        if (((TextView) j3.q(viewInflate, R.id.tv_benefit_1)) != null) {
                                            i11 = R.id.tv_benefit_2;
                                            if (((TextView) j3.q(viewInflate, R.id.tv_benefit_2)) != null) {
                                                i11 = R.id.tv_benefit_3;
                                                if (((TextView) j3.q(viewInflate, R.id.tv_benefit_3)) != null) {
                                                    i11 = R.id.tv_subtitle;
                                                    if (((TextView) j3.q(viewInflate, R.id.tv_subtitle)) != null) {
                                                        i11 = R.id.tv_title;
                                                        if (((TextView) j3.q(viewInflate, R.id.tv_title)) != null) {
                                                            return new e5((FrameLayout) viewInflate, materialButton, imageView, viewQ);
                                                        }
                                                    }
                                                }
                                            }
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
