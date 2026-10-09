package hj;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.flexbox.FlexboxLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class s1 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f33256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a6 f33257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FlexboxLayout f33258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FlexboxLayout f33259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinearLayout f33260e;

    public s1(LinearLayout linearLayout, a6 a6Var, FlexboxLayout flexboxLayout, FlexboxLayout flexboxLayout2, LinearLayout linearLayout2) {
        this.f33256a = linearLayout;
        this.f33257b = a6Var;
        this.f33258c = flexboxLayout;
        this.f33259d = flexboxLayout2;
        this.f33260e = linearLayout2;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33256a;
    }
}
