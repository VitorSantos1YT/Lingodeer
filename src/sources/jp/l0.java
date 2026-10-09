package jp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.button.MaterialButton;
import com.lingo.lingoskill.widget.GameLife;
import com.lingodeer.R;
import fr.j3;
import hj.e3;
import hj.h6;
import hj.i6;
import hj.j6;
import hj.x3;
import i0.pKy.shrCcjmOhAmRC;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l0 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l0 f36508a = new l0(3, x3.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/FragmentCsLessonTestBinding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.fragment_cs_lesson_test, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.answer_flag_img;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) j3.q(viewInflate, R.id.answer_flag_img);
        String str = shrCcjmOhAmRC.XXCEfOm;
        if (lottieAnimationView != null) {
            i11 = R.id.check_button;
            MaterialButton materialButton = (MaterialButton) j3.q(viewInflate, R.id.check_button);
            if (materialButton != null) {
                i11 = R.id.check_button_parent;
                LinearLayout linearLayout = (LinearLayout) j3.q(viewInflate, R.id.check_button_parent);
                if (linearLayout != null) {
                    i11 = R.id.content_mask;
                    RelativeLayout relativeLayout = (RelativeLayout) j3.q(viewInflate, R.id.content_mask);
                    if (relativeLayout != null) {
                        i11 = R.id.ll_answer_flag;
                        LinearLayout linearLayout2 = (LinearLayout) j3.q(viewInflate, R.id.ll_answer_flag);
                        if (linearLayout2 != null) {
                            i11 = R.id.ll_download;
                            View viewQ = j3.q(viewInflate, R.id.ll_download);
                            if (viewQ != null) {
                                e3 e3VarA = e3.a(viewQ);
                                i11 = R.id.ll_title_bar;
                                View viewQ2 = j3.q(viewInflate, R.id.ll_title_bar);
                                if (viewQ2 != null) {
                                    int i12 = R.id.game_life;
                                    GameLife gameLife = (GameLife) j3.q(viewQ2, R.id.game_life);
                                    if (gameLife != null) {
                                        i12 = R.id.iv_auto_play;
                                        if (((AppCompatImageView) j3.q(viewQ2, R.id.iv_auto_play)) != null) {
                                            i12 = R.id.iv_close;
                                            ImageView imageView = (ImageView) j3.q(viewQ2, R.id.iv_close);
                                            if (imageView != null) {
                                                i12 = R.id.iv_lesson_test_menu;
                                                ImageView imageView2 = (ImageView) j3.q(viewQ2, R.id.iv_lesson_test_menu);
                                                if (imageView2 != null) {
                                                    i12 = R.id.iv_theme_btn;
                                                    ImageView imageView3 = (ImageView) j3.q(viewQ2, R.id.iv_theme_btn);
                                                    if (imageView3 != null) {
                                                        i12 = R.id.ll_setting;
                                                        if (((LinearLayout) j3.q(viewQ2, R.id.ll_setting)) != null) {
                                                            LinearLayout linearLayout3 = (LinearLayout) viewQ2;
                                                            i12 = R.id.progressBar;
                                                            ProgressBar progressBar = (ProgressBar) j3.q(viewQ2, R.id.progressBar);
                                                            if (progressBar != null) {
                                                                i12 = R.id.rl_titlebar;
                                                                if (((RelativeLayout) j3.q(viewQ2, R.id.rl_titlebar)) != null) {
                                                                    i12 = R.id.tv_combo;
                                                                    TextView textView = (TextView) j3.q(viewQ2, R.id.tv_combo);
                                                                    if (textView != null) {
                                                                        i12 = R.id.tv_model_info;
                                                                        if (((TextView) j3.q(viewQ2, R.id.tv_model_info)) != null) {
                                                                            i12 = R.id.tv_test_count;
                                                                            TextView textView2 = (TextView) j3.q(viewQ2, R.id.tv_test_count);
                                                                            if (textView2 != null) {
                                                                                j6 j6Var = new j6(linearLayout3, gameLife, imageView, imageView2, imageView3, progressBar, textView, textView2);
                                                                                i11 = R.id.lottie_progress;
                                                                                if (((LottieAnimationView) j3.q(viewInflate, R.id.lottie_progress)) != null) {
                                                                                    i11 = R.id.rl_answer_rect;
                                                                                    View viewQ3 = j3.q(viewInflate, R.id.rl_answer_rect);
                                                                                    if (viewQ3 != null) {
                                                                                        int i13 = R.id.answer_flag_img_btm;
                                                                                        LottieAnimationView lottieAnimationView2 = (LottieAnimationView) j3.q(viewQ3, R.id.answer_flag_img_btm);
                                                                                        if (lottieAnimationView2 != null) {
                                                                                            i13 = R.id.fl_audio;
                                                                                            if (((FrameLayout) j3.q(viewQ3, R.id.fl_audio)) != null) {
                                                                                                i13 = R.id.iv_audio_answer;
                                                                                                ImageView imageView4 = (ImageView) j3.q(viewQ3, R.id.iv_audio_answer);
                                                                                                if (imageView4 != null) {
                                                                                                    i13 = R.id.iv_bug_report;
                                                                                                    ImageView imageView5 = (ImageView) j3.q(viewQ3, R.id.iv_bug_report);
                                                                                                    if (imageView5 != null) {
                                                                                                        i13 = R.id.next_btn;
                                                                                                        MaterialButton materialButton2 = (MaterialButton) j3.q(viewQ3, R.id.next_btn);
                                                                                                        if (materialButton2 != null) {
                                                                                                            i13 = R.id.rl_answer_btm;
                                                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) j3.q(viewQ3, R.id.rl_answer_btm);
                                                                                                            if (constraintLayout != null) {
                                                                                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) viewQ3;
                                                                                                                i13 = R.id.txt_answer_pinyin;
                                                                                                                TextView textView3 = (TextView) j3.q(viewQ3, R.id.txt_answer_pinyin);
                                                                                                                if (textView3 != null) {
                                                                                                                    i13 = R.id.txt_answer_txt;
                                                                                                                    TextView textView4 = (TextView) j3.q(viewQ3, R.id.txt_answer_txt);
                                                                                                                    if (textView4 != null) {
                                                                                                                        i13 = R.id.txt_answer_txt_2;
                                                                                                                        TextView textView5 = (TextView) j3.q(viewQ3, R.id.txt_answer_txt_2);
                                                                                                                        if (textView5 != null) {
                                                                                                                            i13 = R.id.view_pos;
                                                                                                                            View viewQ4 = j3.q(viewQ3, R.id.view_pos);
                                                                                                                            if (viewQ4 != null) {
                                                                                                                                h6 h6Var = new h6(constraintLayout2, lottieAnimationView2, imageView4, imageView5, materialButton2, constraintLayout, constraintLayout2, textView3, textView4, textView5, viewQ4);
                                                                                                                                i11 = R.id.rl_body;
                                                                                                                                RelativeLayout relativeLayout2 = (RelativeLayout) j3.q(viewInflate, R.id.rl_body);
                                                                                                                                if (relativeLayout2 != null) {
                                                                                                                                    i11 = R.id.rl_bug_report;
                                                                                                                                    View viewQ5 = j3.q(viewInflate, R.id.rl_bug_report);
                                                                                                                                    if (viewQ5 != null) {
                                                                                                                                        i6 i6VarA = i6.a(viewQ5);
                                                                                                                                        RelativeLayout relativeLayout3 = (RelativeLayout) viewInflate;
                                                                                                                                        i11 = R.id.status_bar_view;
                                                                                                                                        View viewQ6 = j3.q(viewInflate, R.id.status_bar_view);
                                                                                                                                        if (viewQ6 != null) {
                                                                                                                                            i11 = R.id.tv_prompt_desc;
                                                                                                                                            TextView textView6 = (TextView) j3.q(viewInflate, R.id.tv_prompt_desc);
                                                                                                                                            if (textView6 != null) {
                                                                                                                                                i11 = R.id.txt_skip_btn;
                                                                                                                                                MaterialButton materialButton3 = (MaterialButton) j3.q(viewInflate, R.id.txt_skip_btn);
                                                                                                                                                if (materialButton3 != null) {
                                                                                                                                                    return new x3(relativeLayout3, lottieAnimationView, materialButton, linearLayout, relativeLayout, linearLayout2, e3VarA, j6Var, h6Var, relativeLayout2, i6VarA, relativeLayout3, viewQ6, textView6, materialButton3);
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
                                                                                        throw new NullPointerException(str.concat(viewQ3.getResources().getResourceName(i13)));
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
                                    throw new NullPointerException(str.concat(viewQ2.getResources().getResourceName(i12)));
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException(str.concat(viewInflate.getResources().getResourceName(i11)));
    }
}
