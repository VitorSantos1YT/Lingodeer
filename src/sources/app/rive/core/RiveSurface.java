package app.rive.core;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.view.Surface;
import defpackage.e;
import ep.a;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class RiveSurface {
    public static final int $stable = 8;
    private final EGLDisplay display;
    private final long drawKey;
    private final EGLSurface eglSurface;
    private final int height;
    private final long renderTargetPointer;
    private final Surface surface;
    private final int width;

    public /* synthetic */ RiveSurface(Surface surface, EGLSurface eGLSurface, EGLDisplay eGLDisplay, long j11, long j12, int i11, int i12, f fVar) {
        this(surface, eGLSurface, eGLDisplay, j11, j12, i11, i12);
    }

    private final EGLDisplay component3() {
        return this.display;
    }

    /* JADX INFO: renamed from: copy-__Kf5Qc$default, reason: not valid java name */
    public static /* synthetic */ RiveSurface m182copy__Kf5Qc$default(RiveSurface riveSurface, Surface surface, EGLSurface eGLSurface, EGLDisplay eGLDisplay, long j11, long j12, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            surface = riveSurface.surface;
        }
        if ((i13 & 2) != 0) {
            eGLSurface = riveSurface.eglSurface;
        }
        if ((i13 & 4) != 0) {
            eGLDisplay = riveSurface.display;
        }
        if ((i13 & 8) != 0) {
            j11 = riveSurface.renderTargetPointer;
        }
        if ((i13 & 16) != 0) {
            j12 = riveSurface.drawKey;
        }
        if ((i13 & 32) != 0) {
            i11 = riveSurface.width;
        }
        if ((i13 & 64) != 0) {
            i12 = riveSurface.height;
        }
        long j13 = j12;
        long j14 = j11;
        EGLDisplay eGLDisplay2 = eGLDisplay;
        return riveSurface.m184copy__Kf5Qc(surface, eGLSurface, eGLDisplay2, j14, j13, i11, i12);
    }

    private final native void cppDelete(long j11);

    public final Surface component1() {
        return this.surface;
    }

    public final EGLSurface component2() {
        return this.eglSurface;
    }

    public final long component4() {
        return this.renderTargetPointer;
    }

    /* JADX INFO: renamed from: component5-DhFih_o, reason: not valid java name */
    public final long m183component5DhFih_o() {
        return this.drawKey;
    }

    public final int component6() {
        return this.width;
    }

    public final int component7() {
        return this.height;
    }

    /* JADX INFO: renamed from: copy-__Kf5Qc, reason: not valid java name */
    public final RiveSurface m184copy__Kf5Qc(Surface surface, EGLSurface eglSurface, EGLDisplay display, long j11, long j12, int i11, int i12) {
        m.f(surface, "surface");
        m.f(eglSurface, "eglSurface");
        m.f(display, "display");
        return new RiveSurface(surface, eglSurface, display, j11, j12, i11, i12, null);
    }

    public final void dispose() {
        this.surface.release();
        EGL14.eglDestroySurface(this.display, this.eglSurface);
        cppDelete(this.renderTargetPointer);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RiveSurface)) {
            return false;
        }
        RiveSurface riveSurface = (RiveSurface) obj;
        return m.a(this.surface, riveSurface.surface) && m.a(this.eglSurface, riveSurface.eglSurface) && m.a(this.display, riveSurface.display) && this.renderTargetPointer == riveSurface.renderTargetPointer && DrawKey.m157equalsimpl0(this.drawKey, riveSurface.drawKey) && this.width == riveSurface.width && this.height == riveSurface.height;
    }

    /* JADX INFO: renamed from: getDrawKey-DhFih_o, reason: not valid java name */
    public final long m185getDrawKeyDhFih_o() {
        return this.drawKey;
    }

    public final EGLSurface getEglSurface() {
        return this.eglSurface;
    }

    public final int getHeight() {
        return this.height;
    }

    public final long getRenderTargetPointer() {
        return this.renderTargetPointer;
    }

    public final Surface getSurface() {
        return this.surface;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Integer.hashCode(this.height) + e.b(this.width, (DrawKey.m158hashCodeimpl(this.drawKey) + e.f(this.renderTargetPointer, (this.display.hashCode() + ((this.eglSurface.hashCode() + (this.surface.hashCode() * 31)) * 31)) * 31, 31)) * 31, 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RiveSurface(surface=");
        sb2.append(this.surface);
        sb2.append(", eglSurface=");
        sb2.append(this.eglSurface);
        sb2.append(", display=");
        sb2.append(this.display);
        sb2.append(", renderTargetPointer=");
        sb2.append(this.renderTargetPointer);
        sb2.append(", drawKey=");
        sb2.append((Object) DrawKey.m159toStringimpl(this.drawKey));
        sb2.append(", width=");
        sb2.append(this.width);
        sb2.append(", height=");
        return a.j(sb2, this.height, ')');
    }

    private RiveSurface(Surface surface, EGLSurface eglSurface, EGLDisplay display, long j11, long j12, int i11, int i12) {
        m.f(surface, "surface");
        m.f(eglSurface, "eglSurface");
        m.f(display, "display");
        this.surface = surface;
        this.eglSurface = eglSurface;
        this.display = display;
        this.renderTargetPointer = j11;
        this.drawKey = j12;
        this.width = i11;
        this.height = i12;
    }
}
