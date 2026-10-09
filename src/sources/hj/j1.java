package hj;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.flexbox.FlexboxLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class j1 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f32747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z5 f32748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FlexboxLayout f32749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FlexboxLayout f32750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FlexboxLayout f32751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f32752f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RelativeLayout f32753g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final NestedScrollView f32754h;

    public j1(RelativeLayout relativeLayout, z5 z5Var, FlexboxLayout flexboxLayout, FlexboxLayout flexboxLayout2, FlexboxLayout flexboxLayout3, View view, RelativeLayout relativeLayout2, NestedScrollView nestedScrollView) {
        this.f32747a = relativeLayout;
        this.f32748b = z5Var;
        this.f32749c = flexboxLayout;
        this.f32750d = flexboxLayout2;
        this.f32751e = flexboxLayout3;
        this.f32752f = view;
        this.f32753g = relativeLayout2;
        this.f32754h = nestedScrollView;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32747a;
    }
}
