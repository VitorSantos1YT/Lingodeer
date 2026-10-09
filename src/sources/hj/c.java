package hj;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f32410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaterialButton f32411b;

    public c(ConstraintLayout constraintLayout, MaterialButton materialButton) {
        this.f32410a = constraintLayout;
        this.f32411b = materialButton;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32410a;
    }
}
