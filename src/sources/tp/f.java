package tp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.card.MaterialCardView;
import com.lingo.lingoskill.widget.LollipopFixedWebView;
import com.lingodeer.R;
import fr.j3;
import hj.g3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f52456a = new f(3, g3.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/FragmentAckCardBinding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.fragment_ack_card, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.btn_fav;
        ImageView imageView = (ImageView) j3.q(viewInflate, R.id.btn_fav);
        if (imageView != null) {
            i11 = R.id.btn_save;
            ImageButton imageButton = (ImageButton) j3.q(viewInflate, R.id.btn_save);
            if (imageButton != null) {
                i11 = R.id.fl_btm;
                FrameLayout frameLayout = (FrameLayout) j3.q(viewInflate, R.id.fl_btm);
                if (frameLayout != null) {
                    i11 = R.id.ll_example;
                    LinearLayout linearLayout = (LinearLayout) j3.q(viewInflate, R.id.ll_example);
                    if (linearLayout != null) {
                        i11 = R.id.ll_top;
                        LinearLayout linearLayout2 = (LinearLayout) j3.q(viewInflate, R.id.ll_top);
                        if (linearLayout2 != null) {
                            i11 = R.id.scroll_view;
                            NestedScrollView nestedScrollView = (NestedScrollView) j3.q(viewInflate, R.id.scroll_view);
                            if (nestedScrollView != null) {
                                i11 = R.id.tv_ack;
                                TextView textView = (TextView) j3.q(viewInflate, R.id.tv_ack);
                                if (textView != null) {
                                    i11 = R.id.tv_ack_exp;
                                    TextView textView2 = (TextView) j3.q(viewInflate, R.id.tv_ack_exp);
                                    if (textView2 != null) {
                                        i11 = R.id.tv_example;
                                        TextView textView3 = (TextView) j3.q(viewInflate, R.id.tv_example);
                                        if (textView3 != null) {
                                            i11 = R.id.tv_unit_name;
                                            TextView textView4 = (TextView) j3.q(viewInflate, R.id.tv_unit_name);
                                            if (textView4 != null) {
                                                i11 = R.id.web_view;
                                                LollipopFixedWebView lollipopFixedWebView = (LollipopFixedWebView) j3.q(viewInflate, R.id.web_view);
                                                if (lollipopFixedWebView != null) {
                                                    return new g3((MaterialCardView) viewInflate, imageView, imageButton, frameLayout, linearLayout, linearLayout2, nestedScrollView, textView, textView2, textView3, textView4, lollipopFixedWebView);
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
