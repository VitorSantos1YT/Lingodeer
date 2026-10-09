package m7;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f41036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f41037b;

    public t(MediaCodec mediaCodec, j jVar) {
        this.f41036a = mediaCodec;
        this.f41037b = jVar;
        if (Build.VERSION.SDK_INT < 35 || jVar == null) {
            return;
        }
        jVar.a(mediaCodec);
    }

    @Override // m7.l
    public final void a(Bundle bundle) {
        this.f41036a.setParameters(bundle);
    }

    @Override // m7.l
    public final void b(int i11, int i12, int i13, long j11) {
        this.f41036a.queueInputBuffer(i11, 0, i12, j11, i13);
    }

    @Override // m7.l
    public final void c(int i11, e7.b bVar, long j11, int i12) {
        this.f41036a.queueSecureInputBuffer(i11, 0, bVar.f25111i, j11, i12);
    }

    @Override // m7.l
    public final void d(int i11) {
        this.f41036a.releaseOutputBuffer(i11, false);
    }

    @Override // m7.l
    public final void e(v7.i iVar, Handler handler) {
        this.f41036a.setOnFrameRenderedListener(new a(this, iVar, 1), handler);
    }

    @Override // m7.l
    public final MediaFormat f() {
        return this.f41036a.getOutputFormat();
    }

    @Override // m7.l
    public final void flush() {
        this.f41036a.flush();
    }

    @Override // m7.l
    public final void g() {
        this.f41036a.detachOutputSurface();
    }

    @Override // m7.l
    public final void h(int i11, long j11) {
        this.f41036a.releaseOutputBuffer(i11, j11);
    }

    @Override // m7.l
    public final int i() {
        return this.f41036a.dequeueInputBuffer(0L);
    }

    @Override // m7.l
    public final int j(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f41036a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // m7.l
    public final void k(int i11) {
        this.f41036a.setVideoScalingMode(i11);
    }

    @Override // m7.l
    public final ByteBuffer l(int i11) {
        return this.f41036a.getInputBuffer(i11);
    }

    @Override // m7.l
    public final void m(Surface surface) {
        this.f41036a.setOutputSurface(surface);
    }

    @Override // m7.l
    public final ByteBuffer n(int i11) {
        return this.f41036a.getOutputBuffer(i11);
    }

    @Override // m7.l
    public final void release() {
        j jVar = this.f41037b;
        MediaCodec mediaCodec = this.f41036a;
        try {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 30 && i11 < 33) {
                mediaCodec.stop();
            }
        } finally {
            if (Build.VERSION.SDK_INT >= 35 && jVar != null) {
                jVar.c(mediaCodec);
            }
            mediaCodec.release();
        }
    }
}
