package hj;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.flexbox.FlexboxLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class q1 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f33133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FlexboxLayout f33134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z5 f33135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinearLayout f33136d;

    public q1(LinearLayout linearLayout, FlexboxLayout flexboxLayout, z5 z5Var, LinearLayout linearLayout2) {
        this.f33133a = linearLayout;
        this.f33134b = flexboxLayout;
        this.f33135c = z5Var;
        this.f33136d = linearLayout2;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33133a;
    }
}
