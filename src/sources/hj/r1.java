package hj;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.flexbox.FlexboxLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class r1 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f33205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z5 f33206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FlexboxLayout f33207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FlexboxLayout f33208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinearLayout f33209e;

    public r1(LinearLayout linearLayout, z5 z5Var, FlexboxLayout flexboxLayout, FlexboxLayout flexboxLayout2, LinearLayout linearLayout2) {
        this.f33205a = linearLayout;
        this.f33206b = z5Var;
        this.f33207c = flexboxLayout;
        this.f33208d = flexboxLayout2;
        this.f33209e = linearLayout2;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33205a;
    }
}
