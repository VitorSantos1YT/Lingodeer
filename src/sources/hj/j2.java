package hj;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.flexbox.FlexboxLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class j2 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f32755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FlexboxLayout f32756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e3 f32757c;

    public j2(LinearLayout linearLayout, FlexboxLayout flexboxLayout, e3 e3Var) {
        this.f32755a = linearLayout;
        this.f32756b = flexboxLayout;
        this.f32757c = e3Var;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32755a;
    }
}
