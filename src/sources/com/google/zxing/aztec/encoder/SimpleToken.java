package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class SimpleToken extends Token {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final short f21469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final short f21470d;

    public SimpleToken(Token token, int i11, int i12) {
        super(token);
        this.f21469c = (short) i11;
        this.f21470d = (short) i12;
    }

    @Override // com.google.zxing.aztec.encoder.Token
    public final void a(BitArray bitArray, byte[] bArr) {
        bitArray.c(this.f21469c, this.f21470d);
    }

    public final String toString() {
        short s3 = this.f21470d;
        return "<" + Integer.toBinaryString((1 << s3) | (((1 << s3) - 1) & this.f21469c) | (1 << s3)).substring(1) + '>';
    }
}
