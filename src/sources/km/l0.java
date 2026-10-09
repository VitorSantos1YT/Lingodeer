package km;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayout;
import com.lingodeer.R;
import dl.ExOZ.xItStCyvVEZ;
import fr.j3;
import hj.a6;
import hj.b6;
import hj.d3;
import hj.f6;
import hj.g6;
import hj.j5;
import hj.u3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l0 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l0 f38235a = new l0(3, j5.class, xItStCyvVEZ.nbYbXC, "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/FragmentSyllableIntroductionBinding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.fragment_syllable_introduction, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.app_bar;
        View viewQ = j3.q(viewInflate, R.id.app_bar);
        if (viewQ != null) {
            d3.a(viewQ);
            i11 = R.id.flex_hatsuon;
            FlexboxLayout flexboxLayout = (FlexboxLayout) j3.q(viewInflate, R.id.flex_hatsuon);
            if (flexboxLayout != null) {
                i11 = R.id.flex_long_vowels_3;
                if (((FlexboxLayout) j3.q(viewInflate, R.id.flex_long_vowels_3)) != null) {
                    i11 = R.id.flex_sokuon_3;
                    if (((FlexboxLayout) j3.q(viewInflate, R.id.flex_sokuon_3)) != null) {
                        i11 = R.id.ll_fifty_sound_main_table;
                        View viewQ2 = j3.q(viewInflate, R.id.ll_fifty_sound_main_table);
                        if (viewQ2 != null) {
                            int i12 = R.id.flex_fifty_sound_left;
                            if (((FlexboxLayout) j3.q(viewQ2, R.id.flex_fifty_sound_left)) != null) {
                                i12 = R.id.flex_fifty_sound_top;
                                if (((FlexboxLayout) j3.q(viewQ2, R.id.flex_fifty_sound_top)) != null) {
                                    i12 = R.id.recycler_fifty_sound_main;
                                    if (((RecyclerView) j3.q(viewQ2, R.id.recycler_fifty_sound_main)) != null) {
                                        i11 = R.id.ll_fifty_sound_tips_table_1;
                                        View viewQ3 = j3.q(viewInflate, R.id.ll_fifty_sound_tips_table_1);
                                        if (viewQ3 != null) {
                                            a6 a6VarB = a6.b(viewQ3);
                                            i11 = R.id.ll_hira_table;
                                            View viewQ4 = j3.q(viewInflate, R.id.ll_hira_table);
                                            if (viewQ4 != null) {
                                                LinearLayout linearLayout = (LinearLayout) viewQ4;
                                                int i13 = R.id.tv_particles_1;
                                                TextView textView = (TextView) j3.q(viewQ4, R.id.tv_particles_1);
                                                if (textView != null) {
                                                    i13 = R.id.tv_particles_2;
                                                    TextView textView2 = (TextView) j3.q(viewQ4, R.id.tv_particles_2);
                                                    if (textView2 != null) {
                                                        i13 = R.id.tv_segment_1;
                                                        TextView textView3 = (TextView) j3.q(viewQ4, R.id.tv_segment_1);
                                                        if (textView3 != null) {
                                                            i13 = R.id.tv_segment_2;
                                                            TextView textView4 = (TextView) j3.q(viewQ4, R.id.tv_segment_2);
                                                            if (textView4 != null) {
                                                                u3 u3Var = new u3(linearLayout, textView, textView2, textView3, textView4);
                                                                i11 = R.id.ll_jp_tips_table;
                                                                View viewQ5 = j3.q(viewInflate, R.id.ll_jp_tips_table);
                                                                if (viewQ5 != null) {
                                                                    int i14 = R.id.ll_kanji_1;
                                                                    LinearLayout linearLayout2 = (LinearLayout) j3.q(viewQ5, R.id.ll_kanji_1);
                                                                    if (linearLayout2 != null) {
                                                                        i14 = R.id.ll_kanji_2;
                                                                        LinearLayout linearLayout3 = (LinearLayout) j3.q(viewQ5, R.id.ll_kanji_2);
                                                                        if (linearLayout3 != null) {
                                                                            i14 = R.id.ll_kanji_3;
                                                                            LinearLayout linearLayout4 = (LinearLayout) j3.q(viewQ5, R.id.ll_kanji_3);
                                                                            if (linearLayout4 != null) {
                                                                                b6 b6Var = new b6((LinearLayout) viewQ5, linearLayout2, linearLayout3, linearLayout4, 1);
                                                                                i11 = R.id.ll_jp_writing_table;
                                                                                View viewQ6 = j3.q(viewInflate, R.id.ll_jp_writing_table);
                                                                                if (viewQ6 != null) {
                                                                                    f6 f6VarA = f6.a(viewQ6);
                                                                                    i11 = R.id.ll_kanji_table;
                                                                                    View viewQ7 = j3.q(viewInflate, R.id.ll_kanji_table);
                                                                                    if (viewQ7 != null) {
                                                                                        int i15 = R.id.tv_kanji_1;
                                                                                        TextView textView5 = (TextView) j3.q(viewQ7, R.id.tv_kanji_1);
                                                                                        if (textView5 != null) {
                                                                                            i15 = R.id.tv_kanji_2;
                                                                                            TextView textView6 = (TextView) j3.q(viewQ7, R.id.tv_kanji_2);
                                                                                            if (textView6 != null) {
                                                                                                i15 = R.id.tv_kanji_3;
                                                                                                TextView textView7 = (TextView) j3.q(viewQ7, R.id.tv_kanji_3);
                                                                                                if (textView7 != null) {
                                                                                                    g6 g6Var = new g6((LinearLayout) viewQ7, textView5, textView6, textView7, 0);
                                                                                                    i11 = R.id.ll_kata_table;
                                                                                                    View viewQ8 = j3.q(viewInflate, R.id.ll_kata_table);
                                                                                                    if (viewQ8 != null) {
                                                                                                        int i16 = R.id.tv_camera;
                                                                                                        TextView textView8 = (TextView) j3.q(viewQ8, R.id.tv_camera);
                                                                                                        if (textView8 != null) {
                                                                                                            i16 = R.id.tv_coffee;
                                                                                                            TextView textView9 = (TextView) j3.q(viewQ8, R.id.tv_coffee);
                                                                                                            if (textView9 != null) {
                                                                                                                i16 = R.id.tv_television;
                                                                                                                TextView textView10 = (TextView) j3.q(viewQ8, R.id.tv_television);
                                                                                                                if (textView10 != null) {
                                                                                                                    g6 g6Var2 = new g6((LinearLayout) viewQ8, textView8, textView9, textView10, 1);
                                                                                                                    i11 = R.id.ll_long_vowels_table_1;
                                                                                                                    View viewQ9 = j3.q(viewInflate, R.id.ll_long_vowels_table_1);
                                                                                                                    if (viewQ9 != null) {
                                                                                                                        int i17 = R.id.flex_long_vowels_1;
                                                                                                                        if (((FlexboxLayout) j3.q(viewQ9, R.id.flex_long_vowels_1)) != null) {
                                                                                                                            i17 = R.id.flex_long_vowels_2;
                                                                                                                            if (((FlexboxLayout) j3.q(viewQ9, R.id.flex_long_vowels_2)) != null) {
                                                                                                                                i11 = R.id.ll_parent;
                                                                                                                                if (((LinearLayout) j3.q(viewInflate, R.id.ll_parent)) != null) {
                                                                                                                                    i11 = R.id.ll_voiced_consonants_table;
                                                                                                                                    View viewQ10 = j3.q(viewInflate, R.id.ll_voiced_consonants_table);
                                                                                                                                    if (viewQ10 != null) {
                                                                                                                                        int i18 = R.id.flex_voiced_1;
                                                                                                                                        if (((FlexboxLayout) j3.q(viewQ10, R.id.flex_voiced_1)) != null) {
                                                                                                                                            i18 = R.id.flex_voiced_2;
                                                                                                                                            if (((FlexboxLayout) j3.q(viewQ10, R.id.flex_voiced_2)) != null) {
                                                                                                                                                i18 = R.id.flex_voiced_3;
                                                                                                                                                if (((FlexboxLayout) j3.q(viewQ10, R.id.flex_voiced_3)) != null) {
                                                                                                                                                    i18 = R.id.flex_voiced_4;
                                                                                                                                                    if (((FlexboxLayout) j3.q(viewQ10, R.id.flex_voiced_4)) != null) {
                                                                                                                                                        i18 = R.id.flex_voiced_5;
                                                                                                                                                        if (((FlexboxLayout) j3.q(viewQ10, R.id.flex_voiced_5)) != null) {
                                                                                                                                                            i18 = R.id.flex_voiced_6;
                                                                                                                                                            if (((FlexboxLayout) j3.q(viewQ10, R.id.flex_voiced_6)) != null) {
                                                                                                                                                                i18 = R.id.flex_voiced_7;
                                                                                                                                                                if (((FlexboxLayout) j3.q(viewQ10, R.id.flex_voiced_7)) != null) {
                                                                                                                                                                    i18 = R.id.flex_voiced_8;
                                                                                                                                                                    if (((FlexboxLayout) j3.q(viewQ10, R.id.flex_voiced_8)) != null) {
                                                                                                                                                                        i18 = R.id.flex_voiced_9;
                                                                                                                                                                        if (((FlexboxLayout) j3.q(viewQ10, R.id.flex_voiced_9)) != null) {
                                                                                                                                                                            i11 = R.id.ll_yoon_table;
                                                                                                                                                                            View viewQ11 = j3.q(viewInflate, R.id.ll_yoon_table);
                                                                                                                                                                            if (viewQ11 != null) {
                                                                                                                                                                                int i19 = R.id.flex_yoon_1;
                                                                                                                                                                                if (((FlexboxLayout) j3.q(viewQ11, R.id.flex_yoon_1)) != null) {
                                                                                                                                                                                    i19 = R.id.flex_yoon_2;
                                                                                                                                                                                    if (((FlexboxLayout) j3.q(viewQ11, R.id.flex_yoon_2)) != null) {
                                                                                                                                                                                        i19 = R.id.flex_yoon_3;
                                                                                                                                                                                        if (((FlexboxLayout) j3.q(viewQ11, R.id.flex_yoon_3)) != null) {
                                                                                                                                                                                            i11 = R.id.recycler_view_fifty_sound_4;
                                                                                                                                                                                            RecyclerView recyclerView = (RecyclerView) j3.q(viewInflate, R.id.recycler_view_fifty_sound_4);
                                                                                                                                                                                            if (recyclerView != null) {
                                                                                                                                                                                                i11 = R.id.recycler_view_fifty_sound_5;
                                                                                                                                                                                                RecyclerView recyclerView2 = (RecyclerView) j3.q(viewInflate, R.id.recycler_view_fifty_sound_5);
                                                                                                                                                                                                if (recyclerView2 != null) {
                                                                                                                                                                                                    i11 = R.id.recycler_view_fifty_sound_6;
                                                                                                                                                                                                    RecyclerView recyclerView3 = (RecyclerView) j3.q(viewInflate, R.id.recycler_view_fifty_sound_6);
                                                                                                                                                                                                    if (recyclerView3 != null) {
                                                                                                                                                                                                        i11 = R.id.recycler_view_fifty_sound_7;
                                                                                                                                                                                                        RecyclerView recyclerView4 = (RecyclerView) j3.q(viewInflate, R.id.recycler_view_fifty_sound_7);
                                                                                                                                                                                                        if (recyclerView4 != null) {
                                                                                                                                                                                                            return new j5((LinearLayout) viewInflate, flexboxLayout, a6VarB, u3Var, b6Var, f6VarA, g6Var, g6Var2, recyclerView, recyclerView2, recyclerView3, recyclerView4);
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                throw new NullPointerException("Missing required view with ID: ".concat(viewQ11.getResources().getResourceName(i19)));
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
                                                                                                                                        throw new NullPointerException("Missing required view with ID: ".concat(viewQ10.getResources().getResourceName(i18)));
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                        throw new NullPointerException("Missing required view with ID: ".concat(viewQ9.getResources().getResourceName(i17)));
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        throw new NullPointerException("Missing required view with ID: ".concat(viewQ8.getResources().getResourceName(i16)));
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        throw new NullPointerException("Missing required view with ID: ".concat(viewQ7.getResources().getResourceName(i15)));
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new NullPointerException("Missing required view with ID: ".concat(viewQ5.getResources().getResourceName(i14)));
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                throw new NullPointerException("Missing required view with ID: ".concat(viewQ4.getResources().getResourceName(i13)));
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
