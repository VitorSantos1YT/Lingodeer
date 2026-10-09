package hj;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d4 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f32491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaterialButton f32492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FlexboxLayout f32493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f32494d;

    public d4(ConstraintLayout constraintLayout, MaterialButton materialButton, FlexboxLayout flexboxLayout, View view) {
        this.f32491a = constraintLayout;
        this.f32492b = materialButton;
        this.f32493c = flexboxLayout;
        this.f32494d = view;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32491a;
    }
}
