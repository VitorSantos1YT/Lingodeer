package mk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.lingodeer.R;
import fr.j3;
import hj.e3;
import hj.q;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c extends j implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f41165a = new c(1, q.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/lingo/lingoskill/databinding/ActivityEsusSyllableIntroductionBinding;", 0);

    @Override // fz.c
    public final Object invoke(Object obj) {
        LayoutInflater p4 = (LayoutInflater) obj;
        m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.activity_esus_syllable_introduction, (ViewGroup) null, false);
        int i11 = R.id.ll_download;
        View viewQ = j3.q(viewInflate, R.id.ll_download);
        if (viewQ != null) {
            e3 e3VarA = e3.a(viewQ);
            i11 = R.id.ll_parent;
            LinearLayout linearLayout = (LinearLayout) j3.q(viewInflate, R.id.ll_parent);
            if (linearLayout != null) {
                i11 = R.id.rv_bv_1;
                RecyclerView recyclerView = (RecyclerView) j3.q(viewInflate, R.id.rv_bv_1);
                if (recyclerView != null) {
                    i11 = R.id.rv_bv_2;
                    RecyclerView recyclerView2 = (RecyclerView) j3.q(viewInflate, R.id.rv_bv_2);
                    if (recyclerView2 != null) {
                        i11 = R.id.rv_ch;
                        RecyclerView recyclerView3 = (RecyclerView) j3.q(viewInflate, R.id.rv_ch);
                        if (recyclerView3 != null) {
                            i11 = R.id.rv_consonant_blends;
                            RecyclerView recyclerView4 = (RecyclerView) j3.q(viewInflate, R.id.rv_consonant_blends);
                            if (recyclerView4 != null) {
                                i11 = R.id.rv_consonant_vowel;
                                RecyclerView recyclerView5 = (RecyclerView) j3.q(viewInflate, R.id.rv_consonant_vowel);
                                if (recyclerView5 != null) {
                                    i11 = R.id.rv_cq_1;
                                    RecyclerView recyclerView6 = (RecyclerView) j3.q(viewInflate, R.id.rv_cq_1);
                                    if (recyclerView6 != null) {
                                        i11 = R.id.rv_cq_2;
                                        RecyclerView recyclerView7 = (RecyclerView) j3.q(viewInflate, R.id.rv_cq_2);
                                        if (recyclerView7 != null) {
                                            i11 = R.id.rv_cq_3;
                                            RecyclerView recyclerView8 = (RecyclerView) j3.q(viewInflate, R.id.rv_cq_3);
                                            if (recyclerView8 != null) {
                                                i11 = R.id.rv_diphthongs;
                                                RecyclerView recyclerView9 = (RecyclerView) j3.q(viewInflate, R.id.rv_diphthongs);
                                                if (recyclerView9 != null) {
                                                    i11 = R.id.rv_g_1;
                                                    RecyclerView recyclerView10 = (RecyclerView) j3.q(viewInflate, R.id.rv_g_1);
                                                    if (recyclerView10 != null) {
                                                        i11 = R.id.rv_g_2;
                                                        RecyclerView recyclerView11 = (RecyclerView) j3.q(viewInflate, R.id.rv_g_2);
                                                        if (recyclerView11 != null) {
                                                            i11 = R.id.rv_g_3;
                                                            RecyclerView recyclerView12 = (RecyclerView) j3.q(viewInflate, R.id.rv_g_3);
                                                            if (recyclerView12 != null) {
                                                                i11 = R.id.rv_g_4;
                                                                RecyclerView recyclerView13 = (RecyclerView) j3.q(viewInflate, R.id.rv_g_4);
                                                                if (recyclerView13 != null) {
                                                                    i11 = R.id.rv_h;
                                                                    RecyclerView recyclerView14 = (RecyclerView) j3.q(viewInflate, R.id.rv_h);
                                                                    if (recyclerView14 != null) {
                                                                        i11 = R.id.rv_j;
                                                                        RecyclerView recyclerView15 = (RecyclerView) j3.q(viewInflate, R.id.rv_j);
                                                                        if (recyclerView15 != null) {
                                                                            i11 = R.id.rv_ll;
                                                                            RecyclerView recyclerView16 = (RecyclerView) j3.q(viewInflate, R.id.rv_ll);
                                                                            if (recyclerView16 != null) {
                                                                                i11 = R.id.rv_n;
                                                                                RecyclerView recyclerView17 = (RecyclerView) j3.q(viewInflate, R.id.rv_n);
                                                                                if (recyclerView17 != null) {
                                                                                    i11 = R.id.rv_r_1;
                                                                                    RecyclerView recyclerView18 = (RecyclerView) j3.q(viewInflate, R.id.rv_r_1);
                                                                                    if (recyclerView18 != null) {
                                                                                        i11 = R.id.rv_r_2;
                                                                                        RecyclerView recyclerView19 = (RecyclerView) j3.q(viewInflate, R.id.rv_r_2);
                                                                                        if (recyclerView19 != null) {
                                                                                            i11 = R.id.rv_spanish_alphabet;
                                                                                            RecyclerView recyclerView20 = (RecyclerView) j3.q(viewInflate, R.id.rv_spanish_alphabet);
                                                                                            if (recyclerView20 != null) {
                                                                                                i11 = R.id.rv_triphthongs;
                                                                                                RecyclerView recyclerView21 = (RecyclerView) j3.q(viewInflate, R.id.rv_triphthongs);
                                                                                                if (recyclerView21 != null) {
                                                                                                    i11 = R.id.rv_word_stress_1;
                                                                                                    RecyclerView recyclerView22 = (RecyclerView) j3.q(viewInflate, R.id.rv_word_stress_1);
                                                                                                    if (recyclerView22 != null) {
                                                                                                        i11 = R.id.rv_word_stress_2;
                                                                                                        RecyclerView recyclerView23 = (RecyclerView) j3.q(viewInflate, R.id.rv_word_stress_2);
                                                                                                        if (recyclerView23 != null) {
                                                                                                            i11 = R.id.rv_word_stress_3;
                                                                                                            RecyclerView recyclerView24 = (RecyclerView) j3.q(viewInflate, R.id.rv_word_stress_3);
                                                                                                            if (recyclerView24 != null) {
                                                                                                                i11 = R.id.rv_word_stress_4;
                                                                                                                RecyclerView recyclerView25 = (RecyclerView) j3.q(viewInflate, R.id.rv_word_stress_4);
                                                                                                                if (recyclerView25 != null) {
                                                                                                                    i11 = R.id.rv_x_1;
                                                                                                                    RecyclerView recyclerView26 = (RecyclerView) j3.q(viewInflate, R.id.rv_x_1);
                                                                                                                    if (recyclerView26 != null) {
                                                                                                                        i11 = R.id.rv_x_2;
                                                                                                                        RecyclerView recyclerView27 = (RecyclerView) j3.q(viewInflate, R.id.rv_x_2);
                                                                                                                        if (recyclerView27 != null) {
                                                                                                                            i11 = R.id.rv_x_3;
                                                                                                                            RecyclerView recyclerView28 = (RecyclerView) j3.q(viewInflate, R.id.rv_x_3);
                                                                                                                            if (recyclerView28 != null) {
                                                                                                                                i11 = R.id.rv_x_4;
                                                                                                                                RecyclerView recyclerView29 = (RecyclerView) j3.q(viewInflate, R.id.rv_x_4);
                                                                                                                                if (recyclerView29 != null) {
                                                                                                                                    i11 = R.id.rv_z_1;
                                                                                                                                    RecyclerView recyclerView30 = (RecyclerView) j3.q(viewInflate, R.id.rv_z_1);
                                                                                                                                    if (recyclerView30 != null) {
                                                                                                                                        i11 = R.id.rv_z_2;
                                                                                                                                        RecyclerView recyclerView31 = (RecyclerView) j3.q(viewInflate, R.id.rv_z_2);
                                                                                                                                        if (recyclerView31 != null) {
                                                                                                                                            i11 = R.id.tv_word_stress_desc;
                                                                                                                                            TextView textView = (TextView) j3.q(viewInflate, R.id.tv_word_stress_desc);
                                                                                                                                            if (textView != null) {
                                                                                                                                                return new q((LinearLayout) viewInflate, e3VarA, linearLayout, recyclerView, recyclerView2, recyclerView3, recyclerView4, recyclerView5, recyclerView6, recyclerView7, recyclerView8, recyclerView9, recyclerView10, recyclerView11, recyclerView12, recyclerView13, recyclerView14, recyclerView15, recyclerView16, recyclerView17, recyclerView18, recyclerView19, recyclerView20, recyclerView21, recyclerView22, recyclerView23, recyclerView24, recyclerView25, recyclerView26, recyclerView27, recyclerView28, recyclerView29, recyclerView30, recyclerView31, textView);
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
