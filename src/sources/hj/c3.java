package hj;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.flexbox.FlexboxLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c3 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f32455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FlexboxLayout f32456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FlexboxLayout f32457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d3 f32458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConstraintLayout f32459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f32460f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f32461g;

    public c3(ConstraintLayout constraintLayout, FlexboxLayout flexboxLayout, FlexboxLayout flexboxLayout2, d3 d3Var, ConstraintLayout constraintLayout2, TextView textView, TextView textView2) {
        this.f32455a = constraintLayout;
        this.f32456b = flexboxLayout;
        this.f32457c = flexboxLayout2;
        this.f32458d = d3Var;
        this.f32459e = constraintLayout2;
        this.f32460f = textView;
        this.f32461g = textView2;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32455a;
    }
}
