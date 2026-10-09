package h7;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import b7.f0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends z6.g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f31924i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f31925j;

    /* JADX WARN: Code duplicated, block: B:26:0x0076  */
    /* JADX WARN: Code duplicated, block: B:28:0x007e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0080  */
    /* JADX WARN: Code duplicated, block: B:32:0x0092  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:57:0x011b  */
    @Override // z6.f
    public final void c(ByteBuffer byteBuffer) {
        ByteOrder byteOrderOrder;
        ByteOrder byteOrder;
        int i11;
        int i12;
        boolean z11;
        int i13;
        int i14;
        int[] iArr = this.f31925j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferJ = j(((iLimit - iPosition) / this.f58944b.f58942d) * this.f58945c.f58942d);
        while (iPosition < iLimit) {
            for (int i15 : iArr) {
                int iQ = (f0.q(this.f58944b.f58941c) * i15) + iPosition;
                int i16 = this.f58944b.f58941c;
                if (i16 == 2) {
                    byteBufferJ.putShort(byteBuffer.getShort(iQ));
                } else if (i16 == 3) {
                    byteBufferJ.put(byteBuffer.get(iQ));
                } else if (i16 == 4) {
                    byteBufferJ.putFloat(byteBuffer.getFloat(iQ));
                } else if (i16 == 21) {
                    byteOrderOrder = byteBuffer.order();
                    byteOrder = ByteOrder.BIG_ENDIAN;
                    if (byteOrderOrder == byteOrder) {
                        i11 = iQ;
                    } else {
                        i11 = iQ + 2;
                    }
                    byte b3 = byteBuffer.get(i11);
                    byte b11 = byteBuffer.get(iQ + 1);
                    if (byteBuffer.order() == byteOrder) {
                        iQ += 2;
                    }
                    i12 = ((((b3 << 24) & (-16777216)) | ((b11 << 16) & 16711680)) | ((byteBuffer.get(iQ) << 8) & 65280)) >> 8;
                    if ((i12 & (-16777216)) != 0 || (i12 & (-8388608)) == -8388608) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    b7.a.c("Value out of range of 24-bit integer: " + Integer.toHexString(i12), z11);
                    b7.a.d(byteBufferJ.remaining() >= 3);
                    if (byteBufferJ.order() == byteOrder) {
                        i13 = (i12 & 16711680) >> 16;
                    } else {
                        i13 = i12 & 255;
                    }
                    byte b12 = (byte) i13;
                    byte b13 = (byte) ((i12 & 65280) >> 8);
                    if (byteBufferJ.order() == byteOrder) {
                        i14 = i12 & 255;
                    } else {
                        i14 = (i12 & 16711680) >> 16;
                    }
                    byteBufferJ.put(b12).put(b13).put((byte) i14);
                } else {
                    if (i16 != 22) {
                        if (i16 == 268435456) {
                            byteBufferJ.putShort(byteBuffer.getShort(iQ));
                        } else if (i16 == 1342177280) {
                            byteOrderOrder = byteBuffer.order();
                            byteOrder = ByteOrder.BIG_ENDIAN;
                            if (byteOrderOrder == byteOrder) {
                                i11 = iQ;
                            } else {
                                i11 = iQ + 2;
                            }
                            byte b14 = byteBuffer.get(i11);
                            byte b15 = byteBuffer.get(iQ + 1);
                            if (byteBuffer.order() == byteOrder) {
                                iQ += 2;
                            }
                            i12 = ((((b14 << 24) & (-16777216)) | ((b15 << 16) & 16711680)) | ((byteBuffer.get(iQ) << 8) & 65280)) >> 8;
                            if ((i12 & (-16777216)) != 0) {
                                z11 = true;
                            } else {
                                z11 = true;
                            }
                            b7.a.c("Value out of range of 24-bit integer: " + Integer.toHexString(i12), z11);
                            b7.a.d(byteBufferJ.remaining() >= 3);
                            if (byteBufferJ.order() == byteOrder) {
                                i13 = (i12 & 16711680) >> 16;
                            } else {
                                i13 = i12 & 255;
                            }
                            byte b16 = (byte) i13;
                            byte b17 = (byte) ((i12 & 65280) >> 8);
                            if (byteBufferJ.order() == byteOrder) {
                                i14 = i12 & 255;
                            } else {
                                i14 = (i12 & 16711680) >> 16;
                            }
                            byteBufferJ.put(b16).put(b17).put((byte) i14);
                        } else if (i16 != 1610612736) {
                            throw new IllegalStateException("Unexpected encoding: " + this.f58944b.f58941c);
                        }
                    }
                    byteBufferJ.putInt(byteBuffer.getInt(iQ));
                }
            }
            iPosition += this.f58944b.f58942d;
        }
        byteBuffer.position(iLimit);
        byteBufferJ.flip();
    }

    @Override // z6.g
    public final z6.e f(z6.e eVar) throws AudioProcessor$UnhandledAudioFormatException {
        int i11 = eVar.f58941c;
        int[] iArr = this.f31924i;
        if (iArr == null) {
            return z6.e.f58938e;
        }
        int i12 = eVar.f58940b;
        if (!f0.H(i11)) {
            throw new AudioProcessor$UnhandledAudioFormatException(eVar);
        }
        boolean z11 = i12 != iArr.length;
        int i13 = 0;
        while (i13 < iArr.length) {
            int i14 = iArr[i13];
            if (i14 >= i12) {
                throw new AudioProcessor$UnhandledAudioFormatException("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", eVar);
            }
            z11 |= i14 != i13;
            i13++;
        }
        return z11 ? new z6.e(eVar.f58939a, iArr.length, i11) : z6.e.f58938e;
    }

    @Override // z6.g
    public final void g() {
        this.f31925j = this.f31924i;
    }

    @Override // z6.g
    public final void i() {
        this.f31925j = null;
        this.f31924i = null;
    }
}
