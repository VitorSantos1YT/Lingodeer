package h7;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import b7.f0;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends z6.g {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f31838n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f31839o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f31840p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f31841q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public byte[] f31843s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public byte[] f31846v;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f31842r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f31844t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f31845u = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f31837l = 100000;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f31834i = 0.2f;
    public final long m = 2000000;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f31836k = 10;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final short f31835j = 1024;

    public c0() {
        byte[] bArr = f0.f3976b;
        this.f31843s = bArr;
        this.f31846v = bArr;
    }

    @Override // z6.f
    public final void c(ByteBuffer byteBuffer) {
        int iLimit;
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.f58949g.hasRemaining()) {
            int i11 = this.f31840p;
            short s3 = this.f31835j;
            if (i11 == 0) {
                int iLimit2 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit2, byteBuffer.position() + this.f31843s.length));
                int iLimit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit3 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iLimit3) << 8) | (byteBuffer.get(iLimit3 - 1) & 255)) > s3) {
                        int i12 = this.f31838n;
                        iPosition = defpackage.e.c(iLimit3, i12, i12, i12);
                        break;
                    }
                    iLimit3 -= 2;
                }
                if (iPosition == byteBuffer.position()) {
                    this.f31840p = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    j(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit2);
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException();
                }
                b7.a.j(this.f31844t < this.f31843s.length);
                int iLimit4 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iPosition2) << 8) | (byteBuffer.get(iPosition2 - 1) & 255)) > s3) {
                        int i13 = this.f31838n;
                        iLimit = (iPosition2 / i13) * i13;
                        break;
                    }
                    iPosition2 += 2;
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int length = this.f31844t;
                int i14 = this.f31845u;
                int length2 = length + i14;
                byte[] bArr = this.f31843s;
                if (length2 < bArr.length) {
                    length = bArr.length;
                } else {
                    length2 = i14 - (bArr.length - length);
                }
                int i15 = length - length2;
                boolean z11 = iLimit < iLimit4;
                int iMin = Math.min(iPosition3, i15);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.f31843s, length2, iMin);
                int i16 = this.f31845u + iMin;
                this.f31845u = i16;
                b7.a.j(i16 <= this.f31843s.length);
                boolean z12 = z11 && iPosition3 < i15;
                l(z12);
                if (z12) {
                    this.f31840p = 0;
                    this.f31842r = 0;
                }
                byteBuffer.limit(iLimit4);
            }
        }
    }

    @Override // z6.g
    public final z6.e f(z6.e eVar) throws AudioProcessor$UnhandledAudioFormatException {
        if (eVar.f58941c == 2) {
            return eVar.f58939a == -1 ? z6.e.f58938e : eVar;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(eVar);
    }

    @Override // z6.g
    public final void g() {
        if (isActive()) {
            z6.e eVar = this.f58944b;
            int i11 = eVar.f58940b * 2;
            this.f31838n = i11;
            int i12 = ((((int) ((this.f31837l * ((long) eVar.f58939a)) / 1000000)) / 2) / i11) * i11 * 2;
            if (this.f31843s.length != i12) {
                this.f31843s = new byte[i12];
                this.f31846v = new byte[i12];
            }
        }
        this.f31840p = 0;
        this.f31841q = 0L;
        this.f31842r = 0;
        this.f31844t = 0;
        this.f31845u = 0;
    }

    @Override // z6.g
    public final void h() {
        if (this.f31845u > 0) {
            l(true);
            this.f31842r = 0;
        }
    }

    @Override // z6.g
    public final void i() {
        this.f31839o = false;
        byte[] bArr = f0.f3976b;
        this.f31843s = bArr;
        this.f31846v = bArr;
    }

    @Override // z6.g, z6.f
    public final boolean isActive() {
        return super.isActive() && this.f31839o;
    }

    public final int k(int i11) {
        int length = ((((int) ((this.m * ((long) this.f58944b.f58939a)) / 1000000)) - this.f31842r) * this.f31838n) - (this.f31843s.length / 2);
        b7.a.j(length >= 0);
        int iMin = (int) Math.min((i11 * this.f31834i) + 0.5f, length);
        int i12 = this.f31838n;
        return (iMin / i12) * i12;
    }

    public final void l(boolean z11) {
        int length;
        int iK;
        int i11 = this.f31845u;
        byte[] bArr = this.f31843s;
        if (i11 == bArr.length || z11) {
            if (this.f31842r == 0) {
                if (z11) {
                    m(i11, 3);
                    length = i11;
                } else {
                    b7.a.j(i11 >= bArr.length / 2);
                    length = this.f31843s.length / 2;
                    m(length, 0);
                }
                iK = length;
            } else if (z11) {
                int length2 = i11 - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int iK2 = k(length2) + (this.f31843s.length / 2);
                m(iK2, 2);
                iK = iK2;
                length = length3;
            } else {
                length = i11 - (bArr.length / 2);
                iK = k(length);
                m(iK, 1);
            }
            b7.a.i("bytesConsumed is not aligned to frame size: %s" + length, length % this.f31838n == 0);
            b7.a.j(i11 >= iK);
            this.f31845u -= length;
            int i12 = this.f31844t + length;
            this.f31844t = i12;
            this.f31844t = i12 % this.f31843s.length;
            int i13 = this.f31842r;
            int i14 = this.f31838n;
            this.f31842r = (iK / i14) + i13;
            this.f31841q += (long) ((length - iK) / i14);
        }
    }

    public final void m(int i11, int i12) {
        if (i11 == 0) {
            return;
        }
        b7.a.d(this.f31845u >= i11);
        if (i12 == 2) {
            int i13 = this.f31844t;
            int i14 = this.f31845u;
            int i15 = i13 + i14;
            byte[] bArr = this.f31843s;
            if (i15 <= bArr.length) {
                System.arraycopy(bArr, i15 - i11, this.f31846v, 0, i11);
            } else {
                int length = i14 - (bArr.length - i13);
                if (length >= i11) {
                    System.arraycopy(bArr, length - i11, this.f31846v, 0, i11);
                } else {
                    int i16 = i11 - length;
                    System.arraycopy(bArr, bArr.length - i16, this.f31846v, 0, i16);
                    System.arraycopy(this.f31843s, 0, this.f31846v, i16, length);
                }
            }
        } else {
            int i17 = this.f31844t;
            int i18 = i17 + i11;
            byte[] bArr2 = this.f31843s;
            if (i18 <= bArr2.length) {
                System.arraycopy(bArr2, i17, this.f31846v, 0, i11);
            } else {
                int length2 = bArr2.length - i17;
                System.arraycopy(bArr2, i17, this.f31846v, 0, length2);
                System.arraycopy(this.f31843s, 0, this.f31846v, length2, i11 - length2);
            }
        }
        b7.a.c("sizeToOutput is not aligned to frame size: " + i11, i11 % this.f31838n == 0);
        b7.a.j(this.f31844t < this.f31843s.length);
        byte[] bArr3 = this.f31846v;
        b7.a.c("byteOutput size is not aligned to frame size " + i11, i11 % this.f31838n == 0);
        if (i12 != 3) {
            for (int i19 = 0; i19 < i11; i19 += 2) {
                int i21 = i19 + 1;
                int i22 = (bArr3[i21] << 8) | (bArr3[i19] & 255);
                int i23 = this.f31836k;
                if (i12 == 0) {
                    i23 = ((((i19 * 1000) / (i11 - 1)) * (i23 - 100)) / 1000) + 100;
                } else if (i12 == 2) {
                    i23 += (((i19 * 1000) * (100 - i23)) / (i11 - 1)) / 1000;
                }
                int i24 = (i22 * i23) / 100;
                if (i24 >= 32767) {
                    bArr3[i19] = -1;
                    bArr3[i21] = 127;
                } else if (i24 <= -32768) {
                    bArr3[i19] = 0;
                    bArr3[i21] = -128;
                } else {
                    bArr3[i19] = (byte) (i24 & 255);
                    bArr3[i21] = (byte) (i24 >> 8);
                }
            }
        }
        j(i11).put(bArr3, 0, i11).flip();
    }
}
