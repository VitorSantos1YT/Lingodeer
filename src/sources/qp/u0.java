package qp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.google.android.flexbox.FlexboxLayout;
import com.lingodeer.R;
import hj.a6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u0 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u0 f48212a = new u0(3, hj.p1.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/CnChallengeWordModelView11Binding;", 0);

    /* JADX WARN: Code duplicated, block: B:22:0x0076 A[PHI: r5
      0x0076: PHI (r5v8 int) = (r5v7 int), (r5v9 int), (r5v10 int), (r5v11 int) binds: [B:10:0x003d, B:12:0x0048, B:14:0x0053, B:16:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.cn_challenge_word_model_view_11, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.flex_option;
        if (((FlexboxLayout) fr.j3.q(viewInflate, R.id.flex_option)) != null) {
            i11 = R.id.include_challenge_header_with_translation;
            View viewQ = fr.j3.q(viewInflate, R.id.include_challenge_header_with_translation);
            if (viewQ != null) {
                a6 a6VarA = a6.a(viewQ);
                int i12 = R.id.rl_answer_0;
                if (((FrameLayout) fr.j3.q(viewInflate, R.id.rl_answer_0)) != null) {
                    i12 = R.id.rl_answer_1;
                    if (((FrameLayout) fr.j3.q(viewInflate, R.id.rl_answer_1)) != null) {
                        i12 = R.id.rl_answer_2;
                        if (((FrameLayout) fr.j3.q(viewInflate, R.id.rl_answer_2)) != null) {
                            i12 = R.id.rl_answer_3;
                            if (((FrameLayout) fr.j3.q(viewInflate, R.id.rl_answer_3)) != null) {
                                LinearLayout linearLayout = (LinearLayout) viewInflate;
                                if (((ScrollView) fr.j3.q(viewInflate, R.id.scroll_options)) != null) {
                                    return new hj.p1(linearLayout, a6VarA);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
