package hj;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.flexbox.FlexboxLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m1 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f32909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a6 f32910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FlexboxLayout f32911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FlexboxLayout f32912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FrameLayout f32913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f32914f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f32915g;

    public m1(FrameLayout frameLayout, a6 a6Var, FlexboxLayout flexboxLayout, FlexboxLayout flexboxLayout2, FrameLayout frameLayout2, View view, View view2) {
        this.f32909a = frameLayout;
        this.f32910b = a6Var;
        this.f32911c = flexboxLayout;
        this.f32912d = flexboxLayout2;
        this.f32913e = frameLayout2;
        this.f32914f = view;
        this.f32915g = view2;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32909a;
    }
}
