package hj;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e0 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f32506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaterialButton f32507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f32508c;

    public e0(ConstraintLayout constraintLayout, MaterialButton materialButton, ImageView imageView) {
        this.f32506a = constraintLayout;
        this.f32507b = materialButton;
        this.f32508c = imageView;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32506a;
    }
}
