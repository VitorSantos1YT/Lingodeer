package hj;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.airbnb.lottie.LottieAnimationView;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class u0 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f33371b;

    public /* synthetic */ u0(ViewGroup viewGroup, int i11) {
        this.f33370a = i11;
        this.f33371b = viewGroup;
    }

    public static u0 a(View view) {
        int i11 = R.id.frame_layout;
        if (((FrameLayout) fr.j3.q(view, R.id.frame_layout)) != null) {
            i11 = R.id.img_view;
            if (((LottieAnimationView) fr.j3.q(view, R.id.img_view)) != null) {
                return new u0((CardView) view, 1);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // ta.a
    public final View getRoot() {
        switch (this.f33370a) {
            case 0:
                return (LinearLayout) this.f33371b;
            default:
                return (CardView) this.f33371b;
        }
    }
}
