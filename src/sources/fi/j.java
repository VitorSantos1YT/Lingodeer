package fi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.lingodeer.R;
import fr.j3;
import hj.b6;
import hj.g1;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f27315a = new j(3, g1.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/ArSyllableCardTestModelBinding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.ar_syllable_card_test_model, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.card_content;
        CardView cardView = (CardView) j3.q(viewInflate, R.id.card_content);
        if (cardView != null) {
            i11 = R.id.htv_answer;
            TextView textView = (TextView) j3.q(viewInflate, R.id.htv_answer);
            if (textView != null) {
                i11 = R.id.include_deer_audio;
                View viewQ = j3.q(viewInflate, R.id.include_deer_audio);
                if (viewQ != null) {
                    b6 b6VarA = b6.a(viewQ);
                    i11 = R.id.iv_question;
                    ImageView imageView = (ImageView) j3.q(viewInflate, R.id.iv_question);
                    if (imageView != null) {
                        i11 = R.id.rl_answer_0;
                        CardView cardView2 = (CardView) j3.q(viewInflate, R.id.rl_answer_0);
                        if (cardView2 != null) {
                            i11 = R.id.rl_answer_1;
                            CardView cardView3 = (CardView) j3.q(viewInflate, R.id.rl_answer_1);
                            if (cardView3 != null) {
                                i11 = R.id.strokes_view_0;
                                if (((TextView) j3.q(viewInflate, R.id.strokes_view_0)) != null) {
                                    i11 = R.id.strokes_view_1;
                                    if (((TextView) j3.q(viewInflate, R.id.strokes_view_1)) != null) {
                                        i11 = R.id.tv_left;
                                        if (((TextView) j3.q(viewInflate, R.id.tv_left)) != null) {
                                            i11 = R.id.tv_right;
                                            if (((TextView) j3.q(viewInflate, R.id.tv_right)) != null) {
                                                i11 = R.id.txt_pinyin;
                                                TextView textView2 = (TextView) j3.q(viewInflate, R.id.txt_pinyin);
                                                if (textView2 != null) {
                                                    return new g1((LinearLayout) viewInflate, cardView, textView, b6VarA, imageView, cardView2, cardView3, textView2);
                                                }
                                            }
                                        }
                                    }
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
