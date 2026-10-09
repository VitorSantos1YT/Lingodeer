package f3;

import a0.o0;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import androidx.compose.ui.platform.AndroidComposeView;
import b1.n;
import com.yalantis.ucrop.view.CropImageView;
import e6.q0;
import g2.f0;
import g3.t;
import java.util.function.Consumer;
import l1.k1;
import rz.e0;
import rz.v1;
import rz.z1;
import v3.k;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements ScrollCaptureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f26601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f26602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f26603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AndroidComposeView f26604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wz.d f26605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f26606f;

    public d(t tVar, k kVar, wz.d dVar, i iVar, AndroidComposeView androidComposeView) {
        this.f26601a = tVar;
        this.f26602b = kVar;
        this.f26603c = iVar;
        this.f26604d = androidComposeView;
        this.f26605e = new wz.d(dVar.f55510a.plus(e.f26607a));
        this.f26606f = new g(kVar.b(), new c(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009d, code lost:
    
        if (r10 == r1) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(f3.d r12, android.view.ScrollCaptureSession r13, v3.k r14, xy.c r15) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.d.a(f3.d, android.view.ScrollCaptureSession, v3.k, xy.c):java.lang.Object");
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        e0.B(this.f26605e, v1.f50964a, null, new q0(10, this, runnable, (vy.d) null), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        z1 z1VarB = e0.B(this.f26605e, null, null, new b0.f(this, scrollCaptureSession, rect, consumer, (vy.d) null, 17), 3);
        z1VarB.invokeOnCompletion(new o0(cancellationSignal, 7));
        cancellationSignal.setOnCancelListener(new n(z1VarB, 1));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(f0.B(this.f26602b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f26606f.f26612b = CropImageView.DEFAULT_ASPECT_RATIO;
        ((k1) this.f26603c.f26615b).setValue(Boolean.TRUE);
        runnable.run();
    }
}
