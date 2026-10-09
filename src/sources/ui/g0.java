package ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.lingodeer.R;
import fr.j3;
import hj.u3;
import hj.u4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g0 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g0 f52988a = new g0(3, u4.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/FragmentPinyinTestFinishBinding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.fragment_pinyin_test_finish, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.btn_continue;
        MaterialButton materialButton = (MaterialButton) j3.q(viewInflate, R.id.btn_continue);
        if (materialButton != null) {
            i11 = R.id.fl_finish_pop_deer;
            View viewQ = j3.q(viewInflate, R.id.fl_finish_pop_deer);
            if (viewQ != null) {
                u3 u3VarA = u3.a(viewQ);
                i11 = R.id.ll_btm_btn_parent;
                if (((LinearLayout) j3.q(viewInflate, R.id.ll_btm_btn_parent)) != null) {
                    i11 = R.id.ll_score_info;
                    if (((LinearLayout) j3.q(viewInflate, R.id.ll_score_info)) != null) {
                        FrameLayout frameLayout = (FrameLayout) viewInflate;
                        i11 = R.id.status_bar_view;
                        View viewQ2 = j3.q(viewInflate, R.id.status_bar_view);
                        if (viewQ2 != null) {
                            i11 = R.id.tv_correct_count;
                            TextView textView = (TextView) j3.q(viewInflate, R.id.tv_correct_count);
                            if (textView != null) {
                                i11 = R.id.tv_correct_rate;
                                TextView textView2 = (TextView) j3.q(viewInflate, R.id.tv_correct_rate);
                                if (textView2 != null) {
                                    return new u4(frameLayout, materialButton, u3VarA, viewQ2, textView, textView2);
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
