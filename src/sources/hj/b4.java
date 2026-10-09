package hj;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b4 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f32383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaterialButton f32384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MaterialButton f32385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LottieAnimationView f32386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FrameLayout f32387e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImageView f32388f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f32389g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f32390h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ImageView f32391i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinearLayout f32392j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View f32393k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f32394l;
    public final TextView m;

    public b4(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, LottieAnimationView lottieAnimationView, FrameLayout frameLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, LinearLayout linearLayout, View view, TextView textView, TextView textView2) {
        this.f32383a = constraintLayout;
        this.f32384b = materialButton;
        this.f32385c = materialButton2;
        this.f32386d = lottieAnimationView;
        this.f32387e = frameLayout;
        this.f32388f = imageView;
        this.f32389g = imageView2;
        this.f32390h = imageView3;
        this.f32391i = imageView4;
        this.f32392j = linearLayout;
        this.f32393k = view;
        this.f32394l = textView;
        this.m = textView2;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32383a;
    }
}
