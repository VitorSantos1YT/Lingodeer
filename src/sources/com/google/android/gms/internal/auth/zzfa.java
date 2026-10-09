package com.google.android.gms.internal.auth;

import com.adjust.sdk.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import sz.xej.iFLeRCXvYCGdPW;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f9501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f9502b;

    static {
        Charset.forName("US-ASCII");
        f9501a = Charset.forName(Constants.ENCODING);
        Charset.forName(iFLeRCXvYCGdPW.AnOCKp);
        byte[] bArr = new byte[0];
        f9502b = bArr;
        ByteBuffer.wrap(bArr);
        zzeh zzehVar = new zzeh();
        try {
            int i11 = zzehVar.f9484a;
            if (i11 > 0) {
                zzehVar.f9484a = i11;
            } else {
                zzehVar.f9484a = 0;
            }
        } catch (zzfb e8) {
            throw new IllegalArgumentException(e8);
        }
    }
}
