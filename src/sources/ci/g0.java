package ci;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.lingodeer.R;
import fr.j3;
import hj.n3;
import pt.ImS.aYZzTH;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g0 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g0 f7132a = new g0(3, n3.class, "inflate", aYZzTH.MYzXgXgVPHytf, 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.fragment_ar_syllable_lesson_4, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.card_3ayn;
        MaterialCardView materialCardView = (MaterialCardView) j3.q(viewInflate, R.id.card_3ayn);
        if (materialCardView != null) {
            i11 = R.id.card_d4aad;
            MaterialCardView materialCardView2 = (MaterialCardView) j3.q(viewInflate, R.id.card_d4aad);
            if (materialCardView2 != null) {
                i11 = R.id.card_dh4aa5;
                MaterialCardView materialCardView3 = (MaterialCardView) j3.q(viewInflate, R.id.card_dh4aa5);
                if (materialCardView3 != null) {
                    i11 = R.id.card_ii;
                    MaterialCardView materialCardView4 = (MaterialCardView) j3.q(viewInflate, R.id.card_ii);
                    if (materialCardView4 != null) {
                        i11 = R.id.card_khaa5;
                        MaterialCardView materialCardView5 = (MaterialCardView) j3.q(viewInflate, R.id.card_khaa5);
                        if (materialCardView5 != null) {
                            i11 = R.id.card_uu;
                            MaterialCardView materialCardView6 = (MaterialCardView) j3.q(viewInflate, R.id.card_uu);
                            if (materialCardView6 != null) {
                                i11 = R.id.tv_3ayn_desc;
                                if (((TextView) j3.q(viewInflate, R.id.tv_3ayn_desc)) != null) {
                                    i11 = R.id.tv_dh4aa5_desc;
                                    if (((TextView) j3.q(viewInflate, R.id.tv_dh4aa5_desc)) != null) {
                                        i11 = R.id.tv_diacritic;
                                        if (((TextView) j3.q(viewInflate, R.id.tv_diacritic)) != null) {
                                            i11 = R.id.tv_ii_desc;
                                            if (((TextView) j3.q(viewInflate, R.id.tv_ii_desc)) != null) {
                                                i11 = R.id.tv_khaa5_desc;
                                                if (((TextView) j3.q(viewInflate, R.id.tv_khaa5_desc)) != null) {
                                                    i11 = R.id.tv_latter;
                                                    if (((TextView) j3.q(viewInflate, R.id.tv_latter)) != null) {
                                                        i11 = R.id.tv_title;
                                                        if (((TextView) j3.q(viewInflate, R.id.tv_title)) != null) {
                                                            i11 = R.id.tv_uu_desc;
                                                            if (((TextView) j3.q(viewInflate, R.id.tv_uu_desc)) != null) {
                                                                i11 = R.id.tv_waaw_desc;
                                                                if (((TextView) j3.q(viewInflate, R.id.tv_waaw_desc)) != null) {
                                                                    return new n3((ConstraintLayout) viewInflate, materialCardView, materialCardView2, materialCardView3, materialCardView4, materialCardView5, materialCardView6);
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
