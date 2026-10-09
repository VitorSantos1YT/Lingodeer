package hj;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.card.MaterialCardView;
import com.lingo.lingoskill.widget.SlowPlaySwitchBtn;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d3 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f32489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f32490c;

    public /* synthetic */ d3(Object obj, int i11, View view) {
        this.f32488a = i11;
        this.f32489b = view;
        this.f32490c = obj;
    }

    public static d3 a(View view) {
        MaterialToolbar materialToolbar = (MaterialToolbar) fr.j3.q(view, R.id.toolbar);
        if (materialToolbar == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.toolbar)));
        }
        return new d3(materialToolbar, 6, (AppBarLayout) view);
    }

    public static d3 b(View view) {
        int i11 = R.id.frame_layout;
        if (((FrameLayout) fr.j3.q(view, R.id.frame_layout)) != null) {
            i11 = R.id.img_view;
            if (((LottieAnimationView) fr.j3.q(view, R.id.img_view)) != null) {
                i11 = R.id.ll_word_info;
                View viewQ = fr.j3.q(view, R.id.ll_word_info);
                if (viewQ != null) {
                    int i12 = R.id.tv_bottom;
                    if (((TextView) fr.j3.q(viewQ, R.id.tv_bottom)) != null) {
                        i12 = R.id.tv_middle;
                        if (((TextView) fr.j3.q(viewQ, R.id.tv_middle)) != null) {
                            i12 = R.id.tv_top;
                            if (((TextView) fr.j3.q(viewQ, R.id.tv_top)) != null) {
                                CardView cardView = (CardView) view;
                                if (((TextView) fr.j3.q(view, R.id.tv_word)) != null) {
                                    return new d3(cardView, 7, cardView);
                                }
                                i11 = R.id.tv_word;
                            }
                        }
                    }
                    throw new NullPointerException("Missing required view with ID: ".concat(viewQ.getResources().getResourceName(i12)));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static d3 c(View view) {
        MaterialCardView materialCardView = (MaterialCardView) view;
        int i11 = R.id.iv_option;
        if (((ImageView) fr.j3.q(view, R.id.iv_option)) != null) {
            i11 = R.id.ll_option;
            if (((LinearLayout) fr.j3.q(view, R.id.ll_option)) != null) {
                i11 = R.id.tv_bottom;
                if (((TextView) fr.j3.q(view, R.id.tv_bottom)) != null) {
                    i11 = R.id.tv_middle;
                    if (((TextView) fr.j3.q(view, R.id.tv_middle)) != null) {
                        i11 = R.id.tv_top;
                        if (((TextView) fr.j3.q(view, R.id.tv_top)) != null) {
                            return new d3(materialCardView, 10, materialCardView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // ta.a
    public final View getRoot() {
        switch (this.f32488a) {
            case 0:
                return (ComposeView) this.f32489b;
            case 1:
                return (FrameLayout) this.f32489b;
            case 2:
                return (ConstraintLayout) this.f32489b;
            case 3:
                return (ImageView) this.f32489b;
            case 4:
                return (LinearLayout) this.f32489b;
            case 5:
                return (LinearLayout) this.f32489b;
            case 6:
                return (AppBarLayout) this.f32489b;
            case 7:
                return (CardView) this.f32489b;
            case 8:
                return (SlowPlaySwitchBtn) this.f32489b;
            case 9:
                return (TextView) this.f32489b;
            default:
                return (MaterialCardView) this.f32489b;
        }
    }
}
