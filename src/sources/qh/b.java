package qh;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.lingo.fluent.widget.WordChooseGameLine;
import com.lingo.fluent.widget.WordGameLife;
import com.lingodeer.R;
import fr.j3;
import hj.u5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f47743a = new b(3, u5.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/FragmentWordChooseGameBinding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.fragment_word_choose_game, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.game_life;
        WordGameLife wordGameLife = (WordGameLife) j3.q(viewInflate, R.id.game_life);
        if (wordGameLife != null) {
            i11 = R.id.iv_clock;
            ImageView imageView = (ImageView) j3.q(viewInflate, R.id.iv_clock);
            if (imageView != null) {
                i11 = R.id.iv_cloud_1;
                ImageView imageView2 = (ImageView) j3.q(viewInflate, R.id.iv_cloud_1);
                if (imageView2 != null) {
                    i11 = R.id.iv_cloud_2;
                    ImageView imageView3 = (ImageView) j3.q(viewInflate, R.id.iv_cloud_2);
                    if (imageView3 != null) {
                        i11 = R.id.iv_drop_box;
                        ImageView imageView4 = (ImageView) j3.q(viewInflate, R.id.iv_drop_box);
                        if (imageView4 != null) {
                            i11 = R.id.iv_empty_box;
                            ImageView imageView5 = (ImageView) j3.q(viewInflate, R.id.iv_empty_box);
                            if (imageView5 != null) {
                                i11 = R.id.iv_finish_deer;
                                ImageView imageView6 = (ImageView) j3.q(viewInflate, R.id.iv_finish_deer);
                                if (imageView6 != null) {
                                    i11 = R.id.iv_finish_house;
                                    ImageView imageView7 = (ImageView) j3.q(viewInflate, R.id.iv_finish_house);
                                    if (imageView7 != null) {
                                        i11 = R.id.iv_guide_line;
                                        if (((Guideline) j3.q(viewInflate, R.id.iv_guide_line)) != null) {
                                            i11 = R.id.iv_hill_small;
                                            ImageView imageView8 = (ImageView) j3.q(viewInflate, R.id.iv_hill_small);
                                            if (imageView8 != null) {
                                                i11 = R.id.iv_move_box;
                                                ImageView imageView9 = (ImageView) j3.q(viewInflate, R.id.iv_move_box);
                                                if (imageView9 != null) {
                                                    i11 = R.id.iv_move_line;
                                                    WordChooseGameLine wordChooseGameLine = (WordChooseGameLine) j3.q(viewInflate, R.id.iv_move_line);
                                                    if (wordChooseGameLine != null) {
                                                        i11 = R.id.iv_quit;
                                                        ImageView imageView10 = (ImageView) j3.q(viewInflate, R.id.iv_quit);
                                                        if (imageView10 != null) {
                                                            i11 = R.id.iv_right_deer;
                                                            ImageView imageView11 = (ImageView) j3.q(viewInflate, R.id.iv_right_deer);
                                                            if (imageView11 != null) {
                                                                i11 = R.id.iv_right_house;
                                                                ImageView imageView12 = (ImageView) j3.q(viewInflate, R.id.iv_right_house);
                                                                if (imageView12 != null) {
                                                                    i11 = R.id.iv_right_house_2;
                                                                    ImageView imageView13 = (ImageView) j3.q(viewInflate, R.id.iv_right_house_2);
                                                                    if (imageView13 != null) {
                                                                        i11 = R.id.iv_settings;
                                                                        ImageView imageView14 = (ImageView) j3.q(viewInflate, R.id.iv_settings);
                                                                        if (imageView14 != null) {
                                                                            i11 = R.id.ll_finish_box_count;
                                                                            LinearLayout linearLayout = (LinearLayout) j3.q(viewInflate, R.id.ll_finish_box_count);
                                                                            if (linearLayout != null) {
                                                                                i11 = R.id.progress_bar;
                                                                                ProgressBar progressBar = (ProgressBar) j3.q(viewInflate, R.id.progress_bar);
                                                                                if (progressBar != null) {
                                                                                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                                                    i11 = R.id.tv_correct_count;
                                                                                    TextView textView = (TextView) j3.q(viewInflate, R.id.tv_correct_count);
                                                                                    if (textView != null) {
                                                                                        i11 = R.id.tv_finish_box_count;
                                                                                        TextView textView2 = (TextView) j3.q(viewInflate, R.id.tv_finish_box_count);
                                                                                        if (textView2 != null) {
                                                                                            i11 = R.id.tv_last_time;
                                                                                            TextView textView3 = (TextView) j3.q(viewInflate, R.id.tv_last_time);
                                                                                            if (textView3 != null) {
                                                                                                i11 = R.id.tv_luoma;
                                                                                                TextView textView4 = (TextView) j3.q(viewInflate, R.id.tv_luoma);
                                                                                                if (textView4 != null) {
                                                                                                    i11 = R.id.tv_option_1;
                                                                                                    AppCompatTextView appCompatTextView = (AppCompatTextView) j3.q(viewInflate, R.id.tv_option_1);
                                                                                                    if (appCompatTextView != null) {
                                                                                                        i11 = R.id.tv_option_2;
                                                                                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) j3.q(viewInflate, R.id.tv_option_2);
                                                                                                        if (appCompatTextView2 != null) {
                                                                                                            i11 = R.id.tv_option_3;
                                                                                                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) j3.q(viewInflate, R.id.tv_option_3);
                                                                                                            if (appCompatTextView3 != null) {
                                                                                                                i11 = R.id.tv_pos;
                                                                                                                TextView textView5 = (TextView) j3.q(viewInflate, R.id.tv_pos);
                                                                                                                if (textView5 != null) {
                                                                                                                    i11 = R.id.tv_time;
                                                                                                                    TextView textView6 = (TextView) j3.q(viewInflate, R.id.tv_time);
                                                                                                                    if (textView6 != null) {
                                                                                                                        i11 = R.id.tv_trans;
                                                                                                                        TextView textView7 = (TextView) j3.q(viewInflate, R.id.tv_trans);
                                                                                                                        if (textView7 != null) {
                                                                                                                            i11 = R.id.tv_xp;
                                                                                                                            TextView textView8 = (TextView) j3.q(viewInflate, R.id.tv_xp);
                                                                                                                            if (textView8 != null) {
                                                                                                                                i11 = R.id.tv_zhuyin;
                                                                                                                                TextView textView9 = (TextView) j3.q(viewInflate, R.id.tv_zhuyin);
                                                                                                                                if (textView9 != null) {
                                                                                                                                    i11 = R.id.view_board;
                                                                                                                                    View viewQ = j3.q(viewInflate, R.id.view_board);
                                                                                                                                    if (viewQ != null) {
                                                                                                                                        return new u5(constraintLayout, wordGameLife, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, wordChooseGameLine, imageView10, imageView11, imageView12, imageView13, imageView14, linearLayout, progressBar, constraintLayout, textView, textView2, textView3, textView4, appCompatTextView, appCompatTextView2, appCompatTextView3, textView5, textView6, textView7, textView8, textView9, viewQ);
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
