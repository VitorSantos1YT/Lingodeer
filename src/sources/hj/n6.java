package hj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.legacy.widget.Space;
import com.lingo.lingoskill.widget.flingView.SwipeCardsView;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class n6 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f32997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SwipeCardsView f32998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f32999c;

    public n6(RelativeLayout relativeLayout, SwipeCardsView swipeCardsView, TextView textView) {
        this.f32997a = relativeLayout;
        this.f32998b = swipeCardsView;
        this.f32999c = textView;
    }

    public static n6 a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R.layout.syllable_card_learn_model, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.fling_view;
        SwipeCardsView swipeCardsView = (SwipeCardsView) fr.j3.q(viewInflate, R.id.fling_view);
        if (swipeCardsView != null) {
            i11 = R.id.sp_seat;
            if (((Space) fr.j3.q(viewInflate, R.id.sp_seat)) != null) {
                i11 = R.id.tv_flash;
                TextView textView = (TextView) fr.j3.q(viewInflate, R.id.tv_flash);
                if (textView != null) {
                    return new n6((RelativeLayout) viewInflate, swipeCardsView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32997a;
    }
}
