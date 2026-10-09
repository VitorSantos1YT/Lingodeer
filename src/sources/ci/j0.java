package ci;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.lingodeer.R;
import fr.j3;
import hj.o3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j0 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0 f7137a = new j0(3, o3.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/FragmentArSyllableLesson5Binding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.fragment_ar_syllable_lesson_5, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.card_alif;
        MaterialCardView materialCardView = (MaterialCardView) j3.q(viewInflate, R.id.card_alif);
        if (materialCardView != null) {
            i11 = R.id.card_an;
            MaterialCardView materialCardView2 = (MaterialCardView) j3.q(viewInflate, R.id.card_an);
            if (materialCardView2 != null) {
                i11 = R.id.card_ghayn;
                MaterialCardView materialCardView3 = (MaterialCardView) j3.q(viewInflate, R.id.card_ghayn);
                if (materialCardView3 != null) {
                    i11 = R.id.card_qaaf;
                    MaterialCardView materialCardView4 = (MaterialCardView) j3.q(viewInflate, R.id.card_qaaf);
                    if (materialCardView4 != null) {
                        i11 = R.id.card_siin;
                        MaterialCardView materialCardView5 = (MaterialCardView) j3.q(viewInflate, R.id.card_siin);
                        if (materialCardView5 != null) {
                            i11 = R.id.card_thaa5;
                            MaterialCardView materialCardView6 = (MaterialCardView) j3.q(viewInflate, R.id.card_thaa5);
                            if (materialCardView6 != null) {
                                i11 = R.id.tv_alif_desc;
                                if (((TextView) j3.q(viewInflate, R.id.tv_alif_desc)) != null) {
                                    i11 = R.id.tv_an_desc;
                                    if (((TextView) j3.q(viewInflate, R.id.tv_an_desc)) != null) {
                                        i11 = R.id.tv_diacritic;
                                        if (((TextView) j3.q(viewInflate, R.id.tv_diacritic)) != null) {
                                            i11 = R.id.tv_ghayn_desc;
                                            if (((TextView) j3.q(viewInflate, R.id.tv_ghayn_desc)) != null) {
                                                i11 = R.id.tv_latter;
                                                if (((TextView) j3.q(viewInflate, R.id.tv_latter)) != null) {
                                                    i11 = R.id.tv_qaaf_desc;
                                                    if (((TextView) j3.q(viewInflate, R.id.tv_qaaf_desc)) != null) {
                                                        i11 = R.id.tv_siin_desc;
                                                        if (((TextView) j3.q(viewInflate, R.id.tv_siin_desc)) != null) {
                                                            i11 = R.id.tv_thaa5_desc;
                                                            if (((TextView) j3.q(viewInflate, R.id.tv_thaa5_desc)) != null) {
                                                                i11 = R.id.tv_title;
                                                                if (((TextView) j3.q(viewInflate, R.id.tv_title)) != null) {
                                                                    return new o3((ConstraintLayout) viewInflate, materialCardView, materialCardView2, materialCardView3, materialCardView4, materialCardView5, materialCardView6);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
