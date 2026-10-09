package tp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.widget.NestedScrollView;
import com.google.android.flexbox.FlexboxLayout;
import com.lingodeer.R;
import fr.j3;
import hj.b6;
import hj.e3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f52477a = new m(3, hj.v.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/ActivityHskWordStudyBinding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.activity_hsk_word_study, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.banner_view;
        RelativeLayout relativeLayout = (RelativeLayout) j3.q(viewInflate, R.id.banner_view);
        if (relativeLayout != null) {
            i11 = R.id.fl_btm;
            FrameLayout frameLayout = (FrameLayout) j3.q(viewInflate, R.id.fl_btm);
            if (frameLayout != null) {
                i11 = R.id.flash_card_eye_btn;
                AppCompatButton appCompatButton = (AppCompatButton) j3.q(viewInflate, R.id.flash_card_eye_btn);
                if (appCompatButton != null) {
                    i11 = R.id.flash_card_grey_bg;
                    LinearLayout linearLayout = (LinearLayout) j3.q(viewInflate, R.id.flash_card_grey_bg);
                    if (linearLayout != null) {
                        i11 = R.id.flash_card_txt4;
                        TextView textView = (TextView) j3.q(viewInflate, R.id.flash_card_txt4);
                        if (textView != null) {
                            i11 = R.id.flash_card_txt_top;
                            TextView textView2 = (TextView) j3.q(viewInflate, R.id.flash_card_txt_top);
                            if (textView2 != null) {
                                i11 = R.id.flex_btm;
                                FlexboxLayout flexboxLayout = (FlexboxLayout) j3.q(viewInflate, R.id.flex_btm);
                                if (flexboxLayout != null) {
                                    i11 = R.id.flex_top;
                                    FlexboxLayout flexboxLayout2 = (FlexboxLayout) j3.q(viewInflate, R.id.flex_top);
                                    if (flexboxLayout2 != null) {
                                        i11 = R.id.img_setting;
                                        ImageView imageView = (ImageView) j3.q(viewInflate, R.id.img_setting);
                                        if (imageView != null) {
                                            i11 = R.id.include_deer_audio;
                                            View viewQ = j3.q(viewInflate, R.id.include_deer_audio);
                                            if (viewQ != null) {
                                                b6 b6VarA = b6.a(viewQ);
                                                i11 = R.id.include_flash_card_weak_tip;
                                                View viewQ2 = j3.q(viewInflate, R.id.include_flash_card_weak_tip);
                                                if (viewQ2 != null) {
                                                    int i12 = R.id.frame_time;
                                                    if (((FrameLayout) j3.q(viewQ2, R.id.frame_time)) != null) {
                                                        i12 = R.id.frame_time_bg;
                                                        if (((FrameLayout) j3.q(viewQ2, R.id.frame_time_bg)) != null) {
                                                            LinearLayout linearLayout2 = (LinearLayout) viewQ2;
                                                            TextView textView3 = (TextView) j3.q(viewQ2, R.id.tv_time);
                                                            if (textView3 != null) {
                                                                e3 e3Var = new e3(linearLayout2, linearLayout2, textView3, 4);
                                                                i11 = R.id.iv_close;
                                                                ImageView imageView2 = (ImageView) j3.q(viewInflate, R.id.iv_close);
                                                                if (imageView2 != null) {
                                                                    i11 = R.id.remember_level_parent;
                                                                    LinearLayout linearLayout3 = (LinearLayout) j3.q(viewInflate, R.id.remember_level_parent);
                                                                    if (linearLayout3 != null) {
                                                                        i11 = R.id.rl_btm_panel;
                                                                        if (((RelativeLayout) j3.q(viewInflate, R.id.rl_btm_panel)) != null) {
                                                                            i11 = R.id.scroll_view_sentence;
                                                                            if (((NestedScrollView) j3.q(viewInflate, R.id.scroll_view_sentence)) != null) {
                                                                                i11 = R.id.tv_ara_luoma;
                                                                                TextView textView4 = (TextView) j3.q(viewInflate, R.id.tv_ara_luoma);
                                                                                if (textView4 != null) {
                                                                                    i11 = R.id.tv_ara_luoma_top;
                                                                                    TextView textView5 = (TextView) j3.q(viewInflate, R.id.tv_ara_luoma_top);
                                                                                    if (textView5 != null) {
                                                                                        i11 = R.id.tv_no_study;
                                                                                        TextView textView6 = (TextView) j3.q(viewInflate, R.id.tv_no_study);
                                                                                        if (textView6 != null) {
                                                                                            i11 = R.id.tv_remember_badly;
                                                                                            TextView textView7 = (TextView) j3.q(viewInflate, R.id.tv_remember_badly);
                                                                                            if (textView7 != null) {
                                                                                                i11 = R.id.tv_remember_normal;
                                                                                                TextView textView8 = (TextView) j3.q(viewInflate, R.id.tv_remember_normal);
                                                                                                if (textView8 != null) {
                                                                                                    i11 = R.id.tv_remember_perfect;
                                                                                                    TextView textView9 = (TextView) j3.q(viewInflate, R.id.tv_remember_perfect);
                                                                                                    if (textView9 != null) {
                                                                                                        i11 = R.id.tv_unit_info;
                                                                                                        TextView textView10 = (TextView) j3.q(viewInflate, R.id.tv_unit_info);
                                                                                                        if (textView10 != null) {
                                                                                                            return new hj.v((RelativeLayout) viewInflate, relativeLayout, frameLayout, appCompatButton, linearLayout, textView, textView2, flexboxLayout, flexboxLayout2, imageView, b6VarA, e3Var, imageView2, linearLayout3, textView4, textView5, textView6, textView7, textView8, textView9, textView10);
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
                                                            } else {
                                                                i12 = R.id.tv_time;
                                                            }
                                                        }
                                                    }
                                                    throw new NullPointerException("Missing required view with ID: ".concat(viewQ2.getResources().getResourceName(i12)));
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
