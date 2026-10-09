package hj;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class y4 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f33621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f33622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MaterialButton f33623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f33624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FlexboxLayout f33625e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j6 f33626f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e3 f33627g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f33628h;

    public y4(FrameLayout frameLayout, View view, MaterialButton materialButton, View view2, FlexboxLayout flexboxLayout, j6 j6Var, e3 e3Var, TextView textView) {
        this.f33621a = frameLayout;
        this.f33622b = view;
        this.f33623c = materialButton;
        this.f33624d = view2;
        this.f33625e = flexboxLayout;
        this.f33626f = j6Var;
        this.f33627g = e3Var;
        this.f33628h = textView;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33621a;
    }
}
