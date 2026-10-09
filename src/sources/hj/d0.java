package hj;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d0 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f32475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaterialButton f32476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MaterialButton f32477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f32478d;

    public d0(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, ImageView imageView) {
        this.f32475a = constraintLayout;
        this.f32476b = materialButton;
        this.f32477c = materialButton2;
        this.f32478d = imageView;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32475a;
    }
}
