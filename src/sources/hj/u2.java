package hj;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.flexbox.FlexboxLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class u2 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f33382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FlexboxLayout f33383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g6 f33384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d3 f33385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d3 f33386e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d3 f33387f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d3 f33388g;

    public u2(LinearLayout linearLayout, FlexboxLayout flexboxLayout, g6 g6Var, d3 d3Var, d3 d3Var2, d3 d3Var3, d3 d3Var4) {
        this.f33382a = linearLayout;
        this.f33383b = flexboxLayout;
        this.f33384c = g6Var;
        this.f33385d = d3Var;
        this.f33386e = d3Var2;
        this.f33387f = d3Var3;
        this.f33388g = d3Var4;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33382a;
    }
}
