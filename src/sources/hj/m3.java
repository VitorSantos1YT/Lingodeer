package hj;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m3 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f32922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaterialCardView f32923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MaterialCardView f32924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MaterialCardView f32925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MaterialCardView f32926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MaterialCardView f32927f;

    public m3(ConstraintLayout constraintLayout, MaterialCardView materialCardView, MaterialCardView materialCardView2, MaterialCardView materialCardView3, MaterialCardView materialCardView4, MaterialCardView materialCardView5) {
        this.f32922a = constraintLayout;
        this.f32923b = materialCardView;
        this.f32924c = materialCardView2;
        this.f32925d = materialCardView3;
        this.f32926e = materialCardView4;
        this.f32927f = materialCardView5;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32922a;
    }
}
