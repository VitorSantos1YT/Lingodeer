package qp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e4 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e4 f47913a = new e4(3, hj.y2.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/CnWordModelView4Binding;", 0);

    /* JADX WARN: Code duplicated, block: B:22:0x007a A[PHI: r5
      0x007a: PHI (r5v6 int) = (r5v5 int), (r5v7 int), (r5v8 int), (r5v9 int), (r5v10 int) binds: [B:8:0x0032, B:10:0x003b, B:12:0x0047, B:14:0x0053, B:16:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.cn_word_model_view_4, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.include_word_sentence_audio_title;
        View viewQ = fr.j3.q(viewInflate, R.id.include_word_sentence_audio_title);
        if (viewQ != null) {
            hj.e3 e3VarB = hj.e3.b(viewQ);
            int i12 = R.id.ll_option;
            if (((LinearLayout) fr.j3.q(viewInflate, R.id.ll_option)) != null) {
                i12 = R.id.rl_answer_0;
                View viewQ2 = fr.j3.q(viewInflate, R.id.rl_answer_0);
                if (viewQ2 != null) {
                    hj.i0.a(viewQ2);
                    i12 = R.id.rl_answer_1;
                    View viewQ3 = fr.j3.q(viewInflate, R.id.rl_answer_1);
                    if (viewQ3 != null) {
                        hj.i0.a(viewQ3);
                        i12 = R.id.rl_answer_2;
                        View viewQ4 = fr.j3.q(viewInflate, R.id.rl_answer_2);
                        if (viewQ4 != null) {
                            hj.i0.a(viewQ4);
                            i12 = R.id.rl_answer_3;
                            View viewQ5 = fr.j3.q(viewInflate, R.id.rl_answer_3);
                            if (viewQ5 != null) {
                                hj.i0.a(viewQ5);
                                LinearLayout linearLayout = (LinearLayout) viewInflate;
                                if (((ScrollView) fr.j3.q(viewInflate, R.id.scroll_options)) != null) {
                                    return new hj.y2(linearLayout, e3VarB);
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
