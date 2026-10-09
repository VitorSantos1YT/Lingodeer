package qh;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.lingo.fluent.widget.GameWaveView;
import com.lingo.fluent.widget.WordGameLife;
import com.lingodeer.R;
import fr.j3;
import hj.x5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f0 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0 f47757a = new f0(3, x5.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/FragmentWordSpellGameBinding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.fragment_word_spell_game, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.game_life;
        WordGameLife wordGameLife = (WordGameLife) j3.q(viewInflate, R.id.game_life);
        if (wordGameLife != null) {
            i11 = R.id.iv_boat;
            ImageView imageView = (ImageView) j3.q(viewInflate, R.id.iv_boat);
            if (imageView != null) {
                i11 = R.id.iv_clock;
                ImageView imageView2 = (ImageView) j3.q(viewInflate, R.id.iv_clock);
                if (imageView2 != null) {
                    i11 = R.id.iv_cloud_1;
                    if (((ImageView) j3.q(viewInflate, R.id.iv_cloud_1)) != null) {
                        i11 = R.id.iv_cloud_2;
                        if (((ImageView) j3.q(viewInflate, R.id.iv_cloud_2)) != null) {
                            i11 = R.id.iv_cloud_3;
                            if (((ImageView) j3.q(viewInflate, R.id.iv_cloud_3)) != null) {
                                i11 = R.id.iv_cloud_4;
                                if (((ImageView) j3.q(viewInflate, R.id.iv_cloud_4)) != null) {
                                    i11 = R.id.iv_moution;
                                    ImageView imageView3 = (ImageView) j3.q(viewInflate, R.id.iv_moution);
                                    if (imageView3 != null) {
                                        i11 = R.id.iv_pavilion;
                                        ImageView imageView4 = (ImageView) j3.q(viewInflate, R.id.iv_pavilion);
                                        if (imageView4 != null) {
                                            i11 = R.id.iv_quit;
                                            ImageView imageView5 = (ImageView) j3.q(viewInflate, R.id.iv_quit);
                                            if (imageView5 != null) {
                                                i11 = R.id.ll_wild_goose_parent;
                                                LinearLayout linearLayout = (LinearLayout) j3.q(viewInflate, R.id.ll_wild_goose_parent);
                                                if (linearLayout != null) {
                                                    i11 = R.id.progress_bar;
                                                    ProgressBar progressBar = (ProgressBar) j3.q(viewInflate, R.id.progress_bar);
                                                    if (progressBar != null) {
                                                        i11 = R.id.rl_cloud_parent;
                                                        FrameLayout frameLayout = (FrameLayout) j3.q(viewInflate, R.id.rl_cloud_parent);
                                                        if (frameLayout != null) {
                                                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                            i11 = R.id.tv_last_time;
                                                            TextView textView = (TextView) j3.q(viewInflate, R.id.tv_last_time);
                                                            if (textView != null) {
                                                                i11 = R.id.tv_time;
                                                                TextView textView2 = (TextView) j3.q(viewInflate, R.id.tv_time);
                                                                if (textView2 != null) {
                                                                    i11 = R.id.tv_xp;
                                                                    TextView textView3 = (TextView) j3.q(viewInflate, R.id.tv_xp);
                                                                    if (textView3 != null) {
                                                                        i11 = R.id.wave_view;
                                                                        GameWaveView gameWaveView = (GameWaveView) j3.q(viewInflate, R.id.wave_view);
                                                                        if (gameWaveView != null) {
                                                                            return new x5(constraintLayout, wordGameLife, imageView, imageView2, imageView3, imageView4, imageView5, linearLayout, progressBar, frameLayout, constraintLayout, textView, textView2, textView3, gameWaveView);
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
