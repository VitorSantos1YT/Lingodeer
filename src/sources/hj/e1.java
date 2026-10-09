package hj;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e1 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f32509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f32510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProgressBar f32511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f32512d;

    public e1(ConstraintLayout constraintLayout, LinearLayout linearLayout, ProgressBar progressBar, View view) {
        this.f32509a = constraintLayout;
        this.f32510b = linearLayout;
        this.f32511c = progressBar;
        this.f32512d = view;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32509a;
    }
}
