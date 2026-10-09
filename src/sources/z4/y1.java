package z4;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import com.alibaba.sdk.android.oss.common.OSSConstants;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class y1 extends cf.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowInsetsController f58918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tp.g f58919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Window f58920c;

    public y1(WindowInsetsController windowInsetsController, tp.g gVar) {
        this.f58918a = windowInsetsController;
        this.f58919b = gVar;
    }

    @Override // cf.x
    public final void J(boolean z11) {
        Window window = this.f58920c;
        if (z11) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f58918a.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f58918a.setSystemBarsAppearance(0, 16);
    }

    @Override // cf.x
    public final void K(boolean z11) {
        Window window = this.f58920c;
        if (z11) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | OSSConstants.DEFAULT_BUFFER_SIZE);
            }
            this.f58918a.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f58918a.setSystemBarsAppearance(0, 8);
    }

    @Override // cf.x
    public final void N() {
        ((qp.i) this.f58919b.f52461b).b();
        this.f58918a.show(0);
    }

    @Override // cf.x
    public final void s() {
        ((qp.i) this.f58919b.f52461b).a();
        this.f58918a.hide(0);
    }

    @Override // cf.x
    public boolean u() {
        this.f58918a.setSystemBarsAppearance(0, 0);
        return (this.f58918a.getSystemBarsAppearance() & 8) != 0;
    }

    public y1(Window window, tp.g gVar) {
        this(window.getInsetsController(), gVar);
        this.f58920c = window;
    }
}
