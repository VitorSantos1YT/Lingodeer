package com.google.android.gms.internal.fido;

import com.adjust.sdk.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzde {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f9703a;

    static {
        Charset.forName("US-ASCII");
        Charset.forName(Constants.ENCODING);
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f9703a = bArr;
        ByteBuffer.wrap(bArr);
        zzdb zzdbVar = new zzdb();
        try {
            int i11 = zzdbVar.f9702a;
            if (i11 > 0) {
                zzdbVar.f9702a = i11;
            } else {
                zzdbVar.f9702a = 0;
            }
        } catch (zzdf e8) {
            throw new IllegalArgumentException(e8);
        }
    }
}
