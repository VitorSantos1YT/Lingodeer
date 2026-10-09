package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class BinaryShiftToken extends Token {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final short f21462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final short f21463d;

    public BinaryShiftToken(Token token, int i11, int i12) {
        super(token);
        this.f21462c = (short) i11;
        this.f21463d = (short) i12;
    }

    @Override // com.google.zxing.aztec.encoder.Token
    public final void a(BitArray bitArray, byte[] bArr) {
        int i11 = 0;
        while (true) {
            short s3 = this.f21463d;
            if (i11 >= s3) {
                return;
            }
            if (i11 == 0 || (i11 == 31 && s3 <= 62)) {
                bitArray.c(31, 5);
                if (s3 > 62) {
                    bitArray.c(s3 - 31, 16);
                } else if (i11 == 0) {
                    bitArray.c(Math.min((int) s3, 31), 5);
                } else {
                    bitArray.c(s3 - 31, 5);
                }
            }
            bitArray.c(bArr[this.f21462c + i11], 8);
            i11++;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("<");
        short s3 = this.f21462c;
        sb2.append((int) s3);
        sb2.append("::");
        sb2.append((s3 + this.f21463d) - 1);
        sb2.append('>');
        return sb2.toString();
    }
}
