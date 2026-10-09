package hj;

import android.view.View;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NestedScrollView f32325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaterialButton f32326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MaterialButton f32327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f32328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f32329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f32330f;

    public a0(NestedScrollView nestedScrollView, MaterialButton materialButton, MaterialButton materialButton2, View view, TextView textView, TextView textView2) {
        this.f32325a = nestedScrollView;
        this.f32326b = materialButton;
        this.f32327c = materialButton2;
        this.f32328d = view;
        this.f32329e = textView;
        this.f32330f = textView2;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32325a;
    }
}
