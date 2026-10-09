package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
abstract class Token {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SimpleToken f21476b = new SimpleToken(null, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Token f21477a;

    public Token(Token token) {
        this.f21477a = token;
    }

    public abstract void a(BitArray bitArray, byte[] bArr);
}
