package hj;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.flexbox.FlexboxLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class w2 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f33512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FlexboxLayout f33513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e3 f33514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinearLayout f33515d;

    public w2(LinearLayout linearLayout, FlexboxLayout flexboxLayout, e3 e3Var, LinearLayout linearLayout2) {
        this.f33512a = linearLayout;
        this.f33513b = flexboxLayout;
        this.f33514c = e3Var;
        this.f33515d = linearLayout2;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33512a;
    }
}
