package hj;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.flexbox.FlexboxLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b3 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f32380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FlexboxLayout f32381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g6 f32382c;

    public b3(LinearLayout linearLayout, FlexboxLayout flexboxLayout, g6 g6Var) {
        this.f32380a = linearLayout;
        this.f32381b = flexboxLayout;
        this.f32382c = g6Var;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32380a;
    }
}
