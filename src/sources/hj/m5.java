package hj;

import android.view.View;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m5 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardView f32936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u3 f32937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinearLayout f32938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MaterialButton f32939d;

    public m5(CardView cardView, u3 u3Var, LinearLayout linearLayout, MaterialButton materialButton) {
        this.f32936a = cardView;
        this.f32937b = u3Var;
        this.f32938c = linearLayout;
        this.f32939d = materialButton;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32936a;
    }
}
