package hj;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class p5 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f33098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaterialButton f33099b;

    public p5(LinearLayout linearLayout, MaterialButton materialButton) {
        this.f33098a = linearLayout;
        this.f33099b = materialButton;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33098a;
    }
}
