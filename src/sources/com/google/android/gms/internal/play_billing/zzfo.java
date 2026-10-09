package com.google.android.gms.internal.play_billing;

import com.adjust.sdk.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f12383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f12384b;

    static {
        Charset.forName("US-ASCII");
        f12383a = Charset.forName(Constants.ENCODING);
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f12384b = bArr;
        ByteBuffer.wrap(bArr);
        zzej zzejVar = new zzej();
        try {
            int i11 = zzejVar.f12352a;
            if (i11 > 0) {
                zzejVar.f12352a = i11;
            } else {
                zzejVar.f12352a = 0;
            }
        } catch (zzfq e8) {
            throw new IllegalArgumentException(e8);
        }
    }
}
