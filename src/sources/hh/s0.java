package hh;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.lingodeer.R;
import fr.j3;
import hj.b6;
import hj.l4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s0 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s0 f32296a = new s0(3, l4.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/FragmentPdLearnTipsBinding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.fragment_pd_learn_tips, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.iv_left_arrow;
        ImageView imageView = (ImageView) j3.q(viewInflate, R.id.iv_left_arrow);
        if (imageView != null) {
            i11 = R.id.iv_right_arrow;
            ImageView imageView2 = (ImageView) j3.q(viewInflate, R.id.iv_right_arrow);
            if (imageView2 != null) {
                i11 = R.id.status_bar_view;
                View viewQ = j3.q(viewInflate, R.id.status_bar_view);
                if (viewQ != null) {
                    i11 = R.id.toolbar;
                    View viewQ2 = j3.q(viewInflate, R.id.toolbar);
                    if (viewQ2 != null) {
                        b6 b6VarB = b6.b(viewQ2);
                        i11 = R.id.tv_index;
                        TextView textView = (TextView) j3.q(viewInflate, R.id.tv_index);
                        if (textView != null) {
                            i11 = R.id.view_pager;
                            ViewPager2 viewPager2 = (ViewPager2) j3.q(viewInflate, R.id.view_pager);
                            if (viewPager2 != null) {
                                return new l4((ConstraintLayout) viewInflate, imageView, imageView2, viewQ, b6VarB, textView, viewPager2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
