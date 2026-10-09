package qh;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.lingo.fluent.widget.RippleView;
import com.lingo.fluent.widget.WordGameLife;
import com.lingodeer.R;
import fr.j3;
import hj.c6;
import hj.d6;
import hj.w5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f47794a = new y(3, w5.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/FragmentWordListenGameBinding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.fragment_word_listen_game, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.audio_view;
        RippleView rippleView = (RippleView) j3.q(viewInflate, R.id.audio_view);
        if (rippleView != null) {
            i11 = R.id.fl_top;
            FrameLayout frameLayout = (FrameLayout) j3.q(viewInflate, R.id.fl_top);
            if (frameLayout != null) {
                i11 = R.id.game_life;
                WordGameLife wordGameLife = (WordGameLife) j3.q(viewInflate, R.id.game_life);
                if (wordGameLife != null) {
                    i11 = R.id.iv_casle_btm;
                    ImageView imageView = (ImageView) j3.q(viewInflate, R.id.iv_casle_btm);
                    if (imageView != null) {
                        i11 = R.id.iv_casle_light;
                        ImageView imageView2 = (ImageView) j3.q(viewInflate, R.id.iv_casle_light);
                        if (imageView2 != null) {
                            i11 = R.id.iv_quit;
                            ImageView imageView3 = (ImageView) j3.q(viewInflate, R.id.iv_quit);
                            if (imageView3 != null) {
                                i11 = R.id.iv_ride_deer;
                                ImageView imageView4 = (ImageView) j3.q(viewInflate, R.id.iv_ride_deer);
                                if (imageView4 != null) {
                                    i11 = R.id.iv_settings;
                                    ImageView imageView5 = (ImageView) j3.q(viewInflate, R.id.iv_settings);
                                    if (imageView5 != null) {
                                        i11 = R.id.iv_sky_star_1;
                                        ImageView imageView6 = (ImageView) j3.q(viewInflate, R.id.iv_sky_star_1);
                                        if (imageView6 != null) {
                                            i11 = R.id.iv_sky_star_2;
                                            ImageView imageView7 = (ImageView) j3.q(viewInflate, R.id.iv_sky_star_2);
                                            if (imageView7 != null) {
                                                i11 = R.id.ll_audio;
                                                LinearLayout linearLayout = (LinearLayout) j3.q(viewInflate, R.id.ll_audio);
                                                if (linearLayout != null) {
                                                    i11 = R.id.ll_option_1;
                                                    View viewQ = j3.q(viewInflate, R.id.ll_option_1);
                                                    if (viewQ != null) {
                                                        d6 d6VarA = d6.a(viewQ);
                                                        i11 = R.id.ll_option_2;
                                                        View viewQ2 = j3.q(viewInflate, R.id.ll_option_2);
                                                        if (viewQ2 != null) {
                                                            d6 d6VarA2 = d6.a(viewQ2);
                                                            i11 = R.id.ll_option_3;
                                                            View viewQ3 = j3.q(viewInflate, R.id.ll_option_3);
                                                            if (viewQ3 != null) {
                                                                d6 d6VarA3 = d6.a(viewQ3);
                                                                i11 = R.id.progress_bar;
                                                                ProgressBar progressBar = (ProgressBar) j3.q(viewInflate, R.id.progress_bar);
                                                                if (progressBar != null) {
                                                                    i11 = R.id.rl_finish_frame;
                                                                    View viewQ4 = j3.q(viewInflate, R.id.rl_finish_frame);
                                                                    if (viewQ4 != null) {
                                                                        RelativeLayout relativeLayout = (RelativeLayout) viewQ4;
                                                                        c6 c6Var = new c6(relativeLayout, relativeLayout, 1);
                                                                        RelativeLayout relativeLayout2 = (RelativeLayout) viewInflate;
                                                                        View viewQ5 = j3.q(viewInflate, R.id.rl_star_parent);
                                                                        if (viewQ5 != null) {
                                                                            RelativeLayout relativeLayout3 = (RelativeLayout) viewQ5;
                                                                            c6 c6Var2 = new c6(relativeLayout3, relativeLayout3, 0);
                                                                            i11 = R.id.tv_xp;
                                                                            TextView textView = (TextView) j3.q(viewInflate, R.id.tv_xp);
                                                                            if (textView != null) {
                                                                                i11 = R.id.view_count_down;
                                                                                View viewQ6 = j3.q(viewInflate, R.id.view_count_down);
                                                                                if (viewQ6 != null) {
                                                                                    i11 = R.id.view_point_1;
                                                                                    View viewQ7 = j3.q(viewInflate, R.id.view_point_1);
                                                                                    if (viewQ7 != null) {
                                                                                        i11 = R.id.view_point_2;
                                                                                        View viewQ8 = j3.q(viewInflate, R.id.view_point_2);
                                                                                        if (viewQ8 != null) {
                                                                                            i11 = R.id.view_point_3;
                                                                                            View viewQ9 = j3.q(viewInflate, R.id.view_point_3);
                                                                                            if (viewQ9 != null) {
                                                                                                i11 = R.id.view_point_4;
                                                                                                View viewQ10 = j3.q(viewInflate, R.id.view_point_4);
                                                                                                if (viewQ10 != null) {
                                                                                                    i11 = R.id.view_point_5;
                                                                                                    View viewQ11 = j3.q(viewInflate, R.id.view_point_5);
                                                                                                    if (viewQ11 != null) {
                                                                                                        return new w5(relativeLayout2, rippleView, frameLayout, wordGameLife, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, linearLayout, d6VarA, d6VarA2, d6VarA3, progressBar, c6Var, relativeLayout2, c6Var2, textView, viewQ6, viewQ7, viewQ8, viewQ9, viewQ10, viewQ11);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            i11 = R.id.rl_star_parent;
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
