package ce;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends MediaDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f6854a;

    public f0(ByteBuffer byteBuffer) {
        this.f6854a = byteBuffer;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f6854a.limit();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j11, byte[] bArr, int i11, int i12) {
        ByteBuffer byteBuffer = this.f6854a;
        if (j11 >= byteBuffer.limit()) {
            return -1;
        }
        byteBuffer.position((int) j11);
        int iMin = Math.min(i12, byteBuffer.remaining());
        byteBuffer.get(bArr, i11, iMin);
        return iMin;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
