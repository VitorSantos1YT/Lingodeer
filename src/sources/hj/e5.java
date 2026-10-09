package hj;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e5 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f32532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaterialButton f32533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f32534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f32535d;

    public e5(FrameLayout frameLayout, MaterialButton materialButton, ImageView imageView, View view) {
        this.f32532a = frameLayout;
        this.f32533b = materialButton;
        this.f32534c = imageView;
        this.f32535d = view;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32532a;
    }
}
