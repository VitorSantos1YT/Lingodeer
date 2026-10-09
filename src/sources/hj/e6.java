package hj;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.flexbox.FlexboxLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e6 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f32536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FrameLayout f32537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FrameLayout f32538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FlexboxLayout f32539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FlexboxLayout f32540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinearLayout f32541f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f32542g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f32543h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f32544i;

    public e6(ConstraintLayout constraintLayout, FrameLayout frameLayout, FrameLayout frameLayout2, FlexboxLayout flexboxLayout, FlexboxLayout flexboxLayout2, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3) {
        this.f32536a = constraintLayout;
        this.f32537b = frameLayout;
        this.f32538c = frameLayout2;
        this.f32539d = flexboxLayout;
        this.f32540e = flexboxLayout2;
        this.f32541f = linearLayout;
        this.f32542g = textView;
        this.f32543h = textView2;
        this.f32544i = textView3;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32536a;
    }
}
