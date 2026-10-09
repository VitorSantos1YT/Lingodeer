package hj;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.flexbox.FlexboxLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class x1 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f33562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FlexboxLayout f33563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FlexboxLayout f33564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b6 f33565d;

    public x1(LinearLayout linearLayout, FlexboxLayout flexboxLayout, FlexboxLayout flexboxLayout2, b6 b6Var) {
        this.f33562a = linearLayout;
        this.f33563b = flexboxLayout;
        this.f33564c = flexboxLayout2;
        this.f33565d = b6Var;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33562a;
    }
}
