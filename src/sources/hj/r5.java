package hj;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.airbnb.lottie.LottieAnimationView;
import com.lingo.lingoskill.widget.LollipopFixedWebView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class r5 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f33228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f33229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i6 f33230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k6 f33231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f33232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImageView f33233f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LottieAnimationView f33234g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final NestedScrollView f33235h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f33236i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LollipopFixedWebView f33237j;

    public r5(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, i6 i6Var, k6 k6Var, ImageView imageView, ImageView imageView2, LottieAnimationView lottieAnimationView, NestedScrollView nestedScrollView, TextView textView, LollipopFixedWebView lollipopFixedWebView) {
        this.f33228a = constraintLayout;
        this.f33229b = constraintLayout2;
        this.f33230c = i6Var;
        this.f33231d = k6Var;
        this.f33232e = imageView;
        this.f33233f = imageView2;
        this.f33234g = lottieAnimationView;
        this.f33235h = nestedScrollView;
        this.f33236i = textView;
        this.f33237j = lollipopFixedWebView;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33228a;
    }
}
