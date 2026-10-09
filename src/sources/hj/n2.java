package hj;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.ybq.android.spinkit.SpinKitView;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.widget.RoleWaveView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class n2 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f32967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FrameLayout f32968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FrameLayout f32969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FrameLayout f32970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FlexboxLayout f32971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImageView f32972f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f32973g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f32974h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ConstraintLayout f32975i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final SpinKitView f32976j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final TextView f32977k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f32978l;
    public final RoleWaveView m;

    public n2(ConstraintLayout constraintLayout, FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3, FlexboxLayout flexboxLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ConstraintLayout constraintLayout2, SpinKitView spinKitView, TextView textView, TextView textView2, RoleWaveView roleWaveView) {
        this.f32967a = constraintLayout;
        this.f32968b = frameLayout;
        this.f32969c = frameLayout2;
        this.f32970d = frameLayout3;
        this.f32971e = flexboxLayout;
        this.f32972f = imageView;
        this.f32973g = imageView2;
        this.f32974h = imageView3;
        this.f32975i = constraintLayout2;
        this.f32976j = spinKitView;
        this.f32977k = textView;
        this.f32978l = textView2;
        this.m = roleWaveView;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32967a;
    }
}
