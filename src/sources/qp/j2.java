package qp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.flexbox.FlexboxLayout;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j2 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j2 f47996a = new j2(3, hj.p2.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/CnSentenceModelView9Binding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.cn_sentence_model_view_9, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.const_btm;
        if (((ConstraintLayout) fr.j3.q(viewInflate, R.id.const_btm)) != null) {
            i11 = R.id.flex_option;
            FlexboxLayout flexboxLayout = (FlexboxLayout) fr.j3.q(viewInflate, R.id.flex_option);
            if (flexboxLayout != null) {
                i11 = R.id.flex_top;
                FlexboxLayout flexboxLayout2 = (FlexboxLayout) fr.j3.q(viewInflate, R.id.flex_top);
                if (flexboxLayout2 != null) {
                    i11 = R.id.iv_delete;
                    ImageView imageView = (ImageView) fr.j3.q(viewInflate, R.id.iv_delete);
                    if (imageView != null) {
                        RelativeLayout relativeLayout = (RelativeLayout) viewInflate;
                        i11 = R.id.scroll_option;
                        if (((NestedScrollView) fr.j3.q(viewInflate, R.id.scroll_option)) != null) {
                            i11 = R.id.tv_ok;
                            TextView textView = (TextView) fr.j3.q(viewInflate, R.id.tv_ok);
                            if (textView != null) {
                                i11 = R.id.tv_trans;
                                TextView textView2 = (TextView) fr.j3.q(viewInflate, R.id.tv_trans);
                                if (textView2 != null) {
                                    return new hj.p2(relativeLayout, flexboxLayout, flexboxLayout2, imageView, textView, textView2);
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
