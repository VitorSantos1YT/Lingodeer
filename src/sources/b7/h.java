package b7;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int[] f3987t = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f3988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f3989b = new int[1];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public EGLDisplay f3990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EGLContext f3991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EGLSurface f3992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SurfaceTexture f3993f;

    public h(Handler handler) {
        this.f3988a = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f3988a.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f3993f;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
