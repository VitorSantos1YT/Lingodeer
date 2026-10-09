package m7;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import lf.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public interface l {
    void a(Bundle bundle);

    void b(int i11, int i12, int i13, long j11);

    void c(int i11, e7.b bVar, long j11, int i12);

    void d(int i11);

    void e(v7.i iVar, Handler handler);

    MediaFormat f();

    void flush();

    void g();

    void h(int i11, long j11);

    int i();

    int j(MediaCodec.BufferInfo bufferInfo);

    void k(int i11);

    ByteBuffer l(int i11);

    void m(Surface surface);

    ByteBuffer n(int i11);

    default boolean o(x0 x0Var) {
        return false;
    }

    void release();
}
