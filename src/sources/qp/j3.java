package qp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j3 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j3 f47997a = new j3(3, hj.g2.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/CnSentenceModelView20Binding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.cn_sentence_model_view_20, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.flex_container;
        FlexboxLayout flexboxLayout = (FlexboxLayout) fr.j3.q(viewInflate, R.id.flex_container);
        if (flexboxLayout != null) {
            i11 = R.id.frame_next;
            FrameLayout frameLayout = (FrameLayout) fr.j3.q(viewInflate, R.id.frame_next);
            if (frameLayout != null) {
                i11 = R.id.frame_pre;
                FrameLayout frameLayout2 = (FrameLayout) fr.j3.q(viewInflate, R.id.frame_pre);
                if (frameLayout2 != null) {
                    i11 = R.id.iv_play;
                    ImageView imageView = (ImageView) fr.j3.q(viewInflate, R.id.iv_play);
                    if (imageView != null) {
                        i11 = R.id.ll_control;
                        if (((LinearLayout) fr.j3.q(viewInflate, R.id.ll_control)) != null) {
                            i11 = R.id.ll_parent;
                            if (((LinearLayout) fr.j3.q(viewInflate, R.id.ll_parent)) != null) {
                                i11 = R.id.ll_show_deer;
                                LinearLayout linearLayout = (LinearLayout) fr.j3.q(viewInflate, R.id.ll_show_deer);
                                if (linearLayout != null) {
                                    LinearLayout linearLayout2 = (LinearLayout) viewInflate;
                                    i11 = R.id.tv_press_prompt;
                                    TextView textView = (TextView) fr.j3.q(viewInflate, R.id.tv_press_prompt);
                                    if (textView != null) {
                                        i11 = R.id.tv_trans;
                                        TextView textView2 = (TextView) fr.j3.q(viewInflate, R.id.tv_trans);
                                        if (textView2 != null) {
                                            return new hj.g2(linearLayout2, flexboxLayout, frameLayout, frameLayout2, imageView, linearLayout, linearLayout2, textView, textView2);
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
