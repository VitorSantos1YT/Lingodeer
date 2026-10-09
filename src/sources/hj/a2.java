package hj;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a2 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f32333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FlexboxLayout f32334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FlexboxLayout f32335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f32336d;

    public a2(RelativeLayout relativeLayout, FlexboxLayout flexboxLayout, FlexboxLayout flexboxLayout2, TextView textView) {
        this.f32333a = relativeLayout;
        this.f32334b = flexboxLayout;
        this.f32335c = flexboxLayout2;
        this.f32336d = textView;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32333a;
    }
}
