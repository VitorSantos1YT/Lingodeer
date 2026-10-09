package qp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.flexbox.FlexboxLayout;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r3 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r3 f48152a = new r3(3, hj.q2.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/CnSentenceModelViewQaBinding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.cn_sentence_model_view_qa, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.fl_drag_accept;
        if (((FrameLayout) fr.j3.q(viewInflate, R.id.fl_drag_accept)) != null) {
            i11 = R.id.flex_bottom;
            FlexboxLayout flexboxLayout = (FlexboxLayout) fr.j3.q(viewInflate, R.id.flex_bottom);
            if (flexboxLayout != null) {
                i11 = R.id.frame_tips;
                FrameLayout frameLayout = (FrameLayout) fr.j3.q(viewInflate, R.id.frame_tips);
                if (frameLayout != null) {
                    i11 = R.id.gap_view;
                    View viewQ = fr.j3.q(viewInflate, R.id.gap_view);
                    if (viewQ != null) {
                        i11 = R.id.ll_top;
                        LinearLayout linearLayout = (LinearLayout) fr.j3.q(viewInflate, R.id.ll_top);
                        if (linearLayout != null) {
                            FrameLayout frameLayout2 = (FrameLayout) viewInflate;
                            i11 = R.id.tv_tips;
                            if (((AppCompatTextView) fr.j3.q(viewInflate, R.id.tv_tips)) != null) {
                                return new hj.q2(frameLayout2, flexboxLayout, frameLayout, viewQ, linearLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
