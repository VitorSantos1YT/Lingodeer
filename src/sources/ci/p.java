package ci;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.material.button.MaterialButton;
import com.lingodeer.R;
import hj.j3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f7149a = new p(3, j3.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/FragmentArSyllableIntroductionCard2Binding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.fragment_ar_syllable_introduction_card_2, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.ll_hadhihi;
        LinearLayout linearLayout = (LinearLayout) fr.j3.q(viewInflate, R.id.ll_hadhihi);
        if (linearLayout != null) {
            i11 = R.id.ll_huwa;
            LinearLayout linearLayout2 = (LinearLayout) fr.j3.q(viewInflate, R.id.ll_huwa);
            if (linearLayout2 != null) {
                i11 = R.id.ll_muhimmun;
                LinearLayout linearLayout3 = (LinearLayout) fr.j3.q(viewInflate, R.id.ll_muhimmun);
                if (linearLayout3 != null) {
                    i11 = R.id.ll_taafihun;
                    LinearLayout linearLayout4 = (LinearLayout) fr.j3.q(viewInflate, R.id.ll_taafihun);
                    if (linearLayout4 != null) {
                        i11 = R.id.next_lesson;
                        MaterialButton materialButton = (MaterialButton) fr.j3.q(viewInflate, R.id.next_lesson);
                        if (materialButton != null) {
                            i11 = R.id.table_layout;
                            if (((TableLayout) fr.j3.q(viewInflate, R.id.table_layout)) != null) {
                                i11 = R.id.tv_desc;
                                if (((TextView) fr.j3.q(viewInflate, R.id.tv_desc)) != null) {
                                    i11 = R.id.tv_title;
                                    if (((TextView) fr.j3.q(viewInflate, R.id.tv_title)) != null) {
                                        return new j3((CardView) viewInflate, linearLayout, linearLayout2, linearLayout3, linearLayout4, materialButton);
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
