package ci;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.lingodeer.R;
import fr.j3;
import hj.m3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e0 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f7129a = new e0(3, m3.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/FragmentArSyllableLesson3Binding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.fragment_ar_syllable_lesson_3, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.card_aa;
        MaterialCardView materialCardView = (MaterialCardView) j3.q(viewInflate, R.id.card_aa);
        if (materialCardView != null) {
            i11 = R.id.card_dhaal;
            MaterialCardView materialCardView2 = (MaterialCardView) j3.q(viewInflate, R.id.card_dhaal);
            if (materialCardView2 != null) {
                i11 = R.id.card_jiim;
                MaterialCardView materialCardView3 = (MaterialCardView) j3.q(viewInflate, R.id.card_jiim);
                if (materialCardView3 != null) {
                    i11 = R.id.card_laam;
                    MaterialCardView materialCardView4 = (MaterialCardView) j3.q(viewInflate, R.id.card_laam);
                    if (materialCardView4 != null) {
                        i11 = R.id.card_waaw;
                        MaterialCardView materialCardView5 = (MaterialCardView) j3.q(viewInflate, R.id.card_waaw);
                        if (materialCardView5 != null) {
                            i11 = R.id.tv_aa_desc;
                            if (((TextView) j3.q(viewInflate, R.id.tv_aa_desc)) != null) {
                                i11 = R.id.tv_dhaal_desc;
                                if (((TextView) j3.q(viewInflate, R.id.tv_dhaal_desc)) != null) {
                                    i11 = R.id.tv_diacritic;
                                    if (((TextView) j3.q(viewInflate, R.id.tv_diacritic)) != null) {
                                        i11 = R.id.tv_jiim_desc;
                                        if (((TextView) j3.q(viewInflate, R.id.tv_jiim_desc)) != null) {
                                            i11 = R.id.tv_laam_desc;
                                            if (((TextView) j3.q(viewInflate, R.id.tv_laam_desc)) != null) {
                                                i11 = R.id.tv_latter;
                                                if (((TextView) j3.q(viewInflate, R.id.tv_latter)) != null) {
                                                    i11 = R.id.tv_title;
                                                    if (((TextView) j3.q(viewInflate, R.id.tv_title)) != null) {
                                                        i11 = R.id.tv_waaw_desc;
                                                        if (((TextView) j3.q(viewInflate, R.id.tv_waaw_desc)) != null) {
                                                            return new m3((ConstraintLayout) viewInflate, materialCardView, materialCardView2, materialCardView3, materialCardView4, materialCardView5);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
