package hj;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class k3 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f32813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaterialCardView f32814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MaterialCardView f32815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MaterialCardView f32816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MaterialCardView f32817e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MaterialCardView f32818f;

    public k3(ConstraintLayout constraintLayout, MaterialCardView materialCardView, MaterialCardView materialCardView2, MaterialCardView materialCardView3, MaterialCardView materialCardView4, MaterialCardView materialCardView5) {
        this.f32813a = constraintLayout;
        this.f32814b = materialCardView;
        this.f32815c = materialCardView2;
        this.f32816d = materialCardView3;
        this.f32817e = materialCardView4;
        this.f32818f = materialCardView5;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32813a;
    }
}
