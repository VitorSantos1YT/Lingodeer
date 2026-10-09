package com.google.android.gms.internal.fido;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzch f9691a;

    static {
        new zzcf("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new zzcf("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new zzcg("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new zzcg("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        f9691a = new zzce(new zzcd("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public abstract void a(StringBuilder sb2, byte[] bArr, int i11);

    public abstract int b(int i11);

    public final String c(byte[] bArr, int i11) {
        zzap.b(0, i11, bArr.length);
        StringBuilder sb2 = new StringBuilder(b(i11));
        try {
            a(sb2, bArr, i11);
            return sb2.toString();
        } catch (IOException e8) {
            throw new AssertionError(e8);
        }
    }
}
