package km;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.lingodeer.R;
import fr.j3;
import hj.a6;
import hj.l5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o1 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o1 f38256a = new o1(3, l5.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/FragmentSyllableIntroductionCard2Binding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.fragment_syllable_introduction_card_2, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.ll_fifty_sound_tips_table_1;
        View viewQ = j3.q(viewInflate, R.id.ll_fifty_sound_tips_table_1);
        if (viewQ != null) {
            a6 a6VarB = a6.b(viewQ);
            int i12 = R.id.ll_parent;
            LinearLayout linearLayout = (LinearLayout) j3.q(viewInflate, R.id.ll_parent);
            if (linearLayout != null) {
                i12 = R.id.tv_title_desc_1;
                if (((TextView) j3.q(viewInflate, R.id.tv_title_desc_1)) != null) {
                    return new l5((CardView) viewInflate, a6VarB, linearLayout);
                }
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
