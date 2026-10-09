package hj;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class n4 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f32986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FrameLayout f32987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f32988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FrameLayout f32989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f32990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinearLayout f32991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinearLayout f32992g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinearLayout f32993h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f32994i;

    public n4(ConstraintLayout constraintLayout, FrameLayout frameLayout, ImageView imageView, FrameLayout frameLayout2, ImageView imageView2, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, View view) {
        this.f32986a = constraintLayout;
        this.f32987b = frameLayout;
        this.f32988c = imageView;
        this.f32989d = frameLayout2;
        this.f32990e = imageView2;
        this.f32991f = linearLayout;
        this.f32992g = linearLayout2;
        this.f32993h = linearLayout3;
        this.f32994i = view;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32986a;
    }
}
