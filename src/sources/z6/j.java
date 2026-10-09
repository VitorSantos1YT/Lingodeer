package z6;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import b7.f0;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends g {
    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    @Override // z6.f
    public final void c(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i11 = iLimit - iPosition;
        int i12 = this.f58944b.f58941c;
        if (i12 == 3) {
            i11 *= 2;
        } else if (i12 == 4) {
            i11 /= 2;
        } else {
            if (i12 != 21) {
                if (i12 == 22) {
                    i11 /= 2;
                } else if (i12 != 268435456) {
                    if (i12 != 1342177280) {
                        if (i12 != 1610612736) {
                            throw new IllegalStateException();
                        }
                        i11 /= 2;
                    }
                }
            }
            i11 /= 3;
            i11 *= 2;
        }
        ByteBuffer byteBufferJ = j(i11);
        int i13 = this.f58944b.f58941c;
        if (i13 == 3) {
            while (iPosition < iLimit) {
                byteBufferJ.put((byte) 0);
                byteBufferJ.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else if (i13 == 4) {
            while (iPosition < iLimit) {
                short sF = (short) (f0.f(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferJ.put((byte) (sF & 255));
                byteBufferJ.put((byte) ((sF >> 8) & 255));
                iPosition += 4;
            }
        } else if (i13 == 21) {
            while (iPosition < iLimit) {
                byteBufferJ.put(byteBuffer.get(iPosition + 1));
                byteBufferJ.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else if (i13 == 22) {
            while (iPosition < iLimit) {
                byteBufferJ.put(byteBuffer.get(iPosition + 2));
                byteBufferJ.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        } else if (i13 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferJ.put(byteBuffer.get(iPosition + 1));
                byteBufferJ.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i13 == 1342177280) {
            while (iPosition < iLimit) {
                byteBufferJ.put(byteBuffer.get(iPosition + 1));
                byteBufferJ.put(byteBuffer.get(iPosition));
                iPosition += 3;
            }
        } else {
            if (i13 != 1610612736) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferJ.put(byteBuffer.get(iPosition + 1));
                byteBufferJ.put(byteBuffer.get(iPosition));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferJ.flip();
    }

    @Override // z6.g
    public final e f(e eVar) throws AudioProcessor$UnhandledAudioFormatException {
        int i11 = eVar.f58941c;
        if (i11 == 3 || i11 == 2 || i11 == 268435456 || i11 == 21 || i11 == 1342177280 || i11 == 22 || i11 == 1610612736 || i11 == 4) {
            return i11 != 2 ? new e(eVar.f58939a, eVar.f58940b, 2) : e.f58938e;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(eVar);
    }
}
