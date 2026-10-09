package f7;

import android.media.MediaFormat;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements v7.t, w7.a, a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v7.t f26948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w7.a f26949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v7.t f26950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w7.a f26951d;

    @Override // w7.a
    public final void a(long j11, float[] fArr) {
        w7.a aVar = this.f26951d;
        if (aVar != null) {
            aVar.a(j11, fArr);
        }
        w7.a aVar2 = this.f26949b;
        if (aVar2 != null) {
            aVar2.a(j11, fArr);
        }
    }

    @Override // w7.a
    public final void b() {
        w7.a aVar = this.f26951d;
        if (aVar != null) {
            aVar.b();
        }
        w7.a aVar2 = this.f26949b;
        if (aVar2 != null) {
            aVar2.b();
        }
    }

    @Override // v7.t
    public final void c(long j11, long j12, y6.p pVar, MediaFormat mediaFormat) {
        long j13;
        long j14;
        y6.p pVar2;
        MediaFormat mediaFormat2;
        v7.t tVar = this.f26950c;
        if (tVar != null) {
            tVar.c(j11, j12, pVar, mediaFormat);
            mediaFormat2 = mediaFormat;
            pVar2 = pVar;
            j14 = j12;
            j13 = j11;
        } else {
            j13 = j11;
            j14 = j12;
            pVar2 = pVar;
            mediaFormat2 = mediaFormat;
        }
        v7.t tVar2 = this.f26948a;
        if (tVar2 != null) {
            tVar2.c(j13, j14, pVar2, mediaFormat2);
        }
    }

    @Override // f7.a1
    public final void f(int i11, Object obj) {
        if (i11 == 7) {
            this.f26948a = (v7.t) obj;
            return;
        }
        if (i11 == 8) {
            this.f26949b = (w7.a) obj;
            return;
        }
        if (i11 != 10000) {
            return;
        }
        SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) obj;
        if (sphericalGLSurfaceView == null) {
            this.f26950c = null;
            this.f26951d = null;
        } else {
            this.f26950c = sphericalGLSurfaceView.getVideoFrameMetadataListener();
            this.f26951d = sphericalGLSurfaceView.getCameraMotionListener();
        }
    }
}
