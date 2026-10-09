package hj;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h6 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f32662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LottieAnimationView f32663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f32664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f32665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MaterialButton f32666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConstraintLayout f32667f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConstraintLayout f32668g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f32669h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f32670i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f32671j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View f32672k;

    public h6(ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView, ImageView imageView, ImageView imageView2, MaterialButton materialButton, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, TextView textView, TextView textView2, TextView textView3, View view) {
        this.f32662a = constraintLayout;
        this.f32663b = lottieAnimationView;
        this.f32664c = imageView;
        this.f32665d = imageView2;
        this.f32666e = materialButton;
        this.f32667f = constraintLayout2;
        this.f32668g = constraintLayout3;
        this.f32669h = textView;
        this.f32670i = textView2;
        this.f32671j = textView3;
        this.f32672k = view;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32662a;
    }
}
