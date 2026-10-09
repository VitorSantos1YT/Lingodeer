package ci;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.lingodeer.R;
import fr.j3;
import hj.k3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f7160a = new z(3, k3.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/FragmentArSyllableLesson1Binding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.fragment_ar_syllable_lesson_1, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.card_a;
        MaterialCardView materialCardView = (MaterialCardView) j3.q(viewInflate, R.id.card_a);
        if (materialCardView != null) {
            i11 = R.id.card_baa5;
            MaterialCardView materialCardView2 = (MaterialCardView) j3.q(viewInflate, R.id.card_baa5);
            if (materialCardView2 != null) {
                i11 = R.id.card_i;
                MaterialCardView materialCardView3 = (MaterialCardView) j3.q(viewInflate, R.id.card_i);
                if (materialCardView3 != null) {
                    i11 = R.id.card_miim;
                    MaterialCardView materialCardView4 = (MaterialCardView) j3.q(viewInflate, R.id.card_miim);
                    if (materialCardView4 != null) {
                        i11 = R.id.card_raa5;
                        MaterialCardView materialCardView5 = (MaterialCardView) j3.q(viewInflate, R.id.card_raa5);
                        if (materialCardView5 != null) {
                            i11 = R.id.tv_a_desc;
                            if (((TextView) j3.q(viewInflate, R.id.tv_a_desc)) != null) {
                                i11 = R.id.tv_baa5_desc;
                                if (((TextView) j3.q(viewInflate, R.id.tv_baa5_desc)) != null) {
                                    i11 = R.id.tv_diacritic;
                                    if (((TextView) j3.q(viewInflate, R.id.tv_diacritic)) != null) {
                                        i11 = R.id.tv_i_desc;
                                        if (((TextView) j3.q(viewInflate, R.id.tv_i_desc)) != null) {
                                            i11 = R.id.tv_latter;
                                            if (((TextView) j3.q(viewInflate, R.id.tv_latter)) != null) {
                                                i11 = R.id.tv_miim_desc;
                                                if (((TextView) j3.q(viewInflate, R.id.tv_miim_desc)) != null) {
                                                    i11 = R.id.tv_miim_raa5;
                                                    if (((TextView) j3.q(viewInflate, R.id.tv_miim_raa5)) != null) {
                                                        i11 = R.id.tv_title;
                                                        if (((TextView) j3.q(viewInflate, R.id.tv_title)) != null) {
                                                            return new k3((ConstraintLayout) viewInflate, materialCardView, materialCardView2, materialCardView3, materialCardView4, materialCardView5);
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
