package h9;

import androidx.media3.ui.AspectRatioFrameLayout;
import com.google.common.base.Stopwatch;
import lf.s0;
import lf.t0;
import mw.w0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f32006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f32007c;

    public /* synthetic */ b(Object obj, boolean z11, int i11) {
        this.f32005a = i11;
        this.f32007c = obj;
        this.f32006b = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i11 = this.f32005a;
        Object obj = this.f32007c;
        switch (i11) {
            case 0:
                this.f32006b = false;
                int i12 = AspectRatioFrameLayout.f2154d;
                ((AspectRatioFrameLayout) obj).getClass();
                break;
            case 1:
                boolean z11 = this.f32006b;
                pe.m.a();
                bq.f fVar = (bq.f) ((fc.g) obj).f27142b;
                boolean z12 = fVar.f4943a;
                fVar.f4943a = z11;
                if (z12 != z11) {
                    ((ie.n) fVar.f4944b).a(z11);
                }
                break;
            case 2:
                if (!qf.a.b(this)) {
                    try {
                        t0 t0Var = t0.f40120a;
                        t0.b((s0) obj, this.f32006b);
                    } catch (Throwable th2) {
                        qf.a.a(this, th2);
                        return;
                    }
                    break;
                }
                break;
            default:
                w0 w0Var = (w0) ((mw.i0) obj).f42445b;
                if (this.f32006b) {
                    w0Var.f42766o = true;
                    if (w0Var.f42764l > 0) {
                        Stopwatch stopwatch = w0Var.f42765n;
                        stopwatch.f16400c = 0L;
                        stopwatch.f16399b = false;
                        stopwatch.b();
                    }
                }
                w0Var.f42771t = false;
                break;
        }
    }

    public b(AspectRatioFrameLayout aspectRatioFrameLayout) {
        this.f32005a = 0;
        this.f32007c = aspectRatioFrameLayout;
    }
}
