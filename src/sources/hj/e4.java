package hj;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e4 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f32526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaterialButton f32527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MaterialButton f32528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f32529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f32530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f32531f;

    public e4(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, ImageView imageView, View view, View view2) {
        this.f32526a = constraintLayout;
        this.f32527b = materialButton;
        this.f32528c = materialButton2;
        this.f32529d = imageView;
        this.f32530e = view;
        this.f32531f = view2;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32526a;
    }
}
