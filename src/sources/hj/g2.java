package hj;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g2 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f32603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FlexboxLayout f32604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FrameLayout f32605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FrameLayout f32606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f32607e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinearLayout f32608f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinearLayout f32609g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f32610h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f32611i;

    public g2(LinearLayout linearLayout, FlexboxLayout flexboxLayout, FrameLayout frameLayout, FrameLayout frameLayout2, ImageView imageView, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView, TextView textView2) {
        this.f32603a = linearLayout;
        this.f32604b = flexboxLayout;
        this.f32605c = frameLayout;
        this.f32606d = frameLayout2;
        this.f32607e = imageView;
        this.f32608f = linearLayout2;
        this.f32609g = linearLayout3;
        this.f32610h = textView;
        this.f32611i = textView2;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32603a;
    }
}
