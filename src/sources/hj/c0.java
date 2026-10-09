package hj;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c0 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f32412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f32413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f32414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConstraintLayout f32415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f32416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f32417f;

    public c0(LinearLayout linearLayout, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, TextView textView, View view) {
        this.f32412a = linearLayout;
        this.f32413b = constraintLayout;
        this.f32414c = constraintLayout2;
        this.f32415d = constraintLayout3;
        this.f32416e = textView;
        this.f32417f = view;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32412a;
    }
}
