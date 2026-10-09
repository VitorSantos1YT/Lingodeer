package om;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.lingodeer.R;
import fr.j3;
import hj.q6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f45617a = new k(3, q6.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/SyllableCardTestModel4Binding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.syllable_card_test_model4, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.ll_option;
        LinearLayout linearLayout = (LinearLayout) j3.q(viewInflate, R.id.ll_option);
        if (linearLayout != null) {
            i11 = R.id.ll_title;
            LinearLayout linearLayout2 = (LinearLayout) j3.q(viewInflate, R.id.ll_title);
            if (linearLayout2 != null) {
                i11 = R.id.rl_answer_0;
                View viewQ = j3.q(viewInflate, R.id.rl_answer_0);
                if (viewQ != null) {
                    hj.l.a(viewQ);
                    i11 = R.id.rl_answer_1;
                    View viewQ2 = j3.q(viewInflate, R.id.rl_answer_1);
                    if (viewQ2 != null) {
                        hj.l.a(viewQ2);
                        i11 = R.id.rl_answer_2;
                        View viewQ3 = j3.q(viewInflate, R.id.rl_answer_2);
                        if (viewQ3 != null) {
                            hj.l.a(viewQ3);
                            i11 = R.id.rl_answer_3;
                            View viewQ4 = j3.q(viewInflate, R.id.rl_answer_3);
                            if (viewQ4 != null) {
                                hj.l.a(viewQ4);
                                i11 = R.id.tv_title;
                                TextView textView = (TextView) j3.q(viewInflate, R.id.tv_title);
                                if (textView != null) {
                                    return new q6((LinearLayout) viewInflate, linearLayout, linearLayout2, textView);
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
