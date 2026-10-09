package fn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.lingodeer.R;
import fr.j3;
import hj.d3;
import hj.f6;
import hj.y5;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f extends j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f27349a = new f(3, y5.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/FragmentYinTuHelperKoBinding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.fragment_yin_tu_helper_ko, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.app_bar;
        View viewQ = j3.q(viewInflate, R.id.app_bar);
        if (viewQ != null) {
            d3.a(viewQ);
            i11 = R.id.btn_korean_alphabet_charts;
            MaterialButton materialButton = (MaterialButton) j3.q(viewInflate, R.id.btn_korean_alphabet_charts);
            if (materialButton != null) {
                i11 = R.id.flex_fuyin_tips_table;
                RecyclerView recyclerView = (RecyclerView) j3.q(viewInflate, R.id.flex_fuyin_tips_table);
                if (recyclerView != null) {
                    i11 = R.id.flex_fuyin_tips_table_2;
                    RecyclerView recyclerView2 = (RecyclerView) j3.q(viewInflate, R.id.flex_fuyin_tips_table_2);
                    if (recyclerView2 != null) {
                        i11 = R.id.ll_ko_syllable_char;
                        View viewQ2 = j3.q(viewInflate, R.id.ll_ko_syllable_char);
                        if (viewQ2 != null) {
                            int i12 = R.id.tv_ko_char_1;
                            if (((TextView) j3.q(viewQ2, R.id.tv_ko_char_1)) != null) {
                                i12 = R.id.tv_ko_char_10;
                                if (((TextView) j3.q(viewQ2, R.id.tv_ko_char_10)) != null) {
                                    i12 = R.id.tv_ko_char_11;
                                    if (((TextView) j3.q(viewQ2, R.id.tv_ko_char_11)) != null) {
                                        i12 = R.id.tv_ko_char_12;
                                        if (((TextView) j3.q(viewQ2, R.id.tv_ko_char_12)) != null) {
                                            i12 = R.id.tv_ko_char_13;
                                            if (((TextView) j3.q(viewQ2, R.id.tv_ko_char_13)) != null) {
                                                i12 = R.id.tv_ko_char_2;
                                                if (((TextView) j3.q(viewQ2, R.id.tv_ko_char_2)) != null) {
                                                    i12 = R.id.tv_ko_char_21;
                                                    if (((TextView) j3.q(viewQ2, R.id.tv_ko_char_21)) != null) {
                                                        i12 = R.id.tv_ko_char_22;
                                                        if (((TextView) j3.q(viewQ2, R.id.tv_ko_char_22)) != null) {
                                                            i12 = R.id.tv_ko_char_23;
                                                            if (((TextView) j3.q(viewQ2, R.id.tv_ko_char_23)) != null) {
                                                                i12 = R.id.tv_ko_char_24;
                                                                if (((TextView) j3.q(viewQ2, R.id.tv_ko_char_24)) != null) {
                                                                    i12 = R.id.tv_ko_char_25;
                                                                    if (((TextView) j3.q(viewQ2, R.id.tv_ko_char_25)) != null) {
                                                                        i12 = R.id.tv_ko_char_26;
                                                                        if (((TextView) j3.q(viewQ2, R.id.tv_ko_char_26)) != null) {
                                                                            i12 = R.id.tv_ko_char_27;
                                                                            if (((TextView) j3.q(viewQ2, R.id.tv_ko_char_27)) != null) {
                                                                                i12 = R.id.tv_ko_char_28;
                                                                                if (((TextView) j3.q(viewQ2, R.id.tv_ko_char_28)) != null) {
                                                                                    i12 = R.id.tv_ko_char_29;
                                                                                    if (((TextView) j3.q(viewQ2, R.id.tv_ko_char_29)) != null) {
                                                                                        i12 = R.id.tv_ko_char_3;
                                                                                        if (((TextView) j3.q(viewQ2, R.id.tv_ko_char_3)) != null) {
                                                                                            i12 = R.id.tv_ko_char_30;
                                                                                            if (((TextView) j3.q(viewQ2, R.id.tv_ko_char_30)) != null) {
                                                                                                i12 = R.id.tv_ko_char_4;
                                                                                                if (((TextView) j3.q(viewQ2, R.id.tv_ko_char_4)) != null) {
                                                                                                    i12 = R.id.tv_ko_char_5;
                                                                                                    if (((TextView) j3.q(viewQ2, R.id.tv_ko_char_5)) != null) {
                                                                                                        i12 = R.id.tv_ko_char_6;
                                                                                                        if (((TextView) j3.q(viewQ2, R.id.tv_ko_char_6)) != null) {
                                                                                                            i12 = R.id.tv_ko_char_7;
                                                                                                            if (((TextView) j3.q(viewQ2, R.id.tv_ko_char_7)) != null) {
                                                                                                                i12 = R.id.tv_ko_char_8;
                                                                                                                if (((TextView) j3.q(viewQ2, R.id.tv_ko_char_8)) != null) {
                                                                                                                    i12 = R.id.tv_ko_char_9;
                                                                                                                    if (((TextView) j3.q(viewQ2, R.id.tv_ko_char_9)) != null) {
                                                                                                                        i11 = R.id.ll_ko_syllable_char_2;
                                                                                                                        View viewQ3 = j3.q(viewInflate, R.id.ll_ko_syllable_char_2);
                                                                                                                        if (viewQ3 != null) {
                                                                                                                            int i13 = R.id.tv_ko_char_14;
                                                                                                                            if (((TextView) j3.q(viewQ3, R.id.tv_ko_char_14)) != null) {
                                                                                                                                i13 = R.id.tv_ko_char_15;
                                                                                                                                if (((TextView) j3.q(viewQ3, R.id.tv_ko_char_15)) != null) {
                                                                                                                                    i13 = R.id.tv_ko_char_16;
                                                                                                                                    if (((TextView) j3.q(viewQ3, R.id.tv_ko_char_16)) != null) {
                                                                                                                                        i13 = R.id.tv_ko_char_17;
                                                                                                                                        if (((TextView) j3.q(viewQ3, R.id.tv_ko_char_17)) != null) {
                                                                                                                                            i13 = R.id.tv_ko_char_18;
                                                                                                                                            if (((TextView) j3.q(viewQ3, R.id.tv_ko_char_18)) != null) {
                                                                                                                                                i13 = R.id.tv_ko_char_19;
                                                                                                                                                if (((TextView) j3.q(viewQ3, R.id.tv_ko_char_19)) != null) {
                                                                                                                                                    i13 = R.id.tv_ko_char_20;
                                                                                                                                                    if (((TextView) j3.q(viewQ3, R.id.tv_ko_char_20)) != null) {
                                                                                                                                                        i11 = R.id.ll_parent;
                                                                                                                                                        if (((LinearLayout) j3.q(viewInflate, R.id.ll_parent)) != null) {
                                                                                                                                                            i11 = R.id.ll_syllable_ko_table_3;
                                                                                                                                                            View viewQ4 = j3.q(viewInflate, R.id.ll_syllable_ko_table_3);
                                                                                                                                                            if (viewQ4 != null) {
                                                                                                                                                                int i14 = R.id.ll_final;
                                                                                                                                                                LinearLayout linearLayout = (LinearLayout) j3.q(viewQ4, R.id.ll_final);
                                                                                                                                                                if (linearLayout != null) {
                                                                                                                                                                    i14 = R.id.ll_initial;
                                                                                                                                                                    LinearLayout linearLayout2 = (LinearLayout) j3.q(viewQ4, R.id.ll_initial);
                                                                                                                                                                    if (linearLayout2 != null) {
                                                                                                                                                                        i14 = R.id.ll_vowel;
                                                                                                                                                                        LinearLayout linearLayout3 = (LinearLayout) j3.q(viewQ4, R.id.ll_vowel);
                                                                                                                                                                        if (linearLayout3 != null) {
                                                                                                                                                                            i14 = R.id.tv_1;
                                                                                                                                                                            TextView textView = (TextView) j3.q(viewQ4, R.id.tv_1);
                                                                                                                                                                            if (textView != null) {
                                                                                                                                                                                i14 = R.id.tv_2;
                                                                                                                                                                                TextView textView2 = (TextView) j3.q(viewQ4, R.id.tv_2);
                                                                                                                                                                                if (textView2 != null) {
                                                                                                                                                                                    i14 = R.id.tv_3;
                                                                                                                                                                                    TextView textView3 = (TextView) j3.q(viewQ4, R.id.tv_3);
                                                                                                                                                                                    if (textView3 != null) {
                                                                                                                                                                                        f6 f6Var = new f6((RelativeLayout) viewQ4, linearLayout, linearLayout2, linearLayout3, textView, textView2, textView3, 1);
                                                                                                                                                                                        i11 = R.id.recycler_complex_vowels_1;
                                                                                                                                                                                        RecyclerView recyclerView3 = (RecyclerView) j3.q(viewInflate, R.id.recycler_complex_vowels_1);
                                                                                                                                                                                        if (recyclerView3 != null) {
                                                                                                                                                                                            i11 = R.id.recycler_complex_vowels_2;
                                                                                                                                                                                            RecyclerView recyclerView4 = (RecyclerView) j3.q(viewInflate, R.id.recycler_complex_vowels_2);
                                                                                                                                                                                            if (recyclerView4 != null) {
                                                                                                                                                                                                i11 = R.id.recycler_double_consonants;
                                                                                                                                                                                                RecyclerView recyclerView5 = (RecyclerView) j3.q(viewInflate, R.id.recycler_double_consonants);
                                                                                                                                                                                                if (recyclerView5 != null) {
                                                                                                                                                                                                    i11 = R.id.recycler_single_consonants;
                                                                                                                                                                                                    RecyclerView recyclerView6 = (RecyclerView) j3.q(viewInflate, R.id.recycler_single_consonants);
                                                                                                                                                                                                    if (recyclerView6 != null) {
                                                                                                                                                                                                        i11 = R.id.recycler_single_vowels;
                                                                                                                                                                                                        RecyclerView recyclerView7 = (RecyclerView) j3.q(viewInflate, R.id.recycler_single_vowels);
                                                                                                                                                                                                        if (recyclerView7 != null) {
                                                                                                                                                                                                            return new y5((LinearLayout) viewInflate, materialButton, recyclerView, recyclerView2, f6Var, recyclerView3, recyclerView4, recyclerView5, recyclerView6, recyclerView7);
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
                                                                                                                                                                throw new NullPointerException("Missing required view with ID: ".concat(viewQ4.getResources().getResourceName(i14)));
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            throw new NullPointerException("Missing required view with ID: ".concat(viewQ3.getResources().getResourceName(i13)));
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
                            throw new NullPointerException("Missing required view with ID: ".concat(viewQ2.getResources().getResourceName(i12)));
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
