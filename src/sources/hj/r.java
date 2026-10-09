package hj;

import android.view.View;
import android.widget.ImageView;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class r implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NestedScrollView f33177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaterialButton f33178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f33179c;

    public r(NestedScrollView nestedScrollView, MaterialButton materialButton, ImageView imageView) {
        this.f33177a = nestedScrollView;
        this.f33178b = materialButton;
        this.f33179c = imageView;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33177a;
    }
}
