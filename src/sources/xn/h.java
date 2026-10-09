package xn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.lingodeer.R;
import fr.j3;
import hj.d3;
import hj.e3;
import hj.r0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h extends j implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f56140a = new h(1, r0.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/lingo/lingoskill/databinding/ActivityPtSyllableIntroductionBinding;", 0);

    @Override // fz.c
    public final Object invoke(Object obj) {
        LayoutInflater p4 = (LayoutInflater) obj;
        m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.activity_pt_syllable_introduction, (ViewGroup) null, false);
        int i11 = R.id.app_bar;
        View viewQ = j3.q(viewInflate, R.id.app_bar);
        if (viewQ != null) {
            d3.a(viewQ);
            i11 = R.id.ll_download;
            View viewQ2 = j3.q(viewInflate, R.id.ll_download);
            if (viewQ2 != null) {
                e3 e3VarA = e3.a(viewQ2);
                i11 = R.id.recycler_diff_double_vowel_table;
                RecyclerView recyclerView = (RecyclerView) j3.q(viewInflate, R.id.recycler_diff_double_vowel_table);
                if (recyclerView != null) {
                    i11 = R.id.recycler_double_vowels;
                    RecyclerView recyclerView2 = (RecyclerView) j3.q(viewInflate, R.id.recycler_double_vowels);
                    if (recyclerView2 != null) {
                        i11 = R.id.recycler_final_table_1;
                        RecyclerView recyclerView3 = (RecyclerView) j3.q(viewInflate, R.id.recycler_final_table_1);
                        if (recyclerView3 != null) {
                            i11 = R.id.recycler_final_table_2;
                            RecyclerView recyclerView4 = (RecyclerView) j3.q(viewInflate, R.id.recycler_final_table_2);
                            if (recyclerView4 != null) {
                                i11 = R.id.recycler_nose_vowels;
                                RecyclerView recyclerView5 = (RecyclerView) j3.q(viewInflate, R.id.recycler_nose_vowels);
                                if (recyclerView5 != null) {
                                    i11 = R.id.recycler_sep_table_1;
                                    RecyclerView recyclerView6 = (RecyclerView) j3.q(viewInflate, R.id.recycler_sep_table_1);
                                    if (recyclerView6 != null) {
                                        i11 = R.id.recycler_sep_table_2;
                                        RecyclerView recyclerView7 = (RecyclerView) j3.q(viewInflate, R.id.recycler_sep_table_2);
                                        if (recyclerView7 != null) {
                                            i11 = R.id.recycler_sep_table_3;
                                            RecyclerView recyclerView8 = (RecyclerView) j3.q(viewInflate, R.id.recycler_sep_table_3);
                                            if (recyclerView8 != null) {
                                                i11 = R.id.recycler_sep_table_4;
                                                RecyclerView recyclerView9 = (RecyclerView) j3.q(viewInflate, R.id.recycler_sep_table_4);
                                                if (recyclerView9 != null) {
                                                    i11 = R.id.recycler_sep_table_4_2;
                                                    RecyclerView recyclerView10 = (RecyclerView) j3.q(viewInflate, R.id.recycler_sep_table_4_2);
                                                    if (recyclerView10 != null) {
                                                        i11 = R.id.recycler_sep_table_5;
                                                        RecyclerView recyclerView11 = (RecyclerView) j3.q(viewInflate, R.id.recycler_sep_table_5);
                                                        if (recyclerView11 != null) {
                                                            i11 = R.id.recycler_single_vowels;
                                                            RecyclerView recyclerView12 = (RecyclerView) j3.q(viewInflate, R.id.recycler_single_vowels);
                                                            if (recyclerView12 != null) {
                                                                i11 = R.id.recycler_syllable;
                                                                RecyclerView recyclerView13 = (RecyclerView) j3.q(viewInflate, R.id.recycler_syllable);
                                                                if (recyclerView13 != null) {
                                                                    i11 = R.id.recycler_syllable_heavy_table_1;
                                                                    RecyclerView recyclerView14 = (RecyclerView) j3.q(viewInflate, R.id.recycler_syllable_heavy_table_1);
                                                                    if (recyclerView14 != null) {
                                                                        i11 = R.id.recycler_syllable_heavy_table_2;
                                                                        RecyclerView recyclerView15 = (RecyclerView) j3.q(viewInflate, R.id.recycler_syllable_heavy_table_2);
                                                                        if (recyclerView15 != null) {
                                                                            i11 = R.id.recycler_syllable_heavy_table_3;
                                                                            RecyclerView recyclerView16 = (RecyclerView) j3.q(viewInflate, R.id.recycler_syllable_heavy_table_3);
                                                                            if (recyclerView16 != null) {
                                                                                i11 = R.id.recycler_syllable_heavy_table_4;
                                                                                RecyclerView recyclerView17 = (RecyclerView) j3.q(viewInflate, R.id.recycler_syllable_heavy_table_4);
                                                                                if (recyclerView17 != null) {
                                                                                    i11 = R.id.recycler_syllable_heavy_table_5;
                                                                                    RecyclerView recyclerView18 = (RecyclerView) j3.q(viewInflate, R.id.recycler_syllable_heavy_table_5);
                                                                                    if (recyclerView18 != null) {
                                                                                        i11 = R.id.recycler_syllable_heavy_table_6;
                                                                                        RecyclerView recyclerView19 = (RecyclerView) j3.q(viewInflate, R.id.recycler_syllable_heavy_table_6);
                                                                                        if (recyclerView19 != null) {
                                                                                            i11 = R.id.recycler_syllable_table_1;
                                                                                            RecyclerView recyclerView20 = (RecyclerView) j3.q(viewInflate, R.id.recycler_syllable_table_1);
                                                                                            if (recyclerView20 != null) {
                                                                                                i11 = R.id.recycler_syllable_table_2;
                                                                                                RecyclerView recyclerView21 = (RecyclerView) j3.q(viewInflate, R.id.recycler_syllable_table_2);
                                                                                                if (recyclerView21 != null) {
                                                                                                    i11 = R.id.recycler_syllable_table_3;
                                                                                                    RecyclerView recyclerView22 = (RecyclerView) j3.q(viewInflate, R.id.recycler_syllable_table_3);
                                                                                                    if (recyclerView22 != null) {
                                                                                                        i11 = R.id.recycler_syllable_table_4;
                                                                                                        RecyclerView recyclerView23 = (RecyclerView) j3.q(viewInflate, R.id.recycler_syllable_table_4);
                                                                                                        if (recyclerView23 != null) {
                                                                                                            i11 = R.id.recycler_syllable_table_5;
                                                                                                            if (((RecyclerView) j3.q(viewInflate, R.id.recycler_syllable_table_5)) != null) {
                                                                                                                i11 = R.id.recycler_syllable_table_6;
                                                                                                                if (((RecyclerView) j3.q(viewInflate, R.id.recycler_syllable_table_6)) != null) {
                                                                                                                    i11 = R.id.recycler_syllable_table_7;
                                                                                                                    RecyclerView recyclerView24 = (RecyclerView) j3.q(viewInflate, R.id.recycler_syllable_table_7);
                                                                                                                    if (recyclerView24 != null) {
                                                                                                                        i11 = R.id.recycler_third_vowels;
                                                                                                                        RecyclerView recyclerView25 = (RecyclerView) j3.q(viewInflate, R.id.recycler_third_vowels);
                                                                                                                        if (recyclerView25 != null) {
                                                                                                                            i11 = R.id.recycler_tips_table;
                                                                                                                            RecyclerView recyclerView26 = (RecyclerView) j3.q(viewInflate, R.id.recycler_tips_table);
                                                                                                                            if (recyclerView26 != null) {
                                                                                                                                i11 = R.id.tv_a_1;
                                                                                                                                TextView textView = (TextView) j3.q(viewInflate, R.id.tv_a_1);
                                                                                                                                if (textView != null) {
                                                                                                                                    i11 = R.id.tv_a_2;
                                                                                                                                    TextView textView2 = (TextView) j3.q(viewInflate, R.id.tv_a_2);
                                                                                                                                    if (textView2 != null) {
                                                                                                                                        i11 = R.id.tv_a_3;
                                                                                                                                        TextView textView3 = (TextView) j3.q(viewInflate, R.id.tv_a_3);
                                                                                                                                        if (textView3 != null) {
                                                                                                                                            i11 = R.id.tv_a_4;
                                                                                                                                            TextView textView4 = (TextView) j3.q(viewInflate, R.id.tv_a_4);
                                                                                                                                            if (textView4 != null) {
                                                                                                                                                i11 = R.id.tv_e_1;
                                                                                                                                                TextView textView5 = (TextView) j3.q(viewInflate, R.id.tv_e_1);
                                                                                                                                                if (textView5 != null) {
                                                                                                                                                    i11 = R.id.tv_e_2;
                                                                                                                                                    TextView textView6 = (TextView) j3.q(viewInflate, R.id.tv_e_2);
                                                                                                                                                    if (textView6 != null) {
                                                                                                                                                        i11 = R.id.tv_i_1;
                                                                                                                                                        TextView textView7 = (TextView) j3.q(viewInflate, R.id.tv_i_1);
                                                                                                                                                        if (textView7 != null) {
                                                                                                                                                            i11 = R.id.tv_o_1;
                                                                                                                                                            TextView textView8 = (TextView) j3.q(viewInflate, R.id.tv_o_1);
                                                                                                                                                            if (textView8 != null) {
                                                                                                                                                                i11 = R.id.tv_o_2;
                                                                                                                                                                TextView textView9 = (TextView) j3.q(viewInflate, R.id.tv_o_2);
                                                                                                                                                                if (textView9 != null) {
                                                                                                                                                                    i11 = R.id.tv_o_3;
                                                                                                                                                                    TextView textView10 = (TextView) j3.q(viewInflate, R.id.tv_o_3);
                                                                                                                                                                    if (textView10 != null) {
                                                                                                                                                                        i11 = R.id.tv_u_1;
                                                                                                                                                                        TextView textView11 = (TextView) j3.q(viewInflate, R.id.tv_u_1);
                                                                                                                                                                        if (textView11 != null) {
                                                                                                                                                                            return new r0((LinearLayout) viewInflate, e3VarA, recyclerView, recyclerView2, recyclerView3, recyclerView4, recyclerView5, recyclerView6, recyclerView7, recyclerView8, recyclerView9, recyclerView10, recyclerView11, recyclerView12, recyclerView13, recyclerView14, recyclerView15, recyclerView16, recyclerView17, recyclerView18, recyclerView19, recyclerView20, recyclerView21, recyclerView22, recyclerView23, recyclerView24, recyclerView25, recyclerView26, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11);
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
