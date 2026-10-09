package h7;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import com.yalantis.ucrop.view.CropImageView;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends z6.g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f31848i = Float.floatToIntBits(Float.NaN);

    public static void k(int i11, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i11) * 4.656612875245797E-10d));
        if (iFloatToIntBits == f31848i) {
            iFloatToIntBits = Float.floatToIntBits(CropImageView.DEFAULT_ASPECT_RATIO);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // z6.f
    public final void c(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferJ;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i11 = iLimit - iPosition;
        int i12 = this.f58944b.f58941c;
        if (i12 == 21) {
            byteBufferJ = j((i11 / 3) * 4);
            while (iPosition < iLimit) {
                k(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferJ);
                iPosition += 3;
            }
        } else if (i12 == 22) {
            byteBufferJ = j(i11);
            while (iPosition < iLimit) {
                k((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferJ);
                iPosition += 4;
            }
        } else if (i12 == 1342177280) {
            byteBufferJ = j((i11 / 3) * 4);
            while (iPosition < iLimit) {
                k(((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferJ);
                iPosition += 3;
            }
        } else {
            if (i12 != 1610612736) {
                throw new IllegalStateException();
            }
            byteBufferJ = j(i11);
            while (iPosition < iLimit) {
                k((byteBuffer.get(iPosition + 3) & 255) | ((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferJ);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferJ.flip();
    }

    @Override // z6.g
    public final z6.e f(z6.e eVar) throws AudioProcessor$UnhandledAudioFormatException {
        int i11 = eVar.f58941c;
        if (i11 == 21 || i11 == 1342177280 || i11 == 22 || i11 == 1610612736 || i11 == 4) {
            return i11 != 4 ? new z6.e(eVar.f58939a, eVar.f58940b, 4) : z6.e.f58938e;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(eVar);
    }
}
