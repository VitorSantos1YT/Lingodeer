package hj;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.card.MaterialCardView;
import com.lingo.lingoskill.widget.LollipopFixedWebView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g3 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaterialCardView f32612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f32613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageButton f32614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FrameLayout f32615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinearLayout f32616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinearLayout f32617f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final NestedScrollView f32618g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f32619h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f32620i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f32621j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final TextView f32622k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LollipopFixedWebView f32623l;

    public g3(MaterialCardView materialCardView, ImageView imageView, ImageButton imageButton, FrameLayout frameLayout, LinearLayout linearLayout, LinearLayout linearLayout2, NestedScrollView nestedScrollView, TextView textView, TextView textView2, TextView textView3, TextView textView4, LollipopFixedWebView lollipopFixedWebView) {
        this.f32612a = materialCardView;
        this.f32613b = imageView;
        this.f32614c = imageButton;
        this.f32615d = frameLayout;
        this.f32616e = linearLayout;
        this.f32617f = linearLayout2;
        this.f32618g = nestedScrollView;
        this.f32619h = textView;
        this.f32620i = textView2;
        this.f32621j = textView3;
        this.f32622k = textView4;
        this.f32623l = lollipopFixedWebView;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32612a;
    }
}
