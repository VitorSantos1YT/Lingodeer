package hj;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class k0 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f32803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e3 f32804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f32805c;

    public k0(ConstraintLayout constraintLayout, e3 e3Var, View view) {
        this.f32803a = constraintLayout;
        this.f32804b = e3Var;
        this.f32805c = view;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32803a;
    }
}
