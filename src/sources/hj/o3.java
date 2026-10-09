package hj;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class o3 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f33013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaterialCardView f33014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MaterialCardView f33015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MaterialCardView f33016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MaterialCardView f33017e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MaterialCardView f33018f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final MaterialCardView f33019g;

    public o3(ConstraintLayout constraintLayout, MaterialCardView materialCardView, MaterialCardView materialCardView2, MaterialCardView materialCardView3, MaterialCardView materialCardView4, MaterialCardView materialCardView5, MaterialCardView materialCardView6) {
        this.f33013a = constraintLayout;
        this.f33014b = materialCardView;
        this.f33015c = materialCardView2;
        this.f33016d = materialCardView3;
        this.f33017e = materialCardView4;
        this.f33018f = materialCardView5;
        this.f33019g = materialCardView6;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33013a;
    }
}
