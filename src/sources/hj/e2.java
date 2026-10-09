package hj;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.widget.SlowPlaySwitchBtn;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e2 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f32513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FlexboxLayout f32514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FlexboxLayout f32515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FlexboxLayout f32516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f32517e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b6 f32518f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RelativeLayout f32519g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final NestedScrollView f32520h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SlowPlaySwitchBtn f32521i;

    public e2(RelativeLayout relativeLayout, FlexboxLayout flexboxLayout, FlexboxLayout flexboxLayout2, FlexboxLayout flexboxLayout3, View view, b6 b6Var, RelativeLayout relativeLayout2, NestedScrollView nestedScrollView, SlowPlaySwitchBtn slowPlaySwitchBtn) {
        this.f32513a = relativeLayout;
        this.f32514b = flexboxLayout;
        this.f32515c = flexboxLayout2;
        this.f32516d = flexboxLayout3;
        this.f32517e = view;
        this.f32518f = b6Var;
        this.f32519g = relativeLayout2;
        this.f32520h = nestedScrollView;
        this.f32521i = slowPlaySwitchBtn;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32513a;
    }
}
