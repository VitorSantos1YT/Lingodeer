package hj;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class y0 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f33606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaterialCardView f33607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MaterialCardView f33608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f33609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f33610e;

    public y0(ConstraintLayout constraintLayout, MaterialCardView materialCardView, MaterialCardView materialCardView2, ImageView imageView, View view) {
        this.f33606a = constraintLayout;
        this.f33607b = materialCardView;
        this.f33608c = materialCardView2;
        this.f33609d = imageView;
        this.f33610e = view;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33606a;
    }
}
