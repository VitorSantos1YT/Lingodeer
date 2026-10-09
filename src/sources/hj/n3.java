package hj;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class n3 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f32979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaterialCardView f32980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MaterialCardView f32981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MaterialCardView f32982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MaterialCardView f32983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MaterialCardView f32984f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final MaterialCardView f32985g;

    public n3(ConstraintLayout constraintLayout, MaterialCardView materialCardView, MaterialCardView materialCardView2, MaterialCardView materialCardView3, MaterialCardView materialCardView4, MaterialCardView materialCardView5, MaterialCardView materialCardView6) {
        this.f32979a = constraintLayout;
        this.f32980b = materialCardView;
        this.f32981c = materialCardView2;
        this.f32982d = materialCardView3;
        this.f32983e = materialCardView4;
        this.f32984f = materialCardView5;
        this.f32985g = materialCardView6;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32979a;
    }
}
