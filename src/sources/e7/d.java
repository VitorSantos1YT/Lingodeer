package e7;

import androidx.media3.decoder.DecoderInputBuffer$InsufficientCapacityException;
import hh.p0;
import java.nio.ByteBuffer;
import y6.p;
import y6.y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class d extends c7.f {
    public ByteBuffer H;
    public final int K;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p f25113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f25114d = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ByteBuffer f25115e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f25116f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f25117t;

    static {
        y.a("media3.decoder");
    }

    public d(int i11) {
        this.K = i11;
    }

    public void n() {
        this.f6652b = 0;
        ByteBuffer byteBuffer = this.f25115e;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.H;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f25116f = false;
    }

    public final ByteBuffer o(int i11) {
        int i12 = this.K;
        if (i12 == 1) {
            return ByteBuffer.allocate(i11);
        }
        if (i12 == 2) {
            return ByteBuffer.allocateDirect(i11);
        }
        ByteBuffer byteBuffer = this.f25115e;
        throw new DecoderInputBuffer$InsufficientCapacityException(p0.l("Buffer too small (", byteBuffer == null ? 0 : byteBuffer.capacity(), " < ", i11, ")"));
    }

    public final void q(int i11) {
        ByteBuffer byteBuffer = this.f25115e;
        if (byteBuffer == null) {
            this.f25115e = o(i11);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i12 = i11 + iPosition;
        if (iCapacity >= i12) {
            this.f25115e = byteBuffer;
            return;
        }
        ByteBuffer byteBufferO = o(i12);
        byteBufferO.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferO.put(byteBuffer);
        }
        this.f25115e = byteBufferO;
    }

    public final void r() {
        ByteBuffer byteBuffer = this.f25115e;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.H;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
