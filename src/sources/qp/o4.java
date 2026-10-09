package qp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.google.android.flexbox.FlexboxLayout;
import com.lingodeer.R;
import hj.g6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o4 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o4 f48099a = new o4(3, hj.b3.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/CnWordModelView8Binding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.cn_word_model_view_8, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.flex_option;
        FlexboxLayout flexboxLayout = (FlexboxLayout) fr.j3.q(viewInflate, R.id.flex_option);
        if (flexboxLayout != null) {
            i11 = R.id.include_word_model_word_info_title;
            View viewQ = fr.j3.q(viewInflate, R.id.include_word_model_word_info_title);
            if (viewQ != null) {
                g6 g6VarA = g6.a(viewQ);
                int i12 = R.id.rl_answer_0;
                View viewQ2 = fr.j3.q(viewInflate, R.id.rl_answer_0);
                if (viewQ2 != null) {
                    hj.u0.a(viewQ2);
                    i12 = R.id.rl_answer_1;
                    View viewQ3 = fr.j3.q(viewInflate, R.id.rl_answer_1);
                    if (viewQ3 != null) {
                        hj.u0.a(viewQ3);
                        i12 = R.id.rl_answer_2;
                        View viewQ4 = fr.j3.q(viewInflate, R.id.rl_answer_2);
                        if (viewQ4 != null) {
                            hj.u0.a(viewQ4);
                            i12 = R.id.rl_answer_3;
                            View viewQ5 = fr.j3.q(viewInflate, R.id.rl_answer_3);
                            if (viewQ5 != null) {
                                hj.u0.a(viewQ5);
                                i12 = R.id.scroll_options;
                                if (((ScrollView) fr.j3.q(viewInflate, R.id.scroll_options)) != null) {
                                    return new hj.b3((LinearLayout) viewInflate, flexboxLayout, g6VarA);
                                }
                            }
                        }
                    }
                }
                i11 = i12;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
