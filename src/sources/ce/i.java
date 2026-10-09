package ce;

import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements j, com.bumptech.glide.load.data.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f6857a;

    public i(int i11, ByteBuffer byteBuffer) {
        switch (i11) {
            case 1:
                this.f6857a = byteBuffer;
                break;
            default:
                this.f6857a = byteBuffer;
                byteBuffer.order(ByteOrder.BIG_ENDIAN);
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.f
    public Object a() {
        ByteBuffer byteBuffer = this.f6857a;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // ce.j
    public int getUInt16() {
        return (getUInt8() << 8) | getUInt8();
    }

    @Override // ce.j
    public short getUInt8() throws DefaultImageHeaderParser$Reader$EndOfFileException {
        ByteBuffer byteBuffer = this.f6857a;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & 255);
        }
        throw new DefaultImageHeaderParser$Reader$EndOfFileException();
    }

    @Override // ce.j
    public int read(byte[] bArr, int i11) {
        ByteBuffer byteBuffer = this.f6857a;
        int iMin = Math.min(i11, byteBuffer.remaining());
        if (iMin == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, iMin);
        return iMin;
    }

    @Override // ce.j
    public long skip(long j11) {
        ByteBuffer byteBuffer = this.f6857a;
        int iMin = (int) Math.min(byteBuffer.remaining(), j11);
        byteBuffer.position(byteBuffer.position() + iMin);
        return iMin;
    }

    @Override // com.bumptech.glide.load.data.f
    public void b() {
    }
}
