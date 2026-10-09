package qp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w3 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w3 f48248a = new w3(3, hj.v2.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/CnWordModelView2Binding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.cn_word_model_view_2, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.flex_option;
        if (((FlexboxLayout) fr.j3.q(viewInflate, R.id.flex_option)) != null) {
            i11 = R.id.include_title_single_line;
            View viewQ = fr.j3.q(viewInflate, R.id.include_title_single_line);
            if (viewQ != null) {
                LinearLayout linearLayout = (LinearLayout) viewQ;
                TextView textView = (TextView) fr.j3.q(viewQ, R.id.tv_trans);
                if (textView == null) {
                    throw new NullPointerException("Missing required view with ID: ".concat(viewQ.getResources().getResourceName(R.id.tv_trans)));
                }
                hj.d3 d3Var = new hj.d3(textView, 5, linearLayout);
                i11 = R.id.rl_answer_0;
                View viewQ2 = fr.j3.q(viewInflate, R.id.rl_answer_0);
                if (viewQ2 != null) {
                    hj.s0.a(viewQ2);
                    i11 = R.id.rl_answer_1;
                    View viewQ3 = fr.j3.q(viewInflate, R.id.rl_answer_1);
                    if (viewQ3 != null) {
                        hj.s0.a(viewQ3);
                        i11 = R.id.rl_answer_2;
                        View viewQ4 = fr.j3.q(viewInflate, R.id.rl_answer_2);
                        if (viewQ4 != null) {
                            hj.s0.a(viewQ4);
                            i11 = R.id.rl_answer_3;
                            View viewQ5 = fr.j3.q(viewInflate, R.id.rl_answer_3);
                            if (viewQ5 != null) {
                                hj.s0.a(viewQ5);
                                i11 = R.id.scroll_options;
                                if (((ScrollView) fr.j3.q(viewInflate, R.id.scroll_options)) != null) {
                                    return new hj.v2((LinearLayout) viewInflate, d3Var);
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
