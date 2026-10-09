package hj;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.flexbox.FlexboxLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class k1 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f32806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a6 f32807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FlexboxLayout f32808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FrameLayout f32809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f32810e;

    public k1(FrameLayout frameLayout, a6 a6Var, FlexboxLayout flexboxLayout, FrameLayout frameLayout2, ImageView imageView) {
        this.f32806a = frameLayout;
        this.f32807b = a6Var;
        this.f32808c = flexboxLayout;
        this.f32809d = frameLayout2;
        this.f32810e = imageView;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32806a;
    }
}
