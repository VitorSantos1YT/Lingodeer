package mj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.lingodeer.R;
import fr.j3;
import hj.e3;
import hj.m;
import kotlin.jvm.internal.j;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c extends j implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f41163a = new c(1, m.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/lingo/lingoskill/databinding/ActivityDeSyllableIntroductionBinding;", 0);

    @Override // fz.c
    public final Object invoke(Object obj) {
        LayoutInflater p4 = (LayoutInflater) obj;
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.activity_de_syllable_introduction, (ViewGroup) null, false);
        int i11 = R.id.ll_download;
        View viewQ = j3.q(viewInflate, R.id.ll_download);
        if (viewQ != null) {
            e3 e3VarA = e3.a(viewQ);
            i11 = R.id.ll_parent;
            LinearLayout linearLayout = (LinearLayout) j3.q(viewInflate, R.id.ll_parent);
            if (linearLayout != null) {
                i11 = R.id.rv_bdg_a;
                RecyclerView recyclerView = (RecyclerView) j3.q(viewInflate, R.id.rv_bdg_a);
                if (recyclerView != null) {
                    i11 = R.id.rv_bdg_b;
                    RecyclerView recyclerView2 = (RecyclerView) j3.q(viewInflate, R.id.rv_bdg_b);
                    if (recyclerView2 != null) {
                        i11 = R.id.rv_ch_a;
                        RecyclerView recyclerView3 = (RecyclerView) j3.q(viewInflate, R.id.rv_ch_a);
                        if (recyclerView3 != null) {
                            i11 = R.id.rv_ch_b;
                            RecyclerView recyclerView4 = (RecyclerView) j3.q(viewInflate, R.id.rv_ch_b);
                            if (recyclerView4 != null) {
                                i11 = R.id.rv_consonant_vowel;
                                RecyclerView recyclerView5 = (RecyclerView) j3.q(viewInflate, R.id.rv_consonant_vowel);
                                if (recyclerView5 != null) {
                                    i11 = R.id.rv_diphthongs;
                                    RecyclerView recyclerView6 = (RecyclerView) j3.q(viewInflate, R.id.rv_diphthongs);
                                    if (recyclerView6 != null) {
                                        i11 = R.id.rv_double_consonants;
                                        RecyclerView recyclerView7 = (RecyclerView) j3.q(viewInflate, R.id.rv_double_consonants);
                                        if (recyclerView7 != null) {
                                            i11 = R.id.rv_german_alphabet;
                                            RecyclerView recyclerView8 = (RecyclerView) j3.q(viewInflate, R.id.rv_german_alphabet);
                                            if (recyclerView8 != null) {
                                                i11 = R.id.rv_grouped_consonants_a;
                                                RecyclerView recyclerView9 = (RecyclerView) j3.q(viewInflate, R.id.rv_grouped_consonants_a);
                                                if (recyclerView9 != null) {
                                                    i11 = R.id.rv_grouped_consonants_b;
                                                    RecyclerView recyclerView10 = (RecyclerView) j3.q(viewInflate, R.id.rv_grouped_consonants_b);
                                                    if (recyclerView10 != null) {
                                                        i11 = R.id.rv_grouped_consonants_c;
                                                        RecyclerView recyclerView11 = (RecyclerView) j3.q(viewInflate, R.id.rv_grouped_consonants_c);
                                                        if (recyclerView11 != null) {
                                                            i11 = R.id.rv_grouped_consonants_d;
                                                            RecyclerView recyclerView12 = (RecyclerView) j3.q(viewInflate, R.id.rv_grouped_consonants_d);
                                                            if (recyclerView12 != null) {
                                                                i11 = R.id.rv_ig_a;
                                                                RecyclerView recyclerView13 = (RecyclerView) j3.q(viewInflate, R.id.rv_ig_a);
                                                                if (recyclerView13 != null) {
                                                                    i11 = R.id.rv_ig_b;
                                                                    RecyclerView recyclerView14 = (RecyclerView) j3.q(viewInflate, R.id.rv_ig_b);
                                                                    if (recyclerView14 != null) {
                                                                        i11 = R.id.rv_ng;
                                                                        RecyclerView recyclerView15 = (RecyclerView) j3.q(viewInflate, R.id.rv_ng);
                                                                        if (recyclerView15 != null) {
                                                                            i11 = R.id.rv_pfkn;
                                                                            RecyclerView recyclerView16 = (RecyclerView) j3.q(viewInflate, R.id.rv_pfkn);
                                                                            if (recyclerView16 != null) {
                                                                                i11 = R.id.rv_qu;
                                                                                RecyclerView recyclerView17 = (RecyclerView) j3.q(viewInflate, R.id.rv_qu);
                                                                                if (recyclerView17 != null) {
                                                                                    i11 = R.id.rv_r_a;
                                                                                    RecyclerView recyclerView18 = (RecyclerView) j3.q(viewInflate, R.id.rv_r_a);
                                                                                    if (recyclerView18 != null) {
                                                                                        i11 = R.id.rv_r_b;
                                                                                        RecyclerView recyclerView19 = (RecyclerView) j3.q(viewInflate, R.id.rv_r_b);
                                                                                        if (recyclerView19 != null) {
                                                                                            i11 = R.id.rv_r_c;
                                                                                            RecyclerView recyclerView20 = (RecyclerView) j3.q(viewInflate, R.id.rv_r_c);
                                                                                            if (recyclerView20 != null) {
                                                                                                i11 = R.id.rv_r_d;
                                                                                                RecyclerView recyclerView21 = (RecyclerView) j3.q(viewInflate, R.id.rv_r_d);
                                                                                                if (recyclerView21 != null) {
                                                                                                    i11 = R.id.rv_rg_vowels_umlaut;
                                                                                                    RecyclerView recyclerView22 = (RecyclerView) j3.q(viewInflate, R.id.rv_rg_vowels_umlaut);
                                                                                                    if (recyclerView22 != null) {
                                                                                                        i11 = R.id.rv_sb_a;
                                                                                                        RecyclerView recyclerView23 = (RecyclerView) j3.q(viewInflate, R.id.rv_sb_a);
                                                                                                        if (recyclerView23 != null) {
                                                                                                            i11 = R.id.rv_sb_b;
                                                                                                            RecyclerView recyclerView24 = (RecyclerView) j3.q(viewInflate, R.id.rv_sb_b);
                                                                                                            if (recyclerView24 != null) {
                                                                                                                i11 = R.id.rv_sb_c;
                                                                                                                RecyclerView recyclerView25 = (RecyclerView) j3.q(viewInflate, R.id.rv_sb_c);
                                                                                                                if (recyclerView25 != null) {
                                                                                                                    i11 = R.id.rv_schtch;
                                                                                                                    RecyclerView recyclerView26 = (RecyclerView) j3.q(viewInflate, R.id.rv_schtch);
                                                                                                                    if (recyclerView26 != null) {
                                                                                                                        i11 = R.id.rv_stsb_a;
                                                                                                                        RecyclerView recyclerView27 = (RecyclerView) j3.q(viewInflate, R.id.rv_stsb_a);
                                                                                                                        if (recyclerView27 != null) {
                                                                                                                            i11 = R.id.rv_stsb_b;
                                                                                                                            RecyclerView recyclerView28 = (RecyclerView) j3.q(viewInflate, R.id.rv_stsb_b);
                                                                                                                            if (recyclerView28 != null) {
                                                                                                                                i11 = R.id.rv_word_stress_1;
                                                                                                                                RecyclerView recyclerView29 = (RecyclerView) j3.q(viewInflate, R.id.rv_word_stress_1);
                                                                                                                                if (recyclerView29 != null) {
                                                                                                                                    i11 = R.id.rv_word_stress_2_a;
                                                                                                                                    RecyclerView recyclerView30 = (RecyclerView) j3.q(viewInflate, R.id.rv_word_stress_2_a);
                                                                                                                                    if (recyclerView30 != null) {
                                                                                                                                        i11 = R.id.rv_word_stress_2_b;
                                                                                                                                        RecyclerView recyclerView31 = (RecyclerView) j3.q(viewInflate, R.id.rv_word_stress_2_b);
                                                                                                                                        if (recyclerView31 != null) {
                                                                                                                                            i11 = R.id.rv_word_stress_2_c;
                                                                                                                                            RecyclerView recyclerView32 = (RecyclerView) j3.q(viewInflate, R.id.rv_word_stress_2_c);
                                                                                                                                            if (recyclerView32 != null) {
                                                                                                                                                i11 = R.id.rv_word_stress_3_a;
                                                                                                                                                RecyclerView recyclerView33 = (RecyclerView) j3.q(viewInflate, R.id.rv_word_stress_3_a);
                                                                                                                                                if (recyclerView33 != null) {
                                                                                                                                                    i11 = R.id.rv_word_stress_3_b;
                                                                                                                                                    RecyclerView recyclerView34 = (RecyclerView) j3.q(viewInflate, R.id.rv_word_stress_3_b);
                                                                                                                                                    if (recyclerView34 != null) {
                                                                                                                                                        i11 = R.id.rv_word_stress_4;
                                                                                                                                                        RecyclerView recyclerView35 = (RecyclerView) j3.q(viewInflate, R.id.rv_word_stress_4);
                                                                                                                                                        if (recyclerView35 != null) {
                                                                                                                                                            i11 = R.id.rv_wv_a;
                                                                                                                                                            RecyclerView recyclerView36 = (RecyclerView) j3.q(viewInflate, R.id.rv_wv_a);
                                                                                                                                                            if (recyclerView36 != null) {
                                                                                                                                                                i11 = R.id.rv_wv_b;
                                                                                                                                                                RecyclerView recyclerView37 = (RecyclerView) j3.q(viewInflate, R.id.rv_wv_b);
                                                                                                                                                                if (recyclerView37 != null) {
                                                                                                                                                                    i11 = R.id.rv_wv_c;
                                                                                                                                                                    RecyclerView recyclerView38 = (RecyclerView) j3.q(viewInflate, R.id.rv_wv_c);
                                                                                                                                                                    if (recyclerView38 != null) {
                                                                                                                                                                        i11 = R.id.rv_y_a;
                                                                                                                                                                        RecyclerView recyclerView39 = (RecyclerView) j3.q(viewInflate, R.id.rv_y_a);
                                                                                                                                                                        if (recyclerView39 != null) {
                                                                                                                                                                            i11 = R.id.rv_y_b;
                                                                                                                                                                            RecyclerView recyclerView40 = (RecyclerView) j3.q(viewInflate, R.id.rv_y_b);
                                                                                                                                                                            if (recyclerView40 != null) {
                                                                                                                                                                                return new m((LinearLayout) viewInflate, e3VarA, linearLayout, recyclerView, recyclerView2, recyclerView3, recyclerView4, recyclerView5, recyclerView6, recyclerView7, recyclerView8, recyclerView9, recyclerView10, recyclerView11, recyclerView12, recyclerView13, recyclerView14, recyclerView15, recyclerView16, recyclerView17, recyclerView18, recyclerView19, recyclerView20, recyclerView21, recyclerView22, recyclerView23, recyclerView24, recyclerView25, recyclerView26, recyclerView27, recyclerView28, recyclerView29, recyclerView30, recyclerView31, recyclerView32, recyclerView33, recyclerView34, recyclerView35, recyclerView36, recyclerView37, recyclerView38, recyclerView39, recyclerView40);
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
