package z4;

import android.view.View;
import android.view.Window;
import com.alibaba.sdk.android.oss.common.OSSConstants;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class w1 extends cf.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Window f58910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tp.g f58911b;

    public w1(Window window, tp.g gVar) {
        this.f58910a = window;
        this.f58911b = gVar;
    }

    @Override // cf.x
    public final void K(boolean z11) {
        if (!z11) {
            R(OSSConstants.DEFAULT_BUFFER_SIZE);
            return;
        }
        Window window = this.f58910a;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        Q(OSSConstants.DEFAULT_BUFFER_SIZE);
    }

    @Override // cf.x
    public final void N() {
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((8 & i11) != 0) {
                if (i11 == 1) {
                    R(4);
                    this.f58910a.clearFlags(1024);
                } else if (i11 == 2) {
                    R(2);
                } else if (i11 == 8) {
                    ((qp.i) this.f58911b.f52461b).b();
                }
            }
        }
    }

    public final void Q(int i11) {
        View decorView = this.f58910a.getDecorView();
        decorView.setSystemUiVisibility(i11 | decorView.getSystemUiVisibility());
    }

    public final void R(int i11) {
        View decorView = this.f58910a.getDecorView();
        decorView.setSystemUiVisibility((~i11) & decorView.getSystemUiVisibility());
    }

    @Override // cf.x
    public final void s() {
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((8 & i11) != 0) {
                if (i11 == 1) {
                    Q(4);
                } else if (i11 == 2) {
                    Q(2);
                } else if (i11 == 8) {
                    ((qp.i) this.f58911b.f52461b).a();
                }
            }
        }
    }

    @Override // cf.x
    public final boolean u() {
        return (this.f58910a.getDecorView().getSystemUiVisibility() & OSSConstants.DEFAULT_BUFFER_SIZE) != 0;
    }
}
