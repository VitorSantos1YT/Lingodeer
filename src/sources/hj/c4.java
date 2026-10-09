package hj;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c4 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f32462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaterialButton f32463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f32464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FlexboxLayout f32465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f32466e;

    public c4(ConstraintLayout constraintLayout, MaterialButton materialButton, ConstraintLayout constraintLayout2, FlexboxLayout flexboxLayout, View view) {
        this.f32462a = constraintLayout;
        this.f32463b = materialButton;
        this.f32464c = constraintLayout2;
        this.f32465d = flexboxLayout;
        this.f32466e = view;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32462a;
    }
}
