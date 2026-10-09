package km;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.lingodeer.R;
import fr.j3;
import hj.m5;
import hj.u3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r1 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r1 f38270a = new r1(3, m5.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/FragmentSyllableIntroductionCard3Binding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.fragment_syllable_introduction_card_3, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.ll_kanji_table_2;
        View viewQ = j3.q(viewInflate, R.id.ll_kanji_table_2);
        if (viewQ != null) {
            int i12 = R.id.ll_furigana;
            LinearLayout linearLayout = (LinearLayout) j3.q(viewQ, R.id.ll_furigana);
            if (linearLayout != null) {
                i12 = R.id.ll_kanji;
                LinearLayout linearLayout2 = (LinearLayout) j3.q(viewQ, R.id.ll_kanji);
                if (linearLayout2 != null) {
                    i12 = R.id.ll_wataxi;
                    if (((LinearLayout) j3.q(viewQ, R.id.ll_wataxi)) != null) {
                        i12 = R.id.tv_wataxi_word;
                        TextView textView = (TextView) j3.q(viewQ, R.id.tv_wataxi_word);
                        if (textView != null) {
                            i12 = R.id.tv_wataxi_zhuyin;
                            TextView textView2 = (TextView) j3.q(viewQ, R.id.tv_wataxi_zhuyin);
                            if (textView2 != null) {
                                u3 u3Var = new u3((ConstraintLayout) viewQ, linearLayout, linearLayout2, textView, textView2, 4);
                                i11 = R.id.ll_parent;
                                LinearLayout linearLayout3 = (LinearLayout) j3.q(viewInflate, R.id.ll_parent);
                                if (linearLayout3 != null) {
                                    i11 = R.id.next_lesson;
                                    MaterialButton materialButton = (MaterialButton) j3.q(viewInflate, R.id.next_lesson);
                                    if (materialButton != null) {
                                        i11 = R.id.title_tips_desc_3;
                                        if (((TextView) j3.q(viewInflate, R.id.title_tips_desc_3)) != null) {
                                            i11 = R.id.tv_title_desc_3;
                                            if (((TextView) j3.q(viewInflate, R.id.tv_title_desc_3)) != null) {
                                                return new m5((CardView) viewInflate, u3Var, linearLayout3, materialButton);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewQ.getResources().getResourceName(i12)));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
