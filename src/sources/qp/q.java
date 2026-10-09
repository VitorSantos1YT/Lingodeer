package qp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.flexbox.FlexboxLayout;
import com.lingodeer.R;
import hj.a6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f48125a = new q(3, hj.m1.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/CnChallengeSentenceModelView6Binding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.cn_challenge_sentence_model_view_6, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.const_title;
        View viewQ = fr.j3.q(viewInflate, R.id.const_title);
        if (viewQ != null) {
            a6 a6VarA = a6.a(viewQ);
            i11 = R.id.fl_drag_accept;
            if (((FrameLayout) fr.j3.q(viewInflate, R.id.fl_drag_accept)) != null) {
                i11 = R.id.flex_bottom;
                FlexboxLayout flexboxLayout = (FlexboxLayout) fr.j3.q(viewInflate, R.id.flex_bottom);
                if (flexboxLayout != null) {
                    i11 = R.id.flex_top;
                    FlexboxLayout flexboxLayout2 = (FlexboxLayout) fr.j3.q(viewInflate, R.id.flex_top);
                    if (flexboxLayout2 != null) {
                        i11 = R.id.frame_tips;
                        FrameLayout frameLayout = (FrameLayout) fr.j3.q(viewInflate, R.id.frame_tips);
                        if (frameLayout != null) {
                            i11 = R.id.gap_view;
                            View viewQ2 = fr.j3.q(viewInflate, R.id.gap_view);
                            if (viewQ2 != null) {
                                FrameLayout frameLayout2 = (FrameLayout) viewInflate;
                                i11 = R.id.view_line;
                                View viewQ3 = fr.j3.q(viewInflate, R.id.view_line);
                                if (viewQ3 != null) {
                                    return new hj.m1(frameLayout2, a6VarA, flexboxLayout, flexboxLayout2, frameLayout, viewQ2, viewQ3);
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
