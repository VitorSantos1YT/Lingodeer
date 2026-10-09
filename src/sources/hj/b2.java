package hj;

import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.flexbox.FlexboxLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b2 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f32375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FlexboxLayout f32376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FlexboxLayout f32377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FlexboxLayout f32378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f32379e;

    public b2(RelativeLayout relativeLayout, FlexboxLayout flexboxLayout, FlexboxLayout flexboxLayout2, FlexboxLayout flexboxLayout3, View view) {
        this.f32375a = relativeLayout;
        this.f32376b = flexboxLayout;
        this.f32377c = flexboxLayout2;
        this.f32378d = flexboxLayout3;
        this.f32379e = view;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32375a;
    }
}
