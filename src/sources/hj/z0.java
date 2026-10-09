package hj;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class z0 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f33641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f33642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f33643c;

    public z0(ConstraintLayout constraintLayout, ImageView imageView, View view) {
        this.f33641a = constraintLayout;
        this.f33642b = imageView;
        this.f33643c = view;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33641a;
    }
}
