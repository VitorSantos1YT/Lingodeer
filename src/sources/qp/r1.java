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
public final /* synthetic */ class r1 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r1 f48148a = new r1(3, hj.j2.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/CnSentenceModelView3Binding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.cn_sentence_model_view_3, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.flex_option;
        FlexboxLayout flexboxLayout = (FlexboxLayout) fr.j3.q(viewInflate, R.id.flex_option);
        if (flexboxLayout != null) {
            i11 = R.id.include_sentence_model_3_title;
            View viewQ = fr.j3.q(viewInflate, R.id.include_sentence_model_3_title);
            if (viewQ != null) {
                int i12 = R.id.flex_container;
                FlexboxLayout flexboxLayout2 = (FlexboxLayout) fr.j3.q(viewQ, R.id.flex_container);
                if (flexboxLayout2 != null) {
                    LinearLayout linearLayout = (LinearLayout) viewQ;
                    TextView textView = (TextView) fr.j3.q(viewQ, R.id.tv_trans);
                    if (textView != null) {
                        hj.e3 e3Var = new hj.e3(linearLayout, flexboxLayout2, textView, 7);
                        LinearLayout linearLayout2 = (LinearLayout) viewInflate;
                        int i13 = R.id.rl_answer_0;
                        View viewQ2 = fr.j3.q(viewInflate, R.id.rl_answer_0);
                        if (viewQ2 != null) {
                            hj.o.a(viewQ2);
                            i13 = R.id.rl_answer_1;
                            View viewQ3 = fr.j3.q(viewInflate, R.id.rl_answer_1);
                            if (viewQ3 != null) {
                                hj.o.a(viewQ3);
                                i13 = R.id.rl_answer_2;
                                View viewQ4 = fr.j3.q(viewInflate, R.id.rl_answer_2);
                                if (viewQ4 != null) {
                                    hj.o.a(viewQ4);
                                    i13 = R.id.rl_answer_3;
                                    View viewQ5 = fr.j3.q(viewInflate, R.id.rl_answer_3);
                                    if (viewQ5 != null) {
                                        hj.o.a(viewQ5);
                                        i13 = R.id.scroll_options;
                                        if (((ScrollView) fr.j3.q(viewInflate, R.id.scroll_options)) != null) {
                                            return new hj.j2(linearLayout2, flexboxLayout, e3Var);
                                        }
                                    }
                                }
                            }
                        }
                        i11 = i13;
                    } else {
                        i12 = R.id.tv_trans;
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewQ.getResources().getResourceName(i12)));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
