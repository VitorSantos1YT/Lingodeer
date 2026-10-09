package e2;

import androidx.compose.ui.platform.AndroidComposeView;
import bt.y2;
import y.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f24718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AndroidComposeView f24719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y.j0 f24720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y.j0 f24721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f24722e;

    public i(p pVar, AndroidComposeView androidComposeView) {
        this.f24718a = pVar;
        this.f24719b = androidComposeView;
        y.j0 j0Var = s0.f56760a;
        this.f24720c = new y.j0();
        this.f24721d = new y.j0();
    }

    public final void a() {
        if (this.f24722e) {
            return;
        }
        y2 y2Var = new y2(0, this, i.class, "invalidateNodes", "invalidateNodes()V", 0, 5);
        y.e0 e0Var = this.f24719b.Y0;
        if (e0Var.g(y2Var) < 0) {
            e0Var.a(y2Var);
        }
        this.f24722e = true;
    }
}
