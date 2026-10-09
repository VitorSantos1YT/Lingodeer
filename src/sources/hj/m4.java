package hj;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.lingo.lingoskill.widget.LollipopFixedWebView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m4 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f32928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k6 f32929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f32930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f32931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f32932e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f32933f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f32934g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LollipopFixedWebView f32935h;

    public m4(FrameLayout frameLayout, k6 k6Var, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView, TextView textView2, LollipopFixedWebView lollipopFixedWebView) {
        this.f32928a = frameLayout;
        this.f32929b = k6Var;
        this.f32930c = imageView;
        this.f32931d = imageView2;
        this.f32932e = imageView3;
        this.f32933f = textView;
        this.f32934g = textView2;
        this.f32935h = lollipopFixedWebView;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32928a;
    }
}
