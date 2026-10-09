package ci;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.lingodeer.R;
import fr.j3;
import hj.q3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o0 f7148a = new o0(3, q3.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/FragmentArSyllableLesson7Binding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.fragment_ar_syllable_lesson_7, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.card_2a;
        MaterialCardView materialCardView = (MaterialCardView) j3.q(viewInflate, R.id.card_2a);
        if (materialCardView != null) {
            i11 = R.id.card_2a_1;
            MaterialCardView materialCardView2 = (MaterialCardView) j3.q(viewInflate, R.id.card_2a_1);
            if (materialCardView2 != null) {
                i11 = R.id.card_2a_2;
                MaterialCardView materialCardView3 = (MaterialCardView) j3.q(viewInflate, R.id.card_2a_2);
                if (materialCardView3 != null) {
                    i11 = R.id.card_2abba;
                    MaterialCardView materialCardView4 = (MaterialCardView) j3.q(viewInflate, R.id.card_2abba);
                    if (materialCardView4 != null) {
                        i11 = R.id.card_2abbi;
                        MaterialCardView materialCardView5 = (MaterialCardView) j3.q(viewInflate, R.id.card_2abbi);
                        if (materialCardView5 != null) {
                            i11 = R.id.card_2abbu;
                            MaterialCardView materialCardView6 = (MaterialCardView) j3.q(viewInflate, R.id.card_2abbu);
                            if (materialCardView6 != null) {
                                i11 = R.id.card_b;
                                MaterialCardView materialCardView7 = (MaterialCardView) j3.q(viewInflate, R.id.card_b);
                                if (materialCardView7 != null) {
                                    i11 = R.id.card_b_1;
                                    MaterialCardView materialCardView8 = (MaterialCardView) j3.q(viewInflate, R.id.card_b_1);
                                    if (materialCardView8 != null) {
                                        i11 = R.id.card_b_2;
                                        MaterialCardView materialCardView9 = (MaterialCardView) j3.q(viewInflate, R.id.card_b_2);
                                        if (materialCardView9 != null) {
                                            i11 = R.id.card_ba;
                                            MaterialCardView materialCardView10 = (MaterialCardView) j3.q(viewInflate, R.id.card_ba);
                                            if (materialCardView10 != null) {
                                                i11 = R.id.card_bi;
                                                MaterialCardView materialCardView11 = (MaterialCardView) j3.q(viewInflate, R.id.card_bi);
                                                if (materialCardView11 != null) {
                                                    i11 = R.id.card_bu;
                                                    MaterialCardView materialCardView12 = (MaterialCardView) j3.q(viewInflate, R.id.card_bu);
                                                    if (materialCardView12 != null) {
                                                        i11 = R.id.card_faa5;
                                                        MaterialCardView materialCardView13 = (MaterialCardView) j3.q(viewInflate, R.id.card_faa5);
                                                        if (materialCardView13 != null) {
                                                            i11 = R.id.card_haa5;
                                                            MaterialCardView materialCardView14 = (MaterialCardView) j3.q(viewInflate, R.id.card_haa5);
                                                            if (materialCardView14 != null) {
                                                                i11 = R.id.card_kaaf;
                                                                MaterialCardView materialCardView15 = (MaterialCardView) j3.q(viewInflate, R.id.card_kaaf);
                                                                if (materialCardView15 != null) {
                                                                    i11 = R.id.card_shadda;
                                                                    if (((MaterialCardView) j3.q(viewInflate, R.id.card_shadda)) != null) {
                                                                        i11 = R.id.card_shiin;
                                                                        MaterialCardView materialCardView16 = (MaterialCardView) j3.q(viewInflate, R.id.card_shiin);
                                                                        if (materialCardView16 != null) {
                                                                            i11 = R.id.const_2abba;
                                                                            if (((LinearLayout) j3.q(viewInflate, R.id.const_2abba)) != null) {
                                                                                i11 = R.id.const_2abbi;
                                                                                if (((LinearLayout) j3.q(viewInflate, R.id.const_2abbi)) != null) {
                                                                                    i11 = R.id.const_2abbu;
                                                                                    if (((LinearLayout) j3.q(viewInflate, R.id.const_2abbu)) != null) {
                                                                                        i11 = R.id.tv_diacritic;
                                                                                        if (((TextView) j3.q(viewInflate, R.id.tv_diacritic)) != null) {
                                                                                            i11 = R.id.tv_faa5_desc;
                                                                                            if (((TextView) j3.q(viewInflate, R.id.tv_faa5_desc)) != null) {
                                                                                                i11 = R.id.tv_haa5_desc;
                                                                                                if (((TextView) j3.q(viewInflate, R.id.tv_haa5_desc)) != null) {
                                                                                                    i11 = R.id.tv_kaaf_desc;
                                                                                                    if (((TextView) j3.q(viewInflate, R.id.tv_kaaf_desc)) != null) {
                                                                                                        i11 = R.id.tv_latter;
                                                                                                        if (((TextView) j3.q(viewInflate, R.id.tv_latter)) != null) {
                                                                                                            i11 = R.id.tv_shadda_desc;
                                                                                                            if (((TextView) j3.q(viewInflate, R.id.tv_shadda_desc)) != null) {
                                                                                                                i11 = R.id.tv_shiin_desc;
                                                                                                                if (((TextView) j3.q(viewInflate, R.id.tv_shiin_desc)) != null) {
                                                                                                                    i11 = R.id.tv_title;
                                                                                                                    if (((TextView) j3.q(viewInflate, R.id.tv_title)) != null) {
                                                                                                                        return new q3((ConstraintLayout) viewInflate, materialCardView, materialCardView2, materialCardView3, materialCardView4, materialCardView5, materialCardView6, materialCardView7, materialCardView8, materialCardView9, materialCardView10, materialCardView11, materialCardView12, materialCardView13, materialCardView14, materialCardView15, materialCardView16);
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
