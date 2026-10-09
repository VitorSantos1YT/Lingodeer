package hj;

import android.view.View;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a5 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f32349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaterialButton f32350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MaterialButton f32351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j6 f32352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f32353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f32354f;

    public a5(View view, MaterialButton materialButton, MaterialButton materialButton2, j6 j6Var, TextView textView, TextView textView2) {
        this.f32349a = view;
        this.f32350b = materialButton;
        this.f32351c = materialButton2;
        this.f32352d = j6Var;
        this.f32353e = textView;
        this.f32354f = textView2;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32349a;
    }
}
