package jp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.PlayerView;
import com.lingo.fluent.widget.DonutProgress;
import com.lingodeer.R;
import fr.j3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l extends kotlin.jvm.internal.j implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f36507a = new l(1, hj.g.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/lingo/lingoskill/databinding/ActivityAdVideoPromptBinding;", 0);

    @Override // fz.c
    public final Object invoke(Object obj) {
        LayoutInflater p4 = (LayoutInflater) obj;
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.activity_ad_video_prompt, (ViewGroup) null, false);
        int i11 = R.id.iv_close;
        ImageView imageView = (ImageView) j3.q(viewInflate, R.id.iv_close);
        if (imageView != null) {
            i11 = R.id.iv_silence_ctrl;
            ImageView imageView2 = (ImageView) j3.q(viewInflate, R.id.iv_silence_ctrl);
            if (imageView2 != null) {
                i11 = R.id.pb_countdown;
                DonutProgress donutProgress = (DonutProgress) j3.q(viewInflate, R.id.pb_countdown);
                if (donutProgress != null) {
                    i11 = R.id.player_view;
                    PlayerView playerView = (PlayerView) j3.q(viewInflate, R.id.player_view);
                    if (playerView != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        i11 = R.id.status_bar_view;
                        View viewQ = j3.q(viewInflate, R.id.status_bar_view);
                        if (viewQ != null) {
                            return new hj.g(constraintLayout, imageView, imageView2, donutProgress, playerView, viewQ);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
