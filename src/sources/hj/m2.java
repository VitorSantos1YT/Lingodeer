package hj;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m2 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f32916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FlexboxLayout f32917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FlexboxLayout f32918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f32919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f32920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f32921f;

    public m2(FrameLayout frameLayout, FlexboxLayout flexboxLayout, FlexboxLayout flexboxLayout2, View view, TextView textView, View view2) {
        this.f32916a = frameLayout;
        this.f32917b = flexboxLayout;
        this.f32918c = flexboxLayout2;
        this.f32919d = view;
        this.f32920e = textView;
        this.f32921f = view2;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32916a;
    }
}
