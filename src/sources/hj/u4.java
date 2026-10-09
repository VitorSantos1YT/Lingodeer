package hj;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class u4 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f33395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaterialButton f33396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u3 f33397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f33398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f33399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f33400f;

    public u4(FrameLayout frameLayout, MaterialButton materialButton, u3 u3Var, View view, TextView textView, TextView textView2) {
        this.f33395a = frameLayout;
        this.f33396b = materialButton;
        this.f33397c = u3Var;
        this.f33398d = view;
        this.f33399e = textView;
        this.f33400f = textView2;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33395a;
    }
}
