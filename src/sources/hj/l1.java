package hj;

import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.flexbox.FlexboxLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class l1 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f32836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a6 f32837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FlexboxLayout f32838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FlexboxLayout f32839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FlexboxLayout f32840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f32841f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RelativeLayout f32842g;

    public l1(RelativeLayout relativeLayout, a6 a6Var, FlexboxLayout flexboxLayout, FlexboxLayout flexboxLayout2, FlexboxLayout flexboxLayout3, View view, RelativeLayout relativeLayout2) {
        this.f32836a = relativeLayout;
        this.f32837b = a6Var;
        this.f32838c = flexboxLayout;
        this.f32839d = flexboxLayout2;
        this.f32840e = flexboxLayout3;
        this.f32841f = view;
        this.f32842g = relativeLayout2;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32836a;
    }
}
