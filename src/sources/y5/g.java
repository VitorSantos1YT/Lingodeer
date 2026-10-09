package y5;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends b {
    public g(byte[] bArr) {
        super(bArr);
        this.f57093a.mark(Integer.MAX_VALUE);
    }

    public final void b(long j11) throws IOException {
        int i11 = this.f57094b;
        if (i11 > j11) {
            this.f57094b = 0;
            this.f57093a.reset();
        } else {
            j11 -= (long) i11;
        }
        a((int) j11);
    }

    public g(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f57093a.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
