package hj;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class l3 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f32850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaterialCardView f32851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MaterialCardView f32852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MaterialCardView f32853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MaterialCardView f32854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MaterialCardView f32855f;

    public l3(ConstraintLayout constraintLayout, MaterialCardView materialCardView, MaterialCardView materialCardView2, MaterialCardView materialCardView3, MaterialCardView materialCardView4, MaterialCardView materialCardView5) {
        this.f32850a = constraintLayout;
        this.f32851b = materialCardView;
        this.f32852c = materialCardView2;
        this.f32853d = materialCardView3;
        this.f32854e = materialCardView4;
        this.f32855f = materialCardView5;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32850a;
    }
}
