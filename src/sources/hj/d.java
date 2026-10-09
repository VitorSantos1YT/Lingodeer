package hj;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.flexbox.FlexboxLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f32473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FlexboxLayout f32474b;

    public d(ConstraintLayout constraintLayout, FlexboxLayout flexboxLayout) {
        this.f32473a = constraintLayout;
        this.f32474b = flexboxLayout;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32473a;
    }
}
