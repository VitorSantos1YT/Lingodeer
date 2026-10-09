package ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.button.MaterialButton;
import com.lingodeer.R;
import fr.j3;
import hj.o4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f52985a = new e(3, o4.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/FragmentPinyinIntroductionBinding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.fragment_pinyin_introduction, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.btn_ok;
        MaterialButton materialButton = (MaterialButton) j3.q(viewInflate, R.id.btn_ok);
        if (materialButton != null) {
            i11 = R.id.btn_practice;
            MaterialButton materialButton2 = (MaterialButton) j3.q(viewInflate, R.id.btn_practice);
            if (materialButton2 != null) {
                i11 = R.id.flex_layout_1;
                FlexboxLayout flexboxLayout = (FlexboxLayout) j3.q(viewInflate, R.id.flex_layout_1);
                if (flexboxLayout != null) {
                    i11 = R.id.flex_layout_2;
                    FlexboxLayout flexboxLayout2 = (FlexboxLayout) j3.q(viewInflate, R.id.flex_layout_2);
                    if (flexboxLayout2 != null) {
                        i11 = R.id.flex_layout_3;
                        FlexboxLayout flexboxLayout3 = (FlexboxLayout) j3.q(viewInflate, R.id.flex_layout_3);
                        if (flexboxLayout3 != null) {
                            i11 = R.id.img_tone_3;
                            ImageView imageView = (ImageView) j3.q(viewInflate, R.id.img_tone_3);
                            if (imageView != null) {
                                i11 = R.id.ll_char_ma;
                                LinearLayout linearLayout = (LinearLayout) j3.q(viewInflate, R.id.ll_char_ma);
                                if (linearLayout != null) {
                                    i11 = R.id.ll_parent;
                                    LinearLayout linearLayout2 = (LinearLayout) j3.q(viewInflate, R.id.ll_parent);
                                    if (linearLayout2 != null) {
                                        i11 = R.id.ll_pinyin_ma;
                                        LinearLayout linearLayout3 = (LinearLayout) j3.q(viewInflate, R.id.ll_pinyin_ma);
                                        if (linearLayout3 != null) {
                                            i11 = R.id.ll_tone_0;
                                            LinearLayout linearLayout4 = (LinearLayout) j3.q(viewInflate, R.id.ll_tone_0);
                                            if (linearLayout4 != null) {
                                                i11 = R.id.ll_tone_1;
                                                LinearLayout linearLayout5 = (LinearLayout) j3.q(viewInflate, R.id.ll_tone_1);
                                                if (linearLayout5 != null) {
                                                    i11 = R.id.ll_tone_2;
                                                    LinearLayout linearLayout6 = (LinearLayout) j3.q(viewInflate, R.id.ll_tone_2);
                                                    if (linearLayout6 != null) {
                                                        i11 = R.id.ll_tone_3;
                                                        LinearLayout linearLayout7 = (LinearLayout) j3.q(viewInflate, R.id.ll_tone_3);
                                                        if (linearLayout7 != null) {
                                                            i11 = R.id.ll_tone_4;
                                                            LinearLayout linearLayout8 = (LinearLayout) j3.q(viewInflate, R.id.ll_tone_4);
                                                            if (linearLayout8 != null) {
                                                                i11 = R.id.tv_char_ma;
                                                                if (((TextView) j3.q(viewInflate, R.id.tv_char_ma)) != null) {
                                                                    i11 = R.id.tv_pinyin_a;
                                                                    TextView textView = (TextView) j3.q(viewInflate, R.id.tv_pinyin_a);
                                                                    if (textView != null) {
                                                                        i11 = R.id.tv_pinyin_a_desc;
                                                                        TextView textView2 = (TextView) j3.q(viewInflate, R.id.tv_pinyin_a_desc);
                                                                        if (textView2 != null) {
                                                                            i11 = R.id.tv_pinyin_m;
                                                                            TextView textView3 = (TextView) j3.q(viewInflate, R.id.tv_pinyin_m);
                                                                            if (textView3 != null) {
                                                                                i11 = R.id.tv_pinyin_m_desc;
                                                                                TextView textView4 = (TextView) j3.q(viewInflate, R.id.tv_pinyin_m_desc);
                                                                                if (textView4 != null) {
                                                                                    i11 = R.id.tv_pinyin_ma;
                                                                                    if (((TextView) j3.q(viewInflate, R.id.tv_pinyin_ma)) != null) {
                                                                                        i11 = R.id.tv_tone_3_desc;
                                                                                        TextView textView5 = (TextView) j3.q(viewInflate, R.id.tv_tone_3_desc);
                                                                                        if (textView5 != null) {
                                                                                            return new o4((LinearLayout) viewInflate, materialButton, materialButton2, flexboxLayout, flexboxLayout2, flexboxLayout3, imageView, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, textView, textView2, textView3, textView4, textView5);
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
