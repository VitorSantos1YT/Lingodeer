package v7;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.media3.common.util.GlUtil$GlException;
import b7.f0;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends HandlerThread implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b7.h f53641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f53642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Error f53643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RuntimeException f53644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l f53645e;

    public final void a(int i11) throws GlUtil$GlException {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        this.f53641a.getClass();
        b7.h hVar = this.f53641a;
        int[] iArr = hVar.f3989b;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        b7.a.f("eglGetDisplay failed", eGLDisplayEglGetDisplay != null);
        int[] iArr2 = new int[2];
        b7.a.f("eglInitialize failed", EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr2, 0, iArr2, 1));
        hVar.f3990c = eGLDisplayEglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr3 = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, b7.h.f3987t, 0, eGLConfigArr, 0, 1, iArr3, 0);
        boolean z11 = zEglChooseConfig && iArr3[0] > 0 && eGLConfigArr[0] != null;
        Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]};
        String str = f0.f3975a;
        b7.a.f(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z11);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(hVar.f3990c, eGLConfig, EGL14.EGL_NO_CONTEXT, i11 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        b7.a.f("eglCreateContext failed", eGLContextEglCreateContext != null);
        hVar.f3991d = eGLContextEglCreateContext;
        EGLDisplay eGLDisplay = hVar.f3990c;
        if (i11 == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i11 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            b7.a.f("eglCreatePbufferSurface failed", eGLSurfaceEglCreatePbufferSurface != null);
        }
        b7.a.f("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext));
        hVar.f3992e = eGLSurfaceEglCreatePbufferSurface;
        GLES20.glGenTextures(1, iArr, 0);
        b7.a.e();
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr[0]);
        hVar.f3993f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(hVar);
        SurfaceTexture surfaceTexture2 = this.f53641a.f3993f;
        surfaceTexture2.getClass();
        this.f53645e = new l(this, surfaceTexture2, i11 != 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        this.f53641a.getClass();
        b7.h hVar = this.f53641a;
        hVar.f3988a.removeCallbacks(hVar);
        try {
            SurfaceTexture surfaceTexture = hVar.f3993f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, hVar.f3989b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = hVar.f3990c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = hVar.f3990c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = hVar.f3992e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(hVar.f3990c, hVar.f3992e);
            }
            EGLContext eGLContext = hVar.f3991d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(hVar.f3990c, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = hVar.f3990c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(hVar.f3990c);
            }
            hVar.f3990c = null;
            hVar.f3991d = null;
            hVar.f3992e = null;
            hVar.f3993f = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i11 = message.what;
        try {
            if (i11 == 1) {
                try {
                    a(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                    return true;
                } catch (GlUtil$GlException e8) {
                    b7.a.p("Failed to initialize placeholder surface", e8);
                    this.f53644d = new IllegalStateException(e8);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e10) {
                    b7.a.p("Failed to initialize placeholder surface", e10);
                    this.f53643c = e10;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e11) {
                    b7.a.p("Failed to initialize placeholder surface", e11);
                    this.f53644d = e11;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i11 == 2) {
                try {
                    b();
                    quit();
                    return true;
                } catch (Throwable th2) {
                    try {
                        b7.a.p("Failed to release placeholder surface", th2);
                        return true;
                    } finally {
                        quit();
                    }
                }
            }
            return true;
        } catch (Throwable th3) {
            synchronized (this) {
                notify();
                throw th3;
            }
        }
    }
}
