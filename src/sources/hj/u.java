package hj;

import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class u implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f33367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Button f33368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Button f33369c;

    public u(ConstraintLayout constraintLayout, Button button, Button button2) {
        this.f33367a = constraintLayout;
        this.f33368b = button;
        this.f33369c = button2;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33367a;
    }
}
