package hj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class y1 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f33611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b6 f33612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinearLayout f33613c;

    public y1(LinearLayout linearLayout, b6 b6Var, LinearLayout linearLayout2) {
        this.f33611a = linearLayout;
        this.f33612b = b6Var;
        this.f33613c = linearLayout2;
    }

    public static y1 a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R.layout.cn_pinyin_test_model_04, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.include_deer_audio;
        View viewQ = fr.j3.q(viewInflate, R.id.include_deer_audio);
        if (viewQ != null) {
            b6 b6VarA = b6.a(viewQ);
            int i12 = R.id.ll_option;
            LinearLayout linearLayout = (LinearLayout) fr.j3.q(viewInflate, R.id.ll_option);
            if (linearLayout != null) {
                i12 = R.id.ll_title;
                if (((LinearLayout) fr.j3.q(viewInflate, R.id.ll_title)) != null) {
                    i12 = R.id.rl_answer_0;
                    View viewQ2 = fr.j3.q(viewInflate, R.id.rl_answer_0);
                    if (viewQ2 != null) {
                        l.a(viewQ2);
                        i12 = R.id.rl_answer_1;
                        View viewQ3 = fr.j3.q(viewInflate, R.id.rl_answer_1);
                        if (viewQ3 != null) {
                            l.a(viewQ3);
                            return new y1((LinearLayout) viewInflate, b6VarA, linearLayout);
                        }
                    }
                }
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33611a;
    }
}
