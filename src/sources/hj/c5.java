package hj;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c5 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f32467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaterialButton f32468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u3 f32469c;

    public c5(LinearLayout linearLayout, MaterialButton materialButton, u3 u3Var) {
        this.f32467a = linearLayout;
        this.f32468b = materialButton;
        this.f32469c = u3Var;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32467a;
    }
}
