package qp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.google.android.flexbox.FlexboxLayout;
import com.lingodeer.R;
import hj.d6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g2 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g2 f47940a = new g2(3, hj.o2.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/CnSentenceModelView8Binding;", 0);

    /* JADX WARN: Code duplicated, block: B:24:0x008b A[PHI: r6
      0x008b: PHI (r6v6 int) = (r6v5 int), (r6v7 int), (r6v8 int), (r6v9 int), (r6v10 int) binds: [B:10:0x0043, B:12:0x004c, B:14:0x0058, B:16:0x0064, B:18:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.cn_sentence_model_view_8, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.include_sentence_model_8_title;
        View viewQ = fr.j3.q(viewInflate, R.id.include_sentence_model_8_title);
        if (viewQ != null) {
            if (((FlexboxLayout) fr.j3.q(viewQ, R.id.fl_container)) == null) {
                throw new NullPointerException("Missing required view with ID: ".concat(viewQ.getResources().getResourceName(R.id.fl_container)));
            }
            LinearLayout linearLayout = (LinearLayout) viewQ;
            d6 d6Var = new d6(linearLayout, linearLayout, 2);
            int i12 = R.id.ll_option;
            if (((LinearLayout) fr.j3.q(viewInflate, R.id.ll_option)) != null) {
                i12 = R.id.rl_answer_0;
                View viewQ2 = fr.j3.q(viewInflate, R.id.rl_answer_0);
                if (viewQ2 != null) {
                    hj.z.a(viewQ2);
                    i12 = R.id.rl_answer_1;
                    View viewQ3 = fr.j3.q(viewInflate, R.id.rl_answer_1);
                    if (viewQ3 != null) {
                        hj.z.a(viewQ3);
                        i12 = R.id.rl_answer_2;
                        View viewQ4 = fr.j3.q(viewInflate, R.id.rl_answer_2);
                        if (viewQ4 != null) {
                            hj.z.a(viewQ4);
                            i12 = R.id.rl_answer_3;
                            View viewQ5 = fr.j3.q(viewInflate, R.id.rl_answer_3);
                            if (viewQ5 != null) {
                                hj.z.a(viewQ5);
                                LinearLayout linearLayout2 = (LinearLayout) viewInflate;
                                if (((ScrollView) fr.j3.q(viewInflate, R.id.scroll_options)) != null) {
                                    return new hj.o2(linearLayout2, d6Var);
                                }
                                i11 = R.id.scroll_options;
                            } else {
                                i11 = i12;
                            }
                        } else {
                            i11 = i12;
                        }
                    } else {
                        i11 = i12;
                    }
                } else {
                    i11 = i12;
                }
            } else {
                i11 = i12;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
