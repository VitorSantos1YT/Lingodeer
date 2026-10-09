package ce;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements td.f {
    @Override // td.f
    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // td.f
    public final int b(InputStream inputStream, m0.n nVar) {
        int iC = new y5.h(inputStream).c();
        if (iC == 0) {
            return -1;
        }
        return iC;
    }

    @Override // td.f
    public final boolean c(ByteBuffer byteBuffer, m0.n nVar) {
        return false;
    }

    @Override // td.f
    public final int d(ByteBuffer byteBuffer, m0.n nVar) {
        AtomicReference atomicReference = pe.b.f46813a;
        return b(new pe.a(byteBuffer), nVar);
    }

    @Override // td.f
    public final ImageHeaderParser$ImageType e(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // td.f
    public final boolean f(InputStream inputStream, m0.n nVar) {
        return false;
    }
}
