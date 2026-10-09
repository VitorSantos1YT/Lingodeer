package ci;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.lingodeer.R;
import fr.j3;
import hj.i3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f7143a = new m(3, i3.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/FragmentArSyllableIntroductionCard1Binding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.fragment_ar_syllable_introduction_card_1, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.tv_ba;
        TextView textView = (TextView) j3.q(viewInflate, R.id.tv_ba);
        if (textView != null) {
            i11 = R.id.tv_bi;
            TextView textView2 = (TextView) j3.q(viewInflate, R.id.tv_bi);
            if (textView2 != null) {
                i11 = R.id.tv_char_a;
                TextView textView3 = (TextView) j3.q(viewInflate, R.id.tv_char_a);
                if (textView3 != null) {
                    i11 = R.id.tv_char_a_desc;
                    if (((TextView) j3.q(viewInflate, R.id.tv_char_a_desc)) != null) {
                        i11 = R.id.tv_char_b;
                        TextView textView4 = (TextView) j3.q(viewInflate, R.id.tv_char_b);
                        if (textView4 != null) {
                            i11 = R.id.tv_char_b_1;
                            TextView textView5 = (TextView) j3.q(viewInflate, R.id.tv_char_b_1);
                            if (textView5 != null) {
                                i11 = R.id.tv_char_b_1_desc;
                                if (((TextView) j3.q(viewInflate, R.id.tv_char_b_1_desc)) != null) {
                                    i11 = R.id.tv_char_b_desc;
                                    if (((TextView) j3.q(viewInflate, R.id.tv_char_b_desc)) != null) {
                                        i11 = R.id.tv_char_i;
                                        TextView textView6 = (TextView) j3.q(viewInflate, R.id.tv_char_i);
                                        if (textView6 != null) {
                                            i11 = R.id.tv_char_i_desc;
                                            if (((TextView) j3.q(viewInflate, R.id.tv_char_i_desc)) != null) {
                                                i11 = R.id.tv_desc;
                                                if (((TextView) j3.q(viewInflate, R.id.tv_desc)) != null) {
                                                    i11 = R.id.tv_title;
                                                    if (((TextView) j3.q(viewInflate, R.id.tv_title)) != null) {
                                                        return new i3((CardView) viewInflate, textView, textView2, textView3, textView4, textView5, textView6);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
