package hj;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class l2 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f32843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FlexboxLayout f32844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FlexboxLayout f32845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FlexboxLayout f32846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f32847e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RelativeLayout f32848f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f32849g;

    public l2(RelativeLayout relativeLayout, FlexboxLayout flexboxLayout, FlexboxLayout flexboxLayout2, FlexboxLayout flexboxLayout3, View view, RelativeLayout relativeLayout2, TextView textView) {
        this.f32843a = relativeLayout;
        this.f32844b = flexboxLayout;
        this.f32845c = flexboxLayout2;
        this.f32846d = flexboxLayout3;
        this.f32847e = view;
        this.f32848f = relativeLayout2;
        this.f32849g = textView;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32843a;
    }
}
