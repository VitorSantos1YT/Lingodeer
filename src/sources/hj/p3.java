package hj;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class p3 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f33087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaterialCardView f33088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MaterialCardView f33089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MaterialCardView f33090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MaterialCardView f33091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MaterialCardView f33092f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final MaterialCardView f33093g;

    public p3(ConstraintLayout constraintLayout, MaterialCardView materialCardView, MaterialCardView materialCardView2, MaterialCardView materialCardView3, MaterialCardView materialCardView4, MaterialCardView materialCardView5, MaterialCardView materialCardView6) {
        this.f33087a = constraintLayout;
        this.f33088b = materialCardView;
        this.f33089c = materialCardView2;
        this.f33090d = materialCardView3;
        this.f33091e = materialCardView4;
        this.f33092f = materialCardView5;
        this.f33093g = materialCardView6;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33087a;
    }
}
