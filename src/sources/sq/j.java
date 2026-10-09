package sq;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.button.MaterialButton;
import com.lingodeer.R;
import fr.j3;
import hj.f6;
import hj.t5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f51748a = new j(3, t5.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/FragmentViSyllableIntroductionBinding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.fragment_vi_syllable_introduction, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.btn_practice;
        MaterialButton materialButton = (MaterialButton) j3.q(viewInflate, R.id.btn_practice);
        if (materialButton != null) {
            i11 = R.id.flex_1;
            FlexboxLayout flexboxLayout = (FlexboxLayout) j3.q(viewInflate, R.id.flex_1);
            if (flexboxLayout != null) {
                i11 = R.id.flex_2;
                FlexboxLayout flexboxLayout2 = (FlexboxLayout) j3.q(viewInflate, R.id.flex_2);
                if (flexboxLayout2 != null) {
                    i11 = R.id.flex_3;
                    FlexboxLayout flexboxLayout3 = (FlexboxLayout) j3.q(viewInflate, R.id.flex_3);
                    if (flexboxLayout3 != null) {
                        i11 = R.id.flex_4;
                        FlexboxLayout flexboxLayout4 = (FlexboxLayout) j3.q(viewInflate, R.id.flex_4);
                        if (flexboxLayout4 != null) {
                            i11 = R.id.rv_compound_consonants;
                            RecyclerView recyclerView = (RecyclerView) j3.q(viewInflate, R.id.rv_compound_consonants);
                            if (recyclerView != null) {
                                i11 = R.id.rv_double_vowels;
                                RecyclerView recyclerView2 = (RecyclerView) j3.q(viewInflate, R.id.rv_double_vowels);
                                if (recyclerView2 != null) {
                                    i11 = R.id.rv_single_consonants;
                                    RecyclerView recyclerView3 = (RecyclerView) j3.q(viewInflate, R.id.rv_single_consonants);
                                    if (recyclerView3 != null) {
                                        i11 = R.id.rv_single_vowels;
                                        RecyclerView recyclerView4 = (RecyclerView) j3.q(viewInflate, R.id.rv_single_vowels);
                                        if (recyclerView4 != null) {
                                            i11 = R.id.rv_triple_vowels;
                                            RecyclerView recyclerView5 = (RecyclerView) j3.q(viewInflate, R.id.rv_triple_vowels);
                                            if (recyclerView5 != null) {
                                                i11 = R.id.tv_tone_1;
                                                TextView textView = (TextView) j3.q(viewInflate, R.id.tv_tone_1);
                                                if (textView != null) {
                                                    i11 = R.id.tv_tone_2;
                                                    TextView textView2 = (TextView) j3.q(viewInflate, R.id.tv_tone_2);
                                                    if (textView2 != null) {
                                                        i11 = R.id.tv_tone_3;
                                                        TextView textView3 = (TextView) j3.q(viewInflate, R.id.tv_tone_3);
                                                        if (textView3 != null) {
                                                            i11 = R.id.tv_tone_4;
                                                            TextView textView4 = (TextView) j3.q(viewInflate, R.id.tv_tone_4);
                                                            if (textView4 != null) {
                                                                i11 = R.id.tv_tone_5;
                                                                TextView textView5 = (TextView) j3.q(viewInflate, R.id.tv_tone_5);
                                                                if (textView5 != null) {
                                                                    i11 = R.id.tv_tone_6;
                                                                    TextView textView6 = (TextView) j3.q(viewInflate, R.id.tv_tone_6);
                                                                    if (textView6 != null) {
                                                                        i11 = R.id.vi_syllable_include_intro_table;
                                                                        View viewQ = j3.q(viewInflate, R.id.vi_syllable_include_intro_table);
                                                                        if (viewQ != null) {
                                                                            int i12 = R.id.ll_1;
                                                                            LinearLayout linearLayout = (LinearLayout) j3.q(viewQ, R.id.ll_1);
                                                                            if (linearLayout != null) {
                                                                                i12 = R.id.ll_2;
                                                                                LinearLayout linearLayout2 = (LinearLayout) j3.q(viewQ, R.id.ll_2);
                                                                                if (linearLayout2 != null) {
                                                                                    i12 = R.id.ll_3;
                                                                                    LinearLayout linearLayout3 = (LinearLayout) j3.q(viewQ, R.id.ll_3);
                                                                                    if (linearLayout3 != null) {
                                                                                        i12 = R.id.tv_1;
                                                                                        TextView textView7 = (TextView) j3.q(viewQ, R.id.tv_1);
                                                                                        if (textView7 != null) {
                                                                                            i12 = R.id.tv_2;
                                                                                            TextView textView8 = (TextView) j3.q(viewQ, R.id.tv_2);
                                                                                            if (textView8 != null) {
                                                                                                i12 = R.id.tv_3;
                                                                                                TextView textView9 = (TextView) j3.q(viewQ, R.id.tv_3);
                                                                                                if (textView9 != null) {
                                                                                                    return new t5((LinearLayout) viewInflate, materialButton, flexboxLayout, flexboxLayout2, flexboxLayout3, flexboxLayout4, recyclerView, recyclerView2, recyclerView3, recyclerView4, recyclerView5, textView, textView2, textView3, textView4, textView5, textView6, new f6((RelativeLayout) viewQ, linearLayout, linearLayout2, linearLayout3, textView7, textView8, textView9, 2));
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            throw new NullPointerException("Missing required view with ID: ".concat(viewQ.getResources().getResourceName(i12)));
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
