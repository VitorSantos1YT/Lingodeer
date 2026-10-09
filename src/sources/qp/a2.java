package qp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import com.lingodeer.R;
import zp.sBa.anrPHlQ;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a2 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a2 f47822a = new a2(3, hj.m2.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/CnSentenceModelView6Binding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(layoutInflater, anrPHlQ.ueMYqQSXjTEPZOr);
        View viewInflate = layoutInflater.inflate(R.layout.cn_sentence_model_view_6, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.fl_drag_accept;
        if (((FrameLayout) fr.j3.q(viewInflate, R.id.fl_drag_accept)) != null) {
            i11 = R.id.flex_bottom;
            FlexboxLayout flexboxLayout = (FlexboxLayout) fr.j3.q(viewInflate, R.id.flex_bottom);
            if (flexboxLayout != null) {
                i11 = R.id.flex_top;
                FlexboxLayout flexboxLayout2 = (FlexboxLayout) fr.j3.q(viewInflate, R.id.flex_top);
                if (flexboxLayout2 != null) {
                    i11 = R.id.gap_view;
                    View viewQ = fr.j3.q(viewInflate, R.id.gap_view);
                    if (viewQ != null) {
                        FrameLayout frameLayout = (FrameLayout) viewInflate;
                        i11 = R.id.tv_trans;
                        TextView textView = (TextView) fr.j3.q(viewInflate, R.id.tv_trans);
                        if (textView != null) {
                            i11 = R.id.view_line;
                            View viewQ2 = fr.j3.q(viewInflate, R.id.view_line);
                            if (viewQ2 != null) {
                                return new hj.m2(frameLayout, flexboxLayout, flexboxLayout2, viewQ, textView, viewQ2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
