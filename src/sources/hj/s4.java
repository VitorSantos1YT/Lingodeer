package hj;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class s4 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f33270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaterialButton f33271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f33272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f33273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f33274e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImageView f33275f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f33276g;

    public s4(ConstraintLayout constraintLayout, MaterialButton materialButton, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5) {
        this.f33270a = constraintLayout;
        this.f33271b = materialButton;
        this.f33272c = imageView;
        this.f33273d = imageView2;
        this.f33274e = imageView3;
        this.f33275f = imageView4;
        this.f33276g = imageView5;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33270a;
    }
}
