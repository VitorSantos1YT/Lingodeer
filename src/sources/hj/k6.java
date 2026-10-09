package hj;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class k6 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f32829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MaterialButton f32830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConstraintLayout f32831d;

    public /* synthetic */ k6(ConstraintLayout constraintLayout, MaterialButton materialButton, ConstraintLayout constraintLayout2, int i11) {
        this.f32828a = i11;
        this.f32829b = constraintLayout;
        this.f32830c = materialButton;
        this.f32831d = constraintLayout2;
    }

    @Override // ta.a
    public final View getRoot() {
        switch (this.f32828a) {
            case 0:
                break;
        }
        return this.f32829b;
    }
}
