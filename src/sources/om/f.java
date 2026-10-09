package om;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.lingodeer.R;
import com.lingodeer.course.stroke_order_view_new.old.HwCharThumbView;
import fr.j3;
import hj.b6;
import hj.r6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f45608a = new f(3, r6.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/SyllableCardTestModelBinding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.syllable_card_test_model, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.card_content;
        CardView cardView = (CardView) j3.q(viewInflate, R.id.card_content);
        if (cardView != null) {
            i11 = R.id.htv_answer;
            HwCharThumbView hwCharThumbView = (HwCharThumbView) j3.q(viewInflate, R.id.htv_answer);
            if (hwCharThumbView != null) {
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
                                if (((HwCharThumbView) j3.q(viewInflate, R.id.strokes_view_0)) != null) {
                                    i11 = R.id.strokes_view_1;
                                    if (((HwCharThumbView) j3.q(viewInflate, R.id.strokes_view_1)) != null) {
                                        i11 = R.id.tv_left;
                                        if (((TextView) j3.q(viewInflate, R.id.tv_left)) != null) {
                                            i11 = R.id.tv_right;
                                            if (((TextView) j3.q(viewInflate, R.id.tv_right)) != null) {
                                                i11 = R.id.txt_pinyin;
                                                TextView textView = (TextView) j3.q(viewInflate, R.id.txt_pinyin);
                                                if (textView != null) {
                                                    return new r6((LinearLayout) viewInflate, cardView, hwCharThumbView, b6VarA, imageView, cardView2, cardView3, textView);
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
