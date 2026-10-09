package com.google.android.gms.internal.p002firebaseauthapi;

import com.adjust.sdk.Constants;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzqj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f10870a = Charset.forName(Constants.ENCODING);

    public static final zzzv a(String str) throws GeneralSecurityException {
        byte[] bArr = new byte[str.length()];
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new GeneralSecurityException("Not a printable ASCII character: " + cCharAt);
            }
            bArr[i11] = (byte) cCharAt;
        }
        return zzzv.a(bArr);
    }

    public static boolean b(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i11 = 0; i11 < bArr.length; i11++) {
            if (bArr2[i11] != bArr[i11]) {
                return false;
            }
        }
        return true;
    }

    public static final zzzv c(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new zzqh("Not a printable ASCII character: " + cCharAt);
            }
            bArr[i11] = (byte) cCharAt;
        }
        return zzzv.a(bArr);
    }
}
